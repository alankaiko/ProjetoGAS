package br.com.projeto.gas.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Panel;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.SystemColor;

public class TelaPrincipal extends JFrame {

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAgendaClinica = new JMenuItem("Agenda Clinica");
		mnNewMenu.add(mntmAgendaClinica);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Consulta Atendimentos");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmAcomodaes = new JMenuItem("Acomoda\u00E7\u00F5es");
		mnNewMenu.add(mntmAcomodaes);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmCadastroDeConvnios = new JMenuItem("Cadastro de Conv\u00EAnios");
		mnCadastro.add(mntmCadastroDeConvnios);
		
		JMenuItem mntmCadastroDeClnicas = new JMenuItem("Cadastro de Cl\u00EDnicas");
		mnCadastro.add(mntmCadastroDeClnicas);
		
		JMenuItem mntmCadastroDePacientes = new JMenuItem("Cadastro de Pacientes");
		mnCadastro.add(mntmCadastroDePacientes);
		
		JMenuItem mntmCadastroDePronturios = new JMenuItem("Cadastro de Prontu\u00E1rios");
		mnCadastro.add(mntmCadastroDePronturios);
		
		JMenu mnUsurios = new JMenu("Usu\u00E1rios");
		menuBar.add(mnUsurios);
		
		JMenuItem mntmCadastroDeFuncionrios = new JMenuItem("Cadastro de Funcion\u00E1rios");
		mnUsurios.add(mntmCadastroDeFuncionrios);
		
		JMenuItem mntmConsultaFuncionrios = new JMenuItem("Consulta Funcion\u00E1rios");
		mnUsurios.add(mntmConsultaFuncionrios);
		
		JMenu mnFarmcia = new JMenu("Farm\u00E1cia");
		menuBar.add(mnFarmcia);
		
		JMenuItem mntmCadastroDeProdutos = new JMenuItem("Cadastro de Produtos");
		mnFarmcia.add(mntmCadastroDeProdutos);
		
		JMenuItem mntmCadastroDeFornecedor = new JMenuItem("Cadastro de Fornecedor");
		mnFarmcia.add(mntmCadastroDeFornecedor);
		
		JMenuItem mntmCadastroDeGrupos = new JMenuItem("Cadastro de Grupos de Itens");
		mnFarmcia.add(mntmCadastroDeGrupos);
		
		JMenuItem mntmCadastroDeItens = new JMenuItem("Cadastro de Itens");
		mnFarmcia.add(mntmCadastroDeItens);
		
		JMenuItem mntmMotivosDeDevolues = new JMenuItem("Motivos de Devolu\u00E7\u00F5es");
		mnFarmcia.add(mntmMotivosDeDevolues);
		
		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		menuBar.add(mnRelatrios);
		
		JMenuItem mntmRelatrioDeItens = new JMenuItem("Relat\u00F3rio de Itens");
		mnRelatrios.add(mntmRelatrioDeItens);
		
		JMenuItem mntmRelatrioDeFornecedores = new JMenuItem("Relat\u00F3rio de Fornecedores");
		mnRelatrios.add(mntmRelatrioDeFornecedores);
		
		JMenuItem mntmRelatrioDeGrupos = new JMenuItem("Relat\u00F3rio de Grupos de Itens");
		mnRelatrios.add(mntmRelatrioDeGrupos);
		
		JMenuItem mntmRelatrioDePacientes = new JMenuItem("Relat\u00F3rio de Pacientes");
		mnRelatrios.add(mntmRelatrioDePacientes);
		
		JMenuItem mntmRelatrioDeFuncionrios = new JMenuItem("Relat\u00F3rio de Funcion\u00E1rios");
		mnRelatrios.add(mntmRelatrioDeFuncionrios);
		
