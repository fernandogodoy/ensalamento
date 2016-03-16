package br.ensalamento.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Grade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GRADE")
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "DIA")
	private DiasSemana dia;

	@OneToMany(mappedBy = "grade", targetEntity = Professor.class)
	private List<Professor> professores = new ArrayList<Professor>();

	@OneToMany(mappedBy = "grade", targetEntity = Materia.class)
	private List<Materia> materias = new ArrayList<Materia>();

	@OneToMany(mappedBy = "grade", targetEntity = Turma.class)
	private List<Turma> turmas = new ArrayList<Turma>();

}
