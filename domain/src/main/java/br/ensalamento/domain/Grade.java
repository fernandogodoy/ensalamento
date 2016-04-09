package br.ensalamento.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Grade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GRADE")
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "DIA_SEMANA")
	private DiasSemana dia;

	@ManyToOne
	private Turma turma;

	@ManyToOne
	private Materia materia;
	
	@ManyToOne
	private Professor professor;
	
}
