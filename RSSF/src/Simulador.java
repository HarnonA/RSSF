package RSSF;
import java.util.ArrayList;
import java.awt.Point;

public class Simulador {
 
	ArrayList<Node> nodelist;
	
	public Simulador(){
		//Creating Nodes.
		nodelist = new ArrayList<Node>();
		
		nodelist.add( new Node( 0, new Point(8, 4),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 1, new Point(12, 23),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 2, new Point(2, 30),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 3, new Point(1, 57),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 4, new Point(13, 65),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 5, new Point(11, 82),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 6, new Point(1, 90),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 7, new Point(15, 114),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 8, new Point(5, 130),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 9, new Point(10, 150),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 10, new Point(29, 8),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 11, new Point(28, 20),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 12, new Point(23, 35),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 13, new Point(22, 52),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 14, new Point(21, 73),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 15, new Point(17, 90),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 16, new Point(15, 93),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 17, new Point(24, 111),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 18, new Point(22, 135),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 19, new Point(25, 140),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 20, new Point(45, 6),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 21, new Point(40, 25),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 22, new Point(37, 30),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 23, new Point(42, 54),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 24, new Point(42, 66),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 25, new Point(36, 83),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 26, new Point(45, 100),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 27, new Point(33, 117),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 28, new Point(41, 130),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 29, new Point(31, 135),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 30, new Point(45, 2),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 31, new Point(46, 17),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 32, new Point(51, 44),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 33, new Point(58, 50),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 34, new Point(45, 65),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 35, new Point(50, 81),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 36, new Point(57, 98),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 37, new Point(53, 110),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 38, new Point(46, 127),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 39, new Point(54, 143),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 40, new Point(72, 1),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 41, new Point(64, 18),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 42, new Point(70, 34),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 43, new Point(74, 58),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 44, new Point(73, 69),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 45, new Point(68, 80),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 46, new Point(65, 100),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 47, new Point(73, 119),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 48, new Point(62, 129),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 49, new Point(68, 145),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 50, new Point(80, 9),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 51, new Point(76, 15),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 52, new Point(88, 31),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 53, new Point(86, 58),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 54, new Point(83, 64),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 55, new Point(83, 84),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 56, new Point(89, 97),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 57, new Point(89, 118),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 58, new Point(83, 120),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 59, new Point(82, 146),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 60, new Point(93, 3),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 61, new Point(105, 30),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 62, new Point(103, 36),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 63, new Point(93, 60),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 64, new Point(90, 62),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 65, new Point(96, 83),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 66, new Point(102, 101),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 67, new Point(98, 118),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 68, new Point(92, 132),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 69, new Point(93, 148),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 70, new Point(119, 9),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 71, new Point(105, 16),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 72, new Point(120, 41),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 73, new Point(112, 54),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 74, new Point(108, 62),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 75, new Point(117, 84),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 76, new Point(117, 102),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 77, new Point(118, 110),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 78, new Point(106, 128),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 79, new Point(120, 144),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 80, new Point(135, 2),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 81, new Point(129, 17),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 82, new Point(133, 31),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 83, new Point(133, 54),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 84, new Point(120, 68),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 85, new Point(130, 81),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 86, new Point(128, 97),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 87, new Point(131, 109),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 88, new Point(129, 132),  "Sem Conteudo", 2, 40) );
		nodelist.add( new Node( 89, new Point(131, 139),  "Sem Conteudo", 2, 40) );
		nodelist.add( new Node( 90, new Point(143, 0),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 91, new Point(146, 22),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 92, new Point(149, 38),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 93, new Point(149, 47),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 94, new Point(145, 62),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 95, new Point(135, 80),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 96, new Point(136, 96),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 97, new Point(137, 114),  "Sem Conteudo", 2, 40) );
		nodelist.add( new Node( 98, new Point(147, 121),  "Sem Conteudo", 2, 40) );
		nodelist.add( new Node( 99, new Point(135, 148),  "Sem Conteudo", 2, 40) );

	}
	
	/*
	 * Pré-processamento dos nós.
	 */
	public void prepararSimulador(){
		for (int i = 0; i < this.nodelist.size(); ++i){
			ArrayList<Node> vizinhos = this.pegarVizinhos(this.nodelist.get(i));
			for(int j = 0; j < vizinhos.size(); ++j){
				this.nodelist.get(i).setVizinho( vizinhos.get(j) );
			}
		}
	}
	
	/*
	 * Pega os vizinhos de um nó.
	 */
	public ArrayList<Node> pegarVizinhos(Node sensor){
		ArrayList<Node> vizinhos = new ArrayList<Node>();
		
		for(int i = 0; i < this.nodelist.size(); i++){
			if( eVizinho(sensor, this.nodelist.get(i)) && sensor.id != this.nodelist.get(i).getid()){
				vizinhos.add(this.nodelist.get(i)); 
			}
		}
		return vizinhos;
	}
	
	/*
	 * Retorna verdadeiro se o sensor2 é vizinho do sensor 1.
	 */
	private boolean eVizinho(Node sensor1, Node sensor2){
		if(sensor1.getPosicao().distance( sensor2.getPosicao() ) < sensor1.getAlcance()){
			return true;
		}
		return false;
	}
	
	/*
	 * Printa.
	 */
	public void printNodeListContent(){
		for(int i = 0; i < this.nodelist.size(); ++i){
			Node n = this.nodelist.get(i);
			System.out.println("Sensor " + i + ":\n     " + n.getConteudo());
		}
	}
	
	public static void main(String[] args) {
		
		Simulador simulador = new Simulador();
		simulador.prepararSimulador();
		Node s = simulador.nodelist.get(0);
		
		/*MUDE O DESTINO AQUI*/
		Regiao regiaoDestino = new Regiao(new Point(120, 150), new Point(150, 120));
		/********************/
		
		Msg msg = new Msg("TO NO DESTINOOOO!!", regiaoDestino, 100);
		
		s.receber(msg);
		
		simulador.printNodeListContent();
		
	}

}
