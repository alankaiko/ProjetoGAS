package br.com.gsv.prontuario.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ListSelectionModel;

import br.com.gsv.prontuario.formularios.GerenciaProntuarios;
import br.com.projeto.gsv.controller.ProdutoController;
import br.com.projeto.gsv.controller.ProntuarioController;
import br.com.projeto.gsv.util.TabelaDeProdutosUtil;
import br.com.projeto.gsv.util.TabelaDeProntuarios;

public class GerenciarProntuarioListener implements ActionListener{
	private TabelaDeProntuarios tabela;
	private GerenciaProntuarios gerenciamento;
	
	public GerenciarProntuarioListener(GerenciaProntuarios gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TabelaDeProdutos();
	}
	
	
	private void AdicionaListener(){
		this.gerenciamento.getBAgendar().addActionListener(this);
		this.gerenciamento.getBCancelar().addActionListener(this);
		this.gerenciamento.getBFiltrar().addActionListener(this);
		this.gerenciamento.getBPesquisar().addActionListener(this);
	}
	
	
	private void TabelaDeProdutos(){
		ProntuarioController control = new ProntuarioController();
		tabela = new TabelaDeProntuarios(control.ListaCompletaDeProntuarios());
		this.gerenciamento.getTable().setModel(tabela);
		this.gerenciamento.getTable().getColumnModel().getColumn(0).setPreferredWidth(40);
		this.gerenciamento.getTable().getColumnModel().getColumn(1).setPreferredWidth(210);
		this.gerenciamento.getTable().getColumnModel().getColumn(2).setPreferredWidth(150);
		this.gerenciamento.getTable().getColumnModel().getColumn(3).setPreferredWidth(40);
		this.gerenciamento.getTable().getColumnModel().getColumn(4).setPreferredWidth(210);
		this.gerenciamento.getTable().getColumnModel().getColumn(5).setPreferredWidth(150);
		this.gerenciamento.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		this.gerenciamento.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.gerenciamento.getTable().changeSelection(0, 0, false, false);
		//this.gerenciamento.getTable().setRowSelectionInterval(0, 0);
		this.gerenciamento.getTable().setFocusable(false);
		
		this.gerenciamento.getScrollPane().setViewportView(this.gerenciamento.getTable());
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
