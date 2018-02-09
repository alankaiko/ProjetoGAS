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
	@NamedQuery(name="Cliente.buscarPorId", query="SELECT cliente FROM Cliente cliente WHERE cliente.id= :id")
})
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String cpf;
	private String rg;
	private Date dataNasc;
	private Date dataCad;
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
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(nullable = false, length = 9)
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
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

	

	
	
	/* NotNull= o contato não pode ser nulo, OneToMany= um para muitos mappedby
	 * campo da outra classe que está sendo mapeado CascadeType.ALL= quando um
	 * cliente for excluído ocontato é excluído junto com ele.*/
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}
	
	

	/* NotNull= o contato não pode ser nulo, OneToMany= um para muitos mappedby campo 
	 * da outra classe que está sendo mapeado CascadeType.ALL= quando um cliente for 
	 * excluído o contato é excluído junto com ele.	 */
	@OneToMany(mappedBy="cliente", cascade= CascadeType.ALL, fetch=FetchType.EAGER)	
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
	
	
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id=")
				.append(id).append(", nome=")
				.append(nome)
				.append(", cpf=")
				.append(", rg=")
				.append(", dataNasc=")
				.append(dataNasc)
				.append(", dataCad=")
				.append(dataCad)
				.append(", sexo=")
				.append(", tipo=")
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