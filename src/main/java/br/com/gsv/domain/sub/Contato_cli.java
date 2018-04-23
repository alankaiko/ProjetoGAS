package br.com.gsv.domain.sub;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

import br.com.gsv.domain.Paciente;

@Entity
@Table(name = "contato_cli")
public class Contato_cli{

	private Long id;
	private String email;
	private String telefone;
	private String celular;
	private Paciente paciente;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Email
	@Column(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length=20)
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(length=20)
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	@ManyToOne
	@JoinColumn(name="paciente_codigo")
	public Paciente getPaciente() {
		return paciente;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato_cli other = (Contato_cli) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [id=")
			.append(id)
			.append(", email=")
			.append(email)
			.append(", telefone=")
			.append(telefone)
			.append(", celular=")
			.append(celular)
			.append("]");
		return builder.toString();
	}

	
	
}
