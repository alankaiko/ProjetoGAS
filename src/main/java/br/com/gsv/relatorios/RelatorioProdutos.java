package br.com.gsv.relatorios;

import java.io.IOException;
import java.util.List;

import br.com.gsv.produtos.domain.Produto;
import br.com.projeto.gsv.controller.ProdutoController;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;

public class RelatorioProdutos extends AbstractRelatorios{
	private ProdutoController controller;
	private List<Produto> lista;
	private String tituloProduto= "Relatório de Produtos";
	private PdfPCell celulaCodigo, celulaDescricao, celulaQuantidade, celulaFabricante;
	private float [ ] colunaLargura = { 2f , 5.50f , 2, 4};
	
	
	public RelatorioProdutos(){
		controller = new ProdutoController();
		this.lista = controller.ListaCompletaDeProdutos();
		
	}
	
	
	@Override
	public void Iniciar() throws IOException, DocumentException {
		this.NomeArquivo("relproduto");
		this.NomeColunas(tituloProduto);
		this.CriarTabela(colunaLargura);
		this.CriaTitulos();
		PopularTabela();
		this.CriaDocumento();
		
	}

	@Override
	protected void CriaTitulos() {
		celulaCodigo = new PdfPCell(new Paragraph("CÓDIGO", fonteCabecalho));
		celulaCodigo.setBorder(PdfPCell.NO_BORDER);
		
		celulaDescricao = new PdfPCell(new Paragraph("DESCRIÇÃO", fonteCabecalho));
		celulaDescricao.setBorder(PdfPCell.NO_BORDER);
		
		celulaQuantidade = new PdfPCell(new Paragraph("QUANTIDADE", fonteCabecalho));
		celulaQuantidade.setBorder(PdfPCell.NO_BORDER);
		
		celulaFabricante = new PdfPCell(new Paragraph("FABRICANTE", fonteCabecalho));
		celulaFabricante.setBorder(PdfPCell.NO_BORDER);
		
		PdfPCell espaco = new PdfPCell();
		espaco.setColspan(5);
		
		
		tabela.addCell(celulaCodigo);
		tabela.addCell(celulaDescricao);
		tabela.addCell(celulaQuantidade);
		tabela.addCell(celulaFabricante);
		tabela.addCell(espaco);
		
	}

	@Override
	protected void PopularTabela() {
		for(Produto produto : lista){
			celulaCodigo = new PdfPCell(new Paragraph(produto.getCodigo()+"", fonte));				
			celulaDescricao = new PdfPCell(new Paragraph(produto.getDescricao(), fonte));
			celulaQuantidade = new PdfPCell(new Paragraph(produto.getQuantidade()+"", fonte));
			celulaFabricante = new PdfPCell(new Paragraph(produto.getFabricante().getDescricao(), fonte));
		
			celulaCodigo.setHorizontalAlignment(Element.ALIGN_LEFT);
			celulaCodigo.setBorder(PdfPCell.NO_BORDER);
			celulaDescricao.setBorder(PdfPCell.NO_BORDER);
			celulaQuantidade.setBorder(PdfPCell.NO_BORDER);
			celulaFabricante.setBorder(PdfPCell.NO_BORDER);
			
			this.tabela.addCell(celulaCodigo);
			this.tabela.addCell(celulaDescricao);
			this.tabela.addCell(celulaQuantidade);
			this.tabela.addCell(celulaFabricante);
		}
		
	}

}
