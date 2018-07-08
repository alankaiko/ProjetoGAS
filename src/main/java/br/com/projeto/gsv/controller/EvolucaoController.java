package br.com.projeto.gsv.controller;

import br.com.gsv.domain.Evolucao;
import br.com.projeto.gsv.service.EvolucaoService;

public class EvolucaoController {
	private Evolucao evolucao;
	private EvolucaoService service;
	
	public EvolucaoController() {
		this.evolucao = new Evolucao();
		this.service = new EvolucaoService();
	}
	
	public void Salvar(Evolucao evolucao){
		this.service.Salvando(evolucao);
	}
	
	public void Remover(Evolucao evolucao){
		this.service.Remover(evolucao);
	}
	
	
	public Evolucao getEvolucao() {
		return evolucao;
	}
	
	public void setEvolucao(Evolucao evolucao) {
		this.evolucao = evolucao;
	}
	
}
