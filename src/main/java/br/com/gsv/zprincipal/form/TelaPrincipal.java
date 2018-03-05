package br.com.gsv.zprincipal.form;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import br.com.gsv.zprincipal.listeners.BarraStatusListener;
import br.com.gsv.zprincipal.listeners.TelaPrincipalListener;

public class TelaPrincipal extends JFrame {
	private Container tela= getContentPane();
	private JPanel painelPrincipal;  
	private JLabel horas, data, usuarioLogado;
	private JPanel inferior;
	private JMenuBar menuBar;
	private JMenu menuArquivo, menuCadastro, menuUsuario, menuFarmacia, menuRelatorio, menuSair;
	private JMenuItem arquivoAgenda, arquivoConsulta, arquivoAcomodacoes, cadastroConvenio, cadastroClinica, cadastroPaciente;
	private JMenuItem cadastroProntuario, usaurioFuncionario, usuarioConsulta, farmaciaFornecedor;
	private JMenuItem farmaciaGrupoItens, farmaciaItens, farmaciaDevolucoes, relatorioItens;
	private JMenuItem relatorioFornecedor, relatorioGruposItens, relatorioPaciente, relatorioFuncionario, relatorioClinicas;
	private Panel painelMenuRapido, rotuloMenuRapido, paienlPacie, painelFun, painelProd, painelRelPacie, painelRelItens;
	private Label label, rotuloRelPaciente, rotuloRelItens;
	private JButton rotuloPacientes, rotuloFuncionario, rotuloProdutos;
	private TelaPrincipalListener listener;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public TelaPrincipal() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 521);
		
		CriaComponentes();
		horas = new JLabel();
		data = new JLabel();
		usuarioLogado = new JLabel();
		inferior = new JPanel();
		listener = new TelaPrincipalListener(this);
		BarraStatusListener status = new BarraStatusListener(this);
	}
	
	private void CriaComponentes(){
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(217,236,255));
		setJMenuBar(menuBar);
		
		menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		arquivoAgenda = new JMenuItem("Agenda Clinica");
		menuArquivo.add(arquivoAgenda);
		
		arquivoConsulta = new JMenuItem("Consulta Atendimentos");
		menuArquivo.add(arquivoConsulta);
		
		arquivoAcomodacoes = new JMenuItem("Acomoda\u00E7\u00F5es");
		menuArquivo.add(arquivoAcomodacoes);
		
		menuCadastro = new JMenu("Cadastro");
		menuBar.add(menuCadastro);
		
		cadastroConvenio = new JMenuItem("Cadastro de Conv\u00EAnios");
		menuCadastro.add(cadastroConvenio);
		
		cadastroClinica = new JMenuItem("Cadastro de Cl\u00EDnicas");
		menuCadastro.add(cadastroClinica);
		
		cadastroPaciente = new JMenuItem("Cadastro de Pacientes");
		menuCadastro.add(cadastroPaciente);
		
		cadastroProntuario = new JMenuItem("Cadastro de Prontu\u00E1rios");
		menuCadastro.add(cadastroProntuario);
		
		menuUsuario = new JMenu("Usu\u00E1rios");
		menuBar.add(menuUsuario);
		
		usaurioFuncionario = new JMenuItem("Cadastro de Funcion\u00E1rios");
		menuUsuario.add(usaurioFuncionario);
		
		usuarioConsulta = new JMenuItem("Consulta Funcion\u00E1rios");
		menuUsuario.add(usuarioConsulta);
		
		menuFarmacia = new JMenu("Farm\u00E1cia");
		menuBar.add(menuFarmacia);
			
		farmaciaFornecedor = new JMenuItem("Cadastro de Fabricantes");
		menuFarmacia.add(farmaciaFornecedor);
		
		farmaciaGrupoItens = new JMenuItem("Grupos de Produto");
		menuFarmacia.add(farmaciaGrupoItens);
		
		farmaciaItens = new JMenuItem("Cadastro de Produto");
		menuFarmacia.add(farmaciaItens);
		
		farmaciaDevolucoes = new JMenuItem("Motivos de Devolu\u00E7\u00F5es");
		menuFarmacia.add(farmaciaDevolucoes);
		
		menuRelatorio = new JMenu("Relat\u00F3rios");
		menuBar.add(menuRelatorio);
		
		relatorioItens = new JMenuItem("Relat\u00F3rio de Itens");
		menuRelatorio.add(relatorioItens);
		
		
		relatorioFornecedor = new JMenuItem("Relat\u00F3rio de Fornecedores");
		menuRelatorio.add(relatorioFornecedor);
		
		relatorioGruposItens = new JMenuItem("Relat\u00F3rio de Grupos de Itens");
		menuRelatorio.add(relatorioGruposItens);
		
		relatorioPaciente = new JMenuItem("Relat\u00F3rio de Pacientes");
		menuRelatorio.add(relatorioPaciente);
		
		relatorioFuncionario = new JMenuItem("Relat\u00F3rio de Funcion\u00E1rios");
		menuRelatorio.add(relatorioFuncionario);
		
		relatorioClinicas = new JMenuItem("Relat\u00F3rio de Cl\u00EDnicas");
		menuRelatorio.add(relatorioClinicas);
		
		menuSair = new JMenu("Sair");
		menuBar.add(menuSair);
		tela.setLayout(null);
		
		painelPrincipal = new JPanel();
		painelPrincipal.setBackground(Color.WHITE);
		painelPrincipal.setBounds(0, 0, 784, 462);
		tela.add(painelPrincipal);
		painelPrincipal.setLayout(null);
		
		painelMenuRapido = new Panel();
		painelMenuRapido.setBackground(new Color(18,46,81));
		painelMenuRapido.setBounds(15, 0, 239, 439);
		painelPrincipal.add(painelMenuRapido);
		painelMenuRapido.setLayout(null);
		
		rotuloMenuRapido = new Panel();
		rotuloMenuRapido.setBackground(new Color(38,92,127));
		rotuloMenuRapido.setBounds(0, 60, 239, 35);
		painelMenuRapido.add(rotuloMenuRapido);
		rotuloMenuRapido.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
		paienlPacie = new Panel();
		paienlPacie.setBackground(new Color(23,58,102));
		paienlPacie.setBounds(0, 109, 239, 35);
		painelMenuRapido.add(paienlPacie);
		paienlPacie.setLayout(null);
		
		
		
		
		rotuloPacientes = new JButton("Pacientes");
		rotuloPacientes.setBackground(new Color(255, 255, 255));
		rotuloPacientes.setForeground(Color.BLACK);
		rotuloPacientes.setFont(new Font("Tahoma", Font.BOLD, 15));
		rotuloPacientes.setBounds(10, 11, 130, 23);
		paienlPacie.add(rotuloPacientes);
		
		painelFun = new Panel();
		painelFun.setLayout(null);
		painelFun.setBackground(new Color(23,58,102));
		painelFun.setBounds(0, 145, 239, 35);
		painelMenuRapido.add(painelFun);
		
		rotuloFuncionario = new JButton("Funcionários");
		rotuloFuncionario.setBounds(10, 11, 130, 23);
		painelFun.add(rotuloFuncionario);
		rotuloFuncionario.setForeground(Color.BLACK);
		rotuloFuncionario.setFont(new Font("Tahoma", Font.BOLD, 15));
		rotuloFuncionario.setBackground(Color.WHITE);
		
		painelProd = new Panel();
		painelProd.setLayout(null);
		painelProd.setBackground(new Color(23,58,102));
		painelProd.setBounds(0, 181, 239, 35);
		painelMenuRapido.add(painelProd);
		
		rotuloProdutos = new JButton("Produtos");
		rotuloProdutos.setForeground(Color.BLACK);
		rotuloProdutos.setFont(new Font("Tahoma", Font.BOLD, 15));
		rotuloProdutos.setBackground(Color.WHITE);
		rotuloProdutos.setBounds(10, 11, 130, 23);
		painelProd.add(rotuloProdutos);
		
		painelRelPacie = new Panel();
		painelRelPacie.setLayout(null);
		painelRelPacie.setBackground(new Color(23,58,102));
		painelRelPacie.setBounds(0, 217, 239, 35);
		painelMenuRapido.add(painelRelPacie);
		
		painelRelItens = new Panel();
		painelRelItens.setLayout(null);
		painelRelItens.setBackground(new Color(23,58,102));
		painelRelItens.setBounds(0, 253, 239, 35);
		painelMenuRapido.add(painelRelItens);
		
		label = new Label("MENU R\u00C1PIDO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Segoe UI", Font.BOLD, 18));
		label.setAlignment(Label.CENTER);
		rotuloMenuRapido.add(label);
		
		rotuloRelPaciente = new Label("Relat\u00F3rio de Pacientes");
		rotuloRelPaciente.setForeground(Color.WHITE);
		rotuloRelPaciente.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rotuloRelPaciente.setAlignment(Label.CENTER);
		rotuloRelPaciente.setBounds(0, 5, 167, 30);
		painelRelPacie.add(rotuloRelPaciente);
		

		rotuloRelItens = new Label("Relat\u00F3rio de Itens");
		rotuloRelItens.setForeground(Color.WHITE);
		rotuloRelItens.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rotuloRelItens.setAlignment(Label.CENTER);
		rotuloRelItens.setBounds(5, 5, 130, 30);
		painelRelItens.add(rotuloRelItens);
	}
	
	
	

	public Container getTela() {
		return tela;
	}



	public void setTela(Container tela) {
		this.tela = tela;
	}



	public JPanel getPainelPrincipal() {
		return painelPrincipal;
	}



	public void setPainelPrincipal(JPanel painelPrincipal) {
		this.painelPrincipal = painelPrincipal;
	}



	public JLabel getHoras() {
		return horas;
	}



	public void setHoras(JLabel horas) {
		this.horas = horas;
	}



	public JLabel getData() {
		return data;
	}



	public void setData(JLabel data) {
		this.data = data;
	}



	public JLabel getUsuarioLogado() {
		return usuarioLogado;
	}



	public void setUsuarioLogado(JLabel usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}



	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}



	public JMenu getMenuArquivo() {
		return menuArquivo;
	}



	public void setMenuArquivo(JMenu menuArquivo) {
		this.menuArquivo = menuArquivo;
	}



	public JMenu getMenuCadastro() {
		return menuCadastro;
	}



	public void setMenuCadastro(JMenu menuCadastro) {
		this.menuCadastro = menuCadastro;
	}



	public JMenu getMenuUsuario() {
		return menuUsuario;
	}



	public void setMenuUsuario(JMenu menuUsuario) {
		this.menuUsuario = menuUsuario;
	}



	public JMenu getMenuFarmacia() {
		return menuFarmacia;
	}



	public void setMenuFarmacia(JMenu menuFarmacia) {
		this.menuFarmacia = menuFarmacia;
	}



	public JMenu getMenuRelatorio() {
		return menuRelatorio;
	}



	public void setMenuRelatorio(JMenu menuRelatorio) {
		this.menuRelatorio = menuRelatorio;
	}



	public JMenu getMenuSair() {
		return menuSair;
	}



	public void setMenuSair(JMenu menuSair) {
		this.menuSair = menuSair;
	}



	public JMenuItem getArquivoAgenda() {
		return arquivoAgenda;
	}



	public void setArquivoAgenda(JMenuItem arquivoAgenda) {
		this.arquivoAgenda = arquivoAgenda;
	}



	public JMenuItem getArquivoConsulta() {
		return arquivoConsulta;
	}



	public void setArquivoConsulta(JMenuItem arquivoConsulta) {
		this.arquivoConsulta = arquivoConsulta;
	}



	public JMenuItem getArquivoAcomodacoes() {
		return arquivoAcomodacoes;
	}



	public void setArquivoAcomodacoes(JMenuItem arquivoAcomodacoes) {
		this.arquivoAcomodacoes = arquivoAcomodacoes;
	}



	public JMenuItem getCadastroConvenio() {
		return cadastroConvenio;
	}



	public void setCadastroConvenio(JMenuItem cadastroConvenio) {
		this.cadastroConvenio = cadastroConvenio;
	}



	public JMenuItem getCadastroClinica() {
		return cadastroClinica;
	}



	public void setCadastroClinica(JMenuItem cadastroClinica) {
		this.cadastroClinica = cadastroClinica;
	}



	public JMenuItem getCadastroPaciente() {
		return cadastroPaciente;
	}



	public void setCadastroPaciente(JMenuItem cadastroPaciente) {
		this.cadastroPaciente = cadastroPaciente;
	}



	public JMenuItem getCadastroProntuario() {
		return cadastroProntuario;
	}



	public void setCadastroProntuario(JMenuItem cadastroProntuario) {
		this.cadastroProntuario = cadastroProntuario;
	}



	public JMenuItem getUsaurioFuncionario() {
		return usaurioFuncionario;
	}



	public void setUsaurioFuncionario(JMenuItem usaurioFuncionario) {
		this.usaurioFuncionario = usaurioFuncionario;
	}



	public JMenuItem getUsuarioConsulta() {
		return usuarioConsulta;
	}



	public void setUsuarioConsulta(JMenuItem usuarioConsulta) {
		this.usuarioConsulta = usuarioConsulta;
	}



	public JMenuItem getFarmaciaFornecedor() {
		return farmaciaFornecedor;
	}



	public void setFarmaciaFornecedor(JMenuItem farmaciaFornecedor) {
		this.farmaciaFornecedor = farmaciaFornecedor;
	}



	public JMenuItem getFarmaciaGrupoItens() {
		return farmaciaGrupoItens;
	}



	public void setFarmaciaGrupoItens(JMenuItem farmaciaGrupoItens) {
		this.farmaciaGrupoItens = farmaciaGrupoItens;
	}



	public JMenuItem getFarmaciaItens() {
		return farmaciaItens;
	}



	public void setFarmaciaItens(JMenuItem farmaciaItens) {
		this.farmaciaItens = farmaciaItens;
	}



	public JMenuItem getFarmaciaDevolucoes() {
		return farmaciaDevolucoes;
	}



	public void setFarmaciaDevolucoes(JMenuItem farmaciaDevolucoes) {
		this.farmaciaDevolucoes = farmaciaDevolucoes;
	}



	public JMenuItem getRelatorioItens() {
		return relatorioItens;
	}



	public void setRelatorioItens(JMenuItem relatorioItens) {
		this.relatorioItens = relatorioItens;
	}



	public JMenuItem getRelatorioFornecedor() {
		return relatorioFornecedor;
	}



	public void setRelatorioFornecedor(JMenuItem relatorioFornecedor) {
		this.relatorioFornecedor = relatorioFornecedor;
	}



	public JMenuItem getRelatorioGruposItens() {
		return relatorioGruposItens;
	}



	public void setRelatorioGruposItens(JMenuItem relatorioGruposItens) {
		this.relatorioGruposItens = relatorioGruposItens;
	}



	public JMenuItem getRelatorioPaciente() {
		return relatorioPaciente;
	}



	public void setRelatorioPaciente(JMenuItem relatorioPaciente) {
		this.relatorioPaciente = relatorioPaciente;
	}



	public JMenuItem getRelatorioFuncionario() {
		return relatorioFuncionario;
	}



	public void setRelatorioFuncionario(JMenuItem relatorioFuncionario) {
		this.relatorioFuncionario = relatorioFuncionario;
	}



	public JMenuItem getRelatorioClinicas() {
		return relatorioClinicas;
	}



	public void setRelatorioClinicas(JMenuItem relatorioClinicas) {
		this.relatorioClinicas = relatorioClinicas;
	}



	public Panel getPainelMenuRapido() {
		return painelMenuRapido;
	}



	public void setPainelMenuRapido(Panel painelMenuRapido) {
		this.painelMenuRapido = painelMenuRapido;
	}



	public Panel getRotuloMenuRapido() {
		return rotuloMenuRapido;
	}



	public void setRotuloMenuRapido(Panel rotuloMenuRapido) {
		this.rotuloMenuRapido = rotuloMenuRapido;
	}



	public Panel getPaienlPacie() {
		return paienlPacie;
	}



	public void setPaienlPacie(Panel paienlPacie) {
		this.paienlPacie = paienlPacie;
	}



	public Panel getPainelFun() {
		return painelFun;
	}



	public void setPainelFun(Panel painelFun) {
		this.painelFun = painelFun;
	}



	public Panel getPainelProd() {
		return painelProd;
	}



	public void setPainelProd(Panel painelProd) {
		this.painelProd = painelProd;
	}



	public Panel getPainelRelPacie() {
		return painelRelPacie;
	}



	public void setPainelRelPacie(Panel painelRelPacie) {
		this.painelRelPacie = painelRelPacie;
	}



	public Panel getPainelRelItens() {
		return painelRelItens;
	}



	public void setPainelRelItens(Panel painelRelItens) {
		this.painelRelItens = painelRelItens;
	}



	public Label getLabel() {
		return label;
	}



	public void setLabel(Label label) {
		this.label = label;
	}





	public JButton getRotuloPacientes() {
		return rotuloPacientes;
	}



	public void setRotuloPacientes(JButton rotuloPacientes) {
		this.rotuloPacientes = rotuloPacientes;
	}



	public JButton getRotuloFuncionario() {
		return rotuloFuncionario;
	}



	public void setRotuloFuncionario(JButton rotuloFuncionario) {
		this.rotuloFuncionario = rotuloFuncionario;
	}

	


	public JButton getRotuloProdutos() {
		return rotuloProdutos;
	}



	public void setRotuloProdutos(JButton rotuloProdutos) {
		this.rotuloProdutos = rotuloProdutos;
	}



	public Label getRotuloRelPaciente() {
		return rotuloRelPaciente;
	}



	public void setRotuloRelPaciente(Label rotuloRelPaciente) {
		this.rotuloRelPaciente = rotuloRelPaciente;
	}



	public Label getRotuloRelItens() {
		return rotuloRelItens;
	}



	public void setRotuloRelItens(Label rotuloRelItens) {
		this.rotuloRelItens = rotuloRelItens;
	}
		  
	 
	 public void setInferior(JPanel inferior) {
		this.inferior = inferior;
	}
	 
	 public JPanel getInferior() {
		return inferior;
	}
}
