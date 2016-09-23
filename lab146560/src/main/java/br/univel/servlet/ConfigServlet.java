package br.univel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.inject.Inject;
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
		@JMSDestinationDefinition(name = "java:/queue/QueuePedido", 
				interfaceName = "javax.jms.Queue", 
				destinationName = "QueuePedido"),
		@JMSDestinationDefinition(name = "java:/topic/TopicVenda", 
				interfaceName = "javax.jms.Topic", 
				destinationName = "TopicVenda") })


@WebServlet("/config")
public class ConfigServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final static Logger LOGGER = Logger.getLogger(ConfigServlet.class.toString());
	
	@Inject 
	public JMSContext context;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		LOGGER.info("SERVLET DE CONFIGURAÇÃO");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.write("Servlet Config");
	
	}

}
