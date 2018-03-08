package br.com.gsv.fabricantes.listeners;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import br.com.gsv.fabricantes.formularios.BuscarFabricanteDialog;
import br.com.projeto.gsv.util.SomenteNumerosUtil;

public class RadioListenerFabricante implements ItemListener{
	private BuscarFabricanteDialog formulario;
	private SomenteNumerosUtil soNumeros;
	
	
	public RadioListenerFabricante(BuscarFabricanteDialog formulario) {
		this.formulario = formulario;
		AdicionaListener();
		soNumeros = new SomenteNumerosUtil();		
	}
	
	private void AdicionaListener(){
		this.formulario.getBuscaId().addItemListener(this);
		this.formulario.getBuscaDescricao().addItemListener(this);
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent event) {
		if(this.formulario.getBuscaId().isSelected()){
			this.formulario.getTextoBuscar().setText("");
			SomenteNumeros();
		}
		if(this.formulario.getBuscaDescricao().isSelected()){
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
