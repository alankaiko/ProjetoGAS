package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.funcUsuario.domain.Usuario;
import br.com.projeto.gsv.service.CadastroUsuarioService;

public class UsuarioController {
	private Usuario usuario;
	private CadastroUsuarioService cadastroService;

	public UsuarioController() {
		this.usuario = new Usuario();
		this.cadastroService = new CadastroUsuarioService();
	}

	public void SalvarUsuario() {
		this.cadastroService.Salvar(this.usuario);
	}

	public void RemoverUsuario() {
		this.cadastroService.Remover(this.usuario);
	}

	public List<Usuario> listaCompletaUsuario() {
		return cadastroService.ListandoUsuarios();
	}

	public Usuario BuscarPelaID(Long id) {
		return this.cadastroService.BuscandoId(id);
	}

	public List<Usuario> BuscarPeloNome(String nome) {
		return this.cadastroService.BuscandoPeloNome(nome);
	}
	
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
}