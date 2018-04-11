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
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

public class TestandoCelulas {
	String nome="Relatorio.pdf";
	//public static final String DEST = "results/tables/table_template.pdf";
	private List<Paciente> listaPaciente;
	private PacienteController controller;
	
	
	public TestandoCelulas() {
		controller = new  PacienteController();
		listaPaciente = controller.ListaCompletaDePaciente();
	}
	
	/*PdfPCell celula1 = new PdfPCell(new Paragraph("Código"));
	PdfPCell celula12 = new PdfPCell(new Paragraph(""));
	PdfPCell celula2 = new PdfPCell(new Paragraph("Nome"));
	PdfPCell celula13 = new PdfPCell(new Paragraph(""));
	PdfPCell celula3 = new PdfPCell(new Paragraph("RG"));
	PdfPCell celula14= new PdfPCell(new Paragraph(""));
	PdfPCell celula4 = new PdfPCell(new Paragraph("Convênio"));
	PdfPCell celula15 = new PdfPCell(new Paragraph(""));
	PdfPCell celula5 = new PdfPCell(new Paragraph("Cidade"));*/
	
	
	public void CriarPdf()throws IOException, DocumentException{
		Document doc = new Document(PageSize.A4);
		PdfWriter.getInstance(doc, new FileOutputStream(nome));
		
		doc.open();
		
		float [ ] colunaLargura = { 2 , 5 , 3, 3, 3 } ;
		PdfPTable tabela = new PdfPTable(colunaLargura);
		tabela.setWidthPercentage(100);
		tabela.getDefaultCell().setUseAscender(true);
		tabela.getDefaultCell().setUseDescender(true);
		Font fonte = new Font(FontFamily.HELVETICA, 13, Font.NORMAL, GrayColor.GRAYWHITE);
		
		
		PdfPCell celula = new PdfPCell(new Phrase("Este é o cabecalho", fonte));
		celula.setBackgroundColor(GrayColor.GRAYBLACK);
		celula.setHorizontalAlignment(Element.ALIGN_CENTER);
		celula.setColspan(5);
		
		
		tabela.addCell(celula);
		tabela.getDefaultCell().setBackgroundColor(new GrayColor(0.75f));
		tabela.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
		
		//for(int i=0; i<2; i++){
			tabela.addCell("codigo");
			tabela.addCell("nome");
			tabela.addCell("rg");
			tabela.addCell("convenio");
			tabela.addCell("cidade");
		//}
		
		
	
		tabela.setHeaderRows(3);
		tabela.setFooterRows(1);
		tabela.getDefaultCell().setBackgroundColor(GrayColor.GRAYWHITE);
		tabela.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		
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
