package br.univel.servlet;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.jms.JMSException;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.univel.ejb.ProcessVenda;
import br.univel.entity.Venda;

/**
 * WebService JaxWS da Entrega
 * @author Thaís 18 de set de 2016 - 15:02:51
 */

@WebService
public class VendaJaxWS {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private ProcessVenda processVenda;

	@WebMethod(operationName = "operacaoVenda") //Denota que o método está disponível para serviço Web 
	@WebResult(name = "resultadoVenda") //Controla o resultado gerado pelo WebMethod
	public void serviceEnviarVenda() {

		ArrayList<String> itens = new ArrayList<>();
		itens.add("Caneta");
		itens.add("Estojo");

		Venda venda = new Venda(2, itens);

		try {
			//Enviando objeto Entrega para EJB
			processVenda.processarVenda(venda);
		} catch (JMSException e) {
			System.out.println("Não foi possível processar a venda.");
			e.printStackTrace();
		}
	}
}
