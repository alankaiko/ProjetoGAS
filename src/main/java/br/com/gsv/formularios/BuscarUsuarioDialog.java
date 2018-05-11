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

import br.com.gsv.graficoAzul.BuscarUsuarioGrafic;
import br.com.gsv.graficoClassic.BuscarUsuarioClassic;
import br.com.gsv.listeners.BuscarUsuarioListener;

public class BuscarUsuarioDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JTextField textoBuscar;
	private JButton ok, cancelar, buscar;
	private JRadioButton buscaLogin, buscaNome;
	private JLabel buscarUsuario;
	private ButtonGroup botaoGrupo = new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private BuscarUsuarioListener listener;
	private BuscarUsuarioClassic listenerClassic;
	private BuscarUsuarioGrafic listenerGrafic;
	private JPanel painelDrag;
	private int xx,xy;
	
	public BuscarUsuarioDialog() {
		CriaComponentes();
		AdicionaNaTela();
		listener = new BuscarUsuarioListener(this);
	}
	
	public void IniciaClassic(){
		listenerClassic = new BuscarUsuarioClassic(this);
	}
	
	public void IniciaGrafic(){
		listenerGrafic = new BuscarUsuarioGrafic(this);
	}
	
		
	private void CriaComponentes() {
		buscarUsuario = new JLabel();
		buscaLogin = new JRadioButton();
		buscaNome = new JRadioButton();
		textoBuscar = new JTextField();
		buscar = new JButton();
		ok = new JButton();
		cancelar = new JButton();
		scrollPane = new JScrollPane();
		table = new JTable();
		painelDrag = new JPanel();
		
		botaoGrupo.add(buscaLogin);
		botaoGrupo.add(buscaNome);
	}
	
	

	private void AdicionaNaTela() {
		tela.add(this.buscarUsuario);
		tela.add(this.buscaLogin);
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

	public JRadioButton getBuscaLogin() {
		return buscaLogin;
	}

	public void setBuscaLogin(JRadioButton buscaLogin) {
		this.buscaLogin = buscaLogin;
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

	public BuscarUsuarioListener getListener() {
		return listener;
	}

	public void setListener(BuscarUsuarioListener listener) {
		this.listener = listener;
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
