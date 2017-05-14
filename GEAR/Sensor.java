package projects.GEAR;

import java.awt.Point;
import java.util.Iterator;
import java.util.SortedSet;

import jsensor.nodes.Node;
import jsensor.nodes.messages.Inbox;
import jsensor.nodes.messages.Message;
import jsensor.runtime.Jsensor;

public class Sensor extends Node {
	
	/* ATRIBUTOS */
	private static int n_mortos = 0;
	
	private int energia;
	private String conteudo;
	private TabelaCusto custosConhecidos;
	private Point posicao;
	private SortedSet<Node> vizinhos;

	/*
	 *  CONSTRUTOR.
	 */
	@Override
	public void onCreation() {
		// Instancia os atributos.
		this.conteudo = "Sem Conteudo.";
		this.energia = 100;
		this.custosConhecidos = new TabelaCusto();
		this.posicao = new Point(this.getPosition().getPosX(),  this.getPosition().getPosY() );
		//sends the first messages if is one of the selected nodes
        if(this.ID < 2)
        {
        	int time = 10 + this.ID * 10;
        	MyTimer mt = new MyTimer();
            mt.startRelative(time, this);
        }	
	}
	
	/*
	 * (non-Javadoc)
	 * @see jsensor.nodes.Node#handleMessages(jsensor.nodes.messages.Inbox)
	 * Realiza o controle das mensagens recebidas pelos nós.
	 */
	@Override
	public void handleMessages(Inbox inbox) {
		while(inbox.hasMoreMessages())
    	{
			// Verifica se o sensor permanece ativo.
			this.energia -= 1;
			if( this.energia <= 0) {
				Sensor.n_mortos += 1;
				Jsensor.log("Sensor " + this.ID + " without energy. discharge:" + Sensor.n_mortos);
				break;
			}
			
			// Confere se o que foi recebido foi uma mensagem.
			Message messagem = inbox.getNextMessage();
			if(messagem instanceof Msg)
			{
				Msg msg = (Msg) messagem;
				msg.addCaminho( this.ID );
        	     
				// Mata o pacote que tiver feito muitos saltos.
				int tVida = msg.getTempoDeVida();
				if(tVida <= 0){
					System.out.println("\nMessage dead\n");
					System.out.println("a mensagem para a " + msg.getDestino().toString() + " morreu no " + this.ID);
					System.out.println("caminho do morto " + msg.getInfo());
					continue;
				}
				
				// Se este sensor é o destino final... ou nao.
				if(this.estaDentro(msg.getDestino()) )
				{
					this.conteudo = msg.getConteudo();
					
					System.out.println("time: "+ Jsensor.currentTime +
							"\t sensorID: " +this.ID+
							"\t receivedFrom: " + msg.getOrigem() +
							"\t hops: "+ ( 100 - msg.getTempoDeVida() ) +
							"\t msg: " +msg.getInfo() +
							"\t " + msg.getDestino().toString());
					
					Jsensor.log("time: "+ Jsensor.currentTime +
							"\t sensorID: " +this.ID+
							"\t receivedFrom: " + msg.getOrigem() +
							"\t hops: "+ ( 100 - msg.getTempoDeVida() ) +
							"\t msg: " +msg.getInfo() );
					
					Subdivide_Envia(msg);
				}
				else
				{
				    this.enviar( msg );
				}
			}  
    	}
	}
	
	public void enviar( Message mensagem ){
		this.energia -= 4;
		Sensor melhorVizinho = this.melhorVizinhos( ((Msg) mensagem).getDestino() );
		if(melhorVizinho == null){
			System.out.println("Não foi possivel o no " + this.ID + " enviar msg");
			return;
		}
		//System.out.println(" 2 enviando de " + this.getID() + " até " + melhorVizinho.getID() + "\n");
		this.unicast(mensagem, melhorVizinho );
		
	}
	
