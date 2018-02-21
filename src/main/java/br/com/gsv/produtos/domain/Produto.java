package br.com.gsv.produtos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String descricao;
	private Integer registro;
	private Integer quantidade;
	private Integer lote;
	private String medida;
	private String classeTerapeutica;
	private Fabricante fabricante;
	
	
	
	@Id
	@Column
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(nullable=false)
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column
	public Integer getRegistro() {
		return registro;
	}
	public void setRegistro(Integer registro) {
		this.registro = registro;
	}
	
	@Column
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	@Column
	public Integer getLote() {
		return lote;
	}
	public void setLote(Integer lote) {
		this.lote = lote;
	}
	
	@Column
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	
	@Column
	public String getClasseTerapeutica() {
		return classeTerapeutica;
	}
	public void setClasseTerapeutica(String classeTerapeutica) {
		this.classeTerapeutica = classeTerapeutica;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_fabricantes_fab_codigo", referencedColumnName = "fab_codigo", nullable = false)
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
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
		Produto other = (Produto) obj;
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
		builder.append("Produto [id=")
			.append(id)
			.append(", descricao=")
			.append(descricao)
			.append(", registro=")
			.append(registro)
			.append(", quantidade=")
			.append(quantidade)
			.append(", lote=")
			.append(lote)
			.append(", medida=")
			.append(medida)
			.append(", classeTerapeutica=")
			.append(classeTerapeutica)
			.append(", fabricante=")
			.append(fabricante)
			.append("]");
		return builder.toString();
	}
	
	
	
	
}
