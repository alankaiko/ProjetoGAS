package br.com.projeto.gsv.service;

import br.com.gsv.prontuario.domain.Prontuario;
import br.com.gsv.repository.ProntuarioRepository;

public class CadastroProntuarioService {
	ProntuarioRepository repositorio = new ProntuarioRepository();
	
	public void Salvar(Prontuario prontuario){
		this.repositorio.Guardar(prontuario);
	}
	
	
}
