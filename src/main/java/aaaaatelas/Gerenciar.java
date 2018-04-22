package aaaaatelas;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gerenciar extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LConvenio;
	private JTextField TId, TConvenio;
	private JButton BTGravar, BTCancelar;
	private JTable table;
	
	
	
	
	
	public static void main(String[] args) {
		try {
			Gerenciar dialog = new Gerenciar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Gerenciar() {
		this.setBounds(100, 100, 542, 372);
		tela.setLayout(null);
		this.setUndecorated(true);
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 542, 372);
		tela.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(new Color(71,120,197)));
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel("");
		LFechar.setIcon(new ImageIcon(Gerenciar.class.getResource("/imagens/icons8-não-22.png")));
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap(518, Short.MAX_VALUE)
				.addComponent(LFechar))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addComponent(LFechar, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
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
		modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
				.addComponent(fim, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(excluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(incluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(modificar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(buscar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(codigo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(detalhes, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
				.addContainerGap(22, Short.MAX_VALUE))
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
					.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addComponent(detalhes, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(codigo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buscar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(modificar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(incluir, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(excluir, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(fim, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addComponent(scrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setSelectionForeground(Color.WHITE);
		table.setSelectionBackground(Color.BLUE);
	
		 table.setGridColor(new java.awt.Color(255, 255, 255));
	       table.setRowHeight(22);
		scrollPane.setColumnHeaderView(table);
		panel.setLayout(gl_panel);
		
		
	}
}
