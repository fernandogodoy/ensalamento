package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.TypedQuery;

import br.ensalamento.domain.Professor;

public class ProfessorDAOImpl extends GenericDAOImpl<Professor> implements ProfessorDAO {

	public ProfessorDAOImpl() {
		super(Professor.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Professor> consultar(String nome) {
		TypedQuery query = (TypedQuery) getEntityManager()
				.createQuery("SELECT o FROM Professor o  WHERE UPPER(nome) like ?");
		query.setParameter(1, '%' + nome.toUpperCase() + '%');
		return query.getResultList();
	}

}
