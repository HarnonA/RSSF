package RSSF;
import java.awt.Point;
import java.util.ArrayList;


public class Node extends Thread{
	
	static int n_enviados = 0;
	static int n_recebidos = 0;
	static int energia_gasta = 0;
	
	int id;
	int bateria;
	int alcance;
	int regiao;
	Point posicao;
	String conteudo;
	ArrayList<Regiao> msgLidasDest;

	ArrayList<Node> vizinhos;
	boolean dead;

	public Node(int id, Point point, String conteudo,
			int regiao, int alcance){
		this.id = id;
		this.bateria = 100;
		this.alcance = alcance;
		this.conteudo= conteudo;
		this.regiao = regiao;
		this.posicao = point;
		this.msgLidasDest = new ArrayList<Regiao>();
		this.vizinhos = new ArrayList<Node>();
		this.dead = false;
		
	}
	
	public int getid(){
		return id;
	}

	public Point getPosicao() {
		return posicao;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getRegiao() {
		return regiao;
	}

	public int getAlcance() {
		return alcance;
	}
	
	public ArrayList<Node> getVizinhos(){
		return vizinhos;
	}
	
	public void setVizinho(Node s){
		this.vizinhos.add(s);
	}
	
	/*
	public double calcCusto(Point pDistino){
		double peso = 0.8;
		return peso * this.posicao.distance(pDistino) + (1-peso)*(100-bateria);
		
	}
	*/
	
	/*
	 * Retorna se é possivel implicar q esta dentro da regiao
	 */
	public boolean estaDentro(Regiao reg){
		if( reg.getSup().x <= this.posicao.x && reg.getSup().y > this.posicao.y &&
				reg.getInf().x > this.posicao.x && reg.getInf().y <= this.posicao.y ) {
			return true;
		}
		return false;
	}
	
	/*
	 * Verifica se o pacote já foi passou por esse sensor.
	 */
	public boolean JaRecebi(Regiao regDest){
		for(int i = 0; i < this.msgLidasDest.size(); ++i ){
			if(this.msgLidasDest.get(i).getSup() == regDest.getSup() &&
					this.msgLidasDest.get(i).getInf() == regDest.getInf()){

				return true;
			}
		}
		return false;
	}
	
	/*
	 * Retorna se é possivel afirma que a regiao esta vazia.
	 */
	public boolean regiaoEstaVazia( Regiao reg) {
		Point supDir = new Point(reg.getInf().x, reg.getSup().y);
		Point infEsq = new Point(reg.getSup().x, reg.getInf().y);
		
		// Verifica se os quatros pontos da regiao estão no alcance.
		if( this.posicao.distance(reg.getSup()) <= this.alcance && 
				this.posicao.distance(reg.getInf()) <= this.alcance &&
				this.posicao.distance(supDir) <= this.alcance &&
				this.posicao.distance(infEsq) <= this.alcance) {
			
			for(int i = 0; i < vizinhos.size(); ++i){
				if(this.vizinhos.get(i).estaDentro(reg)){
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public void enviar(Msg msg){
		// Pega o ponto central da região.
		Point centro = new Point();
		centro.x = (msg.getRegiaoDestino().getInf().x + msg.getRegiaoDestino().getSup().x) / 2;
		centro.y = (msg.getRegiaoDestino().getInf().y + msg.getRegiaoDestino().getSup().y) / 2;
		
		// Pega o endereço do nó mais próximo do centro da região destino.
		int melhorNo = -1;
		double custo, menorCusto = 1000000;
		for(int i = 0; i < this.vizinhos.size(); ++i ){
			if(this.vizinhos.get(i).getBateria() <= 0 || i == this.id)
				continue;
			
			if(this.vizinhos.get(i).estaDentro(msg.regiaoDestino)){
				melhorNo = i;
				break;
			}
			
			custo = this.vizinhos.get(i).getPosicao().distance( centro );
			if( menorCusto > custo ){
				menorCusto = custo;
				melhorNo = i;
			}
			
		}
		
		if(melhorNo < 0){
			System.out.println("Erro na escolha do próximo hop");
		}
		
		this.n_enviados += 1;
		this.energia_gasta += 4;
		this.bateria -= 4;
		// Envia a mensagem para o no mais proximo do destino.
		this.vizinhos.get( melhorNo ).receber( msg );	
	}
	
	public void Subdivide_Envia(Msg msg){
		
		// Pega o ponto central da região.
		Point centro = new Point();
		centro.x = (msg.getRegiaoDestino().getInf().x + msg.getRegiaoDestino().getSup().x) / 2;
		centro.y = (msg.getRegiaoDestino().getInf().y + msg.getRegiaoDestino().getSup().y) / 2;
	
		// Subdivide e envia em 4 partes
		Regiao original, reg1, reg2, reg3, reg4;
		original = msg.getRegiaoDestino();
		reg1 = new Regiao( original.getSup(), centro );
		reg2 = new Regiao( new Point(centro.x, original.getSup().y ), new Point(original.getInf().x, centro.y) );
		reg3 = new Regiao( new Point(original.getSup().x, centro.y), new Point(centro.x, original.getInf().y) );
		reg4 = new Regiao( centro, original.getInf() );
		
		// Envia pra as subdivisoes.
		if( !this.regiaoEstaVazia(reg1) ){
			/*
			System.out.println("------|| " + this.id + " enviando para ("+ reg1.getSup().x + ", " + reg1.getSup().y +") - (" 
					+ reg1.getInf().x + ", " + reg1.getInf().y + ") ||-----"); */
			msg.setRegiao(reg1);
			enviar(msg);
		}
		
		if( !this.regiaoEstaVazia(reg2) ){
			/*
			System.out.println("------ " + this.id + " enviando para ("+ reg2.getSup().x + ", " + reg2.getSup().y +") - (" 
					+ reg2.getInf().x + ", " + reg2.getInf().y + ") -----"); */
			msg.setRegiao(reg2);
			enviar(msg);
		}
		
		if( !this.regiaoEstaVazia(reg3) ){
			/*
			System.out.println("------ " + this.id + " enviando para ("+ reg3.getSup().x + ", " + reg3.getSup().y +") - (" 
					+ reg3.getInf().x + ", " + reg3.getInf().y + ") -----"); */
			msg.setRegiao(reg3);
			enviar(msg);
		}
		
		if( !this.regiaoEstaVazia(reg4) ){
			/*
			System.out.println("------ " + this.id + " enviando para ("+ reg4.getSup().x + ", " + reg4.getSup().y +") - (" 
					+ reg4.getInf().x + ", " + reg4.getInf().y + ") -----"); */
			msg.setRegiao(reg4);
			enviar(msg);
		}
		
		System.out.println("");
	}

	
	public void receber(Msg msg){
		msg.envelhecer();
		/*
		System.out.println("|| sensor " + this.id + " received message " + msg.getDados() + 
				" for (" + msg.getRegiaoDestino().getSup().x + ", " + msg.getRegiaoDestino().getSup().y + 
				") - (" + msg.getRegiaoDestino().getInf().x + ", " + msg.getRegiaoDestino().getInf().y +") ||\n");
		*/
		this.energia_gasta += 1;
		this.n_recebidos += 1;
		this.bateria -= 1;
		
		// Se a msg nao tiver sido recebida pela primeira vez.
		if( !this.JaRecebi( msg.getRegiaoDestino() ) ){
			this.msgLidasDest.add( msg.getRegiaoDestino() );
			
			// Verifica se o nó está dentro da regiao destino.
			Regiao reg = msg.getRegiaoDestino();
			if( this.estaDentro(reg) ) 
			{
				//System.out.println( "** " + this.id + " pegou msg**");
				this.conteudo = msg.getDados();
				
				this.Subdivide_Envia( msg );
			}
			else{
				
				if(msg.getVida() <= 0)
					return;
				
				this.enviar( msg );		
			}			
		}
	}
	
	
	
	public void enviarFlooding( Msg msg ){
		for(int i = 0; i < this.vizinhos.size(); ++i){
			if(this.vizinhos.get(i).getBateria() > 0){
				this.n_enviados += 1;
				this.energia_gasta += 4;
				this.bateria -= 4;
				this.vizinhos.get(i).receberFlooding( msg );
				
			}
			
		}
	}
	
	public void receberFlooding( Msg msg){
		
		this.energia_gasta += 1;
		this.n_recebidos += 1;
		this.bateria -= 1;
		msg.envelhecer();
		
		if( JaRecebi( msg.getRegiaoDestino() ) ){
			return;
		}
		
		this.msgLidasDest.add(msg.getRegiaoDestino());
		if( this.estaDentro( msg.getRegiaoDestino() )){
			this.conteudo = msg.getDados();
		}
		if(msg.getVida() > 0 ){
			this.enviarFlooding( msg );
		}
		else{
			System.out.println("descartando msg no " + this.id);
		}
	}
	
	
	@Override
	public void run() {
		try{
			Thread.sleep(100);
			this.bateria -= 1;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
