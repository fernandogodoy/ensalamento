package br.ensalamento.persistence;

import java.util.List;

import br.ensalamento.domain.Grade;
import br.ensalamento.domain.Materia;
import br.ensalamento.domain.Professor;
import br.ensalamento.domain.Turma;

public interface GradeDAO extends GenericDAO<Grade>{
	
	List<Grade> consultar(Professor professor);
	
	List<Grade> consultar(Materia materia);
	
	List<Grade> consultar(Turma turma);

}
