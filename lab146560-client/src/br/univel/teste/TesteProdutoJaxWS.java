package br.univel.teste;

import java.math.BigDecimal;
import java.util.List;

import br.univel.ProdutoJaxWSclient.Produto;
import br.univel.ProdutoJaxWSclient.ProdutoJaxWS;
import br.univel.ProdutoJaxWSclient.ProdutoJaxWSService;

public class TesteProdutoJaxWS {
	private static ProdutoJaxWSService service = new ProdutoJaxWSService();
	private static ProdutoJaxWS operacao = service.getProdutoJaxWSPort();

	public static void main(String[] args) {

		// Criando produtos
		Produto p1 = new Produto();
		p1.setDescricao("Produto 1");
		p1.setCodigoBarras("123456");
		p1.setPreco(new BigDecimal(15.00));
		operacao.createProduto(p1);

		Produto p2 = new Produto();
		p2.setDescricao("Produto 2");
		p2.setCodigoBarras("2222222");
		p2.setPreco(new BigDecimal(8.00));
		operacao.createProduto(p2);

		Produto p3 = new Produto();
		p3.setDescricao("Produto 3");
		p3.setCodigoBarras("763876287");
		p3.setPreco(new BigDecimal(17.50));
		operacao.createProduto(p3);

		// Mostrando produtos cadastrados
		mostrar();

		// Altera produto
		System.out.println("|--- Alterando produto ---|");
		Produto alteraProduto = operacao.readProduto(2L);
		alteraProduto.setDescricao("Caderno Pautado");
		alteraProduto.setPreco(new BigDecimal(28.00));
		operacao.updateProduto(alteraProduto);

		// Mostra lista de produtos novamente
		mostrar();

	}

	private static void mostrar() {
		List<Produto> produtos = operacao.readAll();

		System.out.println("|--- LISTA DE PRODUTOS ---|");
		for (Produto produto : produtos) {
			System.out.println("Produto " + produto.getId() + "\n" + "Descricao.:" + produto.getDescricao() + "\n"
					+ "Cod.Barras:" + produto.getCodigoBarras() + "\n" + "Preco.....:" + produto.getPreco());
		}

	}

}
