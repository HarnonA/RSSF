package RSSF;

public class Msg {
	String dados;
	Regiao regiaoDestino;
	int vida;
	
	public Msg(String dados, Regiao regDestino,int vida){
		this.dados = dados;
		this.regiaoDestino = regDestino;
		this.vida = vida;
	}

	public String getDados() {
		return dados;
	}

	public Regiao getRegiaoDestino() {
		return regiaoDestino;
	}
	
	public void setRegiao( Regiao reg ) {
		this.regiaoDestino = reg;
	}

	public int getVida() {
		return vida;
	}
	
	public void envelhecer(){
		--vida;
	}

}
