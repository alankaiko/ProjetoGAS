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

import br.com.gsv.listeners.IncluirFabricantesListener;

public class IncluirFabricantesForm extends JDialog {
	private IncluirFabricantesListener listener;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LFabricante;
	private JTextField TId, TFabricante;
	private JButton BTGravar, BTCancelar;
	
	
	public IncluirFabricantesForm() {
		setTitle("Inserir Dados de Fabricante");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 350, 200);

		tela.setLayout(null);
		tela.add(panel, BorderLayout.CENTER);

		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		DadosFabricante();
		listener = new IncluirFabricantesListener(this);
	}
	
	public void DadosFabricante() {
		LId = new JLabel();
		LId.setText("Código");
		LId.setBounds(37, 30, 50, 20);
		LId.setFont(new Font("Arial", Font.BOLD, 11));
		tela.add(this.LId);
		
		TId = new JTextField();
		TId.setBounds(83, 31, 84, 20);
		TId.setBackground(new Color(255, 255, 204));
		TId.setFont(new Font("Arial", Font.BOLD, 10));
		TId.setForeground(Color.black);
		TId.setEditable(false);
		tela.add(this.TId);

		LFabricante = new JLabel(); 
		LFabricante.setText("Fabricante ");
		LFabricante.setBounds(22, 62, 97, 20);
		LFabricante.setFont(new Font("Arial", Font.BOLD, 11));
		tela.add(this.LFabricante);
		
		TFabricante = new JTextField();
		TFabricante.setBounds(83, 63, 239, 19);
		TFabricante.setFont(new Font("Arial", Font.BOLD, 10));
		tela.add(this.TFabricante);
		
		BTGravar = new JButton();
		BTGravar.setText("Gravar");
		BTGravar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTGravar.setBounds(85, 121, 89, 23);
		tela.add(this.BTGravar);

		BTCancelar = new JButton();
		BTCancelar.setText("Cancelar");
		BTCancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTCancelar.setBounds(180, 121, 89, 23);
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

	public JTextField getTFabricante() {
		return TFabricante;
	}

	public void setTFabricante(JTextField tFabricante) {
		TFabricante = tFabricante;
	}
	
	public void setListener(IncluirFabricantesListener listener) {
		this.listener = listener;
	}
	
	public IncluirFabricantesListener getListener() {
		return listener;
	}


	public JPanel getPanel() {
		return panel;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLId() {
		return LId;
	}


	public void setLId(JLabel lId) {
		LId = lId;
	}

	public JLabel getLFabricante() {
		return LFabricante;
	}


	public void setLFabricante(JLabel lFabricante) {
		LFabricante = lFabricante;
	}

}
