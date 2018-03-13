package br.com.gsv.zprincipal.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.gsv.convenio.formularios.GerenciaTelaConvenio;
import br.com.gsv.fabricantes.formularios.GerenciaTelaFabricante;
import br.com.gsv.funcionario.formularios.GerenciaTelaFuncionario;
import br.com.gsv.funcionario.formularios.IncluirFuncionariosForm;
import br.com.gsv.paciente.formularios.GerenciaTelaPaciente;
import br.com.gsv.produtos.formularios.GerenciaTelaProdutos;
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
		
		this.tela.getRotuloPacientes().addActionListener(this);
		this.tela.getRotuloFuncionario().addActionListener(this);
		this.tela.getRotuloProdutos().addActionListener(this);
		
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.tela.getCadastroPaciente())){
			AbreCadPaciente();
		}		
		if(event.getSource().equals(this.tela.getRotuloPacientes())){
			AbreCadPaciente();
		}
		
		
		
		if(event.getSource().equals(this.tela.getUsuarioConsulta())){
			AbreUsuConsulta();
		}
		if(event.getSource().equals(this.tela.getRotuloFuncionario())){
			AbreUsuConsulta();
		}
		
		
		if(event.getSource().equals(this.tela.getUsaurioFuncionario())){
			AbreIncluFuncionario();
		}
		
		
		if(event.getSource().equals(this.tela.getFarmaciaFornecedor())){
			AbreCadFabricante();
		}
		
		
		if(event.getSource().equals(this.tela.getFarmaciaItens())){
			AbreCadProdutos();
		}
		if(event.getSource().equals(this.tela.getRotuloProdutos())){
			AbreCadProdutos();
		}
		
		if(event.getSource().equals(this.tela.getCadastroConvenio())){
			AbreCadConvenio();			
		}
		
		
	}
	
	
	private void AbreCadPaciente(){
		GerenciaTelaPaciente paciente = new GerenciaTelaPaciente();
		paciente.setLocationRelativeTo(this.tela.getTela());
		paciente.setVisible(true);
	}
	
	private void AbreUsuConsulta(){
		GerenciaTelaFuncionario funcionario = new GerenciaTelaFuncionario();
		funcionario.setLocationRelativeTo(this.tela.getTela());
		funcionario.setVisible(true);
	}
	
	private void AbreIncluFuncionario(){
		IncluirFuncionariosForm incluirFunc =  new IncluirFuncionariosForm();
		incluirFunc.setLocationRelativeTo(this.tela.getTela());
		incluirFunc.setVisible(true);
	}
	
	private void AbreCadFabricante(){
		GerenciaTelaFabricante fabricante = new GerenciaTelaFabricante();
		fabricante.setLocationRelativeTo(this.tela.getTela());
		fabricante.setVisible(true);
	}
	
	private void AbreCadProdutos(){
		GerenciaTelaProdutos produtos = new GerenciaTelaProdutos();
		produtos.setLocationRelativeTo(this.tela.getTela());
		produtos.setVisible(true);
	}
	
	private void AbreCadConvenio(){
		GerenciaTelaConvenio convenio = new GerenciaTelaConvenio();
		convenio.setLocationRelativeTo(this.tela.getTela());
		convenio.setVisible(true);
	}

}

















