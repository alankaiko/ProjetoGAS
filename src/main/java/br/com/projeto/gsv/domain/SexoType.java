package br.com.projeto.gsv.domain;

public enum SexoType {
	MASCULINO("M"), FEMININO("F");
	
	private String descricao;
	
	
	
	
	SexoType(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
	

}
