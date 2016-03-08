package br.ensalamento.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Materia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_materia", nullable = false)
	private Long idMateria;

	@Column(name = "nome")
	private String nome;
	
	@OneToMany(mappedBy = "materia", targetEntity = Grade.class)
	@JoinColumn(nullable = false)
	private List<Grade> grades;

	public Long getIdMateria() {
		return idMateria;
	}

	public String getNome() {
		return nome;
	}

}
