package br.ensalamento.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DisponibilidadeProfessor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DISPONIBILIDADE")
	private Long id;

	@OneToOne
	private Professor professor;

	@Enumerated(EnumType.STRING)
	@Column(name = "DIA")
	private DiasSemana dia;

}