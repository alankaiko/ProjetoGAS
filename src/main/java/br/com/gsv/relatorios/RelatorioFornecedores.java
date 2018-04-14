package br.com.gsv.relatorios;

import java.io.IOException;
import java.util.List;

import br.com.gsv.domain.Fabricante;
import br.com.projeto.gsv.controller.FabricanteController;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;

public class RelatorioFornecedores extends AbstractRelatorios{
	private  FabricanteController controller;
	private List<Fabricante> lista;
	private String tituloFabricante= "Relatório de Fabricante";
	private PdfPCell celulaCodigo, celulaDescricao;
	private float [ ] colunaLargura = { 1.50f , 5.50f};
	
	
	public RelatorioFornecedores(){
		controller = new FabricanteController();
		this.lista = controller.ListaCompletaDeFabricante();
		
	}


	@Override
	public void Iniciar() throws IOException, DocumentException {
		this.NomeArquivo("relfornec");
		this.NomeColunas(tituloFabricante);
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
		
		PdfPCell espaco = new PdfPCell();
		espaco.setColspan(5);
		
		
		tabela.addCell(celulaCodigo);
		tabela.addCell(celulaDescricao);
		tabela.addCell(espaco);		
	}


	@Override
	protected void PopularTabela() {
		for(Fabricante fabricante : lista){
			celulaCodigo = new PdfPCell(new Paragraph(fabricante.getId()+"", fonte));				
			celulaDescricao = new PdfPCell(new Paragraph(fabricante.getDescricao(), fonte));
		
			celulaCodigo.setHorizontalAlignment(Element.ALIGN_LEFT);
			celulaCodigo.setBorder(PdfPCell.NO_BORDER);
			celulaDescricao.setBorder(PdfPCell.NO_BORDER);
			
			this.tabela.addCell(celulaCodigo);
			this.tabela.addCell(celulaDescricao);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
