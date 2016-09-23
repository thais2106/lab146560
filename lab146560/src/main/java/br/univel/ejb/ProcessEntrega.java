package br.univel.ejb;

import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Queue;

import br.univel.entity.Entrega;
import br.univel.mdb.MdbAuditoria;
import br.univel.servlet.ConfigServlet;

/**
 * @author tcrivelatti
 * 11 de ago de 2016
 */

@Stateless
public class ProcessEntrega {

	@Inject 
	public JMSContext context;
	
	@Resource(lookup = "java:/queue/QueuePedido")
	public Queue queue;
	
	private final static Logger LOGGER = Logger.getLogger(ProcessEntrega.class.toString());

	//Método que recebe o objeto ENTREGA e repassa para os MDBs
    public void processarEntrega(Entrega entrega) throws JMSException {
    	LOGGER.info("PROCESSANDO ENTREGA NO EJB");
    	
    	Destination dest = queue;
    	
    	ObjectMessage object = context.createObjectMessage();
    	object.setObject(entrega);
    	
    	//Repassa o objeto para o os MDBs
    	context.createProducer().send(dest, object);
    }

}
