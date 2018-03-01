package br.com.gsv.zprincipal.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.gsv.zprincipal.form.TelaPrincipal;

public class TelaPrincipalListener implements ActionListener{
	private TelaPrincipal tela;
	
	
	
	public TelaPrincipalListener(TelaPrincipal tela) {
		this.tela = tela;
		AdicionaListener();
	}
	
	
	private void AdicionaListener(){
		this.tela.getMenuArquivo().addActionListener(this);
		this.tela.getMenuCadastro().addActionListener(this);
		this.tela.getMenuUsuario().addActionListener(this);
		this.tela.getMenuFarmacia().addActionListener(this);
		this.tela.getMenuRelatorio().addActionListener(this);
		this.tela.getMenuSair().addActionListener(this);
		
		this.tela.getArquivoAgenda().addActionListener(this);
		this.tela.getArquivoConsulta().addActionListener(this);
		this.tela.getArquivoAcomodacoes().addActionListener(this);
		this.tela.getCadastroConvenio().addActionListener(this);
		this.tela.getCadastroClinica().addActionListener(this);
		this.tela.getCadastroPaciente().addActionListener(this);
		
		this.tela.getCadastroProntuario().addActionListener(this);
		this.tela.getUsaurioFuncionario().addActionListener(this);
		this.tela.getUsuarioConsulta().addActionListener(this);
		this.tela.getFarmaciaProduto().addActionListener(this);
		this.tela.getFarmaciaFornecedor().addActionListener(this);
		
		this.tela.getFarmaciaGrupoItens().addActionListener(this);
		this.tela.getFarmaciaItens().addActionListener(this);
		this.tela.getFarmaciaDevolucoes().addActionListener(this);
		this.tela.getRelatorioItens().addActionListener(this);
		
		this.tela.getRelatorioFornecedor().addActionListener(this);
		this.tela.getRelatorioGruposItens().addActionListener(this);
		this.tela.getRelatorioPaciente().addActionListener(this);
		this.tela.getRelatorioFuncionario().addActionListener(this);
		this.tela.getRelatorioClinicas().addActionListener(this);
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.tela.getCadastroPaciente())){
			
		}
		
		
			
		
	}
	
	
	

}

















