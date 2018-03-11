package aaaTesteListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import br.com.gsv.funcionario.formularios.IncluirFuncionariosForm;
import aaaTeste.AffMaria;

public class AffMariaListener implements MouseListener{
	private AffMaria tela;
	
	
	
	public AffMariaListener(AffMaria tela) {
		this.tela = tela;
		AdicionaListener();
	}
	
	
	private void AdicionaListener(){	
		this.tela.getBotaoFuncionario().addMouseListener(this);
		this.tela.getBotaoPaciente().addMouseListener(this);
		this.tela.getBotaoProdutos().addMouseListener(this);
		this.tela.getBotaoRelItens().addMouseListener(this);
		this.tela.getBotaoRelPacientes().addMouseListener(this);
	}
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent event) {
		if(event.getSource().equals(this.tela.getBotaoFuncionario())){
			IncluirFuncionariosForm formulario = new IncluirFuncionariosForm();
			formulario.setVisible(true);
		}
			
	}


	@Override
	public void mousePressed(MouseEvent event) {
		
		
	}


	@Override
	public void mouseReleased(MouseEvent event) {
	
	}


	@Override
	public void mouseEntered(MouseEvent event) {
		
	}


	@Override
	public void mouseExited(MouseEvent event) {
		
	}

}
