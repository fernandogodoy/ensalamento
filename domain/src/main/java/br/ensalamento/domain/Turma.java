package br.ensalamento.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Turma implements Serializable, BaseModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TURMA")
	private Long id;

	@Column(name = "DESCRICAO")
	private String descricao;

	@ManyToOne
	@JoinColumn(name="ID_CURSO")
	private Curso curso;

	@OneToMany(mappedBy = "turma", targetEntity = Grade.class, orphanRemoval=true)
	private List<Grade> grades = new ArrayList<Grade>();
	
	@Override
	public Long getId() {
		return id;
	}
}
