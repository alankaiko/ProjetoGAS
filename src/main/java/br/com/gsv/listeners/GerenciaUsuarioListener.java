package br.com.gsv.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.formularios.BuscarUsuarioDialog;
import br.com.gsv.formularios.CodigoUsuarioDialog;
import br.com.gsv.formularios.DetalhesUsuarioDialog;
import br.com.gsv.formularios.ExcluirUsuarioDialog;
import br.com.gsv.formularios.GerenciaTelaUsuario;
import br.com.gsv.formularios.IncluirUsuarioForm;
import br.com.gsv.tabelas.TabelaDeUsuariosUtil;
import br.com.projeto.gsv.controller.UsuarioController;

public class GerenciaUsuarioListener implements ActionListener{
	private GerenciaTelaUsuario formulario;
	private TabelaDeUsuariosUtil tabela;
	
	public GerenciaUsuarioListener(GerenciaTelaUsuario formulario) {
		this.formulario = formulario;
		AdicionaListener();
		TabelaDeUsuarios();
		TeclaEsc();
	}
	
	

	private void AdicionaListener(){
		this.formulario.getDetalhes().addActionListener(this);
		this.formulario.getCodigo().addActionListener(this);
		this.formulario.getBuscar().addActionListener(this);
		this.formulario.getModificar().addActionListener(this);
		this.formulario.getIncluir().addActionListener(this);
		this.formulario.getExcluir().addActionListener(this);
		this.formulario.getFim().addActionListener(this);	
	}

	
	
	private void TabelaDeUsuarios(){
		UsuarioController control = new UsuarioController();
		tabela = new TabelaDeUsuariosUtil(control.listaCompletaUsuario());
		this.formulario.getTable().setModel(tabela);
		this.formulario.getTable().getColumnModel().getColumn(0).setPreferredWidth(40);
		this.formulario.getTable().getColumnModel().getColumn(1).setPreferredWidth(210);
		this.formulario.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		this.formulario.getTable().changeSelection(0, 0, false, false);
		//this.gerenciamento.getTable().setRowSelectionInterval(0, 0);
		this.formulario.getTable().setFocusable(false);
		this.formulario.getScrollPane().setViewportView(this.formulario.getTable());
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Detalhes") && this.formulario.getTable().getRowCount() != 0){
			ExecutaTelaDetalhes(SelecionaLinha());
		}
		
		if(event.getSource().equals(formulario.getCodigo()) && this.formulario.getTable().getRowCount() != 0){
			ExecutaTelaCodigo();
		}
		
		if(event.getActionCommand().equals("Buscar") && this.formulario.getTable().getRowCount() != 0){
			ExecutaTelaBuscar();
		}
		
		if(event.getSource().equals(formulario.getModificar()) && this.formulario.getTable().getRowCount() != 0){
			ExecutaEdicao(SelecionaLinha());
		}
		
		if(event.getSource().equals(formulario.getIncluir())){
			ExecutaInclusao();
		}
		
		if(event.getSource().equals(formulario.getExcluir()) && this.formulario.getTable().getRowCount() != 0){
			ExecutaExclusao(SelecionaLinha());
		}
		
		if(event.getSource().equals(formulario.getFim())){
			this.formulario.dispose();
		}
	}
	
	
	
	
	
	
	
	
	
	
	private String SelecionaLinha(){
		int linha = this.formulario.getTable().getSelectedRow();
		String login =  (String) this.formulario.getTable().getValueAt(linha,0);
		
		return login;
	}
	
	private void ExecutaInclusao(){
		IncluirUsuarioForm inclui = new IncluirUsuarioForm();
			if(this.formulario.getVersao() == 'c')
				inclui.IniciaClassic();
			if(this.formulario.getVersao() == 'g')
				inclui.IniciaGrafic();
		inclui.getListener().IniciaObjetos();
		inclui.setLocationRelativeTo(this.formulario.getTela());
		inclui.setVisible(true);		
		TabelaDeUsuarios();
	}
	
	private void ExecutaExclusao(String login){
		UsuarioController controller = new UsuarioController();
		ExcluirUsuarioDialog telaExc = new ExcluirUsuarioDialog(controller.BuscarPeloLogin(login));
		if(this.formulario.getVersao() == 'c')
			telaExc.IniciaClassic();
		if(this.formulario.getVersao() == 'g')
			telaExc.IniciaGrafic();
		telaExc.setLocationRelativeTo(this.formulario.getTela());
		telaExc.setVisible(true);
		TabelaDeUsuarios();	
	}
	
	private void ExecutaEdicao(String login){
		UsuarioController controller = new UsuarioController();
		IncluirUsuarioForm edita = new IncluirUsuarioForm();
			if(this.formulario.getVersao() == 'c')
				edita.IniciaClassic();
			if(this.formulario.getVersao() == 'g')
				edita.IniciaGrafic();
		edita.getListener().setUsuario((controller.BuscarPeloLogin(login)));
		edita.getListener().AlterandoObjetos();
		
		edita.setLocationRelativeTo(this.formulario.getTela());
		edita.setVisible(true);
		
		TabelaDeUsuarios();
	}
	
	private void ExecutaTelaDetalhes(String login){
		UsuarioController controller = new UsuarioController();
		DetalhesUsuarioDialog detalhes = new DetalhesUsuarioDialog();
			if(this.formulario.getVersao() == 'c')
				detalhes.IniciaClassic();
			if(this.formulario.getVersao() == 'g')
				detalhes.IniciaGrafic();
		detalhes.getListener().setUsuario(controller.BuscarPeloLogin(login));
		detalhes.getListener().Detalhar();
		
		detalhes.setLocationRelativeTo(this.formulario.getTela());
		detalhes.setVisible(true);
	}
	
	private void ExecutaTelaCodigo(){
		CodigoUsuarioDialog dialogo = new CodigoUsuarioDialog();
			if(this.formulario.getVersao() == 'c')
				dialogo.IniciaClassic();
			if(this.formulario.getVersao() == 'g')
				dialogo.IniciaGrafic();
		dialogo.setLocationRelativeTo(this.formulario.getTela());
		dialogo.setVisible(true);
		pegaLinha(dialogo.getLogin());
	}
	
	
	private void ExecutaTelaBuscar(){
		BuscarUsuarioDialog busca = new BuscarUsuarioDialog();
			if(this.formulario.getVersao() == 'c')
				busca.IniciaClassic();
			if(this.formulario.getVersao() == 'g')
				busca.IniciaGrafic();
		busca.getListener().ResetarLista();
		busca.setLocationRelativeTo(this.formulario.getTela());
		busca.setVisible(true);
		pegaLinha(busca.getListener().getLogin());
	}
	
	private void pegaLinha(String login){
		for(int i =0; i < this.formulario.getTable().getRowCount(); i++){  
		      String coluna = (String) this.formulario.getTable().getValueAt(i, 0);
		       if(coluna.equals(login)){  
		    	   this.formulario.getTable().changeSelection( i , 3 , false , false); 
		    	   break;
		       } 								      
		}											
	}
	
	public void TeclaEsc(){
        JRootPane meurootpane = this.formulario.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
            public void actionPerformed(ActionEvent e) { 
            	formulario.dispose();  
            }  
        });  
    } 
	
	
	
	
	
}
