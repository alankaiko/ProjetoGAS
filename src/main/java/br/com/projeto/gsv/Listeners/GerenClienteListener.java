package br.com.projeto.gsv.Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.projeto.gsv.formularios.TelaGerenCliente;

public class GerenClienteListener implements ActionListener{
	private TelaGerenCliente gerenciamento;
	
	
	public GerenClienteListener(TelaGerenCliente gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
	}

	private void AdicionaListener(){
		gerenciamento.getDetalhes().addActionListener(this);
		gerenciamento.getCodigo().addActionListener(this);
		gerenciamento.getBuscar().addActionListener(this);
		gerenciamento.getModificar().addActionListener(this);
		gerenciamento.getIncluir().addActionListener(this);
		gerenciamento.getExcluir().addActionListener(this);
		gerenciamento.getFim().addActionListener(this);	
	}

	
	
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Detalhes")){
			
		}
		
		if(event.getActionCommand().equals("Código")){
					
		}
		
		if(event.getActionCommand().equals("Buscar")){
			
		}
		
		if(event.getActionCommand().equals("Modificar")){
			
		}
		
		if(event.getActionCommand().equals("Incluir")){
			
		}
		
		if(event.getActionCommand().equals("Excluir")){
			
		}
		
		if(event.getActionCommand().equals("Fim")){
			
		}
	}
	
	
	
	
	
}
