package br.com.projeto.gsv.banco;

import br.com.gsv.domain.Funcionario;
import br.com.gsv.domain.Usuario;
import br.com.gsv.domain.sub.Contato_fun;
import br.com.gsv.domain.sub.Endereco_fun;
import br.com.gsv.domain.sub.RegistroCoren;
import br.com.projeto.gsv.controller.UsuarioController;

public class CriaUsuarioAdmin {
	private Usuario usuario;
	private Funcionario funcionario;
	private UsuarioController control;
	private Contato_fun contato;
	private Endereco_fun endereco;
	private RegistroCoren coren;
	
	public CriaUsuarioAdmin() {
		control = new UsuarioController();
		contato = new Contato_fun();
		endereco = new Endereco_fun();
		coren = new RegistroCoren();
		control = new UsuarioController();
		usuario = new Usuario();
		
		FormToFuncionario();
		AtrelarObjetos();
		FormToUsuario();
		Gravar();
	}

	
	
	private void FormToFuncionario(){
		funcionario = new Funcionario();
		funcionario.setNome("Admin");
		funcionario.setCpf("00000000000");
		funcionario.setRg("0000000");
	}
	
	
	private void FormToUsuario(){
		usuario.setLogin("ADMIN");
		usuario.setSenha("123");
		usuario.setFuncionario(funcionario);
	}
	
	
	
	private void AtrelarObjetos(){
		this.funcionario.setRegistroCoren(this.coren);
		this.funcionario.setContato(this.contato);
		this.funcionario.setEndereco(this.endereco);
		
		this.endereco.setFuncionario(this.funcionario);
		this.contato.setFuncionario(this.funcionario);	
		
	}	

	private void Gravar(){
		control.setUsuario(this.usuario);
		control.SalvarUsuario();
	}
}
