package br.univel.teste;

import br.univel.EntregaJaxWSclient.EntregaJaxWS;
import br.univel.EntregaJaxWSclient.EntregaJaxWSService;

/**
 * Classe de teste para acessar o webservice da Entrega.
 * 
 * Lembrete: Os artefatos gerados pelos arquivos .bat tem tudo o que o WS import mapeia do webservice, 
 * cria automaticamente a minha operação definida no webmethod.
 * @author Thaís 
 * 22 de set de 2016 - 20:41:12
 */
public class TesteEntregaJaxWS {
	public static void main(String[] args) {
		
		//Instanciado os serviços do webservice
		EntregaJaxWSService entregaJax = new EntregaJaxWSService();
		
		/*
		 * Instancio um objeto do tipo EntregaJaxWS da minha interface EntregaJaxWS, onde eu tenho a declaração do meu webmethod
		 * Pego o acesso/local no qual o webservice está rodando, para ter acesso aos métodos.
		 */
		EntregaJaxWS operacao = entregaJax.getEntregaJaxWSPort();
		
		/* Acesso o método que está implementado dentro do meu webservice, no caso o método serviceEntrega(),
		 * com o nome que declarei na annotation @webMethod (operacaoEntrega).
		 */
		operacao.operacaoEntrega();
	}
}
