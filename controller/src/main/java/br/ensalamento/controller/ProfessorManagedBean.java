package br.ensalamento.controller;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.ensalamento.domain.Professor;
import br.ensalamento.persistence.ProfessorDAO;

@Component
@ManagedBean(value = "professorBean")
public class ProfessorManagedBean {

	@Autowired
	private ProfessorDAO professorDAO;

	private Professor professor;

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

	private String nome = "Professor";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void salvar() {
		professorDAO.salvar(professor);
	}

}
