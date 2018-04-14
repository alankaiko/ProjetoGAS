package br.com.gsv.listeners;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import br.com.gsv.formularios.BuscarPacienteDialog;
import br.com.gsv.util.SomenteNumerosUtil;

public class RadioListenerPaciente implements ItemListener{
	private BuscarPacienteDialog formulario;
	private SomenteNumerosUtil soNumeros;
	
	
	public RadioListenerPaciente(BuscarPacienteDialog formulario) {
		this.formulario = formulario;
		AdicionaListener();
		soNumeros = new SomenteNumerosUtil();		
	}
	
	private void AdicionaListener(){
		this.formulario.getBuscaCodigo().addItemListener(this);
		this.formulario.getBuscaNome().addItemListener(this);
		this.formulario.getBuscaCpf().addItemListener(this);
		this.formulario.getBuscaRg().addItemListener(this);
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent event) {
		if(this.formulario.getBuscaCodigo().isSelected()){
			this.formulario.getTextoBuscar().setText("");
			SomenteNumeros();
		}
		if(this.formulario.getBuscaNome().isSelected()){
			this.formulario.getTextoBuscar().setText("");
			TextoEmGeral();
		}
		if(this.formulario.getBuscaCpf().isSelected()){
			this.formulario.getTextoBuscar().setText("");
			SomenteNumeros();
		}
		if(this.formulario.getBuscaRg().isSelected()){
			this.formulario.getTextoBuscar().setText("");
			SomenteNumeros();
		}
		
	}
	
	
	private void SomenteNumeros(){
		formulario.getTextoBuscar().addKeyListener(soNumeros);
	}
	
	private void TextoEmGeral(){
		formulario.getTextoBuscar().removeKeyListener(soNumeros);
	}

}
