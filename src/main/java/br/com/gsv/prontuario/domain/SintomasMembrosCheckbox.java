package br.com.gsv.prontuario.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class SintomasMembrosCheckbox implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="memb_id")
	private Long id;
	
	@Column
	private String checkColoracao;
	
	@Column
	private String checkPerfusao;
	
	@Column
	private String LPulso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCheckColoracao() {
		return checkColoracao;
	}

	public void setCheckColoracao(String checkColoracao) {
		this.checkColoracao = checkColoracao;
	}

	public String getCheckPerfusao() {
		return checkPerfusao;
	}

	public void setCheckPerfusao(String checkPerfusao) {
		this.checkPerfusao = checkPerfusao;
	}

	public String getLPulso() {
		return LPulso;
	}

	public void setLPulso(String lPulso) {
		LPulso = lPulso;
	}

	
}
