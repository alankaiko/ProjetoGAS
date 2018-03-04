package br.com.gsv.convenio.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.convenio.formularios.BuscarConvenioDialog;
import br.com.gsv.convenio.formularios.CodigoConvenioDialog;
import br.com.gsv.convenio.formularios.DetalhesConvenioDialog;
import br.com.gsv.convenio.formularios.ExcluirConvenioDialog;
import br.com.gsv.convenio.formularios.GerenciaTelaConvenio;
import br.com.gsv.convenio.formularios.IncluirConvenioForm;
import br.com.projeto.gsv.controller.ConvenioController;
import br.com.projeto.gsv.util.TabelaDeConveniosUtil;

public class GerenciaConvenioListener implements ActionListener{
	private GerenciaTelaConvenio gerenciamento;
	private TabelaDeConveniosUtil tabela;
	
	
	
	public GerenciaConvenioListener(GerenciaTelaConvenio gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TabelaDeConvenio();
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

	
	
	private void TabelaDeConvenio(){
		ConvenioController control = new ConvenioController();
		tabela = new TabelaDeConveniosUtil(control.listaCompletaConvenios());
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
		IncluirConvenioForm inclui = new IncluirConvenioForm();
		inclui.setLocationRelativeTo(this.gerenciamento.getTela());
		inclui.setVisible(true);		
		TabelaDeConvenio();
	}
	
	private void ExecutaExclusao(Long id){
		ConvenioController controller = new ConvenioController();
		
		ExcluirConvenioDialog telaExc = new ExcluirConvenioDialog(controller.BuscarPelaID(id));
		telaExc.setLocationRelativeTo(this.gerenciamento.getTela());
		telaExc.setVisible(true);
		TabelaDeConvenio();	
	}
	
	private void ExecutaEdicao(Long id){
		ConvenioController controller = new ConvenioController();
		IncluirConvenioForm edita = new IncluirConvenioForm();
		
		edita.getListener().setConvenio((controller.BuscarPelaID(id)));
		edita.getListener().AlterandoObjetos();
		
		edita.setLocationRelativeTo(this.gerenciamento.getTela());
		edita.setVisible(true);
		
		TabelaDeConvenio();
	}
	
	private void ExecutaTelaDetalhes(Long id){
		ConvenioController controller = new ConvenioController();
		DetalhesConvenioDialog detalhes = new DetalhesConvenioDialog();
		
		detalhes.getListener().setConvenio(controller.BuscarPelaID(id));
		detalhes.getListener().Detalhar();
		
		detalhes.setLocationRelativeTo(this.gerenciamento.getTela());
		detalhes.setVisible(true);
	}
	
	private void ExecutaTelaCodigo(){
		CodigoConvenioDialog dialogo = new CodigoConvenioDialog();
		dialogo.setLocationRelativeTo(this.gerenciamento.getTela());
		dialogo.setVisible(true);
		pegaLinha(dialogo.getCodigo());
	}
	
	
	private void ExecutaTelaBuscar(){
		BuscarConvenioDialog busca = new BuscarConvenioDialog();
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
