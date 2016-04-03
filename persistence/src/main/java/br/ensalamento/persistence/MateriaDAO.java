package br.ensalamento.persistence;

import java.util.List;

import br.ensalamento.domain.AnoAtividade;
import br.ensalamento.domain.Materia;

public interface MateriaDAO extends GenericDAO<Materia> {
	
	List<Materia> consultar(String nome);
	
	List<Materia> consultar(AnoAtividade anoAtividade);
	
}
