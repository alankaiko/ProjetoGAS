package br.com.gsv.funcUsuario.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.convenio.formularios.BuscarConvenioDialog;
import br.com.gsv.funcUsuario.domain.Usuario;
import br.com.gsv.funcUsuario.formularios.BuscarUsuarioDialog;
import br.com.projeto.gsv.controller.ConvenioController;
import br.com.projeto.gsv.controller.UsuarioController;
import br.com.projeto.gsv.util.TabelaBuscarConvenioUtil;
import br.com.projeto.gsv.util.TabelaBuscarUsuarioUtil;

public class BuscarUsuarioListener implements ActionListener{
	private BuscarUsuarioDialog formulario;
	private TabelaBuscarUsuarioUtil tabela;
	private String login;
	
	
	public BuscarUsuarioListener(BuscarUsuarioDialog formulario) {
		this.formulario = formulario;
		TabelaUsuarios();
		AdicionaListener();
		UsandoTAB();
		//UpCase();
		TeclaEsc();
	}
	
	private void AdicionaListener(){
		this.formulario.getBuscar().addActionListener(this);
		this.formulario.getOk().addActionListener(this);
		this.formulario.getCancelar().addActionListener(this);
	}
	
	
	private void TabelaUsuarios(){
		UsuarioController control = new UsuarioController();
		tabela = new TabelaBuscarUsuarioUtil(control.listaCompletaUsuario());
		this.formulario.getTable().setModel(tabela);
		this.formulario.getTable().getColumnModel().getColumn(0).setPreferredWidth(30);
		this.formulario.getTable().getColumnModel().getColumn(1).setPreferredWidth(180);
		this.formulario.getTable().getColumnModel().getColumn(2).setPreferredWidth(180);
		
		this.formulario.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.formulario.getTable().changeSelection(0, 0, false, false);
		//this.formulario.getTable().setRowSelectionInterval(0, 0);
		this.formulario.getTable().setFocusable(false);
		this.formulario.getScrollPane().setViewportView(this.formulario.getTable());
		
		
		
	}
	
	
	
	
	private void UsandoTAB(){
		this.formulario.getRootPane().setDefaultButton(this.formulario.getBuscar());
		this.formulario.getBuscar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBuscar().doClick();
                }  
            }  
        });
		
		
		
		this.formulario.getOk().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getOk().doClick();  
                }  
            }  
        });
		
		
		this.formulario.getCancelar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getCancelar().doClick();  
                }  
            }  
        });
	}
	
	
	private void UpCase(){
		this.formulario.getTextoBuscar().addKeyListener(new KeyAdapter() {  
			public void keyReleased(KeyEvent ke) {  
				if (ke.getKeyCode() != KeyEvent.VK_HOME) {  
					String s = formulario.getTextoBuscar().getText();  
					formulario.getTextoBuscar().setText(s.toUpperCase());  
				}  
			}  
		}); 	
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
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getOk())){
			int linha = this.formulario.getTable().getSelectedRow();
			login = (String) this.formulario.getTable().getValueAt(linha, 0);
			this.formulario.dispose();
		}
		
		if(event.getSource().equals(this.formulario.getBuscar()) && !this.formulario.getTextoBuscar().getText().isEmpty()){
			if(this.formulario.getBuscaLogin().isSelected())
				BuscarLogin();
			
			if(this.formulario.getBuscaNome().isSelected())
				BuscarNome();
		}		
		
		if(event.getSource().equals(this.formulario.getCancelar())){
			this.formulario.dispose();
		}
		
	}

	
	
	
	private void BuscarLogin(){
		UsuarioController control = new UsuarioController();
		List<Usuario> lista = new ArrayList<Usuario>();
		lista.add(control.BuscarPeloLogin(this.formulario.getTextoBuscar().getText()));
		
		if(lista.get(0) != null)
			TabelaBusca(lista);
		
	}
		
		
	private void BuscarNome(){
		UsuarioController control = new UsuarioController();
		List<Usuario> lista = control.ListinhaPelosNomes(this.formulario.getTextoBuscar().getText());
		
		if(lista.get(0) != null)
			TabelaBusca(lista);	
		
	}
	
	private void TabelaBusca(List<Usuario> lista){
		tabela = new TabelaBuscarUsuarioUtil(lista);
		this.formulario.getTable().setModel(tabela);
		this.formulario.getTable().getColumnModel().getColumn(0).setPreferredWidth(30);
		this.formulario.getTable().getColumnModel().getColumn(1).setPreferredWidth(180);
		this.formulario.getTable().getColumnModel().getColumn(2).setPreferredWidth(180);
		this.formulario.getTable().changeSelection(0, 1, false, false);
	}
	
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	
	
	
}
