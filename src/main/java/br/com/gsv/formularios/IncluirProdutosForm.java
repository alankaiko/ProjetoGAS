package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.graficoClassic.IncluirProdutosClassic;
import br.com.gsv.listeners.IncluirProdutoListener;

public class IncluirProdutosForm extends JDialog {
	private static final long serialVersionUID = 1L;
	private IncluirProdutoListener listener;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton BTGravar, BTCancelar;
	private JTextField TCodigo, TDescricao, TQuantidade;
	private JLabel LDados, LCodigo, LDescricao, LQuantidade, LFabricante, LAdicionaFabricante;
	private JComboBox comboFabricante;
	private IncluirProdutosClassic listenerClassic;
	private int xx,xy;
	
	
	public IncluirProdutosForm() {
		CriaVariaveis();
		InicializaComponentes();
		listener = new IncluirProdutoListener(this);
		listenerClassic = new IncluirProdutosClassic(this);
	}
	
	private void CriaVariaveis(){
		LDados = new JLabel();
		LCodigo = new JLabel();
		TCodigo = new JTextField();
		LDescricao = new JLabel();
		TDescricao = new JTextField();
		LQuantidade = new JLabel();
		LFabricante = new JLabel();
		comboFabricante = new JComboBox();
		BTCancelar = new JButton();
		BTGravar = new JButton();
		TQuantidade = new JTextField();
		LAdicionaFabricante = new JLabel();
	}
	
	
	private void InicializaComponentes(){
		tela.add(LDados);
		tela.add(LCodigo);
		tela.add(TCodigo);
		tela.add(LDescricao);
		tela.add(TDescricao);
		tela.add(LQuantidade);
		tela.add(LFabricante);
		tela.add(comboFabricante);
		tela.add(BTCancelar);
		tela.add(BTGravar);
		tela.add(TQuantidade);
		tela.add(LAdicionaFabricante);
		
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

	public int getXx() {
		return xx;
	}

	public void setXx(int xx) {
		this.xx = xx;
	}

	public int getXy() {
		return xy;
	}

	public void setXy(int xy) {
		this.xy = xy;
	}

	
}
