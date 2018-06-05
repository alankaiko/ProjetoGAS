package br.com.gsv.agenda.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.agenda.formulario.GerenciarAgenda;
import br.com.gsv.tabelas.TabelaDeAgenda;

public class GerenciarAgendaListener implements ActionListener{
	private GerenciarAgenda gerenciamento;
	private TabelaDeAgenda tabela;
	
	
	
	public GerenciarAgendaListener(GerenciarAgenda gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TabelaDeDias();
		TeclaEsc();
	}

	private void AdicionaListener(){
		//nada por enquanto
	}

	
	
	private void TabelaDeDias(){
		tabela = new TabelaDeAgenda();
		this.gerenciamento.getTable().setModel(tabela);
		
		this.gerenciamento.getTable().getColumnModel().getColumn(0).setPreferredWidth(30);
		this.gerenciamento.getTable().getColumnModel().getColumn(1).setPreferredWidth(30);
		this.gerenciamento.getTable().getColumnModel().getColumn(2).setPreferredWidth(30);
		this.gerenciamento.getTable().getColumnModel().getColumn(3).setPreferredWidth(30);
		this.gerenciamento.getTable().getColumnModel().getColumn(4).setPreferredWidth(30);
		this.gerenciamento.getTable().getColumnModel().getColumn(5).setPreferredWidth(30);
		this.gerenciamento.getTable().getColumnModel().getColumn(6).setPreferredWidth(30);
		this.gerenciamento.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);		
		this.gerenciamento.getTable().changeSelection(0, 0, false, false);
		//this.gerenciamento.getTable().setRowSelectionInterval(0, 0);
		this.gerenciamento.getTable().setFocusable(false);
		this.gerenciamento.getScrollPane().setViewportView(this.gerenciamento.getTable());
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
	}
	
	
	
	
	
	
	
	
	
	public void TeclaEsc(){
        JRootPane meurootpane = this.gerenciamento.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
            public void actionPerformed(ActionEvent e) { 
            	gerenciamento.dispose();  
            }  
        });  
    } 
	
}
