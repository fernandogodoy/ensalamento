package br.ensalamento.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Materia implements Serializable, BaseModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MATERIA")
	private Long id;

	@Column(name = "NOME")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="ID_ANO_ATIVIDADE")
	private AnoAtividade anoAtividade;

	@OneToMany(mappedBy = "materia", targetEntity = MateriaCurso.class, orphanRemoval=true)
	private List<MateriaCurso> materiasCursos = new ArrayList<MateriaCurso>();

	@OneToMany(mappedBy = "materia", targetEntity = Grade.class, orphanRemoval=true)
	private List<Grade> grades = new ArrayList<Grade>();
	
	@OneToMany(mappedBy = "materia", targetEntity = ProfessorMateria.class, orphanRemoval=true)
	private List<ProfessorMateria> professoresMaterias = new ArrayList<ProfessorMateria>();

	
	@Override
	public Long getId() {
		return id;
	}
}
