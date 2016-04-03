package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.TypedQuery;

import br.ensalamento.domain.AnoAtividade;
import br.ensalamento.domain.Materia;

public class MateriaDAOImpl extends GenericDAOImpl<Materia> implements MateriaDAO {

	public MateriaDAOImpl() {
		super(Materia.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Materia> consultar(String nome) {
		TypedQuery query = (TypedQuery) getEntityManager()
				.createQuery("SELECT o FROM Materia o  WHERE UPPER(nome) like ?");
		query.setParameter(1, '%' + nome.toUpperCase() + '%');
		return query.getResultList();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Materia> consultar(AnoAtividade anoAtividade) {
		TypedQuery query = (TypedQuery) getEntityManager()
				.createQuery("SELECT o FROM Materia o  WHERE anoAtividade = ?");
		query.setParameter(1, anoAtividade);
		return query.getResultList();
	};

}
