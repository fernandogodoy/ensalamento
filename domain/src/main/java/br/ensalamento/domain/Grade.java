package br.ensalamento.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Grade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_grade", nullable = false)
	private Long idGrade;
	
	//~~ENUM
	
	@ManyToOne
	private Professor professor;
	
	@ManyToOne
	private Materia materia;
	
	@ManyToOne
	private Turma turma;
	
	public Long getIdGrade() {
		return idGrade;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public Materia getMateria() {
		return materia;
	}

	public Turma getTurma() {
		return turma;
	}
}
