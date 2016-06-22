package br.ensalamento.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DISPONIBILIDADE_PROFESSOR")
public class DisponibilidadeProfessor implements Serializable, BaseModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DISPONIBILIDADE")
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "DIA_SEMANA")
	private DiasSemana dia;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name="ID_PROFESSOR")
	private Professor professor;

	@Override
	public Long getId() {
		return id;
	}
}
