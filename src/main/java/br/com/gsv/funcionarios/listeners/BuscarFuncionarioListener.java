package br.com.gsv.funcionarios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.funcionario.formularios.BuscarFuncionarioDialog;
import br.com.projeto.gsv.controller.FuncionarioController;
import br.com.projeto.gsv.util.TabelaBuscarPacientesUtil;
import br.com.projeto.gsv.util.TabelaBuscarFuncionariosUtil;

public class BuscarFuncionarioListener implements ActionListener{
	private BuscarFuncionarioDialog formulario;
	private TabelaBuscarFuncionariosUtil tabela;
	private Long codigo;
	
	
	public BuscarFuncionarioListener(BuscarFuncionarioDialog formulario) {
		this.formulario = formulario;
		TabelaFuncionario();
		AdicionaListener();
		UsandoTAB();
		UpCase();
		TeclaEsc();
	}
	
	private void AdicionaListener(){
		this.formulario.getBuscar().addActionListener(this);
		this.formulario.getOk().addActionListener(this);
		this.formulario.getCancelar().addActionListener(this);
	}
	
	
	private void TabelaFuncionario(){
		FuncionarioController control = new FuncionarioController();
		tabela = new TabelaBuscarFuncionariosUtil(control.ListaCompletaDeFuncionarios());
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
			codigo = (Long) this.formulario.getTable().getValueAt(linha, 0);
			this.formulario.dispose();
		}
		
		if(event.getSource().equals(this.formulario.getBuscar()) && !this.formulario.getTextoBuscar().getText().isEmpty()){
			if(this.formulario.getBuscaCodigo().isSelected())
				BuscarCodigo();
			
			if(this.formulario.getBuscaRg().isSelected())
				BuscarRg();
			
			if(this.formulario.getBuscaCpf().isSelected())
				BuscarCpf();
			
			if(this.formulario.getBuscaNome().isSelected())
				BuscarNome();
		}		
		
		if(event.getSource().equals(this.formulario.getCancelar())){
			this.formulario.dispose();
		}
		
	}

	
	
	
	private void BuscarCodigo(){
		TabelaFuncionario();
		Long codigo = Long.parseLong(this.formulario.getTextoBuscar().getText());
		
		for(int i = 0; i < this.formulario.getTable().getRowCount(); i++){
			Long coluna = (Long) this.formulario.getTable().getValueAt(i, 0);
			if(coluna.equals(codigo)){
				this.formulario.getTable().changeSelection(i, 4, false, false);
			}
		}
	}
		
		
	private void BuscarRg(){
		TabelaFuncionario();
		String rg =  this.formulario.getTextoBuscar().getText();
		
		for(int i=0; i < this.formulario.getTable().getRowCount(); i++){
			String coluna = (String) this.formulario.getTable().getValueAt(i, 3);
			if(coluna.equals(rg)){
				this.formulario.getTable().changeSelection(i, 4, false, false);
			}
		}	
	}
	
	
	private void BuscarCpf(){
		TabelaFuncionario();
		String cpf = this.formulario.getTextoBuscar().getText();
		
		for(int i =0; i < this.formulario.getTable().getRowCount(); i++){  
		     String coluna = (String)this.formulario.getTable().getValueAt(i, 2); 
		       if(coluna.equals(cpf)){  
		    	   this.formulario.getTable().changeSelection( i , 4 , false , false); 
		    	   break;
		       } 								      
		}	
	}
	
	private void BuscarNome(){
		FuncionarioController control = new FuncionarioController();
		tabela = new TabelaBuscarFuncionariosUtil(control.BuscarPeloNome(this.formulario.getTextoBuscar().getText()));
		this.formulario.getTable().setModel(tabela);
		this.formulario.getTable().getColumnModel().getColumn(0).setPreferredWidth(30);
		this.formulario.getTable().getColumnModel().getColumn(1).setPreferredWidth(180);
		this.formulario.getTable().getColumnModel().getColumn(2).setPreferredWidth(100);
		this.formulario.getTable().getColumnModel().getColumn(3).setPreferredWidth(30);
		this.formulario.getTable().changeSelection(0, 4, false, false);
		
		
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Long getCodigo() {
		return codigo;
	}
	
}
