package teste;


public class TESte {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().openSession();
		HibernateUtil.getSessionFactory().close();

	}

}
