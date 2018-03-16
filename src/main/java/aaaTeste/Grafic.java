package aaaTeste;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class Grafic extends JDialog {
	private JTextField TCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Grafic dialog = new Grafic();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Grafic() {
		setBounds(100, 100, 316, 171);
		setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
		);
		
		JLabel LCodigo = new JLabel("Buscar Código");
		LCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		
		TCodigo = new JTextField();
		TCodigo.setColumns(10);
		
		JButton ok = new JButton();
		ok.setText("Buscar");
		ok.setBounds(215, 381, 84, 23);
		ok.setBackground(new Color(71, 120, 197));
		ok.setFont(new Font("Segoe UI", 0, 14));
		ok.setForeground(new Color(255, 255, 255));
		
		JButton cancelar = new JButton("Voltar");
		cancelar.setText("Voltar");
		cancelar.setBounds(215, 381, 84, 23);
		cancelar.setBackground(new Color(71, 120, 197));
		cancelar.setFont(new Font("Segoe UI", 0, 14));
		cancelar.setForeground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 204));
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(73)
							.addComponent(ok)
							.addGap(18)
							.addComponent(cancelar))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(26)
							.addComponent(LCodigo, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(TCodigo, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(50, Short.MAX_VALUE))
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TCodigo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(LCodigo))
					.addGap(45)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(ok)
						.addComponent(cancelar))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
	}
}
