package br.univel.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.jms.JMSException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.univel.ejb.ProcessEntrega;
import br.univel.entity.Entrega;

/**
 * WebService JaxWS da Entrega
 * @author Thaís 18 de set de 2016 - 14:54:43
 */

@WebService
public class EntregaJaxWS extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB
	private ProcessEntrega processEntrega;

	@WebMethod(operationName="operacaoEntrega") //Denota que o método está disponível para serviço Web 
	@WebResult(name="resultadoEntrega") //Controla o resultado gerado pelo WebMethod
	@Override
	protected void doGet(@WebParam(name = "paramReq") HttpServletRequest req,
			@WebParam(name = "paramResp") HttpServletResponse resp) throws ServletException, IOException {

		Entrega entrega = new Entrega(2, "Boulevard of Broken Dreams");
		
		try {
			//Enviando objeto Entrega para EJB
			processEntrega.processarEntrega(entrega);
		} catch (JMSException e) {
			System.out.println("Não foi possível processar a entrega.");
			e.printStackTrace();
		}
	}
}
