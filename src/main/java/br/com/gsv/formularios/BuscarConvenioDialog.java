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

import br.com.gsv.graficoAzul.BuscarConvenioGrafic;
import br.com.gsv.graficoClassic.BuscarConvenioClassic;
import br.com.gsv.listeners.BuscarConvenioListener;
import br.com.gsv.listeners.RadioListenerConvenio;

public class BuscarConvenioDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JTextField textoBuscar;
	private JButton ok,cancelar, buscar;
	private JRadioButton buscaId, buscaNome;
	private JLabel buscarUsuario;
	private ButtonGroup botaoGrupo= new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private BuscarConvenioListener listener;
	private RadioListenerConvenio radioListener;
	private BuscarConvenioClassic listenerClassic;
	private BuscarConvenioGrafic listenerGrafic;
	private JPanel painelDrag;
	private int xx,xy;
	
	
	
	public BuscarConvenioDialog() {
		CriaComponentes();
		AdicionaNaTela();
		listener = new BuscarConvenioListener(this);
		radioListener = new RadioListenerConvenio(this);
	}
	
	public void IniciaClassic(){
		listenerClassic = new BuscarConvenioClassic(this);
	}
	
	public void IniciaGrafic(){
		listenerGrafic = new BuscarConvenioGrafic(this);
	}
	
	
	private void CriaComponentes(){
		buscarUsuario = new JLabel();
		buscaId = new JRadioButton();
		buscaNome = new JRadioButton();
		textoBuscar = new JTextField();
		buscar = new JButton();
		ok = new JButton();
		cancelar = new JButton();
		table = new JTable();
		scrollPane = new JScrollPane();
		painelDrag = new JPanel();
		botaoGrupo.add(buscaId);
		botaoGrupo.add(buscaNome);
	}
	
	private void AdicionaNaTela(){
		tela.add(this.buscarUsuario);
		tela.add(this.buscaId);
		tela.add(this.buscaNome);
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


	public JRadioButton getBuscaNome() {
		return buscaNome;
	}
	
	public void setBuscaNome(JRadioButton buscaNome) {
		this.buscaNome = buscaNome;
	}


	public JTextField getTextoBuscar() {
		return textoBuscar;
	}


	public void setTextoBuscar(JTextField textoBuscar) {
		this.textoBuscar = textoBuscar;
	}
	
	public BuscarConvenioListener getListener() {
		return listener;
	}
	public void setListener(BuscarConvenioListener listener) {
		this.listener = listener;
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


	public JLabel getBuscarUsuario() {
		return buscarUsuario;
	}


	public void setBuscarUsuario(JLabel buscarUsuario) {
		this.buscarUsuario = buscarUsuario;
	}


	public ButtonGroup getBotaoGrupo() {
		return botaoGrupo;
	}


	public void setBotaoGrupo(ButtonGroup botaoGrupo) {
		this.botaoGrupo = botaoGrupo;
	}


	public RadioListenerConvenio getRadioListener() {
		return radioListener;
	}


	public void setRadioListener(RadioListenerConvenio radioListener) {
		this.radioListener = radioListener;
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
