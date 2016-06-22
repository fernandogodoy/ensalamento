package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import br.ensalamento.domain.BaseModel;

public abstract class GenericDAOImpl<M extends BaseModel> implements GenericDAO<M> {

	public GenericDAOImpl(Class<M> objeto) {
		this.objeto = objeto;
	}

	private Class<M> objeto;

	@PersistenceContext
	public EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public M getById(Long id) {
		return entityManager.find(objeto, id);
	}

	@Override
	@Transactional
	public void salvar(M objeto) {
		entityManager.merge(objeto);
	}

	@Override
	@Transactional
	public void update(M objeto) {
		if (null == objeto.getId()) {
			entityManager.persist(objeto);
		} else {
			entityManager.merge(objeto);
		}
	}

	@Transactional
	@Override
	public void excluir(M objeto) {
		entityManager.remove(getById(objeto.getId()));
	}

	@Transactional
	@Override
	public void excluir(Long id) {
		
		excluir(getById(id));
	}

	@Override
	public List<M> findAll() {
		TypedQuery<M> q = entityManager.createQuery(" FROM " + this.objeto.getSimpleName(), this.objeto);
		return q.getResultList();
	}

}
