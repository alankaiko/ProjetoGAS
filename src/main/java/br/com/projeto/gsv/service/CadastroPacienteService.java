package br.com.projeto.gsv.service;

import java.util.List;

import br.com.gsv.domain.Convenio;
import br.com.gsv.domain.Paciente;
import br.com.projeto.gsv.repository.PacienteRepository;

public class CadastroPacienteService {
	private PacienteRepository repositorio = new PacienteRepository();

	
	public void Salvar(Paciente paciente){
		this.repositorio.Guardar(paciente);
	}
	
	public void Remover(Paciente paciente){
		this.repositorio.Remover(paciente);
	}
	
	public List<Paciente> ListandoPacientes(){
		return repositorio.ListarPacientes();
	}
	
	public Long VerificaQtd(){
		return this.repositorio.VerificaQTDRegistro();
	}
	
	public Paciente BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
	
	public List<Paciente> BuscandoPeloNome(String nome){
		return this.repositorio.BuscarPeloNome(nome);
	}
	
	//Acessa o método Service do Objeto Fabricante para retornar uma lista completa de todos os Fabricantes
	public List<Convenio> ConvenioListaCompleta(){
		CadastroConvenioService serviceFab = new CadastroConvenioService();
		return serviceFab.ListandoConvenios();
	}
}
