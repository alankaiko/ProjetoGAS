package br.com.projeto.gsv.repository;



import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.gsv.domain.Evolucao;
import br.com.gsv.util.HibernateUtil;

public class EvolucaoRepository {
	Session sessao;
	Transaction transacao = null;
	
	public void Salvar(Evolucao evolucao){
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		
		try {
			transacao = sessao.beginTransaction();
			sessao.merge(evolucao);
			transacao.commit();
		} catch (Exception e) {
			if(transacao != null)
				transacao.rollback();
			
			throw e;
		}finally{
			sessao.close();
		}
	}
	
	public void Remover(Evolucao evolucao){
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(evolucao);
			transacao.commit();
		} catch (Exception e) {
			if(transacao != null)
				transacao.rollback();
			
			throw e;
		}finally{
			sessao.close();
		}
	}
	
	
}



















