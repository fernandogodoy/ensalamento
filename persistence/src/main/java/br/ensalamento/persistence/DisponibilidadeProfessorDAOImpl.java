package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.TypedQuery;

import br.ensalamento.domain.DisponibilidadeProfessor;
import br.ensalamento.domain.Professor;

public class DisponibilidadeProfessorDAOImpl extends GenericDAOImpl<DisponibilidadeProfessor>
		implements DisponibilidadeProfessorDAO {

	public DisponibilidadeProfessorDAOImpl() {
		super(DisponibilidadeProfessor.class);
	}

	@Override
	public List<DisponibilidadeProfessor> consultar(Professor professor) {
		TypedQuery<DisponibilidadeProfessor> query = getEntityManager().createQuery(
				"SELECT o FROM DisponibilidadeProfessor o  WHERE professor = ? ", DisponibilidadeProfessor.class);
		query.setParameter(1, professor);
		return query.getResultList();
	}

}
