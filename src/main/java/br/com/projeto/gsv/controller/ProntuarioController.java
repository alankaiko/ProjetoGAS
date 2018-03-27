package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.prontuario.domain.Prontuario;
import br.com.projeto.gsv.service.CadastroProntuarioService;

public class ProntuarioController {
	private Prontuario prontuario;
	private CadastroProntuarioService cadastroService;

	public ProntuarioController() {
		this.prontuario = new Prontuario();
		this.cadastroService = new CadastroProntuarioService();
	}
	
	public void SalvarProntuario() {
		this.cadastroService.Salvar(this.prontuario);
	}
	
	public List<Prontuario> ListaCompletaDeProntuarios(){
		return cadastroService.ListandoProntuarios();
	}
	
	
	public Prontuario BuscarPelaID(Long id){
		return this.cadastroService.BuscandoId(id);
	}
	
	public void RemoverProntuario() {
		this.cadastroService.Remover(this.prontuario);
	}
	
	
	
	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	public Prontuario getProntuario() {
		return prontuario;
	}
}