	/*
	 * Algoritmo de disseminação.
	 */
	public void Subdivide_Envia(Msg msg){
		
		// Pega o ponto central da região.
		Point centro = this.getCentro( msg.getDestino() );
	
		// Subdivide e envia em 4 partes
		Regiao original, reg1, reg2, reg3, reg4;
		original = msg.getDestino();
		reg1 = new Regiao( original.getSup(), centro );
		reg2 = new Regiao( new Point(centro.x, original.getSup().y ), new Point(original.getInf().x, centro.y) );
		reg3 = new Regiao( new Point(original.getSup().x, centro.y), new Point(centro.x, original.getInf().y) );
		reg4 = new Regiao( centro, original.getInf() );
		
		System.out.println("O sensor " + this.ID + " Subdividiu a " + original.toString() + ":");
		System.out.println("\t reg1 " + reg1.toString());
		System.out.println("\t reg2 " + reg2.toString());
		System.out.println("\t reg3 " + reg3.toString());
		System.out.println("\t reg4 " + reg4.toString());
		
		// Envia pra as subdivisoes.
		if( !this.regiaoEstaVazia(reg1) ){
			Msg msg1 = new Msg(msg.getConteudo(), msg.getCaminho(), reg1, msg.getTempoDeVida());
			this.enviar(msg1);
		}
		else{
			System.out.println("reg1 esta vazia");
		}
		
		if( !this.regiaoEstaVazia(reg2) ){
			Msg msg2 = new Msg(msg.getConteudo(), msg.getCaminho(), reg2, msg.getTempoDeVida());
			enviar(msg2);
		}
		else{
			System.out.println("reg2 esta vazia");
		}
		
		if( !this.regiaoEstaVazia(reg3) ){
			Msg msg3 = new Msg(msg.getConteudo(), msg.getCaminho(), reg3, msg.getTempoDeVida());
			enviar(msg3);
		}
		else{
			System.out.println("reg3 esta vazia");
		}
		
		if( !this.regiaoEstaVazia(reg4) ){
			Msg msg4 = new Msg(msg.getConteudo(), msg.getCaminho(), reg4, msg.getTempoDeVida());
			enviar(msg4);
		}
		else{
			System.out.println("reg4 esta vazia");
		}
		System.out.println("");
	}

	/*
	 * Função de custo.
	 */
	public double calcCusto(Point pDistino){
		double peso = 0.8;
		return peso * this.posicao.distance(pDistino) + (1-peso)*(100-this.energia);
		
	}
	
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
	 * Retorna se é possivel afirma que a regiao esta vazia.
	 */
	public boolean regiaoEstaVazia( Regiao reg) {
		Point supDir = new Point(reg.getInf().x, reg.getSup().y);
		Point infEsq = new Point(reg.getSup().x, reg.getInf().y);
		
		int alcance = this.getCommunicationRadio();
		// Verifica se os quatros pontos da regiao estão no alcance.
		if( this.posicao.distance(reg.getSup()) <= alcance && 
				this.posicao.distance(reg.getInf()) <= alcance &&
				this.posicao.distance(supDir) <= alcance &&
				this.posicao.distance(infEsq) <= alcance) {
			
			this.findVizinhos();
			if(this.vizinhos.size() == 0)
				System.out.println("" + this.ID +" NAO tem vizinhos" );
			Iterator<Node> it = this.vizinhos.iterator();
			while(it.hasNext()){
				Sensor s = (Sensor) it.next(); 
				if( s.estaDentro(reg) )
					return false;
			}
			return true;
		}
		return false;
	}
	
	/*
	 * Retorna o id do vizinho de menor custo.
	 */
	public Sensor melhorVizinhos(Regiao reg){
		Sensor melhorVizinho = null;
		double menorCusto = 1000000;
		
		this.findVizinhos();
		
		// Faz a iteração com cada vizinho.
		Iterator<Node> it = this.vizinhos.iterator();
		while( it.hasNext() ){
			Sensor vizinhoAtual = (Sensor) it.next();
			double custoVizinho = vizinhoAtual.getCusto( reg );
			
			// Seleciona o vizinho de menor custo
			if(custoVizinho < menorCusto){
				menorCusto = custoVizinho;
				melhorVizinho = vizinhoAtual;
			}	
		}
		
		// Adiciona o melhor caminho aos custos conhecidos.
		this.custosConhecidos.addNovoCusto( this.getCentro(reg), menorCusto + 
				Configuration.messageTransmissionModel.timeToReach(this, melhorVizinho, null), melhorVizinho.getID());
		
		return melhorVizinho;
	}
	
	/*
	 * Retorna o centro da regiao;
	 */
	public Point getCentro(Regiao reg){
		// Pega o ponto central da região.
		Point centro = new Point();
		centro.x = (reg.getInf().x + reg.getSup().x) / 2;
		centro.y = (reg.getInf().y + reg.getSup().y) / 2;
		return centro;
	}

	public double getCusto(Regiao reg){
		if (this.estaDentro( reg ) ){
			return 0.0;
		}
		
		Point p = this.getCentro(reg);
		
		int endereco = this.custosConhecidos.getEndereco( p ); 
		if(endereco == -1)
			return calcCusto(p);
		else 
			return this.custosConhecidos.getCustoTotal(endereco);
	}
	
	public String getConteudo(){
		return this.conteudo;
	}
	
	public void findVizinhos(){
		this.vizinhos = this.getNeighbours().getNodesList();
	}
}
