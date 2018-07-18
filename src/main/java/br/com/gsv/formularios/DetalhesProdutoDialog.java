package br.com.gsv.formularios;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import br.com.gsv.listeners.DetalhesProdutoListener;

public class DetalhesProdutoDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton BTCancelar;
	private JLabel TCodigo, TDescricao, TQuantidade;
	private JLabel LDados, LCodigo, LDescricao, LQuantidade, LFabricante, TFabricante;
	private DetalhesProdutoListener listener;
	private JSeparator separa;
	

	public DetalhesProdutoDialog() {
		setTitle("Detalhes Dados de Produtos");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 489, 356);

		tela.setLayout(null);
		tela.add(panel, BorderLayout.CENTER);

		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		CriaTela();
		listener = new DetalhesProdutoListener(this);
	}
	
	public void CriaTela() {
		LDados = new JLabel();
		LDados.setText("Dados do Produto");
		LDados.setBounds(38, 29, 130, 14);
		tela.add(LDados);
		
		LCodigo = new JLabel();
		LCodigo.setText("Código");
		LCodigo.setBounds(38, 62, 70, 14);
		tela.add(LCodigo);
		
		TCodigo = new JLabel();
		TCodigo.setBounds(100, 59, 86, 20);
		tela.add(TCodigo);

		LDescricao = new JLabel();
		LDescricao.setText("Descrição");
		LDescricao.setBounds(38, 104, 70, 14);
		tela.add(LDescricao);
		
		TDescricao = new JLabel();
		TDescricao.setBounds(106, 101, 328, 20);
		tela.add(TDescricao);
		
		LQuantidade = new JLabel();
		LQuantidade.setText("Quantidade");
		LQuantidade.setBounds(38, 145, 94, 14);
		tela.add(LQuantidade);
		
		TQuantidade = new JLabel();
		TQuantidade.setBounds(116, 142, 124, 20);
		tela.add(TQuantidade);

		LFabricante = new JLabel();
		LFabricante.setText("Fabricante");
		LFabricante.setBounds(38, 196, 80, 14);
		tela.add(LFabricante);
		
		TFabricante = new JLabel();
		TFabricante.setBounds(128, 196, 262, 14);
		tela.add(TFabricante);

		BTCancelar = new JButton();
		BTCancelar.setText("Cancelar");
		BTCancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTCancelar.setBounds(209, 275, 89, 23);
		tela.add(BTCancelar);
		
		separa = new JSeparator();
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


	public JButton getBTCancelar() {
		return BTCancelar;
	}

	public void setBTCancelar(JButton bTCancelar) {
		BTCancelar = bTCancelar;
	}

	public JLabel getTCodigo() {
		return TCodigo;
	}

	public void setTCodigo(JLabel tCodigo) {
		TCodigo = tCodigo;
	}

	public JLabel getTDescricao() {
		return TDescricao;
	}

	public void setTDescricao(JLabel tDescricao) {
		TDescricao = tDescricao;
	}

	public JLabel getTQuantidade() {
		return TQuantidade;
	}

	public void setTQuantidade(JLabel tQuantidade) {
		TQuantidade = tQuantidade;
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

	public JLabel getTFabricante() {
		return TFabricante;
	}

	public void setTFabricante(JLabel tFabricante) {
		TFabricante = tFabricante;
	}

	public DetalhesProdutoListener getListener() {
		return listener;
	}

	public void setListener(DetalhesProdutoListener listener) {
		this.listener = listener;
	}

	public JSeparator getSepara() {
		return separa;
	}
	
	public void setSepara(JSeparator separa) {
		this.separa = separa;
	}
	
}
