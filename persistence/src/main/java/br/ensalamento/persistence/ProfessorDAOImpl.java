package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.ensalamento.domain.Professor;

@Repository
public class ProfessorDAOImpl extends GenericDAOImpl<Professor> implements ProfessorDAO {

	public ProfessorDAOImpl() {
		super(Professor.class);
	}

	@Override
	public List<Professor> consultar(String nome) {
		TypedQuery<Professor> query =  getEntityManager()
				.createQuery("SELECT o FROM Professor o  WHERE UPPER(nome) like ?", Professor.class);
		query.setParameter(1, '%' + nome.toUpperCase() + '%');
		return query.getResultList();
	}

}
