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
public class AnoAtividade implements Serializable, BaseModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ANO_ATIVIDADE")
	private Long id;

	@Column(name = "ANO")
	private Integer ano;

	@Column(name = "SEMESTRE")
	private Integer semestre;
	
	@OneToMany(mappedBy = "anoAtividade", targetEntity = Materia.class, orphanRemoval=true)
    private List<Materia> materias = new ArrayList<Materia>();

	@Override
	public Long getId() {
		return id;
	}
}
