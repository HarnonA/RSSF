package projects.GEAR;

import jsensor.nodes.Node;
import jsensor.nodes.messages.Message;
import jsensor.nodes.models.MessageTransmissionModel;

public class ModeloDeTransmissao extends MessageTransmissionModel{

	@Override
	public float timeToReach(Node arg0, Node arg1, Message arg2) {
		return 1;
	}

}
