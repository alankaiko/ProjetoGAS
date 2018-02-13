package br.com.projeto.gsv.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.util.HibernateUtil;



public class ClienteRepository {
	Session sessao;
	Transaction transacao = null;
	
	//Metodo que salva um novo cliente Pessoa Fisica ou Pessoa Juridica
	public void Guardar(Cliente cliente){
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transacao = sessao.beginTransaction();
			sessao.merge(cliente);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null)
				transacao.rollback();
			throw e;
		} finally {
			sessao.close();
		}
	}
	
	
	public void Remover(Cliente cliente) {
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(cliente);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null)
				transacao.rollback();
			throw e;
		} finally {
			sessao.close();
		}
	}
	
	
	
	public Cliente BuscarPorId(Long id){
		sessao = HibernateUtil.getSessionFactory().openSession();
		Cliente cliente = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Cliente.buscarPorId");
			consulta.setLong("id", id);
			cliente = (Cliente) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		}finally{
			sessao.close();
		}		
		return cliente;
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> ListarClientes(){
		sessao = HibernateUtil.getSessionFactory().openSession();
		List<Cliente> lista = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Cliente.listar");
			lista = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		}finally{
			sessao.close();
		}
		
		return lista;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Cliente> BuscarPeloNome(String nome){
		sessao = HibernateUtil.getSessionFactory().openSession();
		List<Cliente> lista = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Cliente.buscarPeloNome");
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
