package br.com.gsv.convenio.formularios;

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

import br.com.gsv.convenio.listeners.DetalhesConvenioListener;

public class DetalhesConvenioDialog extends JDialog {
	private DetalhesConvenioListener listener;	
	
	public DetalhesConvenioDialog() {
		CriarTelaGeral();
		Dados();
		InicializaCompomentes();
		listener = new DetalhesConvenioListener(this);
	}

	
		
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.setTitle("Dados de Convenio ");
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
			TId = new JTextField();
			TId.setBounds(83, 31, 84, 20);
			TId.setBackground(new Color(255, 255, 204));
			TId.setFont(new Font("Arial", Font.BOLD, 10));
			TId.setForeground(Color.black);
			TId.setEditable(false);

		LFabricante = new JLabel("Convênio ");
		LFabricante.setBounds(22, 62, 97, 20);
		LFabricante.setFont(new Font("Arial", Font.BOLD, 11));
			TFabricante = new JTextField();
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
		private JTextField TId, TFabricante;
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

		public DetalhesConvenioListener getListener() {
			return listener;
		}
		
		public void setListener(DetalhesConvenioListener listener) {
			this.listener = listener;
		}

}
