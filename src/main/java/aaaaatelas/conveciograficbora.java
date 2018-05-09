package aaaaatelas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;

public class conveciograficbora extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	
	
	
	
	
	public static void main(String[] args) {
		try {
			conveciograficbora dialog = new conveciograficbora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public conveciograficbora() {
		this.setBounds(100, 100, 400, 215);
		tela.setLayout(null);
		this.setUndecorated(true);
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 400, 215);
		tela.add(panel);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel("");
		LFechar.setIcon(new ImageIcon(conveciograficbora.class.getResource("/imagens/icons8-não-22.png")));
		
		JLabel Titulo = new JLabel("Detalhes Convênio");
		Titulo.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		Titulo.setForeground(Color.WHITE);
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
					.addComponent(LFechar)
					.addContainerGap())
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addGroup(gl_painelTitulo.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(Titulo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(LFechar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		painelTitulo.setLayout(gl_painelTitulo);
		
		JButton cancelar = new JButton("Voltar");
		cancelar.setForeground(Color.WHITE);
		cancelar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		cancelar.setBackground(new Color(71, 120, 197));
		
		JSeparator separator = new JSeparator();
		
		JLabel LCodigo = new JLabel("Código");
		LCodigo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JLabel TCodigo = new JLabel("New label");
		TCodigo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel LConvenio = new JLabel("Convênio");
		LConvenio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JLabel TConvenio = new JLabel("New label");
		TConvenio.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(138)
					.addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LConvenio, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(TConvenio, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LCodigo, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(TCodigo, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
					.addGap(137))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LCodigo)
						.addComponent(TCodigo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LConvenio, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(TConvenio, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		
	}
}
