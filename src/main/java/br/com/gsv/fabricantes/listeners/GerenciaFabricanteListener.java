package br.com.gsv.fabricantes.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.fabricantes.formularios.BuscarFabricanteDialog;
import br.com.gsv.fabricantes.formularios.CodigoFabricanteDialog;
import br.com.gsv.fabricantes.formularios.DetalhesFabricanteDialog;
import br.com.gsv.fabricantes.formularios.ExcluirFabricanteDialog;
import br.com.gsv.fabricantes.formularios.GerenciaTelaFabricante;
import br.com.gsv.fabricantes.formularios.IncluirFabricantesForm;
import br.com.projeto.gsv.controller.FabricanteController;
import br.com.projeto.gsv.util.TabelaDeFabricanteUtil;

public class GerenciaFabricanteListener implements ActionListener{
	private GerenciaTelaFabricante gerenciamento;
	private TabelaDeFabricanteUtil tabela;
	
	
	
	public GerenciaFabricanteListener(GerenciaTelaFabricante gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TabelaDeFabricantes();
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

	
	
	private void TabelaDeFabricantes(){
		FabricanteController control = new FabricanteController();
		tabela = new TabelaDeFabricanteUtil(control.ListaCompletaDeFabricante());
		this.gerenciamento.getTable().setModel(tabela);
		this.gerenciamento.getTable().getColumnModel().getColumn(0).setPreferredWidth(40);
		this.gerenciamento.getTable().getColumnModel().getColumn(1).setPreferredWidth(210);
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
		IncluirFabricantesForm inclui = new IncluirFabricantesForm();
		inclui.setLocationRelativeTo(this.gerenciamento.getTela());
		inclui.setVisible(true);		
		TabelaDeFabricantes();
	}
	
	private void ExecutaExclusao(Long id){
		FabricanteController controller = new FabricanteController();
		
		ExcluirFabricanteDialog telaExc = new ExcluirFabricanteDialog(controller.BuscarPelaID(id));
		telaExc.setLocationRelativeTo(this.gerenciamento.getTela());
		telaExc.setVisible(true);
		TabelaDeFabricantes();	
	}
	
	private void ExecutaEdicao(Long id){
		FabricanteController controller = new FabricanteController();
		IncluirFabricantesForm edita = new IncluirFabricantesForm();
		
		edita.getListener().setFabricante((controller.BuscarPelaID(id)));
		edita.getListener().AlterandoObjetos();
		
		edita.setLocationRelativeTo(this.gerenciamento.getTela());
		edita.setVisible(true);
		
		TabelaDeFabricantes();
	}
	
	private void ExecutaTelaDetalhes(Long id){
		FabricanteController controller = new FabricanteController();
		DetalhesFabricanteDialog detalhes = new DetalhesFabricanteDialog();
		
		detalhes.getListener().setFabricante(controller.BuscarPelaID(id));
		detalhes.getListener().Detalhar();
		
		detalhes.setLocationRelativeTo(this.gerenciamento.getTela());
		detalhes.setVisible(true);
	}
	
	private void ExecutaTelaCodigo(){
		CodigoFabricanteDialog dialogo = new CodigoFabricanteDialog();
		dialogo.setLocationRelativeTo(this.gerenciamento.getTela());
		dialogo.setVisible(true);
		pegaLinha(dialogo.getCodigo());
	}
	
	
	private void ExecutaTelaBuscar(){
		BuscarFabricanteDialog busca = new BuscarFabricanteDialog();
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
