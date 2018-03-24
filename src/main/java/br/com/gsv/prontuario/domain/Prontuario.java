package br.com.gsv.prontuario.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.gsv.paciente.domain.Paciente;

@Table
@Entity
public class Prontuario {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="conv_id")
	private Long id;
	
	@Column
	private Paciente paciente;
	
	@Column
	private String anotConsciencia;
	
	@Column
	private String anotMental;
	
	@Column
	private String anotObservacao;

	@Column
	private String condDeambulacao;
	
	@Column
	private String condDeamObservacao;
	
	@Column
	private String condRepouso;
	
	@Column
	private String condSono;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tab_pront_equip_id", referencedColumnName = "equip_id")
	private EquipamentoCheckBox equipCheckbox;
	
	@Column
	private String equipObservacao;

	@Column
	private String inteHemoText;
	
	@Column
	private String inteDispText;
	
	@Column
	private String inteEdemaText;
	
	@Column
	private String inteDescText;
	
	@Column
	private String inteHemaText;
	
	@Column
	private String inteCicaText;
	
	@Column
	private String inteOutrosText;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tab_pront_sint_id", referencedColumnName = "sint_id")
	private SintomasCheckbox sintomasEsp;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tab_pront_memb_id", referencedColumnName = "memb_id")
	private SintomasMembrosCheckbox sintomasMembros;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tab_pront_integ_id", referencedColumnName = "integ_id")
	private IntegridadeHemorragia integHemorragia;
	
	@Column
	private String sintomasEspText;
	
	@Column
	private String sinomasMembText;
	
	
	
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}	

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getAnotConsciencia() {
		return anotConsciencia;
	}

	public void setAnotConsciencia(String anotConsciencia) {
		this.anotConsciencia = anotConsciencia;
	}

	public String getAnotMental() {
		return anotMental;
	}

	public void setAnotMental(String anotMental) {
		this.anotMental = anotMental;
	}

	public String getAnotObservacao() {
		return anotObservacao;
	}

	public void setAnotObservacao(String anotObservacao) {
		this.anotObservacao = anotObservacao;
	}

	public String getCondDeambulacao() {
		return condDeambulacao;
	}

	public void setCondDeambulacao(String condDeambulacao) {
		this.condDeambulacao = condDeambulacao;
	}

	public String getCondDeamObservacao() {
		return condDeamObservacao;
	}

	public void setCondDeamObservacao(String condDeamObservacao) {
		this.condDeamObservacao = condDeamObservacao;
	}

	public String getCondRepouso() {
		return condRepouso;
	}

	public void setCondRepouso(String condRepouso) {
		this.condRepouso = condRepouso;
	}

	public String getCondSono() {
		return condSono;
	}

	public void setCondSono(String condSono) {
		this.condSono = condSono;
	}

	public EquipamentoCheckBox getEquipCheckbox() {
		return equipCheckbox;
	}

	public void setEquipCheckbox(EquipamentoCheckBox equipCheckbox) {
		this.equipCheckbox = equipCheckbox;
	}

	public String getEquipObservacao() {
		return equipObservacao;
	}

	public void setEquipObservacao(String equipObservacao) {
		this.equipObservacao = equipObservacao;
	}

	public String getInteHemoText() {
		return inteHemoText;
	}

	public void setInteHemoText(String inteHemoText) {
		this.inteHemoText = inteHemoText;
	}

	public String getInteDispText() {
		return inteDispText;
	}

	public void setInteDispText(String inteDispText) {
		this.inteDispText = inteDispText;
	}

	public String getInteEdemaText() {
		return inteEdemaText;
	}

	public void setInteEdemaText(String inteEdemaText) {
		this.inteEdemaText = inteEdemaText;
	}

	public String getInteDescText() {
		return inteDescText;
	}

	public void setInteDescText(String inteDescText) {
		this.inteDescText = inteDescText;
	}

	public String getInteHemaText() {
		return inteHemaText;
	}

	public void setInteHemaText(String inteHemaText) {
		this.inteHemaText = inteHemaText;
	}

	public String getInteCicaText() {
		return inteCicaText;
	}

	public void setInteCicaText(String inteCicaText) {
		this.inteCicaText = inteCicaText;
	}

	public String getInteOutrosText() {
		return inteOutrosText;
	}

	public void setInteOutrosText(String inteOutrosText) {
		this.inteOutrosText = inteOutrosText;
	}

	public SintomasCheckbox getSintomasEsp() {
		return sintomasEsp;
	}

	public void setSintomasEsp(SintomasCheckbox sintomasEsp) {
		this.sintomasEsp = sintomasEsp;
	}

	public SintomasMembrosCheckbox getSintomasMembros() {
		return sintomasMembros;
	}

	public void setSintomasMembros(SintomasMembrosCheckbox sintomasMembros) {
		this.sintomasMembros = sintomasMembros;
	}

	public String getSintomasEspText() {
		return sintomasEspText;
	}

	public void setSintomasEspText(String sintomasEspText) {
		this.sintomasEspText = sintomasEspText;
	}

	public String getSinomasMembText() {
		return sinomasMembText;
	}

	public void setSinomasMembText(String sinomasMembText) {
		this.sinomasMembText = sinomasMembText;
	}
	
	public void setIntegHemorragia(IntegridadeHemorragia integHemorragia) {
		this.integHemorragia = integHemorragia;
	}
	public IntegridadeHemorragia getIntegHemorragia() {
		return integHemorragia;
	}

}