package br.com.projeto.gsv.service;

import java.util.List;

import br.com.gsv.funcUsuario.domain.Usuario;
import br.com.gsv.repository.UsuarioRepository;

public class CadastroUsuarioService {
	private UsuarioRepository repositorio = new UsuarioRepository();

	
	public void Salvar(Usuario usuario){
		this.repositorio.Guardar(usuario);
	}
	
	public void Remover(Usuario usuario){
		this.repositorio.Remover(usuario);
	}
	
	public List<Usuario> ListandoUsuarios(){
		return this.repositorio.ListarUsuario();
	}
	
	public Long VerificaQtdReg(){
		return this.repositorio.VerificaQTDRegistro();
	}
	
	public Usuario Autenticando(String login, String senha){
		return this.repositorio.Autenticar(login, senha);
	}
	
	public Usuario BuscandoPeloLogin(String login){
		return this.repositorio.BuscarPeloLogin(login);
	}
	
	public List<Usuario> ListandoPorNome(String nome){
		return repositorio.BuscarPeloNome(nome);
	}
	

}
