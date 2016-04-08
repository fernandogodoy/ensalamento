package br.ensalamento.persistence;

import org.junit.Ignore;
import org.junit.Test;

import br.ensalamento.domain.AnoAtividade;

public class AnoAtividadeDAOImplTest {

	@Ignore
	public void salvar() {
		AnoAtividade anoAtividade = new AnoAtividade();
		anoAtividade.setAno(2016);
		anoAtividade.setSemestre(1);
		
		AnoAtividadeDAOImpl anoAtividadeDAOImpl = new AnoAtividadeDAOImpl();
		anoAtividadeDAOImpl.salvar(anoAtividade);
	}

}
