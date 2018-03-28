package br.com.gsv.zprincipal.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.gsv.convenio.formularios.GerenciaTelaConvenio;
import br.com.gsv.fabricantes.formularios.GerenciaTelaFabricante;
import br.com.gsv.funcUsuario.formularios.GerenciaTelaUsuario;
import br.com.gsv.funcionario.formularios.GerenciaTelaFuncionario;
import br.com.gsv.funcionario.formularios.IncluirFuncionariosForm;
import br.com.gsv.paciente.formularios.GerenciaTelaPaciente;
import br.com.gsv.produtos.formularios.GerenciaTelaProdutos;
import br.com.gsv.prontuario.formularios.GerenciaProntuarios;
import br.com.gsv.prontuario.formularios.ProntuarioForm;
import br.com.gsv.zprincipal.form.TelaPrincipalClassic;

public class TelaPrincipalClassicListener implements ActionListener{
	private TelaPrincipalClassic tela;
	
	
	
	public TelaPrincipalClassicListener(TelaPrincipalClassic tela) {
		this.tela = tela;
		AdicionaListener();
	}
	
	
	private void AdicionaListener(){	
		this.tela.getMenuArquivo().addActionListener(this);
		this.tela.getMenuAtendimento().addActionListener(this);
		this.tela.getMenuCadastro().addActionListener(this);
		this.tela.getMenuUsuario().addActionListener(this);
		this.tela.getMenuFarmacia().addActionListener(this);
		this.tela.getMenuRelatorio().addActionListener(this);
		this.tela.getMenuSair().addActionListener(this);
		
		this.tela.getAtendimentoAnotacoes().addActionListener(this);
		this.tela.getAtendimentoProntuario().addActionListener(this);
		
		this.tela.getArquivoAgCli().addActionListener(this);
		this.tela.getArquivoConAte().addActionListener(this);
		this.tela.getArquivoAcomodacoes().addActionListener(this);
		
		this.tela.getCadastroConvenio().addActionListener(this);
		this.tela.getCadastroClinica().addActionListener(this);
		this.tela.getCadastroPaciente().addActionListener(this);
		
		this.tela.getUsuarioConFun().addActionListener(this);
		this.tela.getUsuarioFuncionario().addActionListener(this);
		this.tela.getUsuarioUser().addActionListener(this);
	
		this.tela.getFarmaciaFabricante().addActionListener(this);
		this.tela.getFarmaciaGruProduto().addActionListener(this);
		this.tela.getFarmaciaProduto().addActionListener(this);
		this.tela.getFarmaciaDevolucoes().addActionListener(this);
	
		this.tela.getRelatorioItens().addActionListener(this);
		this.tela.getRelatorioFornecedores().addActionListener(this);
		this.tela.getRelatorioGruItens().addActionListener(this);
		this.tela.getRelatorioPaciente().addActionListener(this);
		this.tela.getRelatorioFuncionario().addActionListener(this);
		this.tela.getRelatorioClinica().addActionListener(this);
				
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.tela.getAtendimentoAnotacoes())){
			AbreAgendaProntuario();
		}
		
		if(event.getSource().equals(this.tela.getAtendimentoProntuario())){
			AbreProntuarios();
		}
		
		if(event.getSource().equals(this.tela.getCadastroConvenio())){
			AbreCadConvenio();
		}
		
		if(event.getSource().equals(this.tela.getCadastroPaciente())){
			AbreCadPaciente();
		}
		
		if(event.getSource().equals(this.tela.getUsuarioConFun())){
			AbreUsuConsulta();
		}
		
		if(event.getSource().equals(this.tela.getUsuarioFuncionario())){
			AbreIncluFuncionario();
		}
		
		if(event.getSource().equals(this.tela.getFarmaciaFabricante())){
			AbreCadFabricante();
		}
		
		if(event.getSource().equals(this.tela.getFarmaciaProduto())){
			AbreCadProdutos();
		}
		
		if(event.getSource().equals(this.tela.getUsuarioUser())){
			AbreCadUsuarios();
		}
		
	}
	
	private void AbreProntuarios(){
		ProntuarioForm formulario = new ProntuarioForm();
		formulario.setLocationRelativeTo(this.tela.getTela());
		formulario.setVisible(true);
	}
	
	private void AbreAgendaProntuario(){
		GerenciaProntuarios formulario = new GerenciaProntuarios();
		formulario.setLocationRelativeTo(this.tela.getTela());
		formulario.setVisible(true);
	}
	
	private void AbreCadConvenio(){
		GerenciaTelaConvenio convenio = new GerenciaTelaConvenio();
		convenio.setLocationRelativeTo(this.tela.getTela());
		convenio.setVisible(true);
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
	
	private void AbreCadUsuarios(){
		GerenciaTelaUsuario user = new GerenciaTelaUsuario();
		user.setLocationRelativeTo(this.tela.getTela());
		user.setVisible(true);
	}
	

}

















