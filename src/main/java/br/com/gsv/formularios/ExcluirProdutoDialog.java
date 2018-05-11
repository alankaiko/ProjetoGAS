package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.domain.Produto;
import br.com.gsv.graficoAzul.ExcluirProdutoGrafic;
import br.com.gsv.graficoClassic.ExcluirProdutoClassic;
import br.com.gsv.listeners.ExcluirProdutoListener;

public class ExcluirProdutoDialog extends JDialog {
	private ExcluirProdutoListener listener;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton ok, cancelar;
	private JLabel excluir;
	private JSeparator separa;
	private Produto produto;
	private ExcluirProdutoClassic listenerClassic;
	private ExcluirProdutoGrafic listenerGrafic;
	private JPanel painelDrag;
	private int xx,xy;
	

	public ExcluirProdutoDialog(Produto produto) {
		this.produto = produto;
		CriaVariaveis();
		Inicializa();
		listener = new ExcluirProdutoListener(this);
	}
	
	public void IniciaClassic(){
		listenerClassic = new ExcluirProdutoClassic(this);
	}
	
	public void IniciaGrafic(){
		listenerGrafic = new ExcluirProdutoGrafic(this);
	}
	

	
	private void CriaVariaveis(){
		ok = new JButton();
		cancelar = new JButton();
		excluir = new JLabel();
		separa = new JSeparator();
		painelDrag = new JPanel();
	}
	
	private void Inicializa(){
		tela.add(this.ok);
		tela.add(this.cancelar);
		tela.add(this.excluir);
		tela.add(this.separa);
		tela.add(this.painelDrag);
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

	public JLabel getExcluir() {
		return excluir;
	}

	public void setExcluir(JLabel excluir) {
		this.excluir = excluir;
	}

	public Produto getProduto() {
		return produto;
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

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public JSeparator getSepara() {
		return separa;
	}
	public void setSepara(JSeparator separa) {
		this.separa = separa;
	}



	public JPanel getPainelDrag() {
		return painelDrag;
	}



	public void setPainelDrag(JPanel painelDrag) {
		this.painelDrag = painelDrag;
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
