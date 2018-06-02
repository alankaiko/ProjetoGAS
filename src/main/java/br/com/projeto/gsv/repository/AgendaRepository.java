package br.com.projeto.gsv.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.gsv.domain.Agenda;
import br.com.gsv.util.HibernateUtil;

public class AgendaRepository {
	Session sessao;
	Transaction transacao = null;
	
	//Metodo que salva um novo cliente Pessoa Fisica ou Pessoa Juridica
	public void Guardar(Agenda agenda){
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transacao = sessao.beginTransaction();
			sessao.merge(agenda);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null)
				transacao.rollback();
			
			throw e;
		} finally {
			sessao.close();
		}
	}
	
	
	public void Remover(Agenda agenda) {
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(agenda);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null)
				transacao.rollback();
			
			throw e;
		} finally {
			sessao.close();
		}
	}
	
	
	
	public Agenda BuscarPorId(Long id){
		sessao = HibernateUtil.getSessionFactory().openSession();
		Agenda agenda = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Agenda.buscarPorId");
			consulta.setLong("id", id);
			agenda = (Agenda) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		}finally{
			sessao.close();
		}		
		return agenda;
	}
		

}
