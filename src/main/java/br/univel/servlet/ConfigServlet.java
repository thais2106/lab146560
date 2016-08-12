package br.univel.servlet;

import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;

/**
 * @author tcrivelatti
 * 11 de ago de 2016
 */

@JMSDestinationDefinitions(value = {
		@JMSDestinationDefinition(
				name = "java:/queue/QueuePedido ",
				interfaceName = "javax.jms.Queue",
				destinationName = "QueuePedido"
				),
		@JMSDestinationDefinition(
				name = "java:/topic/TopicVenda",
				interfaceName = "javax.jms.Topic",
				destinationName = "TopicVenda")
		})
public class ConfigServlet {

}
