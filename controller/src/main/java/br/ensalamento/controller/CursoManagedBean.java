package br.ensalamento.controller;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ensalamento.persistence.CursoDAO;

@Component
@ManagedBean(value = "cursoBean")
public class CursoManagedBean {
	
	@Autowired
	private CursoDAO cursoDao;
	
	private String nome = "Curso";
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
