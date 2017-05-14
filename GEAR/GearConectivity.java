package projects.GEAR;

import jsensor.nodes.Node;
import jsensor.nodes.models.ConnectivityModel;

public class GearConectivity extends ConnectivityModel {

	@Override
	public boolean isConnected(Node arg0, Node arg1) {
		return true;
	}

}
