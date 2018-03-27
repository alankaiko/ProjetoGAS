package aaaTeste;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javafx.scene.control.DatePicker;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.util.Calendar;

import javax.swing.JTable;

public class TesteCalendar extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public static void main(String[] args) {
		try {
			TesteCalendar dialog = new TesteCalendar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public TesteCalendar() {
		setBounds(100, 100, 725, 459);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 709, 421);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		DatePicker teste = new DatePicker();
		
	}
}
