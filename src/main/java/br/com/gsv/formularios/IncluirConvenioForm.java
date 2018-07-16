package br.com.gsv.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.listeners.IncluirConvenioListener;

public class IncluirConvenioForm extends JDialog{
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LConvenio;
	private JTextField TId, TConvenio;
	private JButton BTGravar, BTCancelar;
	private IncluirConvenioListener listener;
	private int xx,xy;

	
	public IncluirConvenioForm() {
		setTitle("Inserir Convenio / Plano / Credencial");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 350, 164);

		tela.setLayout(null);
		tela.add(panel, BorderLayout.CENTER);

		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		OrganizaDados();
		listener = new IncluirConvenioListener(this);
	}
	
	
	private void OrganizaDados() {
		LId = new JLabel();
		LId.setText("Código");
		LId.setFont(new Font("Arial", Font.BOLD, 11));
		LId.setBounds(37, 30, 50, 20);
		tela.add(this.LId);
			
		TId = new JTextField();
		TId.setBounds(83, 31, 84, 20);
		TId.setBackground(new Color(255, 255, 204));
		TId.setFont(new Font("Arial", Font.BOLD, 10));
		TId.setForeground(Color.black);
		TId.setEditable(false);
		tela.add(this.TId);
		
		LConvenio = new JLabel();
		LConvenio.setText("Convenio");
		LConvenio.setBounds(22, 62, 104, 20);
		LConvenio.setFont(new Font("Arial", Font.BOLD, 11));
		tela.add(this.LConvenio);
			
		TConvenio = new JTextField();
		TConvenio.setBounds(83, 63, 239, 19);
		TConvenio.setFont(new Font("Arial", Font.BOLD, 10));
		TConvenio.setToolTipText("Ex: IPASGO / UNIMED");
		tela.add(this.TConvenio);

		BTGravar = new JButton();
		BTGravar.setText("Gravar");
		BTGravar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTGravar.setBounds(70, 93, 89, 23);
		tela.add(this.BTGravar);

		BTCancelar = new JButton();
		BTCancelar.setText("Cancelar");
		BTCancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTCancelar.setBounds(170, 93, 89, 23);
		tela.add(this.BTCancelar);	
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
