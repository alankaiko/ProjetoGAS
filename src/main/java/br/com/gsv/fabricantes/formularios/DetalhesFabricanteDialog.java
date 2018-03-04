package br.com.gsv.fabricantes.formularios;

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

import br.com.gsv.fabricantes.listeners.DetalhesFabricanteListener;

public class DetalhesFabricanteDialog extends JDialog {
	private DetalhesFabricanteListener listener;	
	
	public DetalhesFabricanteDialog() {
		CriarTelaGeral();
		Dados();
		InicializaCompomentes();
		listener = new DetalhesFabricanteListener(this);
	}

	
		
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.setTitle("Dados de Fabricante ");
		this.setModal(true);
		this.setResizable(false);
		this.setBounds(100, 100, 350, 200);
		
		this.tela.setLayout(null);		
		this.tela.add(contentPanel, BorderLayout.CENTER);
		
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
	}
	
		
		
	//cria os componentes jbutton jlabel jtexfield etc etc etc e organiza dentro do layout geral
	public void Dados(){
		LId = new JLabel("Código");
		LId.setBounds(37, 30, 50, 20);
		LId.setFont(new Font("Arial", Font.BOLD, 11));
			TId = new JLabel();
			TId.setBounds(83, 31, 84, 20);
			TId.setBackground(new Color(255, 255, 204));
			TId.setFont(new Font("Arial", Font.BOLD, 10));
			TId.setForeground(Color.black);

		LFabricante = new JLabel("Fabricante ");
		LFabricante.setBounds(22, 62, 97, 20);
		LFabricante.setFont(new Font("Arial", Font.BOLD, 11));
			TFabricante = new JLabel();
			TFabricante.setBounds(83, 63, 239, 19);
			TFabricante.setFont(new Font("Arial", Font.BOLD, 10));
					
			
		cancelar = new JButton("Cancelar");
		cancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		cancelar.setBounds(522, 398, 89, 23);
	}
		
		
		//classe que adiciona os componentes criados no metodo anterior à tela geral
		public void InicializaCompomentes(){
			tela.add(this.TId);
			tela.add(this.TFabricante );
			tela.add(this.LFabricante);
			tela.add(this.LId);
			tela.add(this.cancelar);			
		}
		
		
		private final JPanel contentPanel = new JPanel();
		private Container tela = getContentPane();
		private JLabel LId, LFabricante;
		private JLabel TId, TFabricante;
		private JButton cancelar;

		

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


}
