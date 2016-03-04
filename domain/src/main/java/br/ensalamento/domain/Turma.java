package br.ensalamento.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Turma implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_turma")
	private Long idTurma;
	
	@OneToMany(mappedBy = "turma", targetEntity = Curso.class)
	@JoinColumn(nullable = false)
	private List<Curso> cursos;
	
	@OneToMany(mappedBy = "turma", targetEntity = Grade.class)
	@JoinColumn(nullable = false)
	private List<Grade> grades;
	
	
}
