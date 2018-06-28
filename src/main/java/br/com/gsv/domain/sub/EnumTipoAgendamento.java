package br.com.gsv.domain.sub;

public enum EnumTipoAgendamento {
	ATENDIMENTO("ATENDIMENTO"), CONSULTA("CONSULTA"), RETORNO("RETORNO");
	
	private String valor;
	
	private EnumTipoAgendamento(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
	
}
