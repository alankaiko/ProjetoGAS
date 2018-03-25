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
public class SintomasCheckbox implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="sint_id")
	private Long id;
	
	@Column
	private String checkNauseas;
	
	@Column
	private String checkMalEstar;
	
	@Column
	private String checkInsonia;
	
	@Column
	private String checkPrurido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCheckNauseas() {
		return checkNauseas;
	}

	public void setCheckNauseas(String checkNauseas) {
		this.checkNauseas = checkNauseas;
	}

	public String getCheckMalEstar() {
		return checkMalEstar;
	}

	public void setCheckMalEstar(String checkMalEstar) {
		this.checkMalEstar = checkMalEstar;
	}

	public String getCheckInsonia() {
		return checkInsonia;
	}

	public void setCheckInsonia(String checkInsonia) {
		this.checkInsonia = checkInsonia;
	}

	public String getCheckPrurido() {
		return checkPrurido;
	}

	public void setCheckPrurido(String checkPrurido) {
		this.checkPrurido = checkPrurido;
	}

	

}
