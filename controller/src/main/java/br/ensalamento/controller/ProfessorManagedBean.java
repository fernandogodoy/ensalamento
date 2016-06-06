package br.ensalamento.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ensalamento.domain.Professor;
import br.ensalamento.persistence.ProfessorDAO;

@Component
@ManagedBean(value = "professorBean")
public class ProfessorManagedBean {

	@Autowired
	private ProfessorDAO professorDAO;

	private Professor professor;

	private List<Professor> professores = new ArrayList<Professor>();

	@PostConstruct
	private void init() {
		professor = new Professor();
	}

	public Professor getProfessor() {

		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void salvar() {
		professorDAO.salvar(professor);
		professor = new Professor();
	}

	@PostConstruct
	public List<Professor> getProfessores() {
		professores = professorDAO.findAll();
		return professores;
	}

}
