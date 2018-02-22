package br.com.gsv.produtos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table
@NamedQueries({
	@NamedQuery(name="Produto.listar", query="SELECT produto FROM Produto produto"),
	@NamedQuery(name="Produto.buscarPorId", query="SELECT produto FROM Produto produto WHERE produto.id = :id"),
	@NamedQuery(name="Produto.buscarPelaDescricao", query="SELECT produto FROM Produto produto WHERE produto.descricao LIKE :descricao")
})
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String codigo;
	private String descricao;
	private Integer quantidade;
	private Integer lote;
	private String medida;
	private String classeTerapeutica;
	private Fabricante fabricante;
	
	
	
	@Id
	@GeneratedValue
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
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
			.append(", codigo=")
			.append(codigo)
			.append(", descricao=")
			.append(descricao)
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
