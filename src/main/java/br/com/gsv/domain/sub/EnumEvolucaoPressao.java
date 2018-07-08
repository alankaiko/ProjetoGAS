package br.com.gsv.domain.sub;

public enum EnumEvolucaoPressao {
	HIPOTENSO("Hipotenso"), NORMOTENSO("Normotenso"), NORMOTENSO_LIMITROFE("Normotenso Limitrofe"),
	HIPERTENSO_LEVE("Hipertenso Leve"), HIPERTENSO_MODERADO("Hipertenso Moderado"), HIPERTENSO_GRAVE("Hipertenso Grave");
	
	private String valor;
	
	private EnumEvolucaoPressao(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
