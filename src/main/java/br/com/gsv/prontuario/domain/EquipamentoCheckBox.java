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
	private boolean checkCateter;
	
	@Column
	private boolean checkSonda;
	
	@Column
	private boolean checkUripen;
	
	@Column
	private boolean checkDreno;
	
	@Column
	private boolean checkCurativos;
	
	@Column
	private boolean checkVenoclise;
	
	@Column
	private boolean checkOutros;
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public boolean isCheckCateter() {
		return checkCateter;
	}

	public void setCheckCateter(boolean checkCateter) {
		this.checkCateter = checkCateter;
	}

	public boolean isCheckSonda() {
		return checkSonda;
	}

	public void setCheckSonda(boolean checkSonda) {
		this.checkSonda = checkSonda;
	}

	public boolean isCheckUripen() {
		return checkUripen;
	}

	public void setCheckUripen(boolean checkUripen) {
		this.checkUripen = checkUripen;
	}

	public boolean isCheckDreno() {
		return checkDreno;
	}

	public void setCheckDreno(boolean checkDreno) {
		this.checkDreno = checkDreno;
	}

	public boolean isCheckCurativos() {
		return checkCurativos;
	}

	public void setCheckCurativos(boolean checkCurativos) {
		this.checkCurativos = checkCurativos;
	}

	public boolean isCheckVenoclise() {
		return checkVenoclise;
	}

	public void setCheckVenoclise(boolean checkVenoclise) {
		this.checkVenoclise = checkVenoclise;
	}

	public boolean isCheckOutros() {
		return checkOutros;
	}

	public void setCheckOutros(boolean checkOutros) {
		this.checkOutros = checkOutros;
	}

}
