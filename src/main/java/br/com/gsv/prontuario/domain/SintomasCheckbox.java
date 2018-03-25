package br.com.gsv.prontuario.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class SintomasCheckbox {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="sint_id")
	private Long id;
	
	@Column
	private boolean checkNauseas;
	
	@Column
	private boolean checkMalEstar;
	
	@Column
	private boolean checkInsonia;
	
	@Column
	private boolean checkPrurido;

	
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public boolean isCheckNauseas() {
		return checkNauseas;
	}

	public void setCheckNauseas(boolean checkNauseas) {
		this.checkNauseas = checkNauseas;
	}

	public boolean isCheckMalEstar() {
		return checkMalEstar;
	}

	public void setCheckMalEstar(boolean checkMalEstar) {
		this.checkMalEstar = checkMalEstar;
	}

	public boolean isCheckInsonia() {
		return checkInsonia;
	}

	public void setCheckInsonia(boolean checkInsonia) {
		this.checkInsonia = checkInsonia;
	}

	public boolean isCheckPrurido() {
		return checkPrurido;
	}

	public void setCheckPrurido(boolean checkPrurido) {
		this.checkPrurido = checkPrurido;
	}

}
