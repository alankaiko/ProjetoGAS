package br.com.gsv.relatorios;

import java.io.IOException;
import java.util.List;

import br.com.gsv.domain.Prontuario;
import br.com.gsv.util.ConverteDadosUtil;
import br.com.projeto.gsv.controller.ProntuarioController;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;

public class RelatorioProntuarioData extends AbstractRelatorios{
	private ProntuarioController controller;
	private List<Prontuario> lista;
	private String tituloProntuario= "Relatório de Prontuários por Paciente";
	private PdfPCell celulaCodigoCli, celulaNomeCli, celulaNivCons, celulaEstaMen, celulaAvali, celulaFuncionario, celulaDataCadastro;
	private float [ ] colunaLargura = { 1.25f , 4.3f , 2.5f, 2.5f, 2,3.5f,3 };
	
	public RelatorioProntuarioData(){
		controller = new ProntuarioController();
		this.lista = controller.BuscandoPelaData(ConverteDadosUtil.TransformandoEmDate("13/04/2018"));		
	}
	
	
	
	@Override
	public void Iniciar() throws IOException, DocumentException {
		this.NomeArquivo("relprontuario");
		this.NomeColunas(tituloProntuario);
		this.CriarTabela(colunaLargura);
		this.CriaTitulos();
		PopularTabela();
		this.CriaDocumento();	
	}

	@Override
	protected void CriaTitulos() {
		celulaCodigoCli = new PdfPCell(new Paragraph("CÓDIGO", fonteCabecalho));
		celulaCodigoCli.setBorder(PdfPCell.NO_BORDER);
		
		celulaNomeCli = new PdfPCell(new Paragraph("NOME", fonteCabecalho));
		celulaNomeCli.setBorder(PdfPCell.NO_BORDER);
		
		celulaNivCons = new PdfPCell(new Paragraph("NÍVEL CONSC.", fonteCabecalho));
		celulaNivCons.setBorder(PdfPCell.NO_BORDER);
		
		celulaEstaMen = new PdfPCell(new Paragraph("ESTADO MENTAL", fonteCabecalho));
		celulaEstaMen.setBorder(PdfPCell.NO_BORDER);
		
		celulaAvali = new PdfPCell(new Paragraph("AVALIAÇÃO", fonteCabecalho));
		celulaAvali.setBorder(PdfPCell.NO_BORDER);
		
		celulaFuncionario = new PdfPCell(new Paragraph("ATENDIDO POR", fonteCabecalho));
		celulaFuncionario.setBorder(PdfPCell.NO_BORDER);
		
		celulaDataCadastro = new PdfPCell(new Paragraph("DATA DO REGISTRO", fonteCabecalho));
		celulaDataCadastro.setBorder(PdfPCell.NO_BORDER);
		
		PdfPCell espaco = new PdfPCell();
		espaco.setColspan(7);
		
		tabela.addCell(celulaCodigoCli);
		tabela.addCell(celulaNomeCli);
		tabela.addCell(celulaNivCons);
		tabela.addCell(celulaEstaMen);
		tabela.addCell(celulaAvali);
		tabela.addCell(celulaFuncionario);
		tabela.addCell(celulaDataCadastro);
		tabela.addCell(espaco);		
	}

	@Override
	protected void PopularTabela() {
		for(Prontuario prontuario : lista){
			celulaCodigoCli = new PdfPCell(new Paragraph(prontuario.getPaciente().getId()+"", fonteProntuario));
			celulaNomeCli = new PdfPCell(new Paragraph(prontuario.getPaciente().getNome()+"", fonteProntuario));
			celulaNivCons = new PdfPCell(new Paragraph(prontuario.getAnotConsciencia()+"", fonteProntuario));
			celulaEstaMen = new PdfPCell(new Paragraph(prontuario.getAnotMental()+"", fonteProntuario));
			celulaAvali = new PdfPCell(new Paragraph(prontuario.getAvaliCefaloMental()+"", fonteProntuario));
			celulaFuncionario = new PdfPCell(new Paragraph(prontuario.getFuncionario().getNome()+"", fonteProntuario));
			celulaDataCadastro = new PdfPCell(new Paragraph(ConverteDadosUtil.TransformandoEmString(prontuario.getData())+"", fonteProntuario));
			
			
			celulaCodigoCli.setHorizontalAlignment(Element.ALIGN_CENTER);
			celulaCodigoCli.setBorder(PdfPCell.NO_BORDER);
			celulaNomeCli.setBorder(PdfPCell.NO_BORDER);
			celulaNivCons.setBorder(PdfPCell.NO_BORDER);
			celulaEstaMen.setBorder(PdfPCell.NO_BORDER);
			celulaAvali.setBorder(PdfPCell.NO_BORDER);
			celulaFuncionario.setBorder(PdfPCell.NO_BORDER);
			celulaDataCadastro.setBorder(PdfPCell.NO_BORDER);
			
			this.tabela.addCell(celulaCodigoCli);
			this.tabela.addCell(celulaNomeCli);
			this.tabela.addCell(celulaNivCons);
			this.tabela.addCell(celulaEstaMen);
			this.tabela.addCell(celulaAvali);
			this.tabela.addCell(celulaFuncionario);
			this.tabela.addCell(celulaDataCadastro);
		}
	}
	
}
