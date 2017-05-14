package projects.GEAR;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import jsensor.nodes.events.TimerEvent;
import jsensor.runtime.Jsensor;
import jsensor.utils.Configuration;

public class MyTimer extends TimerEvent{
	static int num = 1;
	
	@Override
	public void fire() {
		
		// Cria uma mensagem.
		Regiao destino = getRandomRegiao();
		String texto = "'MENSAGEM  NUMERO "+ MyTimer.num + "'";
		ArrayList<Integer> caminho = new ArrayList<>();
		caminho.add(this.node.getID());
		Msg mensagem = new Msg(texto, caminho, destino, 100);
		
		MyTimer.num += 1;
		
		System.out.println("time: "+ Jsensor.currentTime +"\t sensorID: "+ this.node.getID() + 
				"\t sendTo: (" + destino.getSup().getX() + ", " + destino.getSup().getY() + 
				") (" + destino.getInf().getX() + ", " + destino.getInf().getY() + ")\n");
		
		Sensor origem = (Sensor)this.node;
		Sensor vizinho = origem.melhorVizinhos(destino);
		
		//System.out.println(" 1 enviando de " + this.node.getID() + " até " + vizinho.getID() + "\n");
		
		
		//Envia a mensagem
		this.node.unicast(mensagem, vizinho);
	}
	
	/*
	 * Gera aleatoriamento uma regiao destino
	 */
	private Regiao getRandomRegiao(){
		int maxW = Configuration.dimX;
		int maxH = Configuration.dimY;
		
		Random rand = new Random();
		
		int x = rand.nextInt( maxW - 40 );
		int y =  rand.nextInt( maxH-40 ) +40;
		
		Point sup = new Point( x, y); 
		Point inf = new Point( x+40 , y-40);
		
		return new Regiao(sup, inf);
		
	}
}
