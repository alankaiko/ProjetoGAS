package br.com.gsv.listeners;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import br.com.gsv.formularios.BuscarConvenioDialog;
import br.com.gsv.util.SomenteNumerosUtil;

public class RadioListenerConvenio implements ItemListener{
	private BuscarConvenioDialog formulario;
	private SomenteNumerosUtil soNumeros;
	
	
	public RadioListenerConvenio(BuscarConvenioDialog formulario) {
		this.formulario = formulario;
		AdicionaListener();
		soNumeros = new SomenteNumerosUtil();		
	}
	
	private void AdicionaListener(){
		this.formulario.getBuscaId().addItemListener(this);
		this.formulario.getBuscaNome().addItemListener(this);
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent event) {
		if(this.formulario.getBuscaId().isSelected()){
			this.formulario.getTextoBuscar().setText("");
			SomenteNumeros();
		}
		if(this.formulario.getBuscaNome().isSelected()){
			this.formulario.getTextoBuscar().setText("");
			TextoEmGeral();
		}
		
	}
	
	
	private void SomenteNumeros(){
		formulario.getTextoBuscar().addKeyListener(soNumeros);
	}
	
	private void TextoEmGeral(){
		formulario.getTextoBuscar().removeKeyListener(soNumeros);
	}

}
