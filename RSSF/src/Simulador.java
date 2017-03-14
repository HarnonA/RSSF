package RSSF;
import java.util.ArrayList;
import java.awt.Point;

public class Simulador {
 
	ArrayList<Node> nodelist;
	
	public Simulador(){
		//Creating Nodes.
		nodelist = new ArrayList<Node>();
		
		nodelist.add( new Node( 0, new Point(4, 2),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 1, new Point(4, 24),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 2, new Point(12, 54),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 3, new Point(16, 72),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 4, new Point(16, 81),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 5, new Point(12, 117),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 6, new Point(4, 121),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 7, new Point(11, 157),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 8, new Point(14, 168),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 9, new Point(6, 184),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 10, new Point(33, 2),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 11, new Point(28, 39),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 12, new Point(35, 41),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 13, new Point(29, 65),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 14, new Point(31, 100),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 15, new Point(29, 114),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 16, new Point(31, 122),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 17, new Point(22, 147),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 18, new Point(38, 165),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 19, new Point(40, 193),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 20, new Point(57, 12),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 21, new Point(43, 31),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 22, new Point(42, 60),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 23, new Point(56, 61),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 24, new Point(46, 82),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 25, new Point(55, 114),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 26, new Point(46, 133),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 27, new Point(59, 159),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 28, new Point(53, 163),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 29, new Point(58, 182),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 30, new Point(68, 5),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 31, new Point(74, 33),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 32, new Point(73, 48),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 33, new Point(79, 66),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 34, new Point(65, 87),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 35, new Point(63, 109),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 36, new Point(78, 137),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 37, new Point(62, 140),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 38, new Point(80, 161),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 39, new Point(80, 190),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 40, new Point(85, 2),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 41, new Point(92, 29),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 42, new Point(99, 48),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 43, new Point(89, 65),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 44, new Point(98, 94),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 45, new Point(99, 106),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 46, new Point(94, 121),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 47, new Point(87, 158),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 48, new Point(89, 177),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 49, new Point(98, 194),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 50, new Point(116, 16),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 51, new Point(108, 33),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 52, new Point(103, 40),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 53, new Point(101, 73),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 54, new Point(101, 99),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 55, new Point(103, 101),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 56, new Point(106, 132),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 57, new Point(104, 157),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 58, new Point(101, 163),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 59, new Point(105, 196),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 60, new Point(128, 18),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 61, new Point(136, 34),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 62, new Point(121, 40),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 63, new Point(124, 73),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 64, new Point(123, 88),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 65, new Point(120, 103),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 66, new Point(121, 121),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 67, new Point(130, 143),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 68, new Point(125, 173),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 69, new Point(130, 194),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 70, new Point(140, 2),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 71, new Point(146, 31),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 72, new Point(143, 54),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 73, new Point(145, 69),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 74, new Point(152, 85),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 75, new Point(152, 120),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 76, new Point(141, 131),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 77, new Point(145, 153),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 78, new Point(158, 175),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 79, new Point(157, 185),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 80, new Point(162, 16),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 81, new Point(162, 23),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 82, new Point(172, 42),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 83, new Point(165, 71),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 84, new Point(169, 91),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 85, new Point(165, 102),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 86, new Point(179, 124),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 87, new Point(173, 153),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 88, new Point(163, 179),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 89, new Point(164, 185),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 90, new Point(188, 3),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 91, new Point(193, 25),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 92, new Point(191, 52),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 93, new Point(197, 66),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 94, new Point(185, 99),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 95, new Point(186, 115),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 96, new Point(197, 127),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 97, new Point(197, 151),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 98, new Point(182, 161),  "Sem Conteudo", 1, 40) );
		nodelist.add( new Node( 99, new Point(181, 198),  "Sem Conteudo", 1, 40) );


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
		Regiao regiaoDestino = new Regiao(new Point(160, 200), new Point(200, 160));
		/********************/
		
		Msg msg = new Msg("TO NO DESTINOOOO!!", regiaoDestino, 100);
		
		s.receber(msg);
		
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
