package br.com.projeto.gsv.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;



import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.projeto.gsv.domain.Funcionario;
import br.com.projeto.gsv.util.HibernateUtil;


public class FuncionarioRepository {
	private EntityManager manager;

	
	// busca funcionario por id
	public Funcionario BuscarPorId(double id) {
		return this.manager.find(Funcionario.class, id);
	}
	
	
	//busca funcionario por cpf
	public Funcionario BuscarPorCPF(String cpf){
		try {
			return manager.createQuery("from Funcionario where upper(cpf) = :cpf", Funcionario.class)
				.setParameter("cpf", cpf.toUpperCase())
				.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	
	//busca funcionario por rg
	public Funcionario BuscarPorRG(String rg){
		try {
			return manager.createQuery("from Funcionario where upper(rg) = :rg", Funcionario.class)
				.setParameter("rg", rg.toUpperCase())
				.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	

	// busca uma lista de funcionario atravez do nome, pode retornar mais de um funcionario
	public List<Funcionario> BuscarPorNome(String nome) {
		return this.manager.createQuery("from Funcionario " + "where upper(nome) like :nome", Funcionario.class)
				.setParameter("nome", nome.toUpperCase() + "%")
				.getResultList();
	}
	
	

	// faz a remoçao do funcionario informado
	public void Remover(Funcionario funcionario) {
		try {
			funcionario = BuscarPorId(funcionario.getId());
			manager.remove(funcionario);
			manager.flush();
		} catch (PersistenceException e) {
			System.out.println("ERRO EM REMOVER FUNCIONARIO " + e);
		}
	}
	

	// insere um funcionario no banco
	public void Adicionar(Funcionario funcionario) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(funcionario);
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
