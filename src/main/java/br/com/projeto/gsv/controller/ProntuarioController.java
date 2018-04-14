package br.com.projeto.gsv.controller;

import java.util.Date;
import java.util.List;

import br.com.gsv.domain.Prontuario;
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
	
	public List<Prontuario> BuscandoPelaIdPaciente(Long id){
		return this.cadastroService.BuscaPelaIdPaciente(id);
	}
	
	public void RemoverProntuario() {
		this.cadastroService.Remover(this.prontuario);
	}
	
	public List<Prontuario> BuscandoPelaData(Date data){
		return this.cadastroService.PegandoPelaData(data);
	}
	
	
	
	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	public Prontuario getProntuario() {
		return prontuario;
	}
}
