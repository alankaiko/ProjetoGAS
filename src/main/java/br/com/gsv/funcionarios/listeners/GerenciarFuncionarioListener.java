package br.com.gsv.funcionarios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.funcionario.formularios.BuscarFuncionarioDialog;
import br.com.gsv.funcionario.formularios.CodigoFuncionarioDialog;
import br.com.gsv.funcionario.formularios.DetalhesFuncionarioDialog;
import br.com.gsv.funcionario.formularios.ExcluirFuncionarioDialog;
import br.com.gsv.funcionario.formularios.GerenciarTelaFuncionario;
import br.com.gsv.funcionario.formularios.IncluirFuncionariosForm;
import br.com.projeto.gsv.controller.FuncionarioController;
import br.com.projeto.gsv.util.TabelaDeFuncionariosUtil;

public class GerenciarFuncionarioListener implements ActionListener{
	private GerenciarTelaFuncionario gerenciamento;
	private TabelaDeFuncionariosUtil tabela;
	
	
	
	public GerenciarFuncionarioListener(GerenciarTelaFuncionario gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TabelaDeFuncionarios();
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

	
	
	private void TabelaDeFuncionarios(){
		FuncionarioController control = new FuncionarioController();
		tabela = new TabelaDeFuncionariosUtil(control.ListaCompletaDeFuncionarios());
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
		IncluirFuncionariosForm inclui = new IncluirFuncionariosForm();
		inclui.setLocationRelativeTo(this.gerenciamento.getTela());
		inclui.setVisible(true);		
		TabelaDeFuncionarios();
	}
	
	private void ExecutaExclusao(Long id){
		FuncionarioController controller = new FuncionarioController();
		
		ExcluirFuncionarioDialog telaExc = new ExcluirFuncionarioDialog(controller.BuscarPelaID(id));
		telaExc.setLocationRelativeTo(this.gerenciamento.getTela());
		telaExc.setVisible(true);
		TabelaDeFuncionarios();	
	}
	
	private void ExecutaEdicao(Long id){
		FuncionarioController controller = new FuncionarioController();
		IncluirFuncionariosForm edita = new IncluirFuncionariosForm();
		
		edita.getListener().setFuncionario(controller.BuscarPelaID(id));
		edita.getListener().AlterandoObjetos();
		
		edita.setLocationRelativeTo(this.gerenciamento.getTela());
		edita.setVisible(true);
		
		TabelaDeFuncionarios();
	}
	
	private void ExecutaTelaDetalhes(Long id){
		FuncionarioController controller = new FuncionarioController();
		DetalhesFuncionarioDialog detalhes = new DetalhesFuncionarioDialog();
		
		detalhes.getListener().setFuncionario(controller.BuscarPelaID(id));
		detalhes.getListener().Detalhar();
		
		detalhes.setLocationRelativeTo(this.gerenciamento.getTela());
		detalhes.setVisible(true);
	}
	
	private void ExecutaTelaCodigo(){
		CodigoFuncionarioDialog dialogo = new CodigoFuncionarioDialog();
		dialogo.setLocationRelativeTo(this.gerenciamento.getTela());
		dialogo.setVisible(true);
		pegaLinha(dialogo.getCodigo());
	}
	
	
	private void ExecutaTelaBuscar(){
		BuscarFuncionarioDialog busca = new BuscarFuncionarioDialog();
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
