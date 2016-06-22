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

	@Override
	public List<Curso> consultar(String nome) {

		TypedQuery<Curso> query = getEntityManager()
				.createQuery("SELECT o FROM Curso o  WHERE UPPER(nome) " + "like ? ", Curso.class);
		query.setParameter(1, "%" + nome.toUpperCase() + "%");
		return query.getResultList();
	}

}
