package br.com.gsv.prontuario.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class IntegridadeHemorragia {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="integ_id")
	private Long id;
	
	@Column
	private boolean checkHemorragia;
	
	@Column
	private boolean checkDispneia;
	
	@Column
	private boolean checkEdema;
	
	@Column
	private boolean checkDescamacao;
	
	@Column
	private boolean checkHematoma;
	
	@Column
	private boolean checkCicatriz;
	
	@Column
	private boolean checkOutroInt;

	
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public boolean isCheckHemorragia() {
		return checkHemorragia;
	}

	public void setCheckHemorragia(boolean checkHemorragia) {
		this.checkHemorragia = checkHemorragia;
	}

	public boolean isCheckDispneia() {
		return checkDispneia;
	}

	public void setCheckDispneia(boolean checkDispneia) {
		this.checkDispneia = checkDispneia;
	}

	public boolean isCheckEdema() {
		return checkEdema;
	}

	public void setCheckEdema(boolean checkEdema) {
		this.checkEdema = checkEdema;
	}

	public boolean isCheckDescamacao() {
		return checkDescamacao;
	}

	public void setCheckDescamacao(boolean checkDescamacao) {
		this.checkDescamacao = checkDescamacao;
	}

	public boolean isCheckHematoma() {
		return checkHematoma;
	}

	public void setCheckHematoma(boolean checkHematoma) {
		this.checkHematoma = checkHematoma;
	}

	public boolean isCheckCicatriz() {
		return checkCicatriz;
	}

	public void setCheckCicatriz(boolean checkCicatriz) {
		this.checkCicatriz = checkCicatriz;
	}

	public boolean isCheckOutroInt() {
		return checkOutroInt;
	}

	public void setCheckOutroInt(boolean checkOutroInt) {
		this.checkOutroInt = checkOutroInt;
	}

}
