package projects.GEAR;

import javax.naming.CommunicationException;

import jsensor.nodes.Node;
import jsensor.nodes.models.DistributionModelNode;
import jsensor.utils.Configuration;
import jsensor.utils.Position;

public class RandomDistribution extends DistributionModelNode
{
	int x = -1;
	int y = 0;
	int size = Configuration.communicationRadios[0] / 2;
	
	@Override
	public Position getPosition(Node s) {
		// Avance uma casa para a direita.
		this.x++;
		// Se não pode mais ir para a direita, volte a primera casa e avance 1 para cima.
		if( x > 0 && Configuration.dimX/x <= size){
			x = 1;
			y++;
		}
		// Se todas as casas foram preenchidas, coloque os nós aleatoriamente em qualquel lugar.
		if( y > 0 && Configuration.dimY/y <= size){
			return new Position(s.getRandom().nextInt(Configuration.dimX), s.getRandom().nextInt(Configuration.dimY));
		}
		
		return new Position(s.getRandom().nextInt( size ) + this.x*size , s.getRandom().nextInt( size) + this.y*size );
	}
}