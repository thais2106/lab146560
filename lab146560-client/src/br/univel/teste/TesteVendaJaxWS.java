package br.univel.teste;

import br.univel.VendaJaxWSclient.VendaJaxWS;
import br.univel.VendaJaxWSclient.VendaJaxWSService;
/**
 * Classe de teste para acessar o webservice da Venda.
 * 
 * Lembrete: Os artefatos gerados pelos arquivos .bat tem tudo o que o WS import mapeia do webservice, 
 * cria automaticamente a minha operação definida no webmethod.
 * @author Thaís 
 * 22 de set de 2016 - 20:51:47
 */
public class TesteVendaJaxWS {
	public static void main(String[] args) {
		
		//Instanciado os serviços do webservice
		VendaJaxWSService vendaJax = new VendaJaxWSService();
		
		/*
		 * Instancio um objeto do tipo VendaJaxWS da minha interface VendaJaxWS, onde eu tenho a declaração do meu webmethod
		 * Pego o acesso/local no qual o webservice está rodando, para ter acesso aos métodos.
		 */
		VendaJaxWS porta = vendaJax.getVendaJaxWSPort();
		
		/* Acesso o método que está implementado dentro do meu webservice, no caso o método serviceVenda(),
		 * com o nome que declarei na annotation @webMethod (operacaoVenda).
		 */
		porta.operacaoVenda();
	}
}
