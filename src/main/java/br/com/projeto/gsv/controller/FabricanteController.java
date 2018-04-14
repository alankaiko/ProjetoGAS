package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.domain.Fabricante;
import br.com.projeto.gsv.service.CadastroFabricanteService;

public class FabricanteController {
	private Fabricante fabricante;
	private CadastroFabricanteService cadastroService;

	public FabricanteController() {
		this.fabricante = new Fabricante();
		this.cadastroService = new CadastroFabricanteService();
	}

	public void SalvarFabricante() {
		this.cadastroService.Salvar(this.fabricante);
	}

	public void RemoverFabricante() {
		this.cadastroService.Remover(this.fabricante);
	}

	public List<Fabricante> ListaCompletaDeFabricante() {
		return cadastroService.ListandoFabricantes();
	}

	public Fabricante BuscarPelaID(Long id) {
		return this.cadastroService.BuscandoId(id);
	}

	public List<Fabricante> BuscarPeloNome(String nome) {
		return this.cadastroService.BuscandoPeloNome(nome);
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}
}
