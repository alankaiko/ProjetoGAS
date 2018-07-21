package br.com.gsv.relatorios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import br.com.gsv.domain.Prontuario;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;


public class RelatorioProntuarioPorPaciente {
	public static final String DEST = "results/objects/list_alignment.pdf";
	private static Prontuario prontuario;
	PdfPTable tabela;
	protected Font fonteTitulo = new Font(FontFamily.HELVETICA, 13, Font.BOLDITALIC, GrayColor.GRAYBLACK);
	protected Font fonte = new Font(FontFamily.COURIER, 7, Font.NORMAL, GrayColor.GRAYBLACK);
	PdfPCell celulaCodigo, campoCodigo, celulaDataCad, campoDataCad, celulaDataNas, campoDataNas;
	float [ ] colunaLargura = { 1.50f , 5.50f, 1.50f , 5.50f,1.50f , 5.50f };
	
	
	 
    public static void main(String[] args) throws IOException,DocumentException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        
        new RelatorioProntuarioPorPaciente().createPdf(DEST);
    }
    
    public RelatorioProntuarioPorPaciente() {
		prontuario = new Prontuario();
		
	}
 
    public void createPdf(String dest) throws IOException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        
       
        Paragraph paragrafo = new Paragraph("prontuario.getPaciente().getNome()", fonteTitulo);  
        document.add(paragrafo);
        
        DottedLineSeparator separator = new DottedLineSeparator();
        Chunk c = new Chunk(separator);
        Paragraph p = new Paragraph();
        p.add(c);
        document.add(p);
        
       
        
    	tabela = new PdfPTable(colunaLargura);
    	tabela.setWidthPercentage(100);
		tabela.getDefaultCell().setUseAscender(true);
		tabela.getDefaultCell().setUseDescender(true);
		tabela.getDefaultCell().setBorderWidth(0.40f);
    	 
    	celulaCodigo = new PdfPCell(new Paragraph("Código Paciente"+"", fonte));			
    	celulaCodigo.setBorder(PdfPCell.NO_BORDER);
    	
    	campoCodigo = new PdfPCell(new Paragraph("prontuario.getPaciente().getId()"+"", fonte));
    	campoCodigo.setBorder(PdfPCell.NO_BORDER);
    	
    	celulaDataCad = new PdfPCell(new Paragraph("Código Paciente"+"", fonte));			
    	celulaDataCad.setBorder(PdfPCell.NO_BORDER);
    	
    	campoDataCad = new PdfPCell(new Paragraph("prontuario.getPaciente().getId()"+"", fonte));
    	campoDataCad.setBorder(PdfPCell.NO_BORDER);
    	
    	celulaDataNas = new PdfPCell(new Paragraph("Código Paciente"+"", fonte));			
    	celulaDataNas.setBorder(PdfPCell.NO_BORDER);
    	
    	campoDataNas = new PdfPCell(new Paragraph("prontuario.getPaciente().getId()"+"", fonte));
    	campoDataNas.setBorder(PdfPCell.NO_BORDER);
    	
    	tabela.addCell(celulaCodigo);
    	tabela.addCell(campoCodigo);
    	
    	tabela.addCell(celulaDataCad);
    	tabela.addCell(campoDataCad);
    	
    	tabela.addCell(celulaDataNas);
    	tabela.addCell(campoDataNas);
    	

        document.add(tabela);
        
        
        
        
        
        
        String text = "test 1 2 3 ";
        
        for (int i = 0; i < 5; i++) {
            text = text + text;
        }
        
        List list = new List(List.UNORDERED);
        ListItem item = new ListItem(text);
        item.setAlignment(Element.ALIGN_JUSTIFIED);
        list.add(item);
        text = "a b c align ";
        
        for (int i = 0; i < 5; i++) {
            text = text + text;
        }
        
        item = new ListItem(text);
        item.setAlignment(Element.ALIGN_JUSTIFIED);
        list.add(item);
        text = "supercalifragilisticexpialidocious ";
        
        for (int i = 0; i < 3; i++) {
            text = text + text;
        }
        
        item = new ListItem(text);
        item.setAlignment(Element.ALIGN_JUSTIFIED);
        list.add(item);
        document.add(list);
        document.close();
     
    }
}
