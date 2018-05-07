package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.graficoAzul.DetalheFabricanteGrafic;
import br.com.gsv.graficoClassic.DetalheFabricanteClassic;
import br.com.gsv.listeners.DetalhesFabricanteListener;

public class DetalhesFabricanteDialog extends JDialog {
	private DetalhesFabricanteListener listener;	
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LFabricante;
	private JLabel TId, TFabricante;
	private JButton cancelar;
	private JSeparator separa;
	private DetalheFabricanteClassic listenerClassic;
	private DetalheFabricanteGrafic listenerGrafic;

	
	public DetalhesFabricanteDialog() {
		CriaVariaveis();
		AdicionaComponentes();
		listener = new DetalhesFabricanteListener(this);
	}
	
	
	public void CriaVariaveis() {
		LId = new JLabel();
		LFabricante = new JLabel();
		TId = new JLabel();
		TFabricante = new JLabel();
		cancelar = new JButton();
		separa = new JSeparator();
	}

	
	public void AdicionaComponentes(){
		tela.add(this.TId);
		tela.add(this.TFabricante );
		tela.add(this.LFabricante);
		tela.add(this.LId);
		tela.add(this.cancelar);		
		tela.add(this.separa);
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

		public void setSepara(JSeparator separa) {
			this.separa = separa;
		}
		public JSeparator getSepara() {
			return separa;
		}
}
