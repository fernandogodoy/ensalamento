package br.ensalamento.persistence;

import java.util.List;

import br.ensalamento.domain.Curso;

public interface CursoDAO extends GenericDAO<Curso> {
	
	List<Curso> consultar(String nome);

}
