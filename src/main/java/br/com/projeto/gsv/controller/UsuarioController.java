package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.domain.Usuario;
import br.com.gsv.util.MensagemPainelUtil;
import br.com.projeto.gsv.service.CadastroUsuarioService;

public class UsuarioController {
	private Usuario usuario;
	private CadastroUsuarioService cadastroService;

	public UsuarioController() {
		this.usuario = new Usuario();
		this.cadastroService = new CadastroUsuarioService();
	}

	public void SalvarUsuario() {
		if(this.cadastroService.VerificaQtdReg() < 6L)
			this.cadastroService.Salvar(this.usuario);
		else
			MensagemPainelUtil.ErroDuplicacao("Máximo de Usuários cadastrados nao pode ultrapassar a 6");
	}

	public void RemoverUsuario() {
		this.cadastroService.Remover(this.usuario);
	}

	public List<Usuario> listaCompletaUsuario() {
		return this.cadastroService.ListandoUsuarios();
	}
	
	public Usuario AutenticaLogin(String login, String senha){
		return this.cadastroService.Autenticando(login, senha);
	}

	

	public Usuario BuscarPeloLogin(String login) {
		return this.cadastroService.BuscandoPeloLogin(login);
	}
	
	public List<Usuario> ListinhaPelosNomes(String nome) {
		return cadastroService.ListandoPorNome(nome);
	}
	
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
}
