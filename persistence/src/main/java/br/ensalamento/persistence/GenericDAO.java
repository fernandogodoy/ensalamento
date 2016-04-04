package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.EntityManager;

public interface GenericDAO<T> {

	T getById(Long id);

	void salvar(T objeto);

	void excluir(T objeto);
	
	void excluir(Long id);
	
	void update(T objeto);
	
	EntityManager getEntityManager();

	List<T> findAll();

}
