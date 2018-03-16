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
import javax.swing.ImageIcon;

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
		
		JPanel painelDrag = new JPanel();
		painelDrag.setBackground(new Color(26,35,51));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap(74, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lid)
								.addComponent(lconvenio, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(tid, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addGap(36))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(tconvenio, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
									.addGap(14))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(155)
							.addComponent(cancelar)
							.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(28)
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))
					.addGap(26))
				.addComponent(painelDrag, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelDrag, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tid)
						.addComponent(lid))
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tconvenio)
						.addComponent(lconvenio))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(cancelar)
					.addGap(23))
		);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Grafic.class.getResource("/imagens/icons8-sair-13.png")));
		GroupLayout gl_painelDrag = new GroupLayout(painelDrag);
		gl_painelDrag.setHorizontalGroup(
			gl_painelDrag.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelDrag.createSequentialGroup()
					.addContainerGap(365, Short.MAX_VALUE)
					.addComponent(label)
					.addContainerGap())
		);
		gl_painelDrag.setVerticalGroup(
			gl_painelDrag.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_painelDrag.createSequentialGroup()
					.addComponent(label)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		painelDrag.setLayout(gl_painelDrag);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
	}
}
