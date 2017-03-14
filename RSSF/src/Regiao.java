package RSSF;
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
}
