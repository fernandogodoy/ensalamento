package br.ensalamento.persistence;

import java.util.List;

import br.ensalamento.domain.DisponibilidadeProfessor;
import br.ensalamento.domain.Professor;

public interface DisponibilidadeProfessorDAO extends GenericDAO<DisponibilidadeProfessor>{
	
	List<DisponibilidadeProfessor> consultar(Professor professor);

}
