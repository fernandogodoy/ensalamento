package br.ensalamento.persistence;

import br.ensalamento.domain.ProfessorMateria;

public class ProfessorMateriaDAOImpl extends GenericDAOImpl<ProfessorMateria> implements ProfessorMateriaDAO{

	public ProfessorMateriaDAOImpl() {
		super(ProfessorMateria.class);
	}
	
}
