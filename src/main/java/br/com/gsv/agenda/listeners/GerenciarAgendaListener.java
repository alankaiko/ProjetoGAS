package br.com.gsv.agenda.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.agenda.formulario.GerenciarAgenda;
import br.com.gsv.tabelas.TabelaDeAgenda;
import br.com.projeto.gsv.controller.AgendaController;

public class GerenciarAgendaListener implements ActionListener, PropertyChangeListener{
	private GerenciarAgenda gerenciamento;
	private TabelaDeAgenda tabela;
	
	
	
	public GerenciarAgendaListener(GerenciarAgenda gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TabelaDeDias();
		TeclaEsc();
	}

	private void AdicionaListener(){
		this.gerenciamento.getBBuscar().addActionListener(this);
		this.gerenciamento.getBVoltar().addActionListener(this);
		this.gerenciamento.getCalendar().addPropertyChangeListener(this);
	}

	
	
	private void TabelaDeDias(){
		AgendaController controller = new AgendaController();
		tabela = new TabelaDeAgenda(controller.ListaDeAgendados());
		
		//tabela = new TabelaDeAgenda();
		//this.gerenciamento.getTable().setModel(tabela);
		
		this.gerenciamento.getTable().getColumnModel().getColumn(0).setPreferredWidth(5);
		this.gerenciamento.getTable().getColumnModel().getColumn(1).setPreferredWidth(200);
		this.gerenciamento.getTable().getColumnModel().getColumn(2).setPreferredWidth(60);
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

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println(this.gerenciamento.getCalendar().getDate());
		
	} 
	
}
