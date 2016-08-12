package br.univel.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author tcrivelatti
 * 11 de ago de 2016
 */

public class Venda implements Serializable{

	private int idVenda;
	private List<String> itens;

	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public List<String> getItens() {
		return itens;
	}
	public void setItens(List<String> itens) {
		this.itens = itens;
	}

}
