package br.com.gsv.relatorios;

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

public class Relatorio {
	private List<Paciente> listaPaciente;
	private PacienteController controller;
	
	
	public void ConfiguraRelTotal(){
		controller = new  PacienteController();
		
		listaPaciente = controller.ListaCompletaDePaciente();
		String nome="Relatorio.pdf";
		//public static final String DEST = "results/tables/table_template.pdf";
		
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
		//	tabela.setWidths(new float[] { 1.80f, 8, 1.50f, 2.30f, 3.80f });
			PdfPCell celula1 = new PdfPCell(new Paragraph("Código"));
			PdfPCell celula12 = new PdfPCell(new Paragraph(""));
			PdfPCell celula2 = new PdfPCell(new Paragraph("Nome"));
			PdfPCell celula13 = new PdfPCell(new Paragraph(""));
			PdfPCell celula3 = new PdfPCell(new Paragraph("RG"));
			PdfPCell celula14= new PdfPCell(new Paragraph(""));
			PdfPCell celula4 = new PdfPCell(new Paragraph("Convênio"));
			PdfPCell celula15 = new PdfPCell(new Paragraph(""));
			PdfPCell celula5 = new PdfPCell(new Paragraph("Cidade"));
			
			celula1.setBorder(PdfPCell.NO_BORDER);
			celula2.setBorder(PdfPCell.NO_BORDER);
			celula3.setBorder(PdfPCell.NO_BORDER);
			celula4.setBorder(PdfPCell.NO_BORDER);
			celula5.setBorder(PdfPCell.NO_BORDER);
			
			tabela.addCell(celula1);
			tabela.addCell(celula12);
			tabela.addCell(celula2);
			tabela.addCell(celula13);
			tabela.addCell(celula3);
			tabela.addCell(celula14);
			tabela.addCell(celula4);
			tabela.addCell(celula15);
			tabela.addCell(celula5);
			
			
			for(Paciente paciente : listaPaciente){
				celula1 = new PdfPCell(new Paragraph(paciente.getId()+"", FontFactory.getFont(FontFactory.COURIER,8, Font.BOLD, BaseColor.BLACK)));		
				celula2 = new PdfPCell(new Paragraph(paciente.getNome(), FontFactory.getFont(FontFactory.COURIER,8, Font.BOLD, BaseColor.BLACK)));
				celula3 = new PdfPCell(new Paragraph(paciente.getRg(), FontFactory.getFont(FontFactory.COURIER,8, Font.BOLD, BaseColor.BLACK)));
				celula4 = new PdfPCell(new Paragraph(paciente.getConvenio().getNome(), FontFactory.getFont(FontFactory.COURIER,8, Font.BOLD, BaseColor.BLACK)));
				celula5 = new PdfPCell(new Paragraph(paciente.getEndereco().get(0).getCidade(), FontFactory.getFont(FontFactory.COURIER,8, Font.BOLD, BaseColor.BLACK)));
				
				celula1.setBorder(PdfPCell.NO_BORDER);
				celula2.setBorder(PdfPCell.NO_BORDER);
				celula3.setBorder(PdfPCell.NO_BORDER);
				celula4.setBorder(PdfPCell.NO_BORDER);
				celula5.setBorder(PdfPCell.NO_BORDER);
				
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
