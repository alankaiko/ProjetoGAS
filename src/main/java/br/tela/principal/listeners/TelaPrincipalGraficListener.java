package br.tela.principal.listeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import com.itextpdf.text.DocumentException;

import br.com.gsv.formularios.GerenciaTelaConvenio;
import br.com.gsv.formularios.GerenciaTelaFabricante;
import br.com.gsv.formularios.GerenciaTelaFuncionario;
import br.com.gsv.formularios.GerenciaTelaPaciente;
import br.com.gsv.formularios.GerenciaTelaProdutos;
import br.com.gsv.formularios.GerenciaTelaUsuario;
import br.com.gsv.formularios.IncluirFuncionariosForm;
import br.com.gsv.formularios.IncluirPacienteForm;
import br.com.gsv.graficoClassic.RelatorioFuncionarioClassic;
import br.com.gsv.graficoClassic.RelatorioProntuarioClassic;
import br.com.gsv.prontuario.formularios.GerenciaProntuarios;
import br.com.gsv.prontuario.formularios.ProntuarioForm;
import br.com.gsv.relatorios.RelatorioConvenio;
import br.com.gsv.relatorios.RelatorioFornecedores;
import br.com.gsv.relatorios.RelatorioPaciente;
import br.com.gsv.relatorios.RelatorioProdutos;
import br.tela.principal.form.TelaPrincipalGrafic;

public class TelaPrincipalGraficListener implements MouseListener, ActionListener{
	private TelaPrincipalGrafic tela;
	
	
	
