package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.GerenciaTelaConvenio;

public class GerenciaConvenioClassic {
	private GerenciaTelaConvenio formulario;
	
	public GerenciaConvenioClassic(GerenciaTelaConvenio formulario) {
		this.formulario = formulario;
		CriarTelaGeralClassic();
		DadosConvenio();
	}
	
	
	public void CriarTelaGeralClassic() {
		this.formulario.setTitle("Convenio / Plano / Credencial");
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 542, 372);
		this.formulario.setResizable(false);
		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getPanel().setLayout(null);
		
		this.formulario.getScrollPane().setBounds(26,12,346,305);
		this.formulario.getTela().add(this.formulario.getScrollPane());	
	}
	

	public void DadosConvenio() {
		this.formulario.getDetalhes().setText("Detalhes");
		this.formulario.getDetalhes().setBounds(395,11,125,20);
		
		this.formulario.getCodigo().setText("Código");
		this.formulario.getCodigo().setBounds(395,34,125,20);
		
		this.formulario.getBuscar().setText("Buscar");
		this.formulario.getBuscar().setBounds(395,57,125,20);
		
		this.formulario.getModificar().setText("Modificar");
		this.formulario.getModificar().setBounds(395,80,125,20);
		
		this.formulario.getIncluir().setText("Incluir");
		this.formulario.getIncluir().setBounds(395,103,125,20);
		
		this.formulario.getExcluir().setText("Excluir");
		this.formulario.getExcluir().setBounds(395,126,125,20);
		
		this.formulario.getFim().setText("Fim");
		this.formulario.getFim().setBounds(395,149,125,20);
		
	}
}
