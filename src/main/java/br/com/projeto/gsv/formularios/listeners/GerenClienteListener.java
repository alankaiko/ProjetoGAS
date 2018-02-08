package br.com.projeto.gsv.formularios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ListSelectionModel;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.formularios.ExcClienteDialog;
import br.com.projeto.gsv.formularios.FrmIncluirCliente;
import br.com.projeto.gsv.formularios.TelaGerenCliente;
import br.com.projeto.gsv.util.TabelaDeClientesUtil;

public class GerenClienteListener implements ActionListener{
	private TelaGerenCliente gerenciamento;
	private TabelaDeClientesUtil tabelas;
	
	
	
	public GerenClienteListener(TelaGerenCliente gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TabelaDeCliente();
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

	
	
	private void TabelaDeCliente(){
		ClienteController control = new ClienteController();
		tabelas = new TabelaDeClientesUtil(control.ListaCompletaDeClientes());
		this.gerenciamento.getTable().setModel(tabelas);
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
			ExecutaInclusao();
		}
		
		if(event.getActionCommand().equals("Excluir")){
			ExecutaExclusao(SelecionaLinha());
		}
		
		if(event.getActionCommand().equals("Fim")){
			
		}
	}
	
	private Long SelecionaLinha(){
		int linha = this.gerenciamento.getTable().getSelectedRow();
		Long id = (Long) this.gerenciamento.getTable().getValueAt(linha,0);
		
		return id;
	}
	
	private void ExecutaInclusao(){
		FrmIncluirCliente painel = new FrmIncluirCliente();
		painel.setLocationRelativeTo(this.gerenciamento.getTela());
		painel.setVisible(true);		
		TabelaDeCliente();
	}
	
	private void ExecutaExclusao(Long id){
		ClienteController controller = new ClienteController();
		
		ExcClienteDialog telaExc = new ExcClienteDialog(controller.BuscarPelaID(id));
		telaExc.setLocationRelativeTo(this.gerenciamento.getTela());
		telaExc.setVisible(true);
		TabelaDeCliente();	
	}
	
	
}