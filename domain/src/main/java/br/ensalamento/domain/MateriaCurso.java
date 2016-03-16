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
public class MateriaCurso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MATERIA_CURSO")
	private Long id;

	@OneToMany(mappedBy = "materiacurso", targetEntity = Curso.class)
	private List<Curso> cursos = new ArrayList<Curso>();

	@OneToMany(mappedBy = "materiacurso", targetEntity = Materia.class)
	private List<Materia> materias = new ArrayList<Materia>();

}
