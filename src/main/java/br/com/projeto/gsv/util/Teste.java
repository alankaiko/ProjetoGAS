package br.com.projeto.gsv.util;


public class Teste {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().openSession();
		HibernateUtil.getSessionFactory().close();

	}

}
