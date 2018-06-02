package br.com.gsv.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.gsv.domain.sub.EnumTipoAgendamento;


@Entity
@Table
public class Agenda {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="conv_id")
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private EnumTipoAgendamento tipoAgendamento;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	@Temporal(TemporalType.TIME)
	private Date horaDesejada;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "tbl_paciente_id", referencedColumnName = "id")
	private Paciente paciente;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "tbl_funcionario_id", referencedColumnName = "fun_id")
	private Funcionario funcionario;
	
	private String observacao;
	
	
	public Agenda() {
		data = new Date();
		horaDesejada = new Date();
		paciente = new Paciente();
		funcionario = new Funcionario();
		observacao = new String();
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


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public EnumTipoAgendamento getTipoAgendamento() {
		return tipoAgendamento;
	}
	
	public void setTipoAgendamento(EnumTipoAgendamento tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}

	public Date getHoraDesejada() {
		return horaDesejada;
	}

	public void setHoraDesejada(Date horaDesejada) {
		this.horaDesejada = horaDesejada;
	}
	
	
	
	
}
