package br.univel.entity;

import java.io.Serializable;

/**
 * @author tcrivelatti
 * 11 de ago de 2016
 */

public class Entrega implements Serializable {

	private int idEntrega;
	private String endereco;
	
	public Entrega(){
		
	}
	
	public Entrega(int idEntrega, String endereco){
		this.idEntrega = idEntrega;
		this.endereco = endereco;
	}

	public int getIdEntrega() {
		return idEntrega;
	}
	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
