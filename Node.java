import java.awt.Point;
import java.util.ArrayList;


public class Node extends Thread{
	int id;
	Point posicao;
	int bateria;
	String conteudo;
	int regiao;
	ArrayList<Integer> msgLidas;
	int alcance;


	public Node(int id, Point point, String conteudo,
			int regiao, int alcance){
		this.id = id;
		this.posicao = point;
		this.bateria = 100;
		this.conteudo= conteudo;
		this.regiao = regiao;
		this.msgLidas = new ArrayList<Integer>();
		this.alcance = alcance;
		
		
		
	}
	
	
	public int getid(){
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Point getPosicao() {
		return posicao;
	}

	public void setPosicao(Point posicao) {
		this.posicao = posicao;
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

	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}

	public ArrayList<Integer> getMsgLidas() {
		return msgLidas;
	}

	public void setMsgLidas(ArrayList<Integer> msgLidas) {
		this.msgLidas = msgLidas;
	}

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
	
	
	// recursive geographic forward
	public void rgf(Msg msg){
		
		
	}
	
	public double calcCusto(Point pDistino){
		double peso = 0.8;
		return peso * this.posicao.distance(pDistino) + (1-peso)*(100-bateria);
		
	}

	public void enviar(){
		
		
		
		
	}
	
	
	public void receber(Msg msg){
		if(conteudo.equals(msg.getDados())){
			if (msg.getVida() > 0) {
				msg.envelhecer();
				msgLidas.add(msg.getIdmsg());

				// id sink recebendo msg
				if (msg.getNoDestino() != id) {
					enviar();
				}

				// if(msg.getRegiaoDestino() == regiao){
				// rgf(msg);
				//
				// }
				else
					conteudo = msg.getDados();
			}
		}
		
		
	}
	public void atualizar(){
		
	}
	
	

	
	
}
