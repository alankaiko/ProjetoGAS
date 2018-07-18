package br.com.gsv.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.gsv.listeners.DetalhesFabricanteListener;

public class DetalhesFabricanteDialog extends JDialog {
	private DetalhesFabricanteListener listener;	
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LFabricante;
	private JLabel TId, TFabricante;
	private JButton cancelar;

	
	public DetalhesFabricanteDialog() {
		setTitle("Dados de Fabricante ");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 350, 200);
		
		tela.setLayout(null);		
		tela.add(panel, BorderLayout.CENTER);
		
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Dados();
		listener = new DetalhesFabricanteListener(this);
	}
	
	public void Dados(){
		LId = new JLabel();
		LId.setText("Código");
		LId.setBounds(37, 30, 50, 20);
		LId.setFont(new Font("Arial", Font.BOLD, 11));
		tela.add(this.LId);
		
		TId = new JLabel();
		TId.setBounds(83, 31, 84, 20);
		TId.setBackground(new Color(255, 255, 204));
		TId.setFont(new Font("Arial", Font.BOLD, 10));
		TId.setForeground(Color.black);
		tela.add(this.TId);	
		
		LFabricante = new JLabel();
		LFabricante.setText("Fabricante ");
		LFabricante.setBounds(22, 62, 97, 20);
		LFabricante.setFont(new Font("Arial", Font.BOLD, 11));
		tela.add(this.LFabricante);
			
		TFabricante = new JLabel();
		TFabricante.setBounds(83, 63, 239, 19);
		TFabricante.setFont(new Font("Arial", Font.BOLD, 10));
		tela.add(this.TFabricante );
			
		cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		cancelar.setBounds(522, 398, 89, 23);
		tela.add(this.cancelar);

	}
		
		
	

	
	public void AdicionaComponentes(){
		
	}
		
	
		

		public JButton getCancelar() {
			return cancelar;
		}



		public void setCancelar(JButton cancelar) {
			this.cancelar = cancelar;
		}



		public Container getTela() {
			return tela;
		}


		public void setTela(Container tela) {
			this.tela = tela;
		}


		public JLabel getTId() {
			return TId;
		}



		public void setTId(JLabel tId) {
			TId = tId;
		}


		public JLabel getTFabricante() {
			return TFabricante;
		}


		public void setTFabricante(JLabel tFabricante) {
			TFabricante = tFabricante;
		}


		public DetalhesFabricanteListener getListener() {
			return listener;
		}
		public void setListener(DetalhesFabricanteListener listener) {
			this.listener = listener;
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


		public JPanel getPanel() {
			return panel;
		}
		
		public void setPanel(JPanel panel) {
			this.panel = panel;
		}

}
