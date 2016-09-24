package br.univel.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.univel.entity.Produto;

/**
 * EJB com operações CRUD para persistir os objetos Produto
 * @author Thaís 
 * 22 de set de 2016 - 21:28:03
 */

@Stateless
public class ProdutoCRUD {
	
	@PersistenceContext(unitName = "lab146560-persistence-unit")
	private EntityManager em;
	
	public void create(Produto p){
		em.persist(p);
	}
	
	public Produto read(Long id){
		Produto p = em.find(Produto.class, id);
		return p;
	}
	
	public List<Produto> readAll(){
		List<Produto> produtos = em.createNativeQuery("select * from produto", Produto.class).getResultList();
		return produtos;
	}
	
	public void update(Produto p){
		em.merge(p);	
	}
	
	public void delete(Produto p){
		em.remove(p);
	}

}
