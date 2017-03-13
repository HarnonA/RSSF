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
	
	public int nNosDentro(){
		//for lista de nos
		//if no dentro de x e y
		//cont++
		return 0;
	}
	
	public int getRegiao(){
		return idReg;
	}
	
	public void subreg(Regiao r){
		
		
	}

}
