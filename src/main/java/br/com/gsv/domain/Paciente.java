package br.com.gsv.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.gsv.domain.sub.Contato_cli;
import br.com.gsv.domain.sub.Endereco_cli;

@Table
@Entity
@NamedQueries({
	@NamedQuery(name="Paciente.listar", query="SELECT paciente FROM Paciente paciente order by id"),
	@NamedQuery(name="Paciente.verificaQtd", query="SELECT COUNT(*) FROM Paciente paciente"),
	@NamedQuery(name="Paciente.buscarPorId", query="SELECT paciente FROM Paciente paciente WHERE paciente.id= :id"),
	@NamedQuery(name="Paciente.buscarPeloNome", query="SELECT paciente FROM Paciente paciente WHERE paciente.nome LIKE :nome")
})
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Long id;
	
	private String nome;
	private String cpf;
	private String rg;
	private Date dataNasc;
	private Date dataCad;
	private Contato_cli contato;
	private Endereco_cli endereco;
	private String observacao;
	
	@ManyToOne(fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinColumn(name = "tbl_convenio_id", referencedColumnName = "conv_id")
	private Convenio convenio;
	
	public Paciente() {
		nome = new String();
		cpf = new String();
		rg = new String();
		contato = new Contato_cli();
		endereco = new Endereco_cli();
		observacao = new String();
	}
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable=false, unique=true)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(nullable=false, unique=true, length=15)
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(length = 9)
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Temporal(TemporalType.TIMESTAMP)
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

	
	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	

	@OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Contato_cli getContato() {
		return contato;
	}

	public void setContato(Contato_cli contato) {
		this.contato = contato;
	}

	@OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Endereco_cli getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco_cli endereco) {
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
		Paciente other = (Paciente) obj;
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
		builder.append("Paciente [id=")
			.append(id)
			.append(", nome=")
			.append(nome)
			.append(", cpf=")
			.append(cpf)
			.append(", rg=")
			.append(rg)
			.append(", dataNasc=")
			.append(dataNasc)
			.append(", dataCad=")
			.append(dataCad)
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