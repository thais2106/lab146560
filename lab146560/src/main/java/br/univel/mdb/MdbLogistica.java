package br.univel.mdb;

import java.util.Date;
import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.univel.entity.Entrega;
import br.univel.entity.Log;

/**
 * @author Thaís 14 de ago de 2016
 */

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.msg.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class MdbLogistica implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	@PersistenceContext(unitName = "lab146560-persistence-unit")
	private EntityManager em;

	public void onMessage(Message rcvMessage) {
		ObjectMessage msg = null;

		try {
			if (rcvMessage instanceof ObjectMessage) {
				msg = (ObjectMessage) rcvMessage;
				Entrega entrega = (Entrega) msg.getObject();

				Thread.sleep(20000);

				String info = "Entrega " + entrega.getIdEntrega() + " concluída!";
				LOGGER.info(info);

				Log log = new Log();
				log.setNomeMdb(MdbLogistica.class.toString());
				log.setDataHora(new Date(System.currentTimeMillis()));
				log.setInfo(info);

				em.persist(log);

			} else {
				LOGGER.warning("Message of Wrong type: " + rcvMessage);
			}

		} catch (InterruptedException | JMSException e) {
			e.printStackTrace();
		}

	}

}
