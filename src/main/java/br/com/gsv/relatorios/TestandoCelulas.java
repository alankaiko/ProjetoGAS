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
import com.itextpdf.text.Paragraph;
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
		Font fonteCabecalho = new Font(FontFamily.COURIER, 8, Font.BOLD, GrayColor.GRAYBLACK);
		Font fonte = new Font(FontFamily.COURIER, 7, Font.NORMAL, GrayColor.GRAYBLACK);
		Font fonteTitulo = new Font(FontFamily.HELVETICA, 14, Font.BOLD, GrayColor.GRAYBLACK);
		
		doc = new Document(PageSize.A4);
		PdfWriter.getInstance(doc, new FileOutputStream(nome));
		
		doc.open();
		
		
		Paragraph paragrafo = new Paragraph("Relatório de Pacientes", fonteTitulo);
		//paragrafo.setAlignment(1);
		doc.add(paragrafo);
		paragrafo = new Paragraph("     ");
		doc.add(paragrafo);
		
		float [ ] colunaLargura = { 2 , 5 , 3, 4, 4 } ;
		PdfPTable tabela = new PdfPTable(colunaLargura);
		tabela.setWidthPercentage(100);
		tabela.getDefaultCell().setUseAscender(true);
		tabela.getDefaultCell().setUseDescender(true);
		
		
		
		PdfPCell celulaCodigo = new PdfPCell(new Paragraph("CÓDIGO", fonteCabecalho));
		celulaCodigo.setHorizontalAlignment(Element.ALIGN_CENTER);
		celulaCodigo.setBorder(PdfPCell.NO_BORDER);
		
		PdfPCell celulaNome = new PdfPCell(new Paragraph("NOME", fonteCabecalho));
		celulaNome.setBorder(PdfPCell.NO_BORDER);
		
		PdfPCell celulaTelefone = new PdfPCell(new Paragraph("TELEFONE", fonteCabecalho));
		celulaTelefone.setBorder(PdfPCell.NO_BORDER);
		
		PdfPCell celulaConvenio = new PdfPCell(new Paragraph("CONVÊNIO", fonteCabecalho));
		celulaConvenio.setBorder(PdfPCell.NO_BORDER);
		
		PdfPCell celulaCidade = new PdfPCell(new Paragraph("CIDADE", fonteCabecalho));
		celulaCidade.setBorder(PdfPCell.NO_BORDER);
		
		//PdfPCell espaco = new PdfPCell();
		//espaco.setColspan(5);
		
		
		tabela.addCell(celulaCodigo);
		tabela.addCell(celulaNome);
		tabela.addCell(celulaTelefone);
		tabela.addCell(celulaConvenio);
		tabela.addCell(celulaCidade);
		//tabela.addCell(espaco);
		
	
		for(Paciente paciente : listaPaciente){
			celulaCodigo = new PdfPCell(new Paragraph(paciente.getId()+"", fonte));				
			celulaNome = new PdfPCell(new Paragraph(paciente.getNome(), fonte));
			celulaTelefone = new PdfPCell(new Paragraph(paciente.getContato().get(0).getCelular(), fonte));
			celulaConvenio = new PdfPCell(new Paragraph(paciente.getConvenio().getNome(), fonte));
			celulaCidade = new PdfPCell(new Paragraph(paciente.getEndereco().get(0).getCidade(), fonte));
		
			celulaCodigo.setHorizontalAlignment(Element.ALIGN_CENTER);
			celulaCodigo.setBorder(PdfPCell.NO_BORDER);
			celulaNome.setBorder(PdfPCell.NO_BORDER);
			celulaTelefone.setBorder(PdfPCell.NO_BORDER);
			celulaConvenio.setBorder(PdfPCell.NO_BORDER);
			celulaCidade.setBorder(PdfPCell.NO_BORDER);
			
			
			tabela.addCell(celulaCodigo);
			tabela.addCell(celulaNome);
			tabela.addCell(celulaTelefone);
			tabela.addCell(celulaConvenio);
			tabela.addCell(celulaCidade);
		}
		
		
		doc.add(tabela);
		doc.close();
		
		Desktop.getDesktop().open(new File(nome));
	}
	
	
	
	
}
