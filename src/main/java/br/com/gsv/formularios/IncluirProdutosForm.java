package br.com.gsv.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.listeners.IncluirProdutoListener;
import br.com.gsv.util.SomenteNumerosUtil;

public class IncluirProdutosForm extends JDialog {
	private static final long serialVersionUID = 1L;
	private IncluirProdutoListener listener;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton BTGravar, BTCancelar;
	private JTextField TCodigo, TDescricao, TQuantidade;
	private JLabel LDados, LCodigo, LDescricao, LQuantidade, LFabricante, LAdicionaFabricante;
	private JComboBox comboFabricante;
	private SomenteNumerosUtil soNumeros;
	
	public IncluirProdutosForm() {
		setTitle("Inserir Dados de Produtos");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 489, 356);
		
		tela.setLayout(null);		
		tela.add(panel, BorderLayout.CENTER);
		
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		CriaComponentes();
		listener = new IncluirProdutoListener(this);
	}
	
	private void CriaComponentes(){
		LDados = new JLabel();
		LDados.setText("Dados do Produto");
		LDados.setBounds(38, 29, 130, 14);
		tela.add(LDados);
		
		LCodigo = new JLabel();
		LCodigo.setText("Código");
		LCodigo.setBounds(38, 62, 70, 14);
		tela.add(LCodigo);
		
		TCodigo = new JTextField();
		TCodigo.setBounds(100, 59, 86, 20);
		TCodigo.setColumns(10);
		TCodigo.setToolTipText("Aceita Letras e Números para composição do Código");
		tela.add(TCodigo);
		
		LDescricao = new JLabel();
		LDescricao.setText("Descrição");
		LDescricao.setBounds(38, 104, 70, 14);
		tela.add(LDescricao);
		
		TDescricao = new JTextField();
		TDescricao.setBounds(108, 101, 328, 20);
		TDescricao.setColumns(10);
		tela.add(TDescricao);
	
		LQuantidade = new JLabel();
		LQuantidade.setText("Quantidade");
		LQuantidade.setBounds(38, 145, 94, 14);
		tela.add(LQuantidade);
		
		TQuantidade = new JTextField();
		TQuantidade.setBounds(109, 142, 124, 20);
		TQuantidade.setColumns(10);
		TQuantidade.addKeyListener(soNumeros);
		tela.add(TQuantidade);
		
		LFabricante = new JLabel();
		LFabricante.setText("Fabricante");
		LFabricante.setBounds(38, 196, 113, 14);
		tela.add(LFabricante);
		
		comboFabricante = new JComboBox();	
		comboFabricante.setBounds(106, 193, 241, 20);
		tela.add(comboFabricante);

		LAdicionaFabricante = new JLabel();
		LAdicionaFabricante.setText("Adicionar?");
		LAdicionaFabricante.setForeground(Color.BLUE);
		LAdicionaFabricante.setFont(new Font("Palatino Linotype", Font.PLAIN, 10));
		LAdicionaFabricante.setBounds(357, 202, 123, 14);
		tela.add(LAdicionaFabricante);
		
		BTGravar = new JButton();
		BTGravar.setText("Gravar");
		BTGravar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTGravar.setBounds(142, 276, 89, 23);
		tela.add(BTGravar);
		
		BTCancelar = new JButton();
		BTCancelar.setText("Cancelar");
		BTCancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTCancelar.setBounds(250, 276, 89, 23);
		tela.add(BTCancelar);
	}

	
	public IncluirProdutoListener getListener() {
		return listener;
	}
	public void setListener(IncluirProdutoListener listener) {
		this.listener = listener;
	}
	

	public JButton getBTGravar() {
		return BTGravar;
	}


	public void setBTGravar(JButton bTGravar) {
		BTGravar = bTGravar;
	}


	public JButton getBTCancelar() {
		return BTCancelar;
	}


	public void setBTCancelar(JButton bTCancelar) {
		BTCancelar = bTCancelar;
	}


	public JTextField getTCodigo() {
		return TCodigo;
	}


	public void setTCodigo(JTextField tCodigo) {
		TCodigo = tCodigo;
	}


	public JTextField getTDescricao() {
		return TDescricao;
	}


	public void setTDescricao(JTextField tDescricao) {
		TDescricao = tDescricao;
	}


	

	public void setComboFabricante(JComboBox comboFabricante) {
		this.comboFabricante = comboFabricante;
	}
	
	public JComboBox getComboFabricante() {
		return comboFabricante;
	}

	public JLabel getLDados() {
		return LDados;
	}


	public void setLDados(JLabel lDados) {
		LDados = lDados;
	}


	public JLabel getLCodigo() {
		return LCodigo;
	}


	public void setLCodigo(JLabel lCodigo) {
		LCodigo = lCodigo;
	}


	public JLabel getLDescricao() {
		return LDescricao;
	}


	public void setLDescricao(JLabel lDescricao) {
		LDescricao = lDescricao;
	}


	public JLabel getLQuantidade() {
		return LQuantidade;
	}


	public void setLQuantidade(JLabel lQuantidade) {
		LQuantidade = lQuantidade;
	}


	public JLabel getLFabricante() {
		return LFabricante;
	}


	public void setLFabricante(JLabel lFabricante) {
		LFabricante = lFabricante;
	}


	public JTextField getTQuantidade() {
		return TQuantidade;
	}


	public void setTQuantidade(JTextField tQuantidade) {
		TQuantidade = tQuantidade;
	}
	
	public void setLAdicionaFabricante(JLabel lAdicionaFabricante) {
		LAdicionaFabricante = lAdicionaFabricante;
	}
	
	public JLabel getLAdicionaFabricante() {
		return LAdicionaFabricante;
	}


	public Container getTela() {
		return tela;
	}


	public void setTela(Container tela) {
		this.tela = tela;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	
}
