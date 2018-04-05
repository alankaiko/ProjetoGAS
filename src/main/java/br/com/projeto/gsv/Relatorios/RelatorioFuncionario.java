package br.com.projeto.gsv.Relatorios;

import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import br.com.gsv.paciente.domain.Paciente;
import br.com.projeto.gsv.controller.PacienteController;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class RelatorioFuncionario {
	private List<Paciente> listaPaciente;
	private PacienteController controller;
	
	
	public void ConfiguraRelTotal(){
		controller = new  PacienteController();
		
		listaPaciente = controller.ListaCompletaDePaciente();
		String nome="Relatorio.pdf";
		
		Document doc = new Document();
		
		Font segoe = new Font("Segoe UI", Font.PLAIN, 12);
		Chunk t = new Chunk();
		
		
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(nome));
			doc.open();
			
			Paragraph paragrafo = new Paragraph("Relatório de Pacientes");
			paragrafo.setAlignment(1);
			doc.add(paragrafo);
			paragrafo = new Paragraph("     ");
			doc.add(paragrafo);
				
			
			
			PdfPTable tabela = new PdfPTable(5);
			tabela.setWidths(new float[] { 1.30f, 8, 1.50f, 2, 3.80f });
			
			PdfPCell celula1 = new PdfPCell(new Paragraph("Código"));
			PdfPCell celula2 = new PdfPCell(new Paragraph("Nome"));
			PdfPCell celula3 = new PdfPCell(new Paragraph("RG"));
			PdfPCell celula4 = new PdfPCell(new Paragraph("Convênio"));
			PdfPCell celula5 = new PdfPCell(new Paragraph("Cidade"));
			
			
			tabela.addCell(celula1);
			tabela.addCell(celula2);
			tabela.addCell(celula3);
			tabela.addCell(celula4);
			tabela.addCell(celula5);
			
			
			for(Paciente paciente : listaPaciente){
				celula1 = new PdfPCell(new Paragraph(paciente.getId()+"", FontFactory.getFont(FontFactory.COURIER,8, Font.BOLD, BaseColor.BLACK)));		
				celula1.setBorder(Rectangle.OUT_BOTTOM);
				celula2 = new PdfPCell(new Paragraph(paciente.getNome(), FontFactory.getFont(FontFactory.COURIER,8, Font.BOLD, BaseColor.BLACK)));
				celula2.setBorder(Rectangle.OUT_BOTTOM);
				celula3 = new PdfPCell(new Paragraph(paciente.getRg(), FontFactory.getFont(FontFactory.COURIER,8, Font.BOLD, BaseColor.BLACK)));
				celula3.setBorder(Rectangle.OUT_BOTTOM);
				celula4 = new PdfPCell(new Paragraph(paciente.getConvenio().getNome(), FontFactory.getFont(FontFactory.COURIER,8, Font.BOLD, BaseColor.BLACK)));
				celula4.setBorder(Rectangle.OUT_BOTTOM);
				celula5 = new PdfPCell(new Paragraph(paciente.getEndereco().get(0).getCidade(), FontFactory.getFont(FontFactory.COURIER,8, Font.BOLD, BaseColor.BLACK)));
				celula5.setBorder(Rectangle.OUT_BOTTOM);
				
				tabela.addCell(celula1);
				tabela.addCell(celula2);
				tabela.addCell(celula3);
				tabela.addCell(celula4);
				tabela.addCell(celula5);
			}
			
			doc.add(tabela);
			doc.close();
			Desktop.getDesktop().open(new File(nome));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
