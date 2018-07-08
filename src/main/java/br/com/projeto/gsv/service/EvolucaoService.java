package br.com.projeto.gsv.service;

import br.com.gsv.domain.Evolucao;
import br.com.projeto.gsv.repository.EvolucaoRepository;

public class EvolucaoService {
	private EvolucaoRepository repositorio = new EvolucaoRepository();
	
	public void Salvando(Evolucao evolucao){
		this.repositorio.Salvar(evolucao);
	}
	
	public void Remover(Evolucao evolucao){
		this.repositorio.Remover(evolucao);
	}
}
