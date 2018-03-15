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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JSeparator;
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
		setBounds(100, 100, 401, 215);
		setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(71, 120, 197)));
		panel.setBackground(Color.WHITE);
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
		);
		
		JLabel lid = new JLabel("Código: ");
		lid.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		
		JLabel lconvenio = new JLabel("Convênio: ");
		lconvenio.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		
		JLabel tid = new JLabel("1");
		tid.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		
		JLabel tconvenio = new JLabel("jurema convenios");
		tconvenio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		
		JButton cancelar = new JButton();
		cancelar.setText("Voltar");
		cancelar.setBounds(215, 381, 84, 23);
		cancelar.setBackground(new Color(71, 120, 197));
		cancelar.setFont(new Font("Segoe UI", 0, 14));
		cancelar.setForeground(new Color(255, 255, 255));
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(71, 120, 197));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap(103, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lid)
								.addComponent(lconvenio, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(46)
									.addComponent(tid, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addGap(36))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
									.addComponent(tconvenio, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
									.addGap(14))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(155)
							.addComponent(cancelar)
							.addPreferredGap(ComponentPlacement.RELATED, 159, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(28)
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)))
					.addGap(26))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(61)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tid)
						.addComponent(lid))
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tconvenio)
						.addComponent(lconvenio))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
					.addComponent(cancelar)
					.addGap(23))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
	}
}
