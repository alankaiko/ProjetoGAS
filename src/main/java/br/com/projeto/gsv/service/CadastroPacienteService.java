package br.com.projeto.gsv.service;

import java.util.List;

import br.com.gsv.paciente.domain.Paciente;
import br.com.gsv.repository.PacienteRepository;

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
	
	public Paciente BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
	
	public List<Paciente> BuscandoPeloNome(String nome){
		return this.repositorio.BuscarPeloNome(nome);
	}
}
