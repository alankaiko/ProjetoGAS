package br.com.projeto.gsv.formularios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.formularios.ExcClienteDialog;

public class ExcClienteDialogListener implements ActionListener{
	private ExcClienteDialog dialogo;
	private ClienteController controller;
	
	
	public ExcClienteDialogListener(ExcClienteDialog dialogo) {
		this.dialogo = dialogo;
		AdicionaListener();
		UsandoTAB();
	}
	
	
	private void AdicionaListener(){
		dialogo.getOk().addActionListener(this);
		dialogo.getCancelar().addActionListener(this);
	}
		
	
	
	private void UsandoTAB(){
		this.dialogo.getOk().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	dialogo.getOk().doClick();
                }  
            }  
        });
		
		
		
		this.dialogo.getCancelar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	dialogo.getCancelar().doClick();  
                }  
            }  
        });
	}
	
	
	
	
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("OK")){
			this.controller = new ClienteController();
			controller.setCliente(this.dialogo.getCliente());
			controller.RemoverCliente();
			this.dialogo.dispose();
		}
		
		if(event.getActionCommand().equals("Cancelar")){
			
		}
		
	}

}
