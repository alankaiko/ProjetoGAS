package br.com.gsv.paciente.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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

import br.com.gsv.paciente.listeners.BuscarPacienteListener;

public class BuscarPacienteDialog extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private JTextField textoBuscar;
	private JButton ok,cancelar, buscar;
	private JRadioButton buscaCpf, buscaRg, buscaNome, buscaCodigo;
	private JLabel buscarUsuario;
	private ButtonGroup botaoGrupo= new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private BuscarPacienteListener listener;
	
	
	public BuscarPacienteDialog() {
		CriarTelaGeral();
		CriaComponentes();
		AdicionaNaTela();
		listener = new BuscarPacienteListener(this);
	}
	
	
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.setTitle("Buscar Clientes");
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
	
		buscaCpf = new JRadioButton("CPF");
		buscaCpf.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaCpf.setBounds(15, 40, 53, 23);
		
		
		buscaRg = new JRadioButton("RG");
		buscaRg.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaRg.setBounds(70, 40, 53, 23);
		
		buscaNome = new JRadioButton("Nome");
		buscaNome.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaNome.setBounds(125, 40, 60, 23);
		
		buscaCodigo = new JRadioButton("Código");
		buscaCodigo.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaCodigo.setBounds(185, 40, 65, 23);
		
		botaoGrupo.add(buscaCpf);
		botaoGrupo.add(buscaRg);
		botaoGrupo.add(buscaNome);
		botaoGrupo.add(buscaCodigo);
	
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
		tela.add(this.buscaCpf);
		tela.add(this.buscaRg);
		tela.add(this.buscaNome);
		tela.add(this.buscaCodigo);
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


	public JRadioButton getBuscaCpf() {
		return buscaCpf;
	}


	public void setBuscaCpf(JRadioButton buscaCpf) {
		this.buscaCpf = buscaCpf;
	}


	public JRadioButton getBuscaRg() {
		return buscaRg;
	}


	public void setBuscaRg(JRadioButton buscaRg) {
		this.buscaRg = buscaRg;
	}


	public JRadioButton getBuscaNome() {
		return buscaNome;
	}


	public void setBuscaNome(JRadioButton buscaNome) {
		this.buscaNome = buscaNome;
	}


	public JRadioButton getBuscaCodigo() {
		return buscaCodigo;
	}


	public void setBuscaCodigo(JRadioButton buscaCodigo) {
		this.buscaCodigo = buscaCodigo;
	}


	public JTextField getTextoBuscar() {
		return textoBuscar;
	}


	public void setTextoBuscar(JTextField textoBuscar) {
		this.textoBuscar = textoBuscar;
	}


	public BuscarPacienteListener getListener() {
		return listener;
	}
	public void setListener(BuscarPacienteListener listener) {
		this.listener = listener;
	}
	
}
