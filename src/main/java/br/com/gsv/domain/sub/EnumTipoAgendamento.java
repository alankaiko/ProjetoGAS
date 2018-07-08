package br.com.gsv.domain.sub;

public enum EnumTipoAgendamento {
	ATENDIMENTO("Atendimento"), CONSULTA("Consulta"), RETORNO("Retorno"), 
	CIRURGIA("Cirurgia"), ENCAMINHAR("Encaminhamento");
	
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
