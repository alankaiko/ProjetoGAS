package br.com.gsv.produtos.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import br.com.gsv.fabricantes.formularios.IncluirFabricantesForm;
import br.com.gsv.produtos.formularios.IncluirProdutosForm;

public class IncluirProdutoMouseListener implements MouseListener {
	private IncluirProdutosForm formulario;
	
	public IncluirProdutoMouseListener(IncluirProdutosForm formulario) {
		this.formulario = formulario;
	}
	
	private void AdicionaListener(){
		this.formulario.getLAdicionaFabricante().addMouseListener(this);
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent event) {
		IncluirFabricantesForm form = new IncluirFabricantesForm();
		System.out.println("teste");
		form.setVisible(true);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
