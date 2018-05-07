package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.com.gsv.graficoAzul.BuscarProdutoGrafic;
import br.com.gsv.graficoClassic.BuscarProdutoClassic;
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
	private BuscarProdutoClassic listenerClassic;
	private BuscarProdutoGrafic listenerGrafic;
	private JPanel painelDrag;
	private int xx,xy;

	
	public BuscarProdutoDialog() {
		CriaComponentes();
		AdicionaNaTela();
		listener = new BuscarProdutoListener(this);
		listenerGrafic = new BuscarProdutoGrafic(this);
	}
	
	
	private void CriaComponentes(){
		buscaCodigo = new JRadioButton();
		buscaDescricao = new JRadioButton();
		buscarDescricao = new JLabel();
		buscaFabricante = new JRadioButton();
		buscaCodigo = new JRadioButton();
		textoBuscar = new JTextField();
		buscar = new JButton();
		ok = new JButton();
		cancelar = new JButton();
		scrollPane = new JScrollPane();
		table = new JTable();
		painelDrag = new JPanel();
		
		botaoGrupo.add(buscaCodigo);
		botaoGrupo.add(buscaDescricao);
		botaoGrupo.add(buscaFabricante);
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
