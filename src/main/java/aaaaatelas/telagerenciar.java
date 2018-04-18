package aaaaatelas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class telagerenciar extends JDialog {
	private int xx,xy;

	public static void main(String[] args) {
		try {
			telagerenciar dialog = new telagerenciar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public telagerenciar() {
		this.setBounds(100, 100, 700, 480);
		getContentPane().setLayout(null);
		setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 700, 480);
		getContentPane().add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(new Color(71,120,197)));
		
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(20,34,56));
		
		JButton detalhes = new JButton("Detalhes");
		detalhes.setBounds(215, 381, 84, 23);
		detalhes.setBackground(new Color(71, 120, 197));
		detalhes.setFont(new Font("Segoe UI", 0, 14));
		detalhes.setForeground(new Color(255, 255, 255));
		
		JButton codigo = new JButton("Código");
		codigo.setBounds(215, 381, 84, 23);
		codigo.setBackground(new Color(71, 120, 197));
		codigo.setFont(new Font("Segoe UI", 0, 14));
		codigo.setForeground(new Color(255, 255, 255));
		
		JButton buscar = new JButton("Buscar");
		buscar.setBounds(215, 381, 84, 23);
		buscar.setBackground(new Color(71, 120, 197));
		buscar.setFont(new Font("Segoe UI", 0, 14));
		buscar.setForeground(new Color(255, 255, 255));
		
		JButton modificar = new JButton("Modificar");
		modificar.setBounds(215, 381, 84, 23);
		modificar.setBackground(new Color(71, 120, 197));
		modificar.setFont(new Font("Segoe UI", 0, 14));
		modificar.setForeground(new Color(255, 255, 255));
		
		JButton incluir = new JButton("Incluir");
		incluir.setBounds(215, 381, 84, 23);
		incluir.setBackground(new Color(71, 120, 197));
		incluir.setFont(new Font("Segoe UI", 0, 14));
		incluir.setForeground(new Color(255, 255, 255));
		
		JButton excluir = new JButton("Excluir");
		excluir.setBounds(215, 381, 84, 23);
		excluir.setBackground(new Color(71, 120, 197));
		excluir.setFont(new Font("Segoe UI", 0, 14));
		excluir.setForeground(new Color(255, 255, 255));
		
		
		JButton fim = new JButton("Fim");
		fim.setBounds(215, 381, 84, 23);
		fim.setBackground(new Color(71, 120, 197));
		fim.setFont(new Font("Segoe UI", 0, 14));
		fim.setForeground(new Color(255, 255, 255));
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 511, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(fim, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(excluir, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(incluir, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(modificar, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(buscar, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(codigo, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(detalhes, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(detalhes)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(codigo)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(buscar)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(modificar)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(incluir)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(excluir)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(fim))
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE))
				.addContainerGap())
		);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(telagerenciar.class.getResource("/imagens/icons8-não-22.png")));
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelTitulo.createSequentialGroup()
				.addContainerGap(642, Short.MAX_VALUE)
				.addComponent(label)
				.addContainerGap())
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addComponent(label)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		painelTitulo.setLayout(gl_painelTitulo);
		panel.setLayout(gl_panel);
		
	}
}
