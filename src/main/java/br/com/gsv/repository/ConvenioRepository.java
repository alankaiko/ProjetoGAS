package br.com.gsv.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.gsv.convenio.domain.Convenio;
import br.com.projeto.gsv.util.HibernateUtil;
import br.com.projeto.gsv.util.MensagemPainelUtil;

public class ConvenioRepository {
	Session sessao;
	Transaction transacao = null;
	
	//Metodo que salva um novo cliente Pessoa Fisica ou Pessoa Juridica
	public void Guardar(Convenio convenio){
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transacao = sessao.beginTransaction();
			sessao.merge(convenio);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null)
				transacao.rollback();
			
			MensagemPainelUtil.ErroDuplicacao("Descrição do Convênio não pode ser duplicado");
			throw e;
		} finally {
			sessao.close();
		}
	}
	
	
	public void Remover(Convenio convenio) {
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(convenio);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null)
				transacao.rollback();
			throw e;
		} finally {
			sessao.close();
		}
	}
	
	
	
	public Convenio BuscarPorId(Long id){
		sessao = HibernateUtil.getSessionFactory().openSession();
		Convenio convenio = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Convenio.buscarPorId");
			consulta.setLong("id", id);
			convenio = (Convenio) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		}finally{
			sessao.close();
		}		
		return convenio;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<Convenio> ListarConvenio(){
		sessao = HibernateUtil.getSessionFactory().openSession();
		List<Convenio> lista = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Convenio.listar");
			lista = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		}finally{
			sessao.close();
		}
		
		return lista;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Convenio> BuscarPeloNome(String nome){
		sessao = HibernateUtil.getSessionFactory().openSession();
		List<Convenio> lista = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Convenio.buscarPeloNome");
			consulta.setString("nome", "%"+nome+"%");
			lista = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		}finally{
			sessao.close();
		}
		
		return lista;
	}
	
	
	

}
