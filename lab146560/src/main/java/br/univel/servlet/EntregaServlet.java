package br.univel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.univel.ejb.ProcessEntrega;
import br.univel.entity.Entrega;
import br.univel.entity.Venda;
import br.univel.mdb.MdbAuditoria;

@WebServlet("/entrega")
public class EntregaServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private final static Logger LOGGER = Logger.getLogger(EntregaServlet.class.toString());
	
	@EJB
	private ProcessEntrega processEntrega;
	
	@Inject 
	public JMSContext context;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOGGER.info("SERVLET DA ENTREGA");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.write("Servlet da Entrega<br>");
		
		Entrega entrega = new Entrega(1, "Rua das Flores");
		
 		out.write("Iniciando processo de entrega <br>");

 		//Repassando o objeto para o EJB
 		try {
			processEntrega.processarEntrega(entrega);
		} catch (JMSException e) {
			System.out.println("Não foi possível processar a entrega.");
			e.printStackTrace();
		}
 		
 		out.write("Processo de entrega concluído.<br>");	
 	}
}
