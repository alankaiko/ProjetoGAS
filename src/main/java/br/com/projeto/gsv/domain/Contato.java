package br.com.projeto.gsv.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="contato")
public class Contato  implements Serializable{
	private static final long serialVersionUID = 1L;
	private double id;
	private String email;
	private String telefone;
	private String celular;
	
	
	
	@Id
	@GeneratedValue
	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	@Column(nullable=false, length=80)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length=50)
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(length=50)
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", email=" + email + ", telefone=" + telefone + ", celular=" + celular + "]";
	}
	
	

}
