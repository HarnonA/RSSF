package RSSF;
import java.awt.Point;
import java.util.ArrayList;


public class Node extends Thread{
	int id;
	int bateria;
	int alcance;
	int regiao;
	Point posicao;
	String conteudo;
	ArrayList<Integer> msgLidas;
	ArrayList<Node> vizinhos;

	public Node(int id, Point point, String conteudo,
			int regiao, int alcance){
		this.id = id;
		this.bateria = 100;
		this.alcance = alcance;
		this.conteudo= conteudo;
		this.regiao = regiao;
		this.posicao = point;
		this.msgLidas = new ArrayList<Integer>();
		this.vizinhos = new ArrayList<Node>();
		
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

	public ArrayList<Integer> getMsgLidas() {
		return msgLidas;
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
