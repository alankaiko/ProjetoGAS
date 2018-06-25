package br.com.projeto.gsv.service;

import java.util.List;

import br.com.gsv.domain.Agenda;
import br.com.projeto.gsv.repository.AgendaRepository;

public class CadastroAgendaService {
	private AgendaRepository repositorio = new AgendaRepository();

	
	public void Salvar(Agenda agenda){
		this.repositorio.Guardar(agenda);
	}
	
	public void Remover(Agenda agenda){
		this.repositorio.Remover(agenda);
	}	
	
	public Agenda BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
	
	public List<String> ListarHorarios(){
		return this.repositorio.ListandoHorarios();
	}
}
