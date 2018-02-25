package br.com.projeto.gsv.service;

import java.util.List;

import br.com.gsv.fabricantes.domain.Fabricante;
import br.com.gsv.repository.FabricanteRepository;



public class CadastroFabricanteService {
private FabricanteRepository repositorio = new FabricanteRepository();

	
	public void Salvar(Fabricante fabricante){
		this.repositorio.Guardar(fabricante);
	}
	
	public void Remover(Fabricante fabricante){
		this.repositorio.Remover(fabricante);
	}
	
	public List<Fabricante> ListandoFabricantes(){
		return repositorio.ListarFabricante();
	}
	
	public Fabricante BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
	
	public List<Fabricante> BuscandoPeloNome(String nome){
		return this.repositorio.BuscarPeloNome(nome);
	}
}