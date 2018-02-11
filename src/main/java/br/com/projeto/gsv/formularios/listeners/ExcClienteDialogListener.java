package br.com.projeto.gsv.formularios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.formularios.ExcClienteDialog;

public class ExcClienteDialogListener implements ActionListener{
	private ExcClienteDialog formulario;
	private ClienteController controller;
	
	
	public ExcClienteDialogListener(ExcClienteDialog formulario) {
		this.formulario = formulario;
		AdicionaListener();
		UsandoTAB();
	}
	
	
	private void AdicionaListener(){
		formulario.getOk().addActionListener(this);
		formulario.getCancelar().addActionListener(this);
	}
		
	
	
	private void UsandoTAB(){
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
	
	
	
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getOk())){
			this.controller = new ClienteController();
			controller.setCliente(this.formulario.getCliente());
			controller.RemoverCliente();
			this.formulario.dispose();
		}
		
		if(event.getSource().equals(this.formulario.getCancelar())){
			this.formulario.dispose();
		}
		
	}

}
