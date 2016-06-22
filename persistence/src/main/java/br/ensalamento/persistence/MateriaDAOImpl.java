package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.TypedQuery;

import br.ensalamento.domain.AnoAtividade;
import br.ensalamento.domain.Materia;

public class MateriaDAOImpl extends GenericDAOImpl<Materia> implements MateriaDAO {

	public MateriaDAOImpl() {
		super(Materia.class);
	}

	@Override
	public List<Materia> consultar(String nome) {
		TypedQuery<Materia> query = getEntityManager().createQuery("SELECT o FROM Materia o  WHERE UPPER(nome) like ?",
				Materia.class);
		query.setParameter(1, '%' + nome.toUpperCase() + '%');
		return query.getResultList();
	}

	@Override
	public List<Materia> consultar(AnoAtividade anoAtividade) {
		TypedQuery<Materia> query = getEntityManager().createQuery("SELECT o FROM Materia o  WHERE anoAtividade = ?",
				Materia.class);
		query.setParameter(1, anoAtividade);
		return query.getResultList();
	};

}
