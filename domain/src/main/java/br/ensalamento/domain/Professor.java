package br.ensalamento.domain;

import java.io.Serializable;
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
public class Professor implements BaseModel, Serializable {

	private static final long serialVersionUID = 1L;

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

//	@OneToOne(mappedBy = "professor", cascade = CascadeType.ALL, orphanRemoval = true)
//	private DisponibilidadeProfessor disponibilidadeProfessor;
//
//	@OneToMany(mappedBy = "professor", targetEntity = Grade.class, orphanRemoval = true)
//	private List<Grade> grades = new ArrayList<Grade>();
//
//	@OneToMany(mappedBy = "professor", targetEntity = ProfessorMateria.class, orphanRemoval = true)
//	private List<ProfessorMateria> professoresMaterias = new ArrayList<ProfessorMateria>();

	@Override
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

//	public DisponibilidadeProfessor getDisponibilidadeProfessor() {
//		return disponibilidadeProfessor;
//	}
//
//	public void setDisponibilidadeProfessor(DisponibilidadeProfessor disponibilidadeProfessor) {
//		this.disponibilidadeProfessor = disponibilidadeProfessor;
//	}
//
//	public List<Grade> getGrades() {
//		return grades;
//	}
//
//	public void setGrades(List<Grade> grades) {
//		this.grades = grades;
//	}
//
//	public List<ProfessorMateria> getProfessoresMaterias() {
//		return professoresMaterias;
//	}

//	public void setProfessoresMaterias(List<ProfessorMateria> professoresMaterias) {
//		this.professoresMaterias = professoresMaterias;
//	}

}
