package br.com.gsv.prontuario.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SintomasMembrosCheckbox {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="memb_id")
	private Long id;
	
	@Column
	private boolean checkColoracao;
	
	@Column
	private boolean checkPerfusao;
	
	@Column
	private boolean LPulso;

	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public boolean isCheckColoracao() {
		return checkColoracao;
	}

	public void setCheckColoracao(boolean checkColoracao) {
		this.checkColoracao = checkColoracao;
	}

	public boolean isCheckPerfusao() {
		return checkPerfusao;
	}

	public void setCheckPerfusao(boolean checkPerfusao) {
		this.checkPerfusao = checkPerfusao;
	}

	public boolean isLPulso() {
		return LPulso;
	}

	public void setLPulso(boolean lPulso) {
		LPulso = lPulso;
	}

}
