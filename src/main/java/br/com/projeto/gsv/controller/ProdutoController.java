package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.funcionario.domain.Funcionario;
import br.com.gsv.produtos.domain.Produto;
import br.com.projeto.gsv.service.CadastroProdutoService;

public class ProdutoController {
	private Produto produto;
	private CadastroProdutoService cadastroService;

	
	
	public ProdutoController() {
		this.produto = new Produto();
		this.cadastroService = new CadastroProdutoService();
	}

	public void SalvarProduto() {
		this.cadastroService.Salvar(this.produto);
	}

	public void RemoverProduto() {
		this.cadastroService.Remover(this.produto);
	}

	public List<Produto> ListaCompletaDeProdutos() {
		return cadastroService.ListandoProdutos();
	}

	public List<Produto> BuscarPorCodigo(String codigo) {
		return this.cadastroService.BuscandoCodigo(codigo);
	}

	public List<Produto> BuscarPelaDescricao(String descricao) {
		return this.cadastroService.BuscandoPelaDescricao(descricao);
	}

	
	public Produto BuscarPelaID(Long id) {
		return this.cadastroService.BuscandoId(id);
	}
	
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Produto getProduto() {
		return produto;
	}
}
