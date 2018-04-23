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

import br.com.gsv.listeners.BuscarUsuarioListener;

public class BuscarUsuarioDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	
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

	
	public BuscarUsuarioDialog() {
		CriarTelaGeral();
		CriaComponentes();
		AdicionaNaTela();
		listener = new BuscarUsuarioListener(this);
	}

	
	// cria e tela geral onde todos os componentes serao inseridos, é a tela
	// geral do sistema
	private void CriarTelaGeral() {
		this.setTitle("Buscar Convenio / Plano / Credencial");
		this.setModal(true);
		this.setResizable(false);
		this.setBounds(100, 100, 514, 344);

		this.tela.setLayout(null);
		this.tela.add(panel, BorderLayout.CENTER);

		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 100, 478, 177);
		this.tela.add(this.scrollPane);
		table = new JTable();

	}

	
	private void CriaComponentes() {
		buscarUsuario = new JLabel("Escolha uma Opção: ");
		buscarUsuario.setBounds(15, 10, 150, 20);

		buscaLogin = new JRadioButton("Login");
		buscaLogin.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaLogin.setBounds(15, 40, 84, 23);

		buscaNome = new JRadioButton("Usuário");
		buscaNome.setFont(new Font("Arial", Font.PLAIN, 13));
		buscaNome.setBounds(106, 40, 90, 23);

		botaoGrupo.add(buscaLogin);
		botaoGrupo.add(buscaNome);

		textoBuscar = new JTextField();
		textoBuscar.setBounds(15, 70, 260, 20);
		textoBuscar.setFont(new Font("Arial", Font.BOLD, 10));
		textoBuscar.setForeground(Color.black);

		buscar = new JButton("Buscar");
		buscar.setBounds(300, 68, 125, 20);

		ok = new JButton("OK");
		ok.setBounds(118, 288, 125, 20);

		cancelar = new JButton("Cancelar");
		cancelar.setBounds(253, 288, 125, 20);

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

	
	
}
