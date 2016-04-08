package br.ensalamento.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AnoAtividade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ANO_ATIVIDADE")
	private Long id;

	@Column(name = "ANO")
	private Integer ano;

	@Column(name = "SEMESTRE")
	private Integer semestre;
	
	@OneToMany(mappedBy = "anoAtividade", targetEntity = Materia.class)
    private List<Materia> materias = new ArrayList<Materia>();

	public Integer getAno() {
		return ano;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

}
