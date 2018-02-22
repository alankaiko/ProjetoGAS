package br.com.gsv.produtos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table
@NamedQueries({
	@NamedQuery(name="Fabricante.listar", query="SELECT fabricante FROM Fabricante fabricante"),
	@NamedQuery(name="Fabricante.buscarPorId", query="SELECT fabricante FROM Fabricante fabricante WHERE fabricante.id = :id")
})
public class Fabricante implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String descricao;

	
	@Id
	@GeneratedValue
	@Column(name="fab_codigo")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Fabricante other = (Fabricante) obj;
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
		builder.append("Fabricante [id=").append(id).append(", descricao=")
				.append(descricao).append("]");
		return builder.toString();
	}

}