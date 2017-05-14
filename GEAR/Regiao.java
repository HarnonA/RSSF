package projects.GEAR;
import java.awt.Point;

public class Regiao {
	private Point sup;
	private Point inf;
	
	public Regiao(Point sup, Point inf){
		this.sup = sup; // Superior esquerdo.
		this.inf = inf; // Inferior direiro.
	}

	public Point getSup(){
		return this.sup;
	}
	
	public Point getInf(){
		return this.inf;
	}
	
	@Override
	public String toString(){
		return "Regiao (" + this.sup.x + ", "+ this.sup.y + ") (" + this.inf.x + ", " + this.inf.y+ ")"; 
	}
}
