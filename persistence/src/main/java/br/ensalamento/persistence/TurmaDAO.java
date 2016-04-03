package br.ensalamento.persistence;

import java.util.List;

import br.ensalamento.domain.Turma;

public interface TurmaDAO extends GenericDAO<Turma>{

	List<Turma> consultar(String descricao);
	
}
