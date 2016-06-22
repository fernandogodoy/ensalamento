package br.ensalamento.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Grade implements Serializable, BaseModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GRADE")
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "DIA_SEMANA")
	private DiasSemana dia;

	@ManyToOne
	@JoinColumn(name="ID_TURMA")
	private Turma turma;

	@ManyToOne
	@JoinColumn(name="ID_MATERIA")
	private Materia materia;
	
	@ManyToOne
	@JoinColumn(name="ID_PROFESSOR")
	private Professor professor;
	
	
	@Override
	public Long getId() {
		return id;
	}
}
