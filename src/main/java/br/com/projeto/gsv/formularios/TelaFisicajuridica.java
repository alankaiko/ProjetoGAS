package br.com.projeto.gsv.formularios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaFisicajuridica extends JDialog {
	private final JPanel contentPanel = new JPanel();

	
	public static void main(String[] args) {
		try {
			TelaFisicajuridica dialog = new TelaFisicajuridica();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public TelaFisicajuridica() {
		
	}

}
