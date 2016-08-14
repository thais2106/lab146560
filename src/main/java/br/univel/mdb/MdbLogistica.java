package br.univel.mdb;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 * @author Thaís 
 * 14 de ago de 2016
 */


@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName="destinationLookup", propertyValue="queue/QueuePedido"),
		@ActivationConfigProperty(propertyName="destinationType", propertyValue="javax.msg.Queue"),
		@ActivationConfigProperty(propertyName="acknowledgeMode", propertyValue="Auto-acknowledge")
})
public class MdbLogistica implements MessageListener {
	
	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	public void onMessage(Message rcvMessage) {
		ObjectMessage msg = null;
		
		try {
			if (rcvMessage instanceof ObjectMessage){
				msg = (ObjectMessage) rcvMessage;
				
				
				LOGGER.info("Mensagem recebida da fila: " + msg);
				LOGGER.info("Processando...");
				
				Thread.sleep(30000);
				
				LOGGER.info("Entrega despachada!");
			} else {
				LOGGER.warning("Message of Wrong type: " + rcvMessage);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
	}

}
