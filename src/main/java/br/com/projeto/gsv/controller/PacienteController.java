package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.domain.Convenio;
import br.com.gsv.domain.Paciente;
import br.com.gsv.util.MensagemPainelUtil;
import br.com.projeto.gsv.service.PacienteService;

public class PacienteController {
	private Paciente paciente;
	private PacienteService cadastroService;
	
	
	public PacienteController(){
		this.paciente = new Paciente();
		this.cadastroService = new PacienteService();
	}
	
	
	public void SalvarPaciente(){
		if(this.cadastroService.VerificaQtd() < 100L)
			this.cadastroService.Salvar(this.paciente);
		else
			MensagemPainelUtil.ErroDuplicacao("Atenção! Só é permitido registrar 100 pacientes");
	}
	
	
	public void RemoverPaciente(){
		this.cadastroService.Remover(this.paciente);
	}
	
	public List<Paciente> ListaCompletaDePaciente(){
		return cadastroService.ListandoPacientes();
	}
	
	public Paciente BuscarPelaID(Long id){
		return this.cadastroService.BuscandoId(id);
	}
	
	public List<Paciente> BuscarPeloNome(String nome){
		return this.cadastroService.BuscandoPeloNome(nome);
	}
	
	
	public List<Convenio> RetornaConvenio(){
		return this.cadastroService.ConvenioListaCompleta();
	}
	
	
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	
	
}
