package br.ensalamento.persistence;

import java.util.List;

import javax.persistence.TypedQuery;

import br.ensalamento.domain.Turma;

public class TurmaDAOImpl extends GenericDAOImpl<Turma> implements TurmaDAO {

	public TurmaDAOImpl() {
		super(Turma.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Turma> consultar(String descricao) {
		TypedQuery query = (TypedQuery) getEntityManager()
				.createQuery("SELECT o FROM Turma o  WHERE UPPER(descricao) like ?");
		query.setParameter(1, '%' + descricao.toUpperCase() + '%');
		return query.getResultList();
	}
}
