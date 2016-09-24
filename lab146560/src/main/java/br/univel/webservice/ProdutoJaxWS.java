package br.univel.webservice;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import br.univel.ejb.ProdutoCRUD;
import br.univel.entity.Produto;

@WebService
public class ProdutoJaxWS {
	
	@EJB
	private ProdutoCRUD crud;
	
	public void createProduto(Produto p){
		crud.create(p);
	}
	
	public Produto readProduto(Long id){
		return crud.read(id); 
	}
	
	public List<Produto> readAll(){
		return crud.readAll();
	}
	
	public void updateProduto(Produto p){
		crud.update(p);
	}
	
	public void deleteProduto(Produto p){
		crud.delete(p);
	}

}
