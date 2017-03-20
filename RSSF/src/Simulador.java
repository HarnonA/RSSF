package RSSF;
import java.util.ArrayList;
import java.awt.Point;

public class Simulador {
 
	ArrayList<Node> nodelist;
	
	public Simulador(){
		//Creating Nodes.
		nodelist = new ArrayList<Node>();
		
		nodelist.add( new Node( 0, new Point(0, 10),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 1, new Point(18, 24),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 2, new Point(5, 43),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 3, new Point(1, 80),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 4, new Point(6, 95),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 5, new Point(1, 115),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 6, new Point(15, 130),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 7, new Point(10, 160),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 8, new Point(7, 172),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 9, new Point(17, 181),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 10, new Point(35, 2),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 11, new Point(28, 36),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 12, new Point(40, 40),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 13, new Point(29, 69),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 14, new Point(23, 81),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 15, new Point(27, 106),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 16, new Point(22, 128),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 17, new Point(35, 149),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 18, new Point(30, 168),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 19, new Point(23, 181),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 20, new Point(47, 0),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 21, new Point(58, 20),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 22, new Point(54, 51),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 23, new Point(43, 68),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 24, new Point(57, 95),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 25, new Point(53, 105),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 26, new Point(57, 123),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 27, new Point(48, 157),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 28, new Point(45, 166),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 29, new Point(42, 194),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 30, new Point(72, 18),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 31, new Point(61, 32),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 32, new Point(60, 54),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 33, new Point(79, 80),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 34, new Point(79, 89),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 35, new Point(75, 115),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 36, new Point(75, 134),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 37, new Point(74, 153),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 38, new Point(75, 172),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 39, new Point(73, 199),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 40, new Point(87, 14),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 41, new Point(89, 35),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 42, new Point(100, 55),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 43, new Point(87, 76),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 44, new Point(95, 80),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 45, new Point(94, 118),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 46, new Point(91, 140),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 47, new Point(93, 155),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 48, new Point(91, 173),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 49, new Point(81, 195),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 50, new Point(115, 0),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 51, new Point(104, 31),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 52, new Point(112, 60),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 53, new Point(111, 73),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 54, new Point(115, 84),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 55, new Point(114, 101),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 56, new Point(119, 136),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 57, new Point(103, 147),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 58, new Point(118, 173),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 59, new Point(116, 181),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 60, new Point(125, 1),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 61, new Point(130, 33),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 62, new Point(127, 42),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 63, new Point(140, 62),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 64, new Point(125, 100),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 65, new Point(136, 109),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 66, new Point(131, 127),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 67, new Point(137, 151),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 68, new Point(127, 175),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 69, new Point(137, 197),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 70, new Point(147, 10),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 71, new Point(160, 21),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 72, new Point(157, 60),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 73, new Point(152, 71),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 74, new Point(156, 94),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 75, new Point(143, 112),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 76, new Point(142, 124),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 77, new Point(140, 148),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 78, new Point(156, 178),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 79, new Point(141, 182),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 80, new Point(169, 16),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 81, new Point(167, 28),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 82, new Point(180, 55),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 83, new Point(162, 70),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 84, new Point(166, 84),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 85, new Point(177, 115),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 86, new Point(164, 134),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 87, new Point(165, 146),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 88, new Point(170, 165),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 89, new Point(165, 191),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 90, new Point(184, 4),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 91, new Point(186, 32),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 92, new Point(191, 55),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 93, new Point(187, 75),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 94, new Point(200, 90),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 95, new Point(192, 107),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 96, new Point(182, 127),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 97, new Point(186, 158),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 98, new Point(198, 160),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 99, new Point(182, 189),  "Sem Conteudo", 1, 40) );	

	}
	
	/*
	 * Pré-processamento dos nós.
	 */
	public double prepararSimulador(){
		double media = 0;
		for (int i = 0; i < this.nodelist.size(); ++i){
			ArrayList<Node> vizinhos = this.pegarVizinhos(this.nodelist.get(i));
			media += vizinhos.size();
			for(int j = 0; j < vizinhos.size(); ++j){
				this.nodelist.get(i).setVizinho( vizinhos.get(j) );
			}
		}
		
		return media/this.nodelist.size();
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
		
		long initialTime = System.currentTimeMillis();
		
		Simulador simulador = new Simulador();
		double densidade = simulador.prepararSimulador();
		Node s = simulador.nodelist.get(0);
		
		/*MUDE O DESTINO AQUI*/
		Regiao regiaoDestino = new Regiao(new Point(460, 500), new Point(500, 460));
		/********************/
		
		Msg msg = new Msg("TO NO DESTINOOOO!!", regiaoDestino, 10000);
		
		/*MUDE O ALGORITMO*/
		s.receber(msg); /* Recursive Geographical Forward*/
		//s.receberFlooding(msg); /* Flooding */
		/********************/
		
		simulador.printNodeListContent();
		
		long endTime = System.currentTimeMillis(); //finaliza a contagem do tempo	
		
		System.out.println("\nDensidade: " + densidade);
		System.out.println("numero de msgs enviadas: " + s.n_enviados);
		System.out.println("numero de msgs recebidas: " + s.n_recebidos);
		System.out.println("quantidade de energia gasta: " + s.energia_gasta);
		
		//O tempo total decorrido será o tempo final menos o tempo inicial
	    System.out.println("Tempo total em milessegundos: " + (endTime - initialTime)); 
	    System.out.println("Tempo total em segundos: " + (endTime - initialTime)/1000);
	    
	}

}
