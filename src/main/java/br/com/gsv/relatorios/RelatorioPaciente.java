package br.com.gsv.relatorios;

import java.util.List;

import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;

import br.com.gsv.paciente.domain.Paciente;
import br.com.projeto.gsv.controller.PacienteController;

public class RelatorioPaciente extends AbstractRelatorios{
	private PacienteController controller;
	private List<Paciente> lista;
	private String tituloPaciente= "Relatório de Pacientes";

	public RelatorioPaciente() {
		this.lista = controller.ListaCompletaDePaciente();
		this.NomeColunas(tituloPaciente, "CÓDIGO","NOME","CONTATO","CONVÊNIO","CIDADE");
	}
	
	
	public void PopularTabela(){
		for(Paciente paciente : lista){
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
	}
	
	
	
	
}
