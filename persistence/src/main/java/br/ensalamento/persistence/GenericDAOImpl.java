package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	public GenericDAOImpl(Class<T> objeto) {
		this.objeto = objeto;
	}

	private Class<T> objeto;

	@PersistenceContext
	public EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public T getById(Long id) {
		return entityManager.find(objeto, id);
	}

	@Transactional
	@Override
	public void salvar(T objeto) {
		
		entityManager.merge(objeto);

	}

	@Override
	public void update(T objeto) {
		entityManager.getTransaction().begin();
		entityManager.merge(objeto);
		entityManager.getTransaction().commit();
	}

	@Override
	public void excluir(T objeto) {
		entityManager.getTransaction().begin();
		entityManager.remove(objeto);
		entityManager.getTransaction().commit();

	}

	@Override
	public void excluir(Long id) {
		excluir(getById(id));
	}

	@Override
	public List<T> findAll() {
		TypedQuery<T> q = entityManager.createQuery(" FROM " + this.objeto.getSimpleName(), this.objeto);
		return q.getResultList();
	}

}
