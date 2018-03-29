package br.com.gsv.zprincipal.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import br.com.gsv.zprincipal.form.TelaLogin;

public class TelaLoginListener implements ActionListener{
	private TelaLogin formulario;
	
	public TelaLoginListener(TelaLogin formulario) {
		this.formulario = formulario;
		AdicionarListener();
		UpCase();
	}

	private void AdicionarListener(){
		this.formulario.getBotaoEntrar().addActionListener(this);
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	private void UpCase(){
		this.formulario.getCampoTexto().addKeyListener(new KeyAdapter() {  
			public void keyReleased(KeyEvent ke) {  
				if (ke.getKeyCode() != KeyEvent.VK_HOME) {  
					String s = formulario.getCampoTexto().getText();  
					formulario.getCampoTexto().setText(s.toUpperCase());  
				}  
			}  
		}); 	
		

	}
	
	
	
}
