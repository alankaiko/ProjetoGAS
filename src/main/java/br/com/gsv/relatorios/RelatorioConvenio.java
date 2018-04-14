package br.com.gsv.relatorios;

import java.io.IOException;
import java.util.List;

import br.com.gsv.domain.Convenio;
import br.com.projeto.gsv.controller.ConvenioController;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;

public class RelatorioConvenio extends AbstractRelatorios{
	private ConvenioController controller;
	private List<Convenio> lista;
	private String tituloConvenio= "Relatório de Convênio";
	private PdfPCell celulaCodigo, celulaDescricao;
	private float [ ] colunaLargura = { 1.50f , 5.50f };
	
	
	public RelatorioConvenio(){
		controller = new ConvenioController();
		this.lista = controller.listaCompletaConvenios();		
	}
	
	

	@Override
	public void Iniciar() throws IOException, DocumentException {
		this.NomeArquivo("relconven");
		this.NomeColunas(tituloConvenio);
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
		for(Convenio convenio : lista){
			celulaCodigo = new PdfPCell(new Paragraph(convenio.getId()+"", fonte));				
			celulaDescricao = new PdfPCell(new Paragraph(convenio.getNome(), fonte));
					
			celulaCodigo.setHorizontalAlignment(Element.ALIGN_LEFT);
			celulaCodigo.setBorder(PdfPCell.NO_BORDER);
			celulaDescricao.setBorder(PdfPCell.NO_BORDER);
			
			this.tabela.addCell(celulaCodigo);
			this.tabela.addCell(celulaDescricao);
		}
		
	}

}
