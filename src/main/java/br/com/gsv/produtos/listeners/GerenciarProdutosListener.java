package br.com.gsv.produtos.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ListSelectionModel;

import br.com.gsv.produtos.formularios.GerenciaTelaProdutos;
import br.com.projeto.gsv.controller.ProdutoController;
import br.com.projeto.gsv.util.TabelaDeProdutosUtil;

public class GerenciarProdutosListener implements ActionListener{
	private GerenciaTelaProdutos gerenciamento;
	private TabelaDeProdutosUtil tabela;
	
	
	public GerenciarProdutosListener(GerenciaTelaProdutos gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TabelaDeProdutos();
	}
	
	private void AdicionaListener(){
		gerenciamento.getDetalhes().addActionListener(this);
		gerenciamento.getCodigo().addActionListener(this);
		gerenciamento.getBuscar().addActionListener(this);
		gerenciamento.getModificar().addActionListener(this);
		gerenciamento.getIncluir().addActionListener(this);
		gerenciamento.getExcluir().addActionListener(this);
		gerenciamento.getFim().addActionListener(this);	
	}
	
	
	private void TabelaDeProdutos(){
		ProdutoController control = new ProdutoController();
		tabela = new TabelaDeProdutosUtil(control.ListaCompletaDeProdutos());
		this.gerenciamento.getTable().setModel(tabela);
		this.gerenciamento.getTable().getColumnModel().getColumn(0).setPreferredWidth(40);
		this.gerenciamento.getTable().getColumnModel().getColumn(1).setPreferredWidth(210);
		this.gerenciamento.getTable().getColumnModel().getColumn(2).setPreferredWidth(150);
		this.gerenciamento.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		this.gerenciamento.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.gerenciamento.getTable().changeSelection(0, 0, false, false);
		//this.gerenciamento.getTable().setRowSelectionInterval(0, 0);
		this.gerenciamento.getTable().setFocusable(false);
		
		this.gerenciamento.getScrollPane().setViewportView(this.gerenciamento.getTable());
		
	}
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
