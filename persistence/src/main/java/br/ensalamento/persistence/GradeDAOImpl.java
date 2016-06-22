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

	@Override
	public List<Grade> consultar(Professor professor) {
		TypedQuery<Grade> query = getEntityManager()
				.createQuery("SELECT o FROM Grade o  WHERE professor = ?", Grade.class);
		query.setParameter(1, professor);
		return query.getResultList();
	}

	@Override
	public List<Grade> consultar(Materia materia) {
		TypedQuery<Grade> query = getEntityManager()
				.createQuery("SELECT o FROM Grade o  WHERE materia = ?", Grade.class);
		query.setParameter(1, materia);
		return query.getResultList();
	}

	@Override
	public List<Grade> consultar(Turma turma) {
		TypedQuery<Grade> query = getEntityManager()
				.createQuery("SELECT o FROM Grade o  WHERE turma = ?", Grade.class);
		query.setParameter(1, turma);
		return query.getResultList();
	}

}