		JMenuItem mntmRelatrioDeClnicas = new JMenuItem("Relat\u00F3rio de Cl\u00EDnicas");
		mnRelatrios.add(mntmRelatrioDeClnicas);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		getContentPane().setLayout(null);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setBackground(Color.WHITE);
		painelPrincipal.setBounds(0, 0, 784, 441);
		getContentPane().add(painelPrincipal);
		painelPrincipal.setLayout(null);
		
		Panel painelMenuRapido = new Panel();
		painelMenuRapido.setBackground(SystemColor.textHighlight);
		painelMenuRapido.setBounds(15, 0, 239, 420);
		painelPrincipal.add(painelMenuRapido);
		painelMenuRapido.setLayout(null);
		
		Panel rotuloMenuRapido = new Panel();
		rotuloMenuRapido.setBackground(new Color(38,92,127));
		rotuloMenuRapido.setBounds(0, 60, 239, 35);
		painelMenuRapido.add(rotuloMenuRapido);
		rotuloMenuRapido.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Label label = new Label("MENU R\u00C1PIDO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Segoe UI", Font.BOLD, 18));
		label.setAlignment(Label.CENTER);
		rotuloMenuRapido.add(label);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(new Color(0,122,204));
		panel_4.setBounds(0, 109, 239, 35);
		painelMenuRapido.add(panel_4);
		panel_4.setLayout(null);
		
		Label rotuloPacientes = new Label("Pacientes");
		rotuloPacientes.setBounds(0, 5, 83, 30);
		rotuloPacientes.setForeground(Color.WHITE);
		rotuloPacientes.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rotuloPacientes.setAlignment(Label.CENTER);
		panel_4.add(rotuloPacientes);
		
		Panel panel_5 = new Panel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(0,122,204));
		panel_5.setBounds(0, 150, 239, 35);
		painelMenuRapido.add(panel_5);
		
		Label rotuloFuncionarios = new Label("Funcion\u00E1rios");
		rotuloFuncionarios.setForeground(Color.WHITE);
		rotuloFuncionarios.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rotuloFuncionarios.setAlignment(Label.CENTER);
		rotuloFuncionarios.setBounds(0, 5, 106, 30);
		panel_5.add(rotuloFuncionarios);
		
		Panel panel_6 = new Panel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(0,122,204));
		panel_6.setBounds(0, 191, 239, 35);
		painelMenuRapido.add(panel_6);
		
		Label rotuloProdutos = new Label("Produtos");
		rotuloProdutos.setForeground(Color.WHITE);
		rotuloProdutos.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rotuloProdutos.setAlignment(Label.CENTER);
		rotuloProdutos.setBounds(0, 5, 78, 30);
		panel_6.add(rotuloProdutos);
		
		Panel panel_7 = new Panel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(0,122,204));
		panel_7.setBounds(0, 232, 239, 35);
		painelMenuRapido.add(panel_7);
		
		Label rotuloRelPaciente = new Label("Relat\u00F3rio de Pacientes");
		rotuloRelPaciente.setForeground(Color.WHITE);
		rotuloRelPaciente.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rotuloRelPaciente.setAlignment(Label.CENTER);
		rotuloRelPaciente.setBounds(0, 5, 167, 30);
		panel_7.add(rotuloRelPaciente);
		
		Panel panel_8 = new Panel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(0,122,204));
		panel_8.setBounds(0, 273, 239, 35);
		painelMenuRapido.add(panel_8);
		
		Label rotuloRelItens = new Label("Relat\u00F3rio de Itens");
		rotuloRelItens.setForeground(Color.WHITE);
		rotuloRelItens.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rotuloRelItens.setAlignment(Label.CENTER);
		rotuloRelItens.setBounds(5, 5, 130, 30);
		panel_8.add(rotuloRelItens);
		
		Panel barraStatus = new Panel();
		barraStatus.setBackground(new Color(108,117,127));
		barraStatus.setBounds(0, 421, 784, 20);
		painelPrincipal.add(barraStatus);
	}
}
