package br.com.projeto.gsv.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "cliente")
@NamedQueries({
	@NamedQuery(name="Cliente.listar", query="SELECT cliente FROM Cliente cliente"),
	@NamedQuery(name="Cliente.buscarPorCodigo", query="SELECT cliente FROM Cliente cliente WHERE cliente.id= :id")
})
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String documento;
	private String rg_insc;
	private Date dataNasc;
	private Date dataCad;
	private TipoPessoa tipo;
	private List<Contato> contato = new ArrayList<Contato>();
	private List<Endereco> endereco = new ArrayList<Endereco>();
	private String observacao;

	
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable = false, length = 100)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(nullable = false, length = 15)
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Column(name="rginscricao",nullable = false, length = 9)
	public String getRg_insc() {
		return rg_insc;
	}

	public void setRg_insc(String rg_insc) {
		this.rg_insc = rg_insc;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Date getDataCad() {
		return dataCad;
	}

	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}

	
	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}
	
	
	
	/* NotNull= o contato não pode ser nulo, OneToMany= um para muitos mappedby
	 * campo da outra classe que está sendo mapeado CascadeType.ALL= quando um
	 * cliente for excluído ocontato é excluído junto com ele.*/
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}
	
	

	/* NotNull= o contato não pode ser nulo, OneToMany= um para muitos mappedby campo 
	 * da outra classe que está sendo mapeado CascadeType.ALL= quando um cliente for 
	 * excluído o contato é excluído junto com ele.	 */
	@OneToMany(mappedBy="cliente", cascade= CascadeType.ALL, fetch=FetchType.LAZY)	
	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	@Column(columnDefinition="text")
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	/* Transient= não é persistido no banco de dados Esse método verifica 
	 * se pessoa FISICA for igual A pessoa fisica ele retorna true.*/
	@Transient
	public boolean isPessoaFisica()
	{
		return TipoPessoa.FISICA !=null && tipo.equals(TipoPessoa.FISICA);
	}
		
	/* Transient= não é persistido no banco de dados Esse método verifica
	 *  se pessoa JURIDICA for igual A (pessoa juridica) ele retorna true.*/	
	@Transient
	public boolean isPessoaJuridica()
	{
		return TipoPessoa.JURIDICA !=null && tipo.JURIDICA.equals(this.getTipo());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id=")
				.append(id).append(", nome=")
				.append(nome).append(", documento=")
				.append(documento)
				.append(", rg=")
				.append(rg_insc)
				.append(", dataNasc=")
				.append(dataNasc)
				.append(", dataCad=")
				.append(dataCad)
				.append(", sexo=")
				.append(", tipo=")
				.append(tipo)
				.append(", contato=")
				.append(contato)
				.append(", endereco=")
				.append(endereco)
				.append(", observacao=")
				.append(observacao)
				.append("]");
		return builder.toString();
	}
		
	
	
}