package br.univel.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tcrivelatti 11 de ago de 2016
 */

@JMSDestinationDefinitions(value = {
		@JMSDestinationDefinition(name = "java:/queue/QueuePedido ", interfaceName = "javax.jms.Queue", destinationName = "QueuePedido"),
		@JMSDestinationDefinition(name = "java:/topic/TopicVenda", interfaceName = "javax.jms.Topic", destinationName = "TopicVenda") })

@WebServlet("/config")
public class ConfigServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final int MSG_COUNT = 3;

	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue queue;

	@Resource(lookup = "java:/topic/TopicVenda")
	private Topic topic;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		try {
			boolean useTopic = req.getParameterMap().keySet().contains("topic");
			final Destination destinoTopic = useTopic ? topic : queue;

			out.write("Enviando mensagens para " + destinoTopic);
			
			for (int i = 0; i < MSG_COUNT; i++) {
				String text = "Esta é uma mensagem" + (i + 1);
				context.createProducer().send(destinoTopic, text);
			}
			
			out.write("Processo topicVenda terminado.");
			
			
			boolean useQueue = req.getParameterMap().keySet().contains("queue");
			final Destination destinoQueue = useTopic ? topic : queue;

			out.write("Enviando mensagens para" + destinoQueue);
			
			for (int i = 0; i < MSG_COUNT; i++) {
				String text = "Esta é uma mensagem" + (i + 1);
				context.createProducer().send(destinoQueue, text);
			}
			
			out.write("Processo queuePedido terminado.");
			
			
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

}
