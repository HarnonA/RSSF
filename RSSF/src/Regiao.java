import java.awt.Point;

public class Regiao {
	int idReg;
	Point sup;
	Point inf;
	
	
	public Regiao(Point sup, Point inf){
		this.sup = sup;
		this.inf = inf;
	}
	
	public boolean estaDentro(Point no){
		//no dentro do limite de x
		if(no.getX()>= sup.getX() && no.getX() <= inf.getX()){
			//no dentro do limite de y
			if(no.getY() >= inf.getY() && no.getY() <= sup.getY())
				return true;
		}
		return false;		
	}
	
	public int nNosDentro(Node no){
		int cont = 0;
		for (int i = 0; i < no.vizinhos.size(); i++) {
			//if no dentro da regiao
			if(estaDentro(no.vizinhos.get(i).posicao))
				cont++;	
		}
		return cont;
	}
	
	public int getRegiao(){
		return idReg;
	}
	
	public void subreg(Regiao r){
		
		
	}

}
