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
public class Professor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_professor", nullable = false)
	private Long idProfessor;
	@Column(name = "nome", length = 255)
	private String nome;
	@Column(name = "especialidade")
	private String especialidade;
	
	@OneToMany(mappedBy = "professor", targetEntity = Grade.class)
	@JoinColumn(nullable = false)
	private List<Grade> grades;
	
	public Long getIdProfessor() {
		return idProfessor;
	}

	public String getNome() {
		return nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}
}
