
public class Msg {
	String dados;
	int regiaoDestino;
	int noDestino;
	int vida;
	int idMsg;
	
	public Msg(String dados,int noDestino,int vida, int idMsg, int no){
		this.dados = dados;
		this.regiaoDestino = noDestino;
		this.vida = vida;
		this.idMsg = idMsg;
		this.noDestino = no;
	}

	public String getDados() {
		return dados;
	}

	public int getRegiaoDestino() {
		return regiaoDestino;
	}

	public int getVida() {
		return vida;
	}
	public int getIdmsg() {
		return idMsg;
	}
	
	public int getNoDestino(){
		return noDestino;
	}
	
	public void envelhecer(){
		--vida;
	}
	
	
	

}
