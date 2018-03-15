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
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Grafic extends JDialog {

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
		setBounds(100, 100, 376, 155);
		setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(71, 120, 197)));
		panel.setBackground(Color.WHITE);
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
		);
		
		
		JLabel excluir = new JLabel("Excluir: Jacaranda de Souza Gimenes");
		excluir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		
		JButton ok = new JButton();
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		ok.setText("Excluir");
		ok.setBounds(215, 381, 84, 23);
		ok.setBackground(new Color(71, 120, 197));
		ok.setFont(new Font("Segoe UI", 0, 14));
		ok.setForeground(new Color(255, 255, 255));
		
		JButton cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setBounds(215, 381, 84, 23);
		cancelar.setBackground(new Color(71, 120, 197));
		cancelar.setFont(new Font("Segoe UI", 0, 14));
		cancelar.setForeground(new Color(255, 255, 255));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(87)
							.addComponent(ok)
							.addGap(52)
							.addComponent(cancelar))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(38)
							.addComponent(excluir)))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(41, Short.MAX_VALUE)
					.addComponent(excluir)
					.addGap(37)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(cancelar)
						.addComponent(ok))
					.addGap(22))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
	}
}
