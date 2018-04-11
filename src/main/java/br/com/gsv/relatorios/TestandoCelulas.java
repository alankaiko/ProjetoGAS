package br.com.gsv.relatorios;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import br.com.gsv.paciente.domain.Paciente;
import br.com.projeto.gsv.controller.PacienteController;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class TestandoCelulas {
	String nome="Relatorio.pdf";
	//public static final String DEST = "results/tables/table_template.pdf";
	private List<Paciente> listaPaciente;
	private PacienteController controller;
	private Document doc;
	
	
	public TestandoCelulas() {
		controller = new  PacienteController();
		listaPaciente = controller.ListaCompletaDePaciente();
	}

	
	public void CriarPdf()throws IOException, DocumentException{
		doc = new Document(PageSize.A4);
		PdfWriter.getInstance(doc, new FileOutputStream(nome));
		
		doc.open();
		
		
		
		float [ ] colunaLargura = { 2 , 5 , 3, 3, 3 } ;
		PdfPTable tabela = new PdfPTable(colunaLargura);
		tabela.setWidthPercentage(100);
		tabela.getDefaultCell().setUseAscender(true);
		tabela.getDefaultCell().setUseDescender(true);
		Font fonteCabecalho = new Font(FontFamily.COURIER, 12, Font.BOLD, GrayColor.GRAYBLACK);
		Font fonte = new Font(FontFamily.COURIER, 8, Font.NORMAL, GrayColor.GRAYWHITE);
		
		
		
		PdfPCell celulaCodigo = new PdfPCell(new Phrase("CÓDIGO", fonteCabecalho));
		celulaCodigo.setHorizontalAlignment(Element.ALIGN_CENTER);
		celulaCodigo.setBorder(PdfPCell.NO_BORDER);
		PdfPCell celulaNome = new PdfPCell(new Phrase("NOME", fonteCabecalho));
		celulaNome.setHorizontalAlignment(Element.ALIGN_CENTER);
		celulaNome.setBorder(PdfPCell.NO_BORDER);
		PdfPCell celulaTelefone = new PdfPCell(new Phrase("TELEFONE", fonteCabecalho));
		celulaTelefone.setHorizontalAlignment(Element.ALIGN_CENTER);
		celulaTelefone.setBorder(PdfPCell.NO_BORDER);
		PdfPCell celulaConvenio = new PdfPCell(new Phrase("CONVÊNIO", fonteCabecalho));
		celulaConvenio.setHorizontalAlignment(Element.ALIGN_CENTER);
		celulaConvenio.setBorder(PdfPCell.NO_BORDER);
		PdfPCell celulaCidade = new PdfPCell(new Phrase("CIDADE", fonteCabecalho));
		celulaCidade.setHorizontalAlignment(Element.ALIGN_CENTER);
		celulaCidade.setBorder(PdfPCell.NO_BORDER);
		//celula.setBackgroundColor(GrayColor.GRAYBLACK);
		//celula.setHorizontalAlignment(Element.ALIGN_CENTER);
		//celula.setColspan(5);
		
		tabela.addCell(celulaCodigo);
		tabela.addCell(celulaNome);
		tabela.addCell(celulaTelefone);
		tabela.addCell(celulaConvenio);
		tabela.addCell(celulaCidade);
		
		
		//tabela.getDefaultCell().setBackgroundColor(new GrayColor(0.75f));
		tabela.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
		tabela.setHeaderRows(8);
		tabela.setFooterRows(4);
		tabela.getDefaultCell().setBackgroundColor(GrayColor.GRAYWHITE);
		//tabela.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
	
		
		
		for(int con =1; con < 101; con++){
			tabela.addCell("codigo ");
			tabela.addCell("nome ");
			tabela.addCell("rg ");
			tabela.addCell("convenio ");
			tabela.addCell("cidade ");
		}
		
		doc.add(tabela);
		doc.close();
		
		Desktop.getDesktop().open(new File(nome));
	}
	
	
	
	
}
