package br.ensalamento.persistence;

import java.util.List;

import br.ensalamento.domain.Professor;

public interface ProfessorDAO extends GenericDAO<Professor>{
	
	List<Professor> consultar(String nome);

}
