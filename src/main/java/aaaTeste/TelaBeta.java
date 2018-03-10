package aaaTeste;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class TelaBeta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBeta frame = new TelaBeta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public TelaBeta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setLocationByPlatform(true);
        //setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(26,35,51));
		panel.setBounds(0, 0, 121, 452);
		contentPane.add(panel);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(41,57,80));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_7, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(100)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(295, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(71,120,197));
		panel_1.setBounds(122, 0, 802, 48);
		contentPane.add(panel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(123, 156, 225));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBorder(null);
		textField.setCaretColor(new Color(255, 255, 255));
		textField.setPreferredSize(new Dimension(2, 20));
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Search_18px.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(552, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_7)
					.addGap(71))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_7)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(71,120,197));
		panel_2.setBounds(122, 48, 281, 404);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(120,168,252));
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(SystemColor.text);
		panel_4.setBackground(new Color(84,127,206));
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Exit_25px.png")));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addContainerGap(213, Short.MAX_VALUE)
					.addComponent(label_5)
					.addGap(22))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(27)
					.addComponent(label_5)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Secured_Letter_25px_2.png")));
		
		JSeparator separator = new JSeparator();
		
		JLabel label_1 = new JLabel("");
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Contacts_25px.png")));
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Calendar_25px.png")));
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Lock_25px.png")));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(9)
							.addComponent(label)
							.addGap(28)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(56, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel label_6 = new JLabel("04");
		label_6.setForeground(SystemColor.text);
		label_6.setFont(new Font("Segoe UI", Font.PLAIN, 52));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(107)
					.addComponent(label_6))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(label_6))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255,255,255));
		panel_5.setBounds(400, 48, 524, 404);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(47)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(253, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		Button btnBook = new Button("Book");
		btnBook.setBounds(215, 381, 84, 23);
		btnBook.setBackground(new Color(71, 120, 197));
		btnBook.setFont(new Font("Segoe UI", 0, 14));
		btnBook.setForeground(new Color(255, 255, 255));
		contentPane.add(btnBook);
	}
}
