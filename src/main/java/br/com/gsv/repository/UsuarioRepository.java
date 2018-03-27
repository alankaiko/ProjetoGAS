package br.com.gsv.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.gsv.convenio.domain.Convenio;
import br.com.gsv.funcUsuario.domain.Usuario;
import br.com.projeto.gsv.util.HibernateUtil;

public class UsuarioRepository {
	Session sessao;
	Transaction transacao = null;
	
	//Metodo que salva um novo cliente Pessoa Fisica ou Pessoa Juridica
	public void Guardar(Usuario usuario){
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transacao = sessao.beginTransaction();
			sessao.merge(usuario);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null)
				transacao.rollback();
			throw e;
		} finally {
			sessao.close();
		}
	}
	
	
	public void Remover(Usuario usuario) {
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(usuario);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null)
				transacao.rollback();
			throw e;
		} finally {
			sessao.close();
		}
	}
	
	
	
	public Usuario BuscarPorId(Long id){
		sessao = HibernateUtil.getSessionFactory().openSession();
		Usuario usuario = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Usuario.buscarPorId");
			consulta.setLong("id", id);
			usuario = (Usuario) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		}finally{
			sessao.close();
		}		
		return usuario;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<Usuario> ListarUsuario(){
		sessao = HibernateUtil.getSessionFactory().openSession();
		List<Usuario> lista = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Usuario.listar");
			lista = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		}finally{
			sessao.close();
		}
		
		return lista;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Usuario> BuscarPeloNome(String nome){
		sessao = HibernateUtil.getSessionFactory().openSession();
		List<Usuario> lista = null;
		
		try {
			Query consulta = sessao.getNamedQuery("Usuario.buscarPeloNome");
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