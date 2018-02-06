package br.com.projeto.gsv.formularios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ListSelectionModel;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.formularios.FrmIncluirCliente;
import br.com.projeto.gsv.formularios.TelaGerenCliente;
import br.com.projeto.gsv.util.TabelaDeClientesUtil;

public class GerenClienteListener implements ActionListener{
	private TelaGerenCliente gerenciamento;
	private TabelaDeClientesUtil tabelas;
	
	
	public GerenClienteListener(TelaGerenCliente gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
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

	
	
	public void Tabelas(){
		ClienteController control = new ClienteController();
		tabelas = new TabelaDeClientesUtil(control.ListaCompletaDeClientes());
		this.gerenciamento.getTable().setModel(tabelas);
		this.gerenciamento.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
	}
	
	
	
	
	
	
	/*public void tabelas(){
		tabelaClientes = new TabelaDeClientes(dao.buscarId());
		table.setModel(tabelaClientes);
		table.getColumnModel().getColumn(0).setPreferredWidth(40);  
		table.getColumnModel().getColumn(1).setPreferredWidth(180);   
		table.getColumnModel().getColumn(2).setPreferredWidth(100); 
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.changeSelection( 0 , 0 , false , false);
		//table.setRowSelectionInterval(0, 0);
		table.setFocusable(false);
		
		scrollPane.setViewportView(table);
	}*/
	
	
	
	
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Detalhes")){
			
		}
		
		if(event.getActionCommand().equals("Código")){
					
		}
		
		if(event.getActionCommand().equals("Buscar")){
			
		}
		
		if(event.getActionCommand().equals("Modificar")){
			
		}
		
		if(event.getActionCommand().equals("Incluir")){
			FrmIncluirCliente painel = new FrmIncluirCliente();
			painel.setLocationRelativeTo(this.gerenciamento.getTela());
			painel.setVisible(true);			
		}
		
		if(event.getActionCommand().equals("Excluir")){
			
		}
		
		if(event.getActionCommand().equals("Fim")){
			
		}
	}
	
	
	
	
	
	
}
