package br.ensalamento.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROFESSOR")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CPF", length = 15)
	private String cpf;

	@Column(name = "RG", length = 15)
	private String rg;
	
	@OneToOne(mappedBy = "professor", cascade = CascadeType.ALL, orphanRemoval = true)
	private DisponibilidadeProfessor disponibilidadeProfessor;
	
	@OneToMany(mappedBy = "professor", targetEntity = Grade.class, orphanRemoval=true)
	private List<Grade> grades = new ArrayList<Grade>();
	
	@OneToMany(mappedBy = "professor", targetEntity = ProfessorMateria.class, orphanRemoval=true)
	private List<ProfessorMateria> professoresMaterias = new ArrayList<ProfessorMateria>();

}
