package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.domain.Convenio;
import br.com.projeto.gsv.service.ConvenioService;

public class ConvenioController {
	private Convenio convenio;
	private ConvenioService cadastroService;

	public ConvenioController() {
		this.convenio = new Convenio();
		this.cadastroService = new ConvenioService();
	}

	public void SalvarConvenio() {
		this.cadastroService.Salvar(this.convenio);
	}

	public void RemoverConvenio() {
		this.cadastroService.Remover(this.convenio);
	}

	public List<Convenio> listaCompletaConvenios() {
		return cadastroService.ListandoConvenios();
	}

	public Convenio BuscarPelaID(Long id) {
		return this.cadastroService.BuscandoId(id);
	}

	public List<Convenio> BuscarPeloNome(String nome) {
		return this.cadastroService.BuscandoPeloNome(nome);
	}
	
	

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	
	public Convenio getConvenio() {
		return convenio;
	}
	
}
