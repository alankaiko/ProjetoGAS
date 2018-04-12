package br.com.gsv.relatorios;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

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

public abstract class AbstractRelatorios {
	public abstract void Iniciar() throws IOException, DocumentException;
	protected abstract void CriaTitulos();
	protected abstract void PopularTabela();
	protected String nome;
	private String titulo;
	private Document documento;
	protected PdfPTable tabela;
	protected Font fonteCabecalho = new Font(FontFamily.COURIER, 8, Font.BOLD, GrayColor.GRAYBLACK);
	protected Font fonteTitulo = new Font(FontFamily.HELVETICA, 14, Font.BOLD, GrayColor.GRAYBLACK);
	protected Font fonte = new Font(FontFamily.COURIER, 7, Font.NORMAL, GrayColor.GRAYBLACK);
	
	
	
	protected void NomeArquivo(String nome){
		this.nome= nome+Calendar.getInstance().getTimeInMillis()+".pdf";
	}
	
	
	protected void NomeColunas(String titulo){
		this.titulo = titulo;
	}
	
	protected void CriarTabela(float[] colu){
		tabela = new PdfPTable(colu);
		tabela.setWidthPercentage(100);
		tabela.getDefaultCell().setUseAscender(true);
		tabela.getDefaultCell().setUseDescender(true);
		tabela.getDefaultCell().setBorderWidth(0.40f);
		
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
