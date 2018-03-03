package br.com.projeto.gsv.service;

import java.util.List;

import br.com.gsv.convenio.domain.Convenio;
import br.com.gsv.repository.ConvenioRepository;

public class CadastroConvenioService {
	private ConvenioRepository repositorio = new ConvenioRepository();

	
	public void Salvar(Convenio convenio){
		this.repositorio.Guardar(convenio);
	}
	
	public void Remover(Convenio convenio){
		this.repositorio.Remover(convenio);
	}
	
	public List<Convenio> ListandoConvenios(){
		return repositorio.ListarConvenio();
	}
	
	public Convenio BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
	
	public List<Convenio> BuscandoPeloNome(String nome){
		return this.repositorio.BuscarPeloNome(nome);
	}
}
