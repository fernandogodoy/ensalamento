package br.ensalamento.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CURSO")
	private Long id;

	@Column(name = "NOME")
	private String nome;
	
	@OneToMany(mappedBy = "curso", targetEntity = MateriaCurso.class, orphanRemoval=true)
	private List<MateriaCurso> materiasCursos = new ArrayList<MateriaCurso>();
	
	@OneToMany(mappedBy = "curso", targetEntity = Turma.class, orphanRemoval=true)
	private List<Turma> turmas = new ArrayList<Turma>();
	
}
