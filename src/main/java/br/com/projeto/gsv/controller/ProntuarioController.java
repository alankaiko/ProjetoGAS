package br.com.projeto.gsv.controller;

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
	
	
	
	
	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	public Prontuario getProntuario() {
		return prontuario;
	}
}
