package br.com.gsv.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.gsv.funcionario.domain.Funcionario;
import br.com.projeto.gsv.util.HibernateUtil;

public class FuncionarioRepository {
	Session sessao;
	Transaction transacao = null;
	
	//Metodo que salva um novo cliente Pessoa Fisica ou Pessoa Juridica
		public void Guardar(Funcionario funcionario){
			sessao = HibernateUtil.getSessionFactory().openSession();
			
			try {
				transacao = sessao.beginTransaction();
				sessao.merge(funcionario);
				transacao.commit();
			} catch (RuntimeException e) {
				if (transacao != null)
					transacao.rollback();
				throw e;
			} finally {
				sessao.close();
			}
		}
		
		
		public void Remover(Funcionario funcionario) {
			sessao = HibernateUtil.getSessionFactory().openSession();
			
			try {
				transacao = sessao.beginTransaction();
				sessao.delete(funcionario);
				transacao.commit();
			} catch (RuntimeException e) {
				if (transacao != null)
					transacao.rollback();
				throw e;
			} finally {
				sessao.close();
			}
		}
		
		
		
		public Funcionario BuscarPorId(Long id){
			sessao = HibernateUtil.getSessionFactory().openSession();
			Funcionario funcionario = null;
			
			try {
				Query consulta = sessao.getNamedQuery("Funcionario.buscarPorId");
				consulta.setLong("id", id);
				funcionario = (Funcionario) consulta.uniqueResult();
			} catch (RuntimeException e) {
				throw e;
			}finally{
				sessao.close();
			}		
			return funcionario;
		}
		
		
		
		@SuppressWarnings("unchecked")
		public List<Funcionario> ListarFuncionarios(){
			sessao = HibernateUtil.getSessionFactory().openSession();
			List<Funcionario> lista = null;
			
			try {
				Query consulta = sessao.getNamedQuery("Funcionario.listar");
				lista = consulta.list();
			} catch (RuntimeException e) {
				throw e;
			}finally{
				sessao.close();
			}
			
			return lista;
		}
		
		
		@SuppressWarnings("unchecked")
		public List<Funcionario> BuscarPeloNome(String nome){
			sessao = HibernateUtil.getSessionFactory().openSession();
			List<Funcionario> lista = null;
			
			try {
				Query consulta = sessao.getNamedQuery("Funcionario.buscarPeloNome");
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
