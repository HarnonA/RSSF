package projects.GEAR;

import java.awt.Point;
import java.util.ArrayList;

public class TabelaCusto {
	int tamanho;
	ArrayList<Point> dest;
	ArrayList<Double> custo;
	ArrayList<Integer> sensorEscolhido;
	/*
	 * Contrutor.
	 */
	public TabelaCusto(){
		this.tamanho = 0;
		this.dest = new ArrayList<Point>();
		this.custo  = new ArrayList<Double>();
		this.sensorEscolhido = new ArrayList<Integer>();
	}
	
	/*
	 * Retorna o endereco do custo do no a regiao.
	 * Caso nao exita retorna -1.
	 */
	public int getEndereco(Point p){
		for(int i = 0; i < this.dest.size(); ++i ){
			if(this.dest.get(i).x == p.x &&
					this.dest.get(i).y == p.y){
				return i;
			}
		}
		return -1;
	}
	
	public double getCustoTotal(int index){
		if(index >=0 && index < tamanho)
			return this.custo.get(index);
		else
			return -1;
	}
	
	public int getSensorEscolhido(int index){
		if(index >=0 && index < tamanho)
			return this.sensorEscolhido.get(index);
		else
			return -1;
	}
	
	public boolean eMelhor(int index, int VizinhoID){
		if( this.sensorEscolhido.get(index) == VizinhoID )
			return true;
		else
			return false;
	}
	
	public void setEscolhido(int index, int escolhido, double custoEscolhido){
		this.sensorEscolhido.set( index, escolhido);
		this.custo.set(index, custoEscolhido);
	}
	
	public void addNovoCusto( Point destino, double custo, int escolhido ){
		this.tamanho += 1;
		this.dest.add( destino );
		this.custo.add( custo );
		this.sensorEscolhido.add( escolhido );
	}
}

