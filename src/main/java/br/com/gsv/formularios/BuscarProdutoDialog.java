package br.com.gsv.formularios;

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

import br.com.gsv.listeners.BuscarProdutoListener;

public class BuscarProdutoDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
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
		setTitle("Buscar Funcionários");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 620, 400);
		
		tela.setLayout(null);		
		tela.add(panel, BorderLayout.CENTER);
		
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				
		scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 100, 585, 220);
		scrollPane.getViewport().setBackground(Color.WHITE);
		tela.add(scrollPane);
		table = new JTable();
		
		OrganizaComponentes();
		listener = new BuscarProdutoListener(this);
	}
	
	
	public void OrganizaComponentes() {
		buscarDescricao = new JLabel();
		buscarDescricao.setText("Escolha uma Opção: ");
		buscarDescricao.setBounds(15,10,150,20);
	
		buscaCodigo = new JRadioButton();
		buscaCodigo.setText("Código");
		buscaCodigo.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaCodigo.setBounds(15, 40, 65, 23);
		botaoGrupo.add(buscaCodigo);
		tela.add(this.buscaCodigo);
		
		buscaDescricao = new JRadioButton();
		buscaDescricao.setText("Descrição");
		buscaDescricao.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaDescricao.setBounds(96, 40, 83, 23);
		botaoGrupo.add(buscaDescricao);
		tela.add(this.buscaDescricao);
		
		buscaFabricante = new JRadioButton();
		buscaFabricante.setText("Fabricante");
		buscaFabricante.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaFabricante.setBounds(190, 40, 108, 23);
		botaoGrupo.add(buscaFabricante);
		tela.add(this.buscaFabricante);
		
		textoBuscar = new JTextField();
		textoBuscar.setBounds(15,70,260,20);
		textoBuscar.setFont(new Font("Arial",Font.BOLD,10));
		textoBuscar.setForeground(Color.black);	
		tela.add(this.textoBuscar);

		buscar = new JButton();
		buscar.setText("Buscar");
		buscar.setBounds(300,68,125,20);
		tela.add(this.buscar);

		ok = new JButton();
		ok.setText("OK");
		ok.setBounds(150,340,125,20);
		tela.add(this.ok);
	
		cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setBounds(290,340,125,20);	
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

	public JTextField getTextoBuscar() {
		return textoBuscar;
	}
	
	public void setTextoBuscar(JTextField textoBuscar) {
		this.textoBuscar = textoBuscar;
	}
	
	public JRadioButton getBuscaCodigo() {
		return buscaCodigo;
	}
	
	public JRadioButton getBuscaDescricao() {
		return buscaDescricao;
	}
	
	public JRadioButton getBuscaFabricante() {
		return buscaFabricante;
	}
	
	public void setListener(BuscarProdutoListener listener) {
		this.listener = listener;
	}
	public BuscarProdutoListener getListener() {
		return listener;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public Container getTela() {
		return tela;
	}

	public void setTela(Container tela) {
		this.tela = tela;
	}

	public JLabel getBuscarDescricao() {
		return buscarDescricao;
	}

	public void setBuscarDescricao(JLabel buscarDescricao) {
		this.buscarDescricao = buscarDescricao;
	}

	public ButtonGroup getBotaoGrupo() {
		return botaoGrupo;
	}

	public void setBotaoGrupo(ButtonGroup botaoGrupo) {
		this.botaoGrupo = botaoGrupo;
	}

	public void setBuscaCodigo(JRadioButton buscaCodigo) {
		this.buscaCodigo = buscaCodigo;
	}

	public void setBuscaDescricao(JRadioButton buscaDescricao) {
		this.buscaDescricao = buscaDescricao;
	}

	public void setBuscaFabricante(JRadioButton buscaFabricante) {
		this.buscaFabricante = buscaFabricante;
	}
}
