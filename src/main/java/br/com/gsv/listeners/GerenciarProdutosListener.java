package br.com.gsv.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.formularios.BuscarProdutoDialog;
import br.com.gsv.formularios.CodigoProdutoDialog;
import br.com.gsv.formularios.DetalhesProdutoDialog;
import br.com.gsv.formularios.ExcluirProdutoDialog;
import br.com.gsv.formularios.GerenciaTelaProdutos;
import br.com.gsv.formularios.IncluirProdutosForm;
import br.com.gsv.tabelas.TabelaDeProdutosUtil;
import br.com.projeto.gsv.controller.ProdutoController;

public class GerenciarProdutosListener implements ActionListener{
	private GerenciaTelaProdutos gerenciamento;
	private TabelaDeProdutosUtil tabela;
	
	
	public GerenciarProdutosListener(GerenciaTelaProdutos gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TabelaDeProdutos();
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
	
	
	
	private void TabelaDeProdutos(){
		ProdutoController control = new ProdutoController();
		tabela = new TabelaDeProdutosUtil(control.ListaCompletaDeProdutos());
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
		if(event.getSource().equals(gerenciamento.getDetalhes()) && this.gerenciamento.getTable().getRowCount() != 0){
			ExecutaTelaDetalhes(SelecionaItem());
		}
		
		if(event.getSource().equals(gerenciamento.getCodigo()) && this.gerenciamento.getTable().getRowCount() != 0){
			ExecutaTelaCodigo();
		}
		
		if(event.getSource().equals(gerenciamento.getBuscar()) && this.gerenciamento.getTable().getRowCount() != 0){
			ExecutaTelaBuscar();
		}
		
		if(event.getSource().equals(gerenciamento.getModificar()) && this.gerenciamento.getTable().getRowCount() != 0){
			ExecutaEdicao(SelecionaLinha());
		}
		
		if(event.getSource().equals(gerenciamento.getIncluir())){
			ExecutaInclusao();
		}
		
		if(event.getSource().equals(gerenciamento.getExcluir()) && this.gerenciamento.getTable().getRowCount() != 0){
			ExecutaExclusao(SelecionaLinha());
		}
		
		if(event.getSource().equals(gerenciamento.getFim())){
			this.gerenciamento.dispose();
		}
		
	}

	
	
	private String SelecionaItem(){
		int linha = this.gerenciamento.getTable().getSelectedRow();
		String codigo = (String) this.gerenciamento.getTable().getValueAt(linha, 0);
		
		return codigo;
	}
	
	
	
	
	
	private void ExecutaTelaDetalhes(String codigo){
		ProdutoController controller = new ProdutoController();
		DetalhesProdutoDialog detalhes = new DetalhesProdutoDialog();
		detalhes.getListener().setProduto(controller.BuscarPorCodigo(codigo));
		detalhes.getListener().Detalhar();
		
		detalhes.setLocationRelativeTo(this.gerenciamento.getTela());
		detalhes.setVisible(true);
		
	
	}
	
	
	private void ExecutaTelaCodigo(){
		CodigoProdutoDialog dialogo = new CodigoProdutoDialog();
		dialogo.setLocationRelativeTo(this.gerenciamento.getTela());
		dialogo.setVisible(true);
		pegaLinha(dialogo.getCodigo());
	}
	
	
	private void ExecutaTelaBuscar(){
		BuscarProdutoDialog busca = new BuscarProdutoDialog();
		busca.setLocationRelativeTo(this.gerenciamento.getTela());
		busca.setVisible(true);
		pegaLinha(busca.getListener().getCodigo());
	}
	

	private void ExecutaEdicao(String codigo){
		ProdutoController controller = new ProdutoController();
		IncluirProdutosForm edita = new IncluirProdutosForm();
			edita.getListener().setProduto(controller.BuscarPorCodigo(codigo));
		edita.getListener().AlterandoProdutos();
		
		edita.setLocationRelativeTo(this.gerenciamento.getTela());
		edita.setVisible(true);
		
		TabelaDeProdutos();
	}
	
	
	private void ExecutaInclusao(){
		IncluirProdutosForm inclui = new IncluirProdutosForm();
		inclui.getListener().InicializaObjetos();
		inclui.setLocationRelativeTo(this.gerenciamento.getTela());
		inclui.setVisible(true);		
		TabelaDeProdutos();
	}
	
	private void ExecutaExclusao(String codigo){
		ProdutoController controller = new ProdutoController();
		ExcluirProdutoDialog telaExc = new ExcluirProdutoDialog(controller.BuscarPorCodigo(codigo));
		telaExc.setLocationRelativeTo(this.gerenciamento.getTela());
		telaExc.setVisible(true);
		TabelaDeProdutos();	
	}
	
	
	private String SelecionaLinha(){
		int linha = this.gerenciamento.getTable().getSelectedRow();
		String codigo = (String) this.gerenciamento.getTable().getValueAt(linha,0);
		
		return codigo;
	}
	
	
	private void pegaLinha(String codigo){
		for(int i =0; i < this.gerenciamento.getTable().getRowCount(); i++){  
		      String coluna = (String) this.gerenciamento.getTable().getValueAt(i, 0);
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
