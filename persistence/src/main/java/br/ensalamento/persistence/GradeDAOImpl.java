package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.TypedQuery;

import br.ensalamento.domain.Grade;
import br.ensalamento.domain.Materia;
import br.ensalamento.domain.Professor;
import br.ensalamento.domain.Turma;

public class GradeDAOImpl extends GenericDAOImpl<Grade> implements GradeDAO {

	public GradeDAOImpl() {
		super(Grade.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Grade> consultar(Professor professor) {
		TypedQuery query = (TypedQuery) getEntityManager()
				.createQuery("SELECT o FROM Grade o  WHERE professor = ?");
		query.setParameter(1, professor);
		return query.getResultList();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Grade> consultar(Materia materia) {
		TypedQuery query = (TypedQuery) getEntityManager()
				.createQuery("SELECT o FROM Grade o  WHERE materia = ?");
		query.setParameter(1, materia);
		return query.getResultList();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Grade> consultar(Turma turma) {
		TypedQuery query = (TypedQuery) getEntityManager()
				.createQuery("SELECT o FROM Grade o  WHERE turma = ?");
		query.setParameter(1, turma);
		return query.getResultList();
	}

}
