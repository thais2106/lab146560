package br.univel.ejb;

import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Topic;

import br.univel.entity.Venda;
import br.univel.servlet.ConfigServlet;

/**
 * EJB que recebe o objeto serializável VENDA por parâmetro e repassará para o TOPICO
 * @author tcrivelatti
 * 11 de ago de 2016
 */

@Stateless
public class ProcessVenda {
	
	@Inject 
	public JMSContext context;
	
	@Resource(lookup = "java:/topic/TopicVenda")
	public Topic topic;
	
	private final static Logger LOGGER = Logger.getLogger(ProcessVenda.class.toString());
	
	//Método que recebe o objeto VENDA e repassa para os MDBs
    public void processarVenda(Venda venda) throws JMSException {
    	LOGGER.info("PROCESSANDO VENDA NO EJB");
    	
    	Destination dest = topic;
    	
    	ObjectMessage object = context.createObjectMessage();
    	object.setObject(venda);
    	
    	//Repassa o objeto para o os MDBs
    	context.createProducer().send(dest, object);
    }

}
