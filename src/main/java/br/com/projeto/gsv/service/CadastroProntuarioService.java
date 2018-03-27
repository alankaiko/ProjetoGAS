package br.com.projeto.gsv.service;

import java.util.List;

import br.com.gsv.prontuario.domain.Prontuario;
import br.com.gsv.repository.ProntuarioRepository;

public class CadastroProntuarioService {
	ProntuarioRepository repositorio = new ProntuarioRepository();
	
	public void Salvar(Prontuario prontuario){
		this.repositorio.Guardar(prontuario);
	}
	
	
	public List<Prontuario> ListandoProntuarios(){
		return repositorio.ListarProntuarios();
	}
	
	public Prontuario BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
	
}
