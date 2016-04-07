package br.ensalamento.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Turma implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TURMA")
	private Long id;

	@Column(name = "DESCRICAO")
	private String descricao;

	@OneToMany(mappedBy = "turma", targetEntity = Curso.class)
	private List<Curso> cursos = new ArrayList<Curso>();

	@ManyToOne
	private Grade grade;
}
