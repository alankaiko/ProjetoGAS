package br.com.gsv.fabricantes.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
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

import br.com.gsv.fabricantes.listeners.BuscarFabricanteListener;

public class BuscarFabricanteDialog extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private JTextField textoBuscar;
	private JButton ok,cancelar, buscar;
	private JRadioButton buscaId, buscaDescricao;
	private JLabel buscarUsuario;
	private ButtonGroup botaoGrupo= new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private BuscarFabricanteListener listener;
	
	
	public BuscarFabricanteDialog() {
		CriarTelaGeral();
		CriaComponentes();
		AdicionaNaTela();
		listener = new BuscarFabricanteListener(this);
	}
	
	
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.setTitle("Buscar Fabricantes");
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
		buscarUsuario= new JLabel("Escolha uma Opção: ");
		buscarUsuario.setBounds(15,10,150,20);
	
		buscaId = new JRadioButton("Código");
		buscaId.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaId.setBounds(15, 40, 86, 23);
		
		
		buscaDescricao = new JRadioButton("Descrição");
		buscaDescricao.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaDescricao.setBounds(144, 40, 99, 23);
		
		botaoGrupo.add(buscaId);
		botaoGrupo.add(buscaDescricao);
		
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
		tela.add(this.buscarUsuario);
		tela.add(this.buscaId);
		tela.add(this.buscaDescricao);
		tela.add(this.textoBuscar);
		tela.add(this.buscar);
		tela.add(this.ok);
		tela.add(this.cancelar);
	}


	public JButton getOk() {
		return ok;
	}


	public void setOk(JButton ok) {
		this.ok = ok;
	}


	public JButton getCancelar() {
		return cancelar;
	}


	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}


	public JButton getBuscar() {
		return buscar;
	}


	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}


	public JTable getTable() {
		return table;
	}


	public void setTable(JTable table) {
		this.table = table;
	}


	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}


	

	public JRadioButton getBuscaId() {
		return buscaId;
	}


	public void setBuscaId(JRadioButton buscaId) {
		this.buscaId = buscaId;
	}


	public JRadioButton getBuscaDescricao() {
		return buscaDescricao;
	}


	public void setBuscaDescricao(JRadioButton buscaDescricao) {
		this.buscaDescricao = buscaDescricao;
	}


	public JTextField getTextoBuscar() {
		return textoBuscar;
	}


	public void setTextoBuscar(JTextField textoBuscar) {
		this.textoBuscar = textoBuscar;
	}

	public void setListener(BuscarFabricanteListener listener) {
		this.listener = listener;
	}
	
	public BuscarFabricanteListener getListener() {
		return listener;
	}
	

}
