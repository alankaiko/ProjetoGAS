package br.com.gsv.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.gsv.prontuario.domain.Prontuario;
import br.com.projeto.gsv.util.HibernateUtil;

public class ProntuarioRepository {
	Session sessao;
	Transaction transacao = null;
	
	
	public void Guardar(Prontuario prontuario){
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transacao = sessao.beginTransaction();
			sessao.merge(prontuario);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null)
				transacao.rollback();
			throw e;
		} finally {
			sessao.close();
		}
	}
	
}
