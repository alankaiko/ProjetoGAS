package br.com.gsv.funcUsuario.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.gsv.funcionario.domain.Funcionario;

@Table
@Entity
@NamedQueries({
	@NamedQuery(name="Usuario.listar", query="SELECT usuario FROM Usuario usuario order by login"),
	@NamedQuery(name="Usuario.buscarPorId", query="SELECT usuario FROM Usuario usuario WHERE usuario.id = :id"),
	@NamedQuery(name="Usuario.buscarPeloLogin", query="SELECT usuario FROM Usuario usuario WHERE usuario.login = :login"),
	@NamedQuery(name="Usuario.buscarPorNome", query="SELECT usuario FROM Usuario usuario WHERE usuario.funcionario.nome LIKE :nome")
})




public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_id")
	private Long id;

	@OneToOne
	@JoinColumn(name = "tbl_funcionario_fun_id", referencedColumnName = "fun_id")
	private Funcionario funcionario;
	
	private String login;
	private String senha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
