package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public abstract class GenericDAOImpl<K> implements GenericDAO<K> {

	public GenericDAOImpl(Class<K> objeto) {
		this.objeto = objeto;
	}

	private Class<K> objeto;

	@PersistenceContext(unitName = "EnsalamentoPU")
	public EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public K getById(Long id) {
		return entityManager.find(objeto, id);
	}

	@Override
	public void salvar(K objeto) {
		entityManager.getTransaction().begin();
		entityManager.persist(objeto);
		entityManager.getTransaction().commit();

	}

	@Override
	public void update(K objeto) {
		entityManager.getTransaction().begin();
		entityManager.merge(objeto);
		entityManager.getTransaction().commit();
	}

	@Override
	public void excluir(K objeto) {
		entityManager.getTransaction().begin();
		entityManager.remove(objeto);
		entityManager.getTransaction().commit();

	}

	@Override
	public void excluir(Long id) {
		excluir(getById(id));
	}

	@Override
	public List<K> findAll() {
		TypedQuery<K> q = entityManager.createQuery(" FROM " + this.objeto.getSimpleName(), this.objeto);
		return q.getResultList();
	}

}
