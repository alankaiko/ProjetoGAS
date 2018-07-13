package br.com.gsv.evolucao.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ListSelectionModel;

import br.com.gsv.evolucao.formulario.GerenciarEvolucoes;
import br.com.gsv.tabelas.TabelaDeEvolucao;
import br.com.projeto.gsv.controller.EvolucaoController;

public class GerenciarEvolucaoListener implements ActionListener{
	private GerenciarEvolucoes formulario;
	private TabelaDeEvolucao tabela;
	
	public GerenciarEvolucaoListener(GerenciarEvolucoes formulario) {
		this.formulario = formulario;
		addActionListener();
	}
	
	
	private void addActionListener(){
		this.formulario.getBTPesquisar().addActionListener(this);
		this.formulario.getBTCancelar().addActionListener(this);
	}
	
	
	private void CriaTabela(){
		EvolucaoController control = new EvolucaoController();
		tabela = new TabelaDeEvolucao(control.ListaCompleta());
		this.formulario.getTable().setModel(tabela);
		
		this.formulario.getTable().getColumnModel().getColumn(0).setPreferredWidth(10);
		this.formulario.getTable().getColumnModel().getColumn(1).setPreferredWidth(60);
		this.formulario.getTable().getColumnModel().getColumn(2).setPreferredWidth(40);
		this.formulario.getTable().getColumnModel().getColumn(3).setPreferredWidth(30);
		this.formulario.getTable().getColumnModel().getColumn(4).setPreferredWidth(30);
		this.formulario.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.formulario.getTable().changeSelection(0, 0, false, false);

		//this.gerenciamento.getTable().setRowSelectionInterval(0, 0);
		this.formulario.getTable().setFocusable(false);
		this.formulario.getScrollPane().setViewportView(this.formulario.getTable());
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
	}

}
