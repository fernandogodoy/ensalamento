package br.ensalamento.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso", nullable = false)
	private Long idCurso;
	@Column(name = "nome")
	private String nome;
	@ManyToOne
	private Turma turma;
		
	public Long getIdCurso() {
		return idCurso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Turma getTurma() {
		return turma;
	}
}
