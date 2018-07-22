package br.com.gsv.relatorios;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import br.com.gsv.domain.Prontuario;
import br.com.gsv.util.ConverteDadosUtil;
import br.com.gsv.util.ValidaCampos;
import br.com.projeto.gsv.controller.ProntuarioController;

import com.itextpdf.text.Chunk;
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
import com.itextpdf.text.pdf.draw.LineSeparator;



public class RelatorioProntuarioPorPaciente{
	private ProntuarioController controller;
	private Prontuario prontuario;
	private String nome;
	private PdfPCell celulaCodigo, campoCodigo, celulaHora, campoHora, celulaDataCad, campoDataCad;
	private float [ ] linha01 = { 1.30f, 3.80f,1.80f, 2.50f,3.30f, 1.30f};
	private PdfPCell celulaRg, campoRg, celulaCpf, campoCpf, celulaDataNas, campoDataNas;
	private float [ ] linha02 = { 0.50f, 3.80f,0.50f, 5.50f,2.00f, 1.30f};
	private PdfPCell celulaNivel, campoNivel, celulaEstadoMen, campoEstadoMen, celulaObservaMen, campoOBservaMen;
	private float [ ] linha03 = { 1.50f, 1.50f,1.00f, 1.50f,2.00f, 1.30f};
	private PdfPCell celulaAvalia, campoAvalia, celulaAvaliaObser, campoAvaliaObser;
	private float [ ] linha04 = { 1.50f, 1.50f,1.00f, 1.50f};
	private PdfPCell celulaRepouso, campoRepouso, celulaSono, campoSono;
	private float [ ] linha05 = { 1.50f, 1.50f,1.00f, 1.50f};
	private PdfPCell celulaCondicao, campoCondicao;
	private float [ ] linha06 = { 1.50f, 1.50f};
	private PdfPTable tabela01;	
	protected Font fonteTitulo = new Font(FontFamily.HELVETICA, 14, Font.BOLD, GrayColor.GRAYBLACK);
	protected Font fonte = new Font(FontFamily.COURIER, 7, Font.BOLD, GrayColor.GRAYBLACK);
	protected Font fonteProntuario = new Font(FontFamily.TIMES_ROMAN, 6, Font.NORMAL, GrayColor.GRAYBLACK);
	public static final String destino = "C:/temp/";
	private Document documento;
	
	
    
    public RelatorioProntuarioPorPaciente() {
    	controller = new ProntuarioController();
	}
    
    
    
	public void Iniciar() throws IOException, DocumentException {
		this.NomeArquivo("Prontuario");
		this.CriaTitulos();
		
	}
	

	private void NomeArquivo(String nome){
		if(ValidaCampos.ValidaSistemaOperacional(System.getProperty("os.name")))
			this.nome= destino+nome+Calendar.getInstance().getTimeInMillis()+".pdf";
		else
			this.nome= nome+Calendar.getInstance().getTimeInMillis()+".pdf";
	}
	
 

	private void CriarTabela(float[] colu){
    	tabela01 = new PdfPTable(colu);
    	tabela01.setWidthPercentage(100);
    	tabela01.getDefaultCell().setUseAscender(true);
    	tabela01.getDefaultCell().setUseDescender(true);
    	tabela01.getDefaultCell().setUseAscender(true);
    	tabela01.getDefaultCell().setUseDescender(true);
    	tabela01.getDefaultCell().setUseAscender(true);
    	tabela01.getDefaultCell().setUseDescender(true);
    	tabela01.getDefaultCell().setBorderWidth(0.40f);
		
	}
	
    
	private void CriaTitulos() {
		try {
			documento = new Document(PageSize.A4);
			PdfWriter.getInstance(documento, new FileOutputStream(nome));
			documento.open();
			
			Paragraph paragrafo = new Paragraph(prontuario.getPaciente().getNome(), fonteTitulo);
			//paragrafo.setAlignment(1);
			documento.add(paragrafo);
		        
			LineSeparator separator = new LineSeparator();
	        Chunk c = new Chunk(separator);
	        Paragraph p = new Paragraph();
	        p.add(c);
	        documento.add(p);
	        
	        this.CriarTabela(linha01);
	        AdicionarLinha01();
	        
	        paragrafo = new Paragraph("     ");
			documento.add(paragrafo);		
	        
	        this.CriarTabela(linha02);
	        AdicionarLinha02();
	        
	        paragrafo = new Paragraph("     ");
			documento.add(paragrafo);		
	        
	        this.CriarTabela(linha03);
	        AdicionarLinha03();
	        
	        paragrafo = new Paragraph("     ");
			documento.add(paragrafo);	
			
	        this.CriarTabela(linha04);
	        AdicionarLinha04();
	        
	        paragrafo = new Paragraph("     ");
			documento.add(paragrafo);	
			
	        this.CriarTabela(linha05);
	        AdicionarLinha05();
	        
	        paragrafo = new Paragraph("     ");
			documento.add(paragrafo);	
			
	        this.CriarTabela(linha06);
	        AdicionarLinha06();
	        
	      
			documento.close();
			Desktop.getDesktop().open(new File(nome));
		} catch (FileNotFoundException | DocumentException e ) {
			System.out.println("metodo que constroi o pdf");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private void AdicionarLinha01(){
		
		try {
			celulaCodigo = new PdfPCell(new Paragraph("Código", fonte));
			celulaCodigo.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaCodigo);
	        
			campoCodigo = new PdfPCell(new Paragraph(prontuario.getPaciente().getId()+"", fonteProntuario));
			campoCodigo.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoCodigo);
			
			celulaHora = new PdfPCell(new Paragraph("Hora Registro", fonte));
			celulaHora.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaHora);
			
			campoHora = new PdfPCell(new Paragraph(prontuario.getHora(), fonteProntuario));
			campoHora.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoHora);
			
