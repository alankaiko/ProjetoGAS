package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.convenio.domain.Convenio;
import br.com.gsv.paciente.domain.Paciente;
import br.com.projeto.gsv.service.CadastroPacienteService;

public class PacienteController {
	private Paciente paciente;
	private CadastroPacienteService cadastroService;
	
	
	public PacienteController(){
		this.paciente = new Paciente();
		this.cadastroService = new CadastroPacienteService();
	}
	
	
	public void SalvarPaciente(){
		this.cadastroService.Salvar(this.paciente);
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