	public TelaPrincipalGraficListener(TelaPrincipalGrafic tela) {
		this.tela = tela;
		AdicionaListener();
		ArrastandoPainel();
		TeclaEsc();
	}
	
	
	private void AdicionaListener(){	
		this.tela.getBotaoProntuario().addMouseListener(this);
		this.tela.getBotaoFuncionario().addMouseListener(this);
		this.tela.getBotaoPaciente().addMouseListener(this);
		this.tela.getBotaoProdutos().addMouseListener(this);
		this.tela.getBotaoRelItens().addMouseListener(this);
		this.tela.getBotaoRelPacientes().addMouseListener(this);
		
		
		
		this.tela.getMenuArquivo().addActionListener(this);
		this.tela.getMenuAtendimento().addActionListener(this);
		this.tela.getMenuCadastro().addActionListener(this);
		this.tela.getMenuUsuario().addActionListener(this);
		this.tela.getMenuFarmacia().addActionListener(this);
		this.tela.getMenuRelatorio().addActionListener(this);
		
		this.tela.getAtendimentoAnotacoes().addActionListener(this);
		this.tela.getAtendimentCadCliente().addActionListener(this);
		
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
		this.tela.getRelatorioConvenio().addActionListener(this);
		this.tela.getRelatorioProntuario().addActionListener(this);
	}
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent event) {
		if(event.getSource().equals(this.tela.getBotaoFuncionario())){
			AbreUsuConsulta();
		}
		
		if(event.getSource().equals(this.tela.getBotaoPaciente())){
			AbreCadPaciente();
		}
		
		if(event.getSource().equals(this.tela.getBotaoProdutos())){
			AbreCadProdutos();
		}
		
		if(event.getSource().equals(this.tela.getBotaoProntuario())){
			AbreAgendaProntuario();
		}
	
		if(event.getSource().equals(this.tela.getBotaoRelPacientes())){
			AbreRelatorioPaciente();
		}
		
		if
		(event.getSource().equals(this.tela.getBotaoRelItens())){
			AbreRelatorioItens();
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
		
		if(event.getSource().equals(this.tela.getBotaoProntuario())){
			AtivaEfeitoBotoes(this.tela.getBotaoProntuario());
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
				this.tela.getBotaoRelPacientes(),
				this.tela.getBotaoProntuario()
			});
		}
		
		if(event.getSource().equals(this.tela.getBotaoFuncionario())){
			ResetaBotao(new JPanel[]{
				this.tela.getBotaoFuncionario(),
				this.tela.getBotaoPaciente(), 
				this.tela.getBotaoProdutos(), 
				this.tela.getBotaoRelItens(), 
				this.tela.getBotaoRelPacientes(),
				this.tela.getBotaoProntuario()
			});
		}
		
		if(event.getSource().equals(this.tela.getBotaoProdutos())){
			ResetaBotao(new JPanel[]{
				this.tela.getBotaoProdutos(),
				this.tela.getBotaoFuncionario(),
				this.tela.getBotaoPaciente(),
				this.tela.getBotaoRelItens(),
				this.tela.getBotaoRelPacientes(),
				this.tela.getBotaoProntuario()
			}); 
		}
		
		if(event.getSource().equals(this.tela.getBotaoRelItens())){
			ResetaBotao(new JPanel[]{
				this.tela.getBotaoRelItens(),
				this.tela.getBotaoFuncionario(), 
				this.tela.getBotaoProdutos(), 
				this.tela.getBotaoPaciente(),
				this.tela.getBotaoRelPacientes(),
				this.tela.getBotaoProntuario()
			}); 			
		}
		
		if(event.getSource().equals(this.tela.getBotaoRelPacientes())){
			ResetaBotao(new JPanel[]{
				this.tela.getBotaoRelPacientes(),
				this.tela.getBotaoFuncionario(), 
				this.tela.getBotaoProdutos(), 
				this.tela.getBotaoPaciente(), 
				this.tela.getBotaoRelItens(),
				this.tela.getBotaoProntuario()
			});
		}
		
		if(event.getSource().equals(this.tela.getBotaoProntuario())){
			ResetaBotao(new JPanel[]{
				this.tela.getBotaoRelPacientes(),
				this.tela.getBotaoFuncionario(), 
				this.tela.getBotaoProdutos(), 
				this.tela.getBotaoPaciente(), 
				this.tela.getBotaoRelItens(),
				this.tela.getBotaoProntuario()
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


	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.tela.getAtendimentoAnotacoes())){
			AbreAgendaProntuario();
		}
		
		if(event.getSource().equals(this.tela.getAtendimentCadCliente())){
			AbreIncluirPaciente();
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
		
		if(event.getSource().equals(this.tela.getRelatorioFuncionario())){
			AbreRelatorioFuncionario();
		}
		
		if(event.getSource().equals(this.tela.getRelatorioProntuario())){
			AbreRelatorioProntuario();
		}
		
		if(event.getSource().equals(this.tela.getRelatorioItens())){
			AbreRelatorioItens();
		}
		
		if(event.getSource().equals(this.tela.getRelatorioConvenio())){
			AbreRelatorioConvenio();
		}
			
		if(event.getSource().equals(this.tela.getRelatorioFornecedores())){
			AbreRelatorioFornecedor();
		}
			
		if(event.getSource().equals(this.tela.getRelatorioPaciente())){
			AbreRelatorioPaciente();
		}	
			
	}
	
	private void AbreProntuarios(){
		ProntuarioForm formulario = new ProntuarioForm();
		formulario.getListener().InicializaObjetos();
		formulario.setLocationRelativeTo(this.tela.getTela());
		formulario.setVisible(true);
	}
	
	private void AbreAgendaProntuario(){
		GerenciaProntuarios formulario = new GerenciaProntuarios();
		formulario.getListener().ResetarLista();
		formulario.setLocationRelativeTo(this.tela.getTela());
		formulario.setVisible(true);
	}
	
	private void AbreIncluirPaciente(){
		IncluirPacienteForm inclui = new IncluirPacienteForm();
		inclui.IniciaGrafic();
		inclui.setLocationRelativeTo(this.tela.getTela());
		inclui.setVisible(true);		
	}
	
	private void AbreCadConvenio(){
		GerenciaTelaConvenio convenio = new GerenciaTelaConvenio();
		convenio.IniciaGrafic();
		convenio.setLocationRelativeTo(this.tela.getTela());
		convenio.setVisible(true);
	}
	
	
	
	private void AbreCadPaciente(){
		GerenciaTelaPaciente paciente = new GerenciaTelaPaciente();
		paciente.IniciaGrafic();
		paciente.setLocationRelativeTo(this.tela.getTela());
		paciente.setVisible(true);
	}
	
	private void AbreUsuConsulta(){
		GerenciaTelaFuncionario funcionario = new GerenciaTelaFuncionario();
		funcionario.IniciaGrafic();
		funcionario.setLocationRelativeTo(this.tela.getTela());
		funcionario.setVisible(true);
	}
	
	private void AbreIncluFuncionario(){
		IncluirFuncionariosForm incluirFunc =  new IncluirFuncionariosForm();
		incluirFunc.IniciaGrafic();
		incluirFunc.setLocationRelativeTo(this.tela.getTela());
		incluirFunc.setVisible(true);
	}
	
	private void AbreCadFabricante(){
		GerenciaTelaFabricante fabricante = new GerenciaTelaFabricante();
		fabricante.IniciaGrafic();
		fabricante.setLocationRelativeTo(this.tela.getTela());
		fabricante.setVisible(true);
	}
	
	private void AbreCadProdutos(){
		GerenciaTelaProdutos produtos = new GerenciaTelaProdutos();
		produtos.IniciaGrafic();
		produtos.setLocationRelativeTo(this.tela.getTela());
		produtos.setVisible(true);
	}
	
	private void AbreCadUsuarios(){
		GerenciaTelaUsuario user = new GerenciaTelaUsuario();
		user.IniciaGrafic();
		user.setLocationRelativeTo(this.tela.getTela());
		user.setVisible(true);
	}
	
	private void AbreRelatorioFuncionario(){
		RelatorioFuncionarioClassic rel = new RelatorioFuncionarioClassic();
		rel.setLocationRelativeTo(this.tela.getTela());
		rel.setVisible(true);
	}
	
	private void AbreRelatorioProntuario(){
		RelatorioProntuarioClassic rel = new RelatorioProntuarioClassic();
		rel.setLocationRelativeTo(this.tela.getTela());
		rel.setVisible(true);
	}
	
	private void AbreRelatorioItens(){
		try {
			RelatorioProdutos rel = new RelatorioProdutos();
			rel.Iniciar();
		} catch (IOException | DocumentException e) {
			e.printStackTrace();
		}
	}
	
	private void AbreRelatorioConvenio(){
		try {
			RelatorioConvenio rel = new RelatorioConvenio();
			rel.Iniciar();
		} catch (IOException | DocumentException e) {
			e.printStackTrace();
		}
	}
	
	private void AbreRelatorioFornecedor(){
		try {
			RelatorioFornecedores rel = new RelatorioFornecedores();
			rel.Iniciar();
		} catch (IOException | DocumentException e) {
			e.printStackTrace();
		}
	}

	private void AbreRelatorioPaciente(){
		try {
			RelatorioPaciente rel = new RelatorioPaciente();
			rel.Iniciar();
		} catch (IOException | DocumentException e) {
			e.printStackTrace();
		}
	}
	
	
	
	private void ArrastandoPainel(){
		
		this.tela.getPanel().addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                arrastaPainel(evt);
            }
        });
		
		this.tela.getPanel().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                arrastaPressionado(evt);
            }
        });
	}
	
	private void arrastaPressionado(MouseEvent evt) {
		this.tela.setXx(evt.getX());
		this.tela.setXy(evt.getY());
        //this.formulario.xx = evt.getX();
        //this.formulario.xy = evt.getY();
    }

    private void arrastaPainel(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.tela.setLocation(x-this.tela.getXx(),y-this.tela.getXy());
    }
    
    @SuppressWarnings("serial")
	public void TeclaEsc(){
        JRootPane meurootpane = this.tela.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
  
            public void actionPerformed(ActionEvent e) {  
            	System.exit(0);
            }  
        });  
    }  

}