			celulaDataCad = new PdfPCell(new Paragraph("Data Registro Prontuário:", fonte));
			celulaDataCad.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaDataCad);

			campoDataCad = new PdfPCell(new Paragraph(ConverteDadosUtil.TransformandoEmString(prontuario.getData()), fonteProntuario));
			campoDataCad.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoDataCad);
			
			
			documento.add(tabela01);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
				
	}
	
	private void AdicionarLinha02(){
		try {
			celulaRg = new PdfPCell(new Paragraph("RG", fonte));
			celulaRg.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaRg);
	        
			campoRg = new PdfPCell(new Paragraph(prontuario.getPaciente().getRg()+"", fonteProntuario));
			campoRg.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoRg);
			
			celulaCpf = new PdfPCell(new Paragraph("CPF", fonte));
			celulaCpf.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaCpf);
			
			campoCpf = new PdfPCell(new Paragraph(prontuario.getPaciente().getCpf()+"", fonteProntuario));
			campoCpf.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoCpf);
			
			celulaDataNas = new PdfPCell(new Paragraph("Data Nasc:", fonte));
			celulaDataNas.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaDataNas);

			campoDataNas = new PdfPCell(new Paragraph(ConverteDadosUtil.TransformandoEmString(prontuario.getPaciente().getDataNasc()), fonteProntuario));
			campoDataNas.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoDataNas);
		
			
			documento.add(tabela01);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	
	private void AdicionarLinha03(){
		try {
			celulaNivel = new PdfPCell(new Paragraph("Nível de Consciência", fonte));
			celulaNivel.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaNivel);
	        
			campoNivel = new PdfPCell(new Paragraph(prontuario.getAnotConsciencia()+"", fonteProntuario));
			campoNivel.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoNivel);
			
			celulaEstadoMen = new PdfPCell(new Paragraph("Estado Mental", fonte));
			celulaEstadoMen.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaEstadoMen);
			
			campoEstadoMen = new PdfPCell(new Paragraph(prontuario.getAnotMental()+"", fonteProntuario));
			campoEstadoMen.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoEstadoMen);
			
			celulaObservaMen = new PdfPCell(new Paragraph("Observação:", fonte));
			celulaObservaMen.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaObservaMen);

			campoOBservaMen = new PdfPCell(new Paragraph(prontuario.getAnotObservacao(), fonteProntuario));
			campoOBservaMen.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoOBservaMen);
		
		
			documento.add(tabela01);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	
	private void AdicionarLinha04(){
		try {
			celulaAvalia = new PdfPCell(new Paragraph("Avaliação do Paciente", fonte));
			celulaAvalia.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaAvalia);
	        
			campoAvalia = new PdfPCell(new Paragraph(prontuario.getCondDeambulacao()+"", fonteProntuario));
			campoAvalia.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoAvalia);
			
			celulaAvaliaObser = new PdfPCell(new Paragraph("Observação Aval.", fonte));
			celulaAvaliaObser.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaAvaliaObser);
			
			campoAvaliaObser = new PdfPCell(new Paragraph(prontuario.getCondDeamObservacao()+"", fonteProntuario));
			campoAvaliaObser.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoAvaliaObser);
		
			documento.add(tabela01);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	private void AdicionarLinha05(){
		try {
			celulaRepouso = new PdfPCell(new Paragraph("Repouso no Leito", fonte));
			celulaRepouso.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaRepouso);
	        
			campoRepouso = new PdfPCell(new Paragraph(prontuario.getCondRepouso()+"", fonteProntuario));
			campoRepouso.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoRepouso);
			
			celulaSono = new PdfPCell(new Paragraph("Sono e Repouso", fonte));
			celulaSono.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaSono);
			
			campoSono = new PdfPCell(new Paragraph(prontuario.getCondSono()+"", fonteProntuario));
			campoSono.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoSono);			
		
			documento.add(tabela01);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	
	private void AdicionarLinha06(){
		try {
			celulaCondicao = new PdfPCell(new Paragraph("Condição de chegada", fonte));
			celulaCondicao.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(celulaCondicao);
	        
			campoCondicao = new PdfPCell(new Paragraph(prontuario.getTextoAreachegada()+"", fonteProntuario));
			campoCondicao.setBorder(PdfPCell.NO_BORDER);
			tabela01.addCell(campoCondicao);
			
			
			documento.add(tabela01);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	
	

	public Prontuario getProntuario() {
		return prontuario;
	}

	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	
	
}
