package br.com.gsv.produtos.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.gsv.produtos.grafico.DetalheProdutoClassic;
import br.com.gsv.produtos.listeners.DetalhesProdutoListener;

public class DetalhesProdutoDialog extends JDialog {
	private DetalhesProdutoListener listener;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton BTCancelar;
	private JLabel TCodigo, TDescricao, TFabricante, TQuantidade;
	private JLabel LDados, LCodigo, LDescricao, LQuantidade, LFabricante;
	private DetalheProdutoClassic listenerClassic;

	public DetalhesProdutoDialog() {
		CriaVariaveis();
		InicializaComponentes();
		
		listenerClassic = new DetalheProdutoClassic(this);
		listener = new DetalhesProdutoListener(this);
	}
	
	private void CriaVariaveis() {
		LDados = new JLabel(); 
		LCodigo = new JLabel(); 
		TCodigo = new JLabel(); 
		LDescricao = new JLabel(); 
		TDescricao = new JLabel(); 
		LQuantidade = new JLabel(); 
		LFabricante = new JLabel(); 
		TFabricante = new JLabel(); 
		BTCancelar = new JButton(); 
		TQuantidade = new JLabel(); 
	}

	private void InicializaComponentes() {
		tela.add(LDados);
		tela.add(LCodigo);
		tela.add(TCodigo);
		tela.add(LDescricao);
		tela.add(TDescricao);
		tela.add(LQuantidade);
		tela.add(LFabricante);
		tela.add(TFabricante);
		tela.add(BTCancelar);
		tela.add(TQuantidade);
	}

	public DetalhesProdutoListener getListener() {
		return listener;
	}

	public void setListener(DetalhesProdutoListener listener) {
		this.listener = listener;
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

	public JLabel getTFabricante() {
		return TFabricante;
	}

	public void setTFabricante(JLabel tFabricante) {
		TFabricante = tFabricante;
	}

	public JLabel getTQuantidade() {
		return TQuantidade;
	}

	public void setTQuantidade(JLabel tQuantidade) {
		TQuantidade = tQuantidade;
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

}
