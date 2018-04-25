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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class TelaBuscarProduto extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LConvenio;
	private JTextField TId, TConvenio;
	private JButton BTGravar, BTCancelar;
	private JTable table;
	private JTextField TBuscar;
	
	
	
	
	
	public static void main(String[] args) {
		try {
			TelaBuscarProduto dialog = new TelaBuscarProduto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public TelaBuscarProduto() {
		this.setBounds(100, 100, 545, 400);
		tela.setLayout(null);
		this.setUndecorated(true);
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 545, 400);
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
					.addContainerGap(482, Short.MAX_VALUE)
					.addComponent(LFechar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addComponent(LFechar, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
		);
		painelTitulo.setLayout(gl_painelTitulo);
		
		TBuscar = new JTextField();
		TBuscar.setColumns(10);
		TBuscar.setBorder(new LineBorder(new Color(71, 120, 197)));
		//textField.addFocusListener(field);
		TBuscar.setToolTipText("Ex: IPASGO / UNIMED");
		
		JButton buscar = new JButton("Buscar");
		buscar.setBounds(215, 381, 84, 23);
		buscar.setBackground(new Color(71, 120, 197));
		buscar.setFont(new Font("Segoe UI", 0, 14));
		buscar.setForeground(new Color(255, 255, 255));
		
		JButton ok = new JButton("OK");
		ok.setForeground(Color.WHITE);
		ok.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		ok.setBackground(new Color(71, 120, 197));
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setForeground(Color.WHITE);
		cancelar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		cancelar.setBackground(new Color(71, 120, 197));
		
		JLabel buscarUsuarioLabel = new JLabel("Escolha Uma Opção");
		buscarUsuarioLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JRadioButton buscaId = new JRadioButton("Código");
		buscaId.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		buscaId.setBackground(Color.WHITE);
		
		JRadioButton buscaDescricao = new JRadioButton("Descrição");
		buscaDescricao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		buscaDescricao.setBackground(Color.WHITE);
		
		JRadioButton buscaFabricante = new JRadioButton("Fabricante");
		buscaFabricante.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		buscaFabricante.setBackground(Color.WHITE);
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(170)
					.addComponent(ok, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(234, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(buscarUsuarioLabel, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
							.addComponent(buscaId, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buscaDescricao, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buscaFabricante, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(119)
							.addComponent(TBuscar, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buscar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(buscarUsuarioLabel)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(buscaFabricante, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addComponent(buscaDescricao)
							.addComponent(buscaId)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buscar, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(ok, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(7))
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
