package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import br.ensalamento.domain.BaseModel;

public interface GenericDAO<M extends BaseModel> {

	M getById(Long id);

	void salvar(M objeto);

	void excluir(M objeto);
	
	void excluir(Long id);
	
	void update(M objeto);
	
	EntityManager getEntityManager();

	List<M> findAll();

}
