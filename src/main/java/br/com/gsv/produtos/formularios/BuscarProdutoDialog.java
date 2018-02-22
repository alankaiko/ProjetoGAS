package br.com.gsv.produtos.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.funcionarios.listeners.BuscarFuncionarioListener;

public class BuscarProdutoDialog extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private JTextField textoBuscar;
	private JButton ok,cancelar, buscar;
	private JRadioButton buscaCodigo, buscaDescricao, buscaFabricante;
	private JLabel buscarDescricao;
	private ButtonGroup botaoGrupo= new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private BuscarProdutoListener listener;

	
	public BuscarProdutoDialog() {
		CriarTelaGeral();
		CriaComponentes();
		AdicionaNaTela();
		listener = new BuscarProdutoListener(this);
	}
	
	
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.setTitle("Buscar Funcionários");
		this.setModal(true);
		this.setResizable(false);
		this.setBounds(100, 100, 620, 400);
		
		this.tela.setLayout(null);		
		this.tela.add(contentPanel, BorderLayout.CENTER);
		
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 100, 560, 220);
		this.tela.add(this.scrollPane);
		table = new JTable();
		
	}
	
	private void CriaComponentes(){
		buscarDescricao= new JLabel("Escolha uma Opção: ");
		buscarDescricao.setBounds(15,10,150,20);
	
		buscaCodigo = new JRadioButton("Código");
		buscaCodigo.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaCodigo.setBounds(15, 40, 53, 23);
		
		buscaDescricao = new JRadioButton("Descrição");
		buscaDescricao.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaDescricao.setBounds(15, 40, 83, 23);
		
		buscaFabricante = new JRadioButton("Fabricante");
		buscaFabricante.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaFabricante.setBounds(100, 40, 108, 23);
		
		buscaCodigo = new JRadioButton("Código");
		buscaCodigo.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaCodigo.setBounds(210, 40, 65, 23);
		
		botaoGrupo.add(buscaCodigo);
		botaoGrupo.add(buscaDescricao);
		botaoGrupo.add(buscaFabricante);
	
		textoBuscar= new JTextField();
		textoBuscar.setBounds(15,70,260,20);
		textoBuscar.setFont(new Font("Arial",Font.BOLD,10));
		textoBuscar.setForeground(Color.black);		

		buscar= new JButton("Buscar");
		buscar.setBounds(300,68,125,20);

		ok= new JButton("OK");
		ok.setBounds(150,340,125,20);
	
		cancelar= new JButton("Cancelar");
		cancelar.setBounds(290,340,125,20);	
	
	}
	
	private void AdicionaNaTela(){
		tela.add(this.buscaCodigo);
		tela.add(this.buscaDescricao);
		tela.add(this.buscaFabricante);
		tela.add(this.buscaCodigo);
		tela.add(this.textoBuscar);
		tela.add(this.buscar);
		tela.add(this.ok);
		tela.add(this.cancelar);
	}

	
	

}
