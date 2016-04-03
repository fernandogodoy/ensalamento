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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<DisponibilidadeProfessor> consultar(Professor professor) {
		TypedQuery query = (TypedQuery) getEntityManager()
				.createQuery("SELECT o FROM DisponibilidadeProfessor o  WHERE professor = ? ");
		query.setParameter(1, professor);
		return query.getResultList();
	}

}
