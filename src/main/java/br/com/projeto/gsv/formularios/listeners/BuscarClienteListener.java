package br.com.projeto.gsv.formularios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ListSelectionModel;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.formularios.BuscarClienteDialog;
import br.com.projeto.gsv.util.TabelaBuscarClientesUtil;

public class BuscarClienteListener implements ActionListener{
	private BuscarClienteDialog formulario;
	private TabelaBuscarClientesUtil tabela;
	
	
	public BuscarClienteListener(BuscarClienteDialog formulario) {
		this.formulario = formulario;
		TabelaCliente();
		AdicionaListener();
	}
	
	private void AdicionaListener(){
		this.formulario.getBuscar().addActionListener(this);
		this.formulario.getOk().addActionListener(this);
		this.formulario.getCancelar().addActionListener(this);
	}
	
	
	private void TabelaCliente(){
		ClienteController control = new ClienteController();
		tabela = new TabelaBuscarClientesUtil(control.ListaCompletaDeClientes());
		this.formulario.getTable().setModel(tabela);
		this.formulario.getTable().getColumnModel().getColumn(0).setPreferredWidth(30);
		this.formulario.getTable().getColumnModel().getColumn(1).setPreferredWidth(180);
		this.formulario.getTable().getColumnModel().getColumn(2).setPreferredWidth(100);
		this.formulario.getTable().getColumnModel().getColumn(3).setPreferredWidth(30);
		
		this.formulario.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.formulario.getTable().changeSelection(0, 0, false, false);
		//this.formulario.getTable().setRowSelectionInterval(0, 0);
		this.formulario.getTable().setFocusable(false);
		this.formulario.getScrollPane().setViewportView(this.formulario.getTable());
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
