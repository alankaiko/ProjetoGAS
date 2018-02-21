package br.com.gsv.produtos.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.gsv.produtos.formularios.GerenciaTelaProdutos;
import br.com.projeto.gsv.util.TabelaDeProdutos;

public class GerenciarProdutosListener implements ActionListener{
	private GerenciaTelaProdutos gerenciamento;
	private TabelaDeProdutos tabela;
	
	
	public GerenciarProdutosListener(GerenciaTelaProdutos gerenciamento) {
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
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
