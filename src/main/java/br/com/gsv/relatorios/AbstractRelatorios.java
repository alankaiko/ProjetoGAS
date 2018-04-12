package br.com.gsv.relatorios;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public abstract class AbstractRelatorios {
	String nome;
	private String titulo;
	private String[] colunas;
	Document documento;
	PdfPTable tabela;
	Font fonteCabecalho = new Font(FontFamily.COURIER, 8, Font.BOLD, GrayColor.GRAYBLACK);
	Font fonteTitulo = new Font(FontFamily.HELVETICA, 14, Font.BOLD, GrayColor.GRAYBLACK);
	Font fonte = new Font(FontFamily.COURIER, 7, Font.NORMAL, GrayColor.GRAYBLACK);
	
	
	protected void NomeArquivo(String nome){
		this.nome= nome+Calendar.getInstance().getTimeInMillis()+".pdf";
	}
	
	
	protected void NomeColunas(String titulo, String... colunas){
		this.titulo = titulo;
		this.colunas = colunas;
	}
	
	protected void CriarTabela(){
		tabela = new PdfPTable(colunas.length);
		tabela.setWidthPercentage(100);
		tabela.getDefaultCell().setUseAscender(true);
		tabela.getDefaultCell().setUseDescender(true);
		
		for(int i=0; i < this.colunas.length; i++){
			PdfPCell celula = new PdfPCell(new Paragraph(this.colunas[i], fonteCabecalho));
			//celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setBorder(PdfPCell.NO_BORDER);
			tabela.addCell(celula);
		}
	}
	
	
		
	
	
	protected void CriaDocumento()throws IOException, DocumentException{
		documento = new Document(PageSize.A4);
		PdfWriter.getInstance(documento, new FileOutputStream(nome));
		documento.open();
		
		Paragraph paragrafo = new Paragraph(this.titulo, fonteTitulo);
		//paragrafo.setAlignment(1);
		documento.add(paragrafo);
		
		paragrafo = new Paragraph("     ");
		documento.add(paragrafo);		
		
		
		
		
		documento.add(tabela);
		documento.close();
		Desktop.getDesktop().open(new File(nome));
	}
	
	
	
	
}
