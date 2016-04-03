package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.EntityManager;

public interface GenericDAO<K> {

	K getById(Long id);

	void salvar(K objeto);

	void excluir(K objeto);
	
	void excluir(Long id);
	
	void update(K objeto);
	
	EntityManager getEntityManager();

	List<K> findAll();

}
