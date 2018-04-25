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

public class gerenciamenor extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LConvenio;
	private JTextField TId, TConvenio;
	private JButton BTGravar, BTCancelar;
	private JTable table;
	
	
	
	
	
	public static void main(String[] args) {
		try {
			gerenciamenor dialog = new gerenciamenor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public gerenciamenor() {
		this.setBounds(100, 100, 700, 480);
		tela.setLayout(null);
		this.setUndecorated(true);
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 700, 480);
		tela.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(new Color(71,120,197)));
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel("");
		LFechar.setIcon(new ImageIcon(gerenciamenor.class.getResource("/imagens/icons8-não-22.png")));
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 698, Short.MAX_VALUE)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addContainerGap(666, Short.MAX_VALUE)
					.addComponent(LFechar)
					.addContainerGap())
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGap(0, 24, Short.MAX_VALUE)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addComponent(LFechar)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		painelTitulo.setLayout(gl_painelTitulo);
		
		
		
		JButton detalhes = new JButton("Detalhes");
		detalhes.setForeground(Color.WHITE);
		detalhes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		detalhes.setBackground(new Color(71, 120, 197));
		
		JButton codigo = new JButton("Código");
		codigo.setForeground(Color.WHITE);
		codigo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		codigo.setBackground(new Color(71, 120, 197));
		
		JButton buscar = new JButton("Buscar");
		buscar.setForeground(Color.WHITE);
		buscar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		buscar.setBackground(new Color(71, 120, 197));
		
		JButton modificar = new JButton("Modificar");
		modificar.setForeground(Color.WHITE);
		modificar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		modificar.setBackground(new Color(71, 120, 197));
		
		JButton incluir = new JButton("Incluir");
		incluir.setForeground(Color.WHITE);
		incluir.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		incluir.setBackground(new Color(71, 120, 197));
		
		JButton excluir = new JButton("Excluir");
		excluir.setForeground(Color.WHITE);
		excluir.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		excluir.setBackground(new Color(71, 120, 197));
		
		JButton fim = new JButton("Fim");
		fim.setForeground(Color.WHITE);
		fim.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		fim.setBackground(new Color(71, 120, 197));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 511, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(detalhes, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(codigo, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(buscar, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(modificar, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(incluir, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(excluir, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(fim, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(detalhes, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(codigo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(buscar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(modificar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(incluir, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(excluir, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(fim, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		table = new JTable();
		table.setSelectionForeground(Color.WHITE);
		table.setSelectionBackground(new Color(84,101,127));
	
		table.setGridColor(new java.awt.Color(255, 255, 255));
	    table.setRowHeight(20);
		scrollPane.setColumnHeaderView(table);
		panel.setLayout(gl_panel);
		
		
	}
}
