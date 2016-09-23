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

import br.univel.entity.Log;
import br.univel.entity.Venda;

/**
 * @author tcrivelatti 11 de ago de 2016
 */

@MessageDriven(name = "MdbVenda", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
		@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "1") })

public class MdbVenda implements MessageListener {

	@PersistenceContext(unitName = "lab146560-persistence-unit")
	private EntityManager em;

	private final static Logger LOGGER = Logger.getLogger(MdbVenda.class.toString());

	public void onMessage(Message rcvMessage) {

		ObjectMessage msg = null;
		try {
			if (rcvMessage instanceof ObjectMessage) {
				msg = (ObjectMessage) rcvMessage;
				Venda venda = (Venda) msg.getObject();
				String info = "Venda nº " + venda.getIdVenda() + " recebida.";
				LOGGER.info(info);

				Log log = new Log();
				log.setNomeMdb(MdbVenda.class.toString());
				log.setDataHora(new Date(System.currentTimeMillis()));
				log.setInfo(info);

				em.persist(log);

			} else {
				LOGGER.warning("Message of wrong type:" + rcvMessage.getClass().getName());
			}
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}

	}

}
