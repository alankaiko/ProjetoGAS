package br.com.gsv.convenio.formularios;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.convenio.listeners.IncluirConvenioListener;

public class IncluirConvenioForm extends JDialog{
	private IncluirConvenioListener listener;
	private IncluirConvenioClassic listenerGrafico;

	// metodo construtor que inicia tudo
	public IncluirConvenioForm() {
		CriarTelaGeral();
		DadosFuncionario();
		InicializaCompomentes();
		listener = new IncluirConvenioListener(this);
		listenerGrafico = new IncluirConvenioClassic(this);
	}

	
	// cria e tela geral onde todos os componentes serao inseridos, é a tela
	// geral do sistema
	private void CriarTelaGeral() {
		this.setTitle("Inserir Convenio / Plano / Credencial");
		this.setModal(true);
		this.setResizable(false);
		this.setBounds(100, 100, 350, 164);

		this.tela.setLayout(null);
		this.tela.add(contentPanel, BorderLayout.CENTER);

		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

	}
		
	
	// cria os componentes jbutton jlabel jtexfield etc etc etc e organiza
	// dentro do layout geral
	public void DadosFuncionario() {
		LId = new JLabel();
		TId = new JTextField();
		LConvenio = new JLabel();
		TConvenio = new JTextField();
		BTGravar = new JButton();
		BTCancelar = new JButton();
	}

	// classe que adiciona os componentes criados no metodo anterior à tela
	// geral
	public void InicializaCompomentes() {
		tela.add(this.TId);
		tela.add(this.LConvenio);
		tela.add(this.TConvenio);
		tela.add(this.LId);
		tela.add(this.BTGravar);
		tela.add(this.BTCancelar);
	}

	private JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LConvenio;
	private JTextField TId, TConvenio;
	private JButton BTGravar, BTCancelar;

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

	public Container getTela() {
		return tela;
	}

	public void setTela(Container tela) {
		this.tela = tela;
	}

	public JTextField getTId() {
		return TId;
	}

	public void setTId(JTextField tId) {
		TId = tId;
	}

	public JLabel getLConvenio() {
		return LConvenio;
	}

	public void setLConvenio(JLabel lConvenio) {
		LConvenio = lConvenio;
	}

	public JTextField getTConvenio() {
		return TConvenio;
	}

	public void setTConvenio(JTextField tConvenio) {
		TConvenio = tConvenio;
	}
	
	public void setListener(IncluirConvenioListener listener) {
		this.listener = listener;
	}
	public IncluirConvenioListener getListener() {
		return listener;
	}

	public JLabel getLId() {
		return LId;
	}

	public void setLId(JLabel lId) {
		LId = lId;
	}


	public JPanel getContentPanel() {
		return contentPanel;
	}

	
	

	
	
}
