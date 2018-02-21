package br.com.projeto.gsv.service;

import java.util.List;

import br.com.gsv.produtos.domain.Produto;
import br.com.gsv.repository.ProdutoRepository;

public class CadastroProdutoService {
	private  ProdutoRepository repositorio = new ProdutoRepository();

	
	public void Salvar(Produto produto){
		this.repositorio.Guardar(produto);
	}
	
	public void Remover(Produto produto){
		this.repositorio.Remover(produto);
	}
	
	public List<Produto> ListandoProdutos(){
		return repositorio.ListarProdutos();
	}
	
	public Produto BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
	
	public List<Produto> BuscandoPelaDescricao(String descricao){
		return this.repositorio.BuscarPeloNome(descricao);
	}
}
