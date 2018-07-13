package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.domain.Evolucao;
import br.com.projeto.gsv.service.EvolucaoService;

public class EvolucaoController {
	private Evolucao evolucao;
	private EvolucaoService service;
	
	public EvolucaoController() {
		this.evolucao = new Evolucao();
		this.service = new EvolucaoService();
	}
	
	public void Salvar(){
		this.service.Salvando(this.evolucao);
	}
	
	public void Remover(){
		this.service.Remover(this.evolucao);
	}
	
	
	public Evolucao getEvolucao() {
		return evolucao;
	}
	
	public void setEvolucao(Evolucao evolucao) {
		this.evolucao = evolucao;
	}
	
	public List<Evolucao> ListaCompleta(){
		return this.service.ListandoTudo();
	}
	
}
