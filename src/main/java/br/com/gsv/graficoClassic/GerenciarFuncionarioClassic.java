package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.GerenciaTelaFuncionario;
import br.com.gsv.formularios.IncluirConvenioForm;

public class GerenciarFuncionarioClassic {
	private GerenciaTelaFuncionario formulario;
	
	public GerenciarFuncionarioClassic(GerenciaTelaFuncionario formulario) {
		this.formulario = formulario;
		CriarTelaGeralClassic();
		DadosConvenio();
	}
	
	
	public void CriarTelaGeralClassic() {
		this.formulario.setTitle("Cadastro de Funcionarios");
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 700, 480);
		this.formulario.setResizable(false);
		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getPanel().setLayout(null);
		
			
	}
	

	public void DadosConvenio() {
		this.formulario.getScrollPane().setBounds(26,12,472,412);
		this.formulario.getTela().add(this.formulario.getScrollPane());	
		
		this.formulario.getDetalhes().setText("Detalhes");
		this.formulario.getDetalhes().setBounds(525,11,125,20);
		
		this.formulario.getCodigo().setText("Código");
		this.formulario.getCodigo().setBounds(525,35,125,20);
		
		this.formulario.getBuscar().setText("Buscar");
		this.formulario.getBuscar().setBounds(525,58,125,20);
		
		this.formulario.getModificar().setText("Modificar");
		this.formulario.getModificar().setBounds(525,81,125,20);
		
		this.formulario.getIncluir().setText("Incluir");
		this.formulario.getIncluir().setBounds(525,104,125,20);
		
		this.formulario.getExcluir().setText("Excluir");
		this.formulario.getExcluir().setBounds(525,127,125,20);
		
		this.formulario.getFim().setText("Fim");
		this.formulario.getFim().setBounds(525,150,125,20);
	}

}
