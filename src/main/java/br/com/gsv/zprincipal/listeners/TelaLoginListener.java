package br.com.gsv.zprincipal.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.gsv.zprincipal.form.TelaLogin;

public class TelaLoginListener implements ActionListener{
	private TelaLogin formulario;
	
	public TelaLoginListener(TelaLogin formulario) {
		this.formulario = formulario;
		AdicionarListener();
	}

	private void AdicionarListener(){
		this.formulario.getBotaoEntrar().addActionListener(this);
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
