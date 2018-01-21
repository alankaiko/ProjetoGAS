package br.com.projeto.gsv.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.util.HibernateUtil;



public class ClienteRepository {
	
	
	public void Guardar(Cliente cliente){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		
		try {
			transacao = sessao.beginTransaction();
			sessao.save(cliente);
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
