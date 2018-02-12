package br.com.projeto.gsv.formularios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.formularios.BuscarClienteDialog;
import br.com.projeto.gsv.formularios.CodidoClienteDialog;
import br.com.projeto.gsv.formularios.DetalheClienteDialog;
import br.com.projeto.gsv.formularios.ExcluirClienteDialog;
import br.com.projeto.gsv.formularios.GerenciarTelaCliente;
import br.com.projeto.gsv.formularios.IncluirClienteForm;
import br.com.projeto.gsv.util.TabelaDeClientesUtil;

public class GerenciarClienteListener implements ActionListener{
	private GerenciarTelaCliente gerenciamento;
	private TabelaDeClientesUtil tabela;
	
	
	
	public GerenciarClienteListener(GerenciarTelaCliente gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TabelaDeCliente();
		TeclaEsc();
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
		tabela = new TabelaDeClientesUtil(control.ListaCompletaDeClientes());
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
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Detalhes")){
			ExecutaTelaDetalhes(SelecionaLinha());
		}
		
		if(event.getSource().equals(gerenciamento.getCodigo())){
			ExecutaTelaCodigo();
		}
		
		if(event.getActionCommand().equals("Buscar")){
			ExecutaTelaBuscar();
		}
		
		if(event.getSource().equals(gerenciamento.getModificar())){
			ExecutaEdicao(SelecionaLinha());
		}
		
		if(event.getSource().equals(gerenciamento.getIncluir())){
			ExecutaInclusao();
		}
		
		if(event.getSource().equals(gerenciamento.getExcluir())){
			ExecutaExclusao(SelecionaLinha());
		}
		
		if(event.getSource().equals(gerenciamento.getFim())){
			this.gerenciamento.dispose();
		}
	}
	
	
	
	
	
	
	
	
	
	
	private Long SelecionaLinha(){
		int linha = this.gerenciamento.getTable().getSelectedRow();
		Long id = (Long) this.gerenciamento.getTable().getValueAt(linha,0);
		
		return id;
	}
	
	private void ExecutaInclusao(){
		IncluirClienteForm inclui = new IncluirClienteForm();
		inclui.setLocationRelativeTo(this.gerenciamento.getTela());
		inclui.setVisible(true);		
		TabelaDeCliente();
	}
	
	private void ExecutaExclusao(Long id){
		ClienteController controller = new ClienteController();
		
		ExcluirClienteDialog telaExc = new ExcluirClienteDialog(controller.BuscarPelaID(id));
		telaExc.setLocationRelativeTo(this.gerenciamento.getTela());
		telaExc.setVisible(true);
		TabelaDeCliente();	
	}
	
	private void ExecutaEdicao(Long id){
		ClienteController controller = new ClienteController();
		IncluirClienteForm edita = new IncluirClienteForm();
		
		edita.getListener().setCliente(controller.BuscarPelaID(id));
		edita.getListener().AlterandoObjetos();
		
		edita.setLocationRelativeTo(this.gerenciamento.getTela());
		edita.setVisible(true);
		
		TabelaDeCliente();
	}
	
	private void ExecutaTelaDetalhes(Long id){
		ClienteController controller = new ClienteController();
		DetalheClienteDialog detalhes = new DetalheClienteDialog();
		
		detalhes.getListener().setCliente(controller.BuscarPelaID(id));
		detalhes.getListener().Detalhar();
		
		detalhes.setLocationRelativeTo(this.gerenciamento.getTela());
		detalhes.setVisible(true);
	}
	
	private void ExecutaTelaCodigo(){
		CodidoClienteDialog dialogo = new CodidoClienteDialog();
		dialogo.setLocationRelativeTo(this.gerenciamento.getTela());
		dialogo.setVisible(true);
		pegaLinha(dialogo.getCodigo());
	}
	
	
	private void ExecutaTelaBuscar(){
		BuscarClienteDialog busca = new BuscarClienteDialog();
		busca.setLocationRelativeTo(this.gerenciamento.getTela());
		busca.setVisible(true);
	}
	
	private void pegaLinha(Long codigo){
		for(int i =0; i < this.gerenciamento.getTable().getRowCount(); i++){  
		      Long coluna = (Long) this.gerenciamento.getTable().getValueAt(i, 0);
		       if(coluna.equals(codigo)){  
		    	   this.gerenciamento.getTable().changeSelection( i , 3 , false , false); 
		    	   break;
		       } 								      
		}											
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
