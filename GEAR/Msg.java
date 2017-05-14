package projects.GEAR;

import java.util.ArrayList;

import jsensor.nodes.messages.Message;

public class Msg extends Message{
	
	private String conteudo;
    private int tempoDeVida;
    private ArrayList<Integer> caminho;
    private Regiao destino;
    
    public Msg( String texto, ArrayList<Integer> caminho, Regiao Destino, int tempoDeVida ) {
		this.conteudo = texto;
		this.caminho = caminho;
		this.destino = Destino;
		this.tempoDeVida = tempoDeVida;
	}

	@Override
	public Message clone() {
		Msg novaMsg = new Msg(this.conteudo, this.caminho, this.destino, this.tempoDeVida-1);
		return novaMsg;
	}
	
	public String getConteudo(){
		return this.conteudo;
	}
	
	public ArrayList<Integer> getCaminho(){
		return this.caminho;
	}
	
	public Regiao getDestino(){
		return this.destino;
	}
	
	public int getTempoDeVida(){
		return this.tempoDeVida;
	}
	
	public void envelhecer(){
		this.tempoDeVida--;
	}
	
	public int getOrigem(){
		return this.caminho.get(0);
	}
	
	public void addCaminho(int sensorID ){
		this.caminho.add( sensorID );
	}
	
	public String getInfo(){
		String conteudo_caminho = this.conteudo + "\nCaminho:\n   ";
		for(int i = 0; i < this.caminho.size() -1 ; ++i){
			conteudo_caminho += this.caminho.get(i) + "-";
		}
		conteudo_caminho += "" + this.caminho.get( this.caminho.size()-1 );
		
		return conteudo_caminho;
	}
	
}
