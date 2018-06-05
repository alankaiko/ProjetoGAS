package zzzzteste;

public class Anein {
	public void Teste(){
		int valor = 15;
		
		Aff(valor);
		
		Eff(valor);
	}
	
	private void Aff(int valor){
		valor = valor + 20;
		System.out.println(valor);
	}
	
	private void Eff(int valor){
		valor = valor + 20;
		System.out.println(valor);
	}
}
