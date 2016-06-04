package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.ensalamento.domain.Curso;

@Repository
public class CursoDAOImpl extends GenericDAOImpl<Curso> implements CursoDAO {

	public CursoDAOImpl() {
		super(Curso.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Curso> consultar(String nome) {

		TypedQuery query = (TypedQuery) getEntityManager()
				.createQuery("SELECT o FROM Curso o  WHERE UPPER(nome) " + "like ? ");
		query.setParameter(1, "%" + nome.toUpperCase() + "%");
		return query.getResultList();
	}

}
