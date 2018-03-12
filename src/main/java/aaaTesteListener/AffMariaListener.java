package aaaTesteListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import br.com.gsv.funcionario.formularios.IncluirFuncionariosForm;
import br.com.gsv.paciente.formularios.IncluirPacienteForm;
import br.com.gsv.produtos.formularios.IncluirProdutosForm;
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
			formulario.setLocationRelativeTo(this.tela.getTela());
			formulario.setVisible(true);
		}
		
		if(event.getSource().equals(this.tela.getBotaoPaciente())){
			IncluirPacienteForm formulario = new IncluirPacienteForm();
			formulario.setLocationRelativeTo(this.tela.getTela());
			formulario.setVisible(true);
		}
		
		if(event.getSource().equals(this.tela.getBotaoProdutos())){
			IncluirProdutosForm formulario = new IncluirProdutosForm();
			formulario.setLocationRelativeTo(this.tela.getTela());
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
		if(event.getSource().equals(this.tela.getBotaoPaciente())){
			AtivaEfeitoBotoes(this.tela.getBotaoPaciente());
		}
		
		if(event.getSource().equals(this.tela.getBotaoFuncionario())){
			AtivaEfeitoBotoes(this.tela.getBotaoFuncionario());
		}
		
		if(event.getSource().equals(this.tela.getBotaoProdutos())){
			AtivaEfeitoBotoes(this.tela.getBotaoProdutos());
		}
		
		if(event.getSource().equals(this.tela.getBotaoRelItens())){
			AtivaEfeitoBotoes(this.tela.getBotaoRelItens());		
		}
		
		if(event.getSource().equals(this.tela.getBotaoRelPacientes())){
			AtivaEfeitoBotoes(this.tela.getBotaoRelPacientes());
		}
	}


	@Override
	public void mouseExited(MouseEvent event) {
		if(event.getSource().equals(this.tela.getBotaoPaciente())){
			ResetaBotao(new JPanel[]{
				this.tela.getBotaoPaciente(),
				this.tela.getBotaoFuncionario(), 
				this.tela.getBotaoProdutos(), 
				this.tela.getBotaoRelItens(),
				this.tela.getBotaoRelPacientes()
			});
		}
		
		if(event.getSource().equals(this.tela.getBotaoFuncionario())){
			ResetaBotao(new JPanel[]{
				this.tela.getBotaoFuncionario(),
				this.tela.getBotaoPaciente(), 
				this.tela.getBotaoProdutos(), 
				this.tela.getBotaoRelItens(), 
				this.tela.getBotaoRelPacientes()
			});
		}
		
		if(event.getSource().equals(this.tela.getBotaoProdutos())){
			ResetaBotao(new JPanel[]{
				this.tela.getBotaoProdutos(),
				this.tela.getBotaoFuncionario(),
				this.tela.getBotaoPaciente(),
				this.tela.getBotaoRelItens(),
				this.tela.getBotaoRelPacientes()
			}); 
		}
		
		if(event.getSource().equals(this.tela.getBotaoRelItens())){
			ResetaBotao(new JPanel[]{
				this.tela.getBotaoRelItens(),
				this.tela.getBotaoFuncionario(), 
				this.tela.getBotaoProdutos(), 
				this.tela.getBotaoPaciente(),
				this.tela.getBotaoRelPacientes()
			}); 			
		}
		
		if(event.getSource().equals(this.tela.getBotaoRelPacientes())){
			ResetaBotao(new JPanel[]{
				this.tela.getBotaoRelPacientes(),
				this.tela.getBotaoFuncionario(), 
				this.tela.getBotaoProdutos(), 
				this.tela.getBotaoPaciente(), 
				this.tela.getBotaoRelItens()
			});
		}
	}
	
	
	private void AtivaEfeitoBotoes(JPanel painelBotao){
		painelBotao.setBackground(new Color(84,127,206));
		
	}
	
	private void ResetaBotao(JPanel [] painel){
        for(int i=0;i<painel.length;i++){
        	painel[i].setBackground(new Color(71,120,197));
        }         
    }

}












