package br.ensalamento.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProfessorMateria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROFESSOR_MATERIA")
	private Long id;

	@ManyToOne
	@JoinColumn(name="ID_PROFESSOR")
	private Professor professor;

	@ManyToOne
	@JoinColumn(name="ID_MATERIA")
	private Materia materia;

}
