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
		return repositorio.ListarUsuario();
	}
	
	public Usuario BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
	
	public List<Usuario> BuscandoPeloNome(String nome){
		return this.repositorio.BuscarPeloNome(nome);
	}
	

}
