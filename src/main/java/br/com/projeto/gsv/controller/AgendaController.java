package br.com.projeto.gsv.controller;

import java.util.Date;
import java.util.List;

import br.com.gsv.domain.Agenda;
import br.com.projeto.gsv.service.AgendaService;

public class AgendaController {
	private Agenda agenda;
	private AgendaService cadastroService;

	public AgendaController() {
		this.agenda = new Agenda();
		this.cadastroService = new AgendaService();
	}

	public void SalvarAgenda() {
		this.cadastroService.Salvar(this.agenda);
	}

	public void RemoverAgenda() {
		this.cadastroService.Remover(this.agenda);
	}
	
	public List<String> ListarHorarios(Date data){
		return this.cadastroService.ListarHorarios(data);
	}

	public List<Agenda> ListaDeAgendados(Date data){
		return this.cadastroService.ListaDosAgendados(data);
	}
	
	public Agenda BuscarPelaID(Long id) {
		return this.cadastroService.BuscandoId(id);
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
	public Agenda getAgenda() {
		return agenda;
	}
	
	
}
