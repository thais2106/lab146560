package br.univel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.univel.ejb.ProcessVenda;
import br.univel.entity.Venda;
import br.univel.mdb.MdbAuditoria;

/**
 * Nesta classe deverá ser instanciado o objeto Venda que será repassado para o EJB
 * @author Thaís 
 * 13 de set de 2016 - 20:54:10
 */
@WebServlet("/venda")
public class VendaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final static Logger LOGGER = Logger.getLogger(VendaServlet.class.toString());
	
	@EJB
	private ProcessVenda processVenda;
	
	@Inject 
	public JMSContext context;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOGGER.info("SERVLET DA VENDA");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.write("Servlet da Venda. <br>");
		
		//ArrayList de itens
		ArrayList< String> itens = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			itens.add("Item "+i);
		}
		
		//Instanciando objeto do tipo Venda
 		Venda venda = new Venda(1, itens);
 		
 		out.write("Iniciando processamento de venda <br>");
 		//Repassando o objeto para o EJB
 		try {
			processVenda.processarVenda(venda);
		} catch (JMSException e) {
			System.out.println("Não foi possível processar a venda.");
			e.printStackTrace();
		}
 		
 		out.write("Processo de venda concluído.<br>");
	}

}
