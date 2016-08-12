package br.univel.mdb;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import br.univel.entity.Venda;

/**
 * @author tcrivelatti
 * 11 de ago de 2016
 */

@MessageDriven(name = "MdbLog", activationConfig = {
	    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
	    @ActivationConfigProperty(propertyName = "maxSession", propertyValue = "1")})

public class MdbLog implements MessageListener{

	private final static Logger LOGGER = Logger.getLogger(MdbLog.class.toString());

	public void onMessage(Message rcvMessage) {

		ObjectMessage msg = null;
        try {
        	 if (rcvMessage instanceof ObjectMessage) {
                 msg = (ObjectMessage) rcvMessage;
                 Venda venda = (Venda) msg.getObject();
             } else {
                 LOGGER.warning("Message of wrong type:" + rcvMessage.getClass().getName());
             }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }

	}

}
