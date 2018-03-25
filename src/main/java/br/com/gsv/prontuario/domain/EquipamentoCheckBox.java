package br.com.gsv.prontuario.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class EquipamentoCheckBox {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="equip_id")
	private Long id;
	
	@Column
	private String checkCateter;
	
	@Column
	private String checkSonda;
	
	@Column
	private String checkUripen;
	
	@Column
	private String checkDreno;
	
	@Column
	private String checkCurativos;
	
	@Column
	private String checkVenoclise;
	
	@Column
	private String checkOutros;
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public String getCheckCateter() {
		return checkCateter;
	}

	public void setCheckCateter(String checkCateter) {
		this.checkCateter = checkCateter;
	}

	public String getCheckSonda() {
		return checkSonda;
	}

	public void setCheckSonda(String checkSonda) {
		this.checkSonda = checkSonda;
	}

	public String getCheckUripen() {
		return checkUripen;
	}

	public void setCheckUripen(String checkUripen) {
		this.checkUripen = checkUripen;
	}

	public String getCheckDreno() {
		return checkDreno;
	}

	public void setCheckDreno(String checkDreno) {
		this.checkDreno = checkDreno;
	}

	public String getCheckCurativos() {
		return checkCurativos;
	}

	public void setCheckCurativos(String checkCurativos) {
		this.checkCurativos = checkCurativos;
	}

	public String getCheckVenoclise() {
		return checkVenoclise;
	}

	public void setCheckVenoclise(String checkVenoclise) {
		this.checkVenoclise = checkVenoclise;
	}

	public String getCheckOutros() {
		return checkOutros;
	}

	public void setCheckOutros(String checkOutros) {
		this.checkOutros = checkOutros;
	}

	

}
