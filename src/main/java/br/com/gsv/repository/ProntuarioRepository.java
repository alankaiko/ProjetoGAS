package br.com.gsv.repository;

import java.util.List;

import org.hibernate.Query;
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
	
	
	
	@SuppressWarnings("unchecked")
	public List<Prontuario> ListarProntuarios(){
		sessao = HibernateUtil.getSessionFactory().openSession();
		List<Prontuario> lista = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Prontuario.listar");
			lista = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		}finally{
			sessao.close();
		}
		
		return lista;
	}
	
	
	public Prontuario BuscarPorId(Long id){
		sessao = HibernateUtil.getSessionFactory().openSession();
		Prontuario prontuario = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Prontuario.buscarPorId");
			consulta.setLong("id", id);
			prontuario = (Prontuario) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		}finally{
			sessao.close();
		}		
		return prontuario;
	}
	
	
}
