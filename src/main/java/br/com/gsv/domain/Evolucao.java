package br.com.gsv.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.gsv.domain.sub.EnumEvolucaoEstGeral;
import br.com.gsv.domain.sub.EnumEvolucaoNivOrientacao;
import br.com.gsv.domain.sub.EnumEvolucaoNivelConsciencia;
import br.com.gsv.domain.sub.EnumEvolucaoPressao;
import br.com.gsv.domain.sub.EnumEvolucaoPulso;
import br.com.gsv.domain.sub.EnumEvolucaoTemperatura;

@Table
@Entity
public class Evolucao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private EnumEvolucaoEstGeral enumEstadoGeral;
	
	@Enumerated(EnumType.STRING)
	private EnumEvolucaoNivelConsciencia enumNivelConsciencia;
	
	@Enumerated(EnumType.STRING)
	private EnumEvolucaoNivOrientacao enumNivelOrientacao;
	
	@Enumerated(EnumType.STRING)
	private EnumEvolucaoTemperatura enumTemperatura;
	
	@Enumerated(EnumType.STRING)
	private EnumEvolucaoPressao enumPressao;
	
	@Enumerated(EnumType.STRING)
	private EnumEvolucaoPulso enumPulso;
	
	private String queixaPaciente;
	private String temperatura;
	private String pressao;
	private String pulso;
	private String radioRespiracao;
	
	@Temporal(TemporalType.DATE)
	private Date data;

	public Evolucao() {
		queixaPaciente = new String();
		temperatura = new String();
		pressao = new String();
		pulso = new String();
		radioRespiracao = new String();
		data = new Date();
	}

	public EnumEvolucaoEstGeral getEnumEstadoGeral() {
		return enumEstadoGeral;
	}

	public void setEnumEstadoGeral(EnumEvolucaoEstGeral enumEstadoGeral) {
		this.enumEstadoGeral = enumEstadoGeral;
	}

	public EnumEvolucaoNivelConsciencia getEnumNivelConsciencia() {
		return enumNivelConsciencia;
	}

	public void setEnumNivelConsciencia(
			EnumEvolucaoNivelConsciencia enumNivelConsciencia) {
		this.enumNivelConsciencia = enumNivelConsciencia;
	}

	public EnumEvolucaoNivOrientacao getEnumNivelOrientacao() {
		return enumNivelOrientacao;
	}

	public void setEnumNivelOrientacao(
			EnumEvolucaoNivOrientacao enumNivelOrientacao) {
		this.enumNivelOrientacao = enumNivelOrientacao;
	}

	public EnumEvolucaoTemperatura getEnumTemperatura() {
		return enumTemperatura;
	}

	public void setEnumTemperatura(EnumEvolucaoTemperatura enumTemperatura) {
		this.enumTemperatura = enumTemperatura;
	}

	public EnumEvolucaoPressao getEnumPressao() {
		return enumPressao;
	}

	public void setEnumPressao(EnumEvolucaoPressao enumPressao) {
		this.enumPressao = enumPressao;
	}

	public EnumEvolucaoPulso getEnumPulso() {
		return enumPulso;
	}

	public void setEnumPulso(EnumEvolucaoPulso enumPulso) {
		this.enumPulso = enumPulso;
	}

	public String getQueixaPaciente() {
		return queixaPaciente;
	}

	public void setQueixaPaciente(String queixaPaciente) {
		this.queixaPaciente = queixaPaciente;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getPressao() {
		return pressao;
	}

	public void setPressao(String pressao) {
		this.pressao = pressao;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public String getRadioRespiracao() {
		return radioRespiracao;
	}

	public void setRadioRespiracao(String radioRespiracao) {
		this.radioRespiracao = radioRespiracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
