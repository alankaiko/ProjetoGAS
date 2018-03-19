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
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class GraficoProduto extends JDialog {
	private JTextField tCodigo;
	private JTextField Tdesrcicao;
	private JTextField tquantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GraficoProduto dialog = new GraficoProduto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GraficoProduto() {
		setBounds(100, 100, 471, 312);
		setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
		);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(71,120,197));
		
		JLabel Lcodigo = new JLabel("Código");
		Lcodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		tCodigo = new JTextField();
		tCodigo.setBorder(new LineBorder(new Color(71,120,197)));
		tCodigo.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		tCodigo.setColumns(10);
		
		JLabel Ldescricao = new JLabel("Descrição");
		Ldescricao.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		Tdesrcicao = new JTextField();
		Tdesrcicao.setBorder(new LineBorder(new Color(71,120,197)));
		Tdesrcicao.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		Tdesrcicao.setColumns(10);
		
		JLabel lquantidade = new JLabel("Quantidade");
		lquantidade.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		tquantidade = new JTextField();
		tquantidade.setBorder(new LineBorder(new Color(71,120,197)));
		tquantidade.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		tquantidade.setColumns(10);
		
		JLabel lfabricante = new JLabel("Fabricante");
		lfabricante.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		JComboBox combofabricante = new JComboBox();
		combofabricante.setBackground(Color.WHITE);
		combofabricante.setForeground(Color.BLACK);
		
		JLabel ladicionar = new JLabel("Adicionar?");
		ladicionar.setForeground(Color.BLUE);
		ladicionar.setFont(new Font("SansSerif", Font.PLAIN, 10));
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(215, 381, 84, 23);
		btnGravar.setBackground(new Color(71, 120, 197));
		btnGravar.setFont(new Font("Segoe UI", 0, 14));
		btnGravar.setForeground(new Color(255, 255, 255));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(215, 381, 84, 23);
		btnCancelar.setBackground(new Color(71, 120, 197));
		btnCancelar.setFont(new Font("Segoe UI", 0, 14));
		btnCancelar.setForeground(new Color(255, 255, 255));
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(Tdesrcicao, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lquantidade)
								.addComponent(Ldescricao)
								.addComponent(Lcodigo)
								.addComponent(tquantidade, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addComponent(tCodigo, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lfabricante)
									.addContainerGap())
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(combofabricante, 0, 229, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(ladicionar)
										.addGap(65))
									.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
										.addGap(13)
										.addComponent(btnGravar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(btnCancelar)
										.addGap(151)))))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Lcodigo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Ldescricao)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Tdesrcicao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lquantidade)
						.addComponent(lfabricante))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tquantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(combofabricante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ladicionar))
					.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGravar)
						.addComponent(btnCancelar))
					.addContainerGap())
		);
		
		JLabel LabelTitulo = new JLabel("Inserir Produtos");
		LabelTitulo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		LabelTitulo.setForeground(Color.WHITE);
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(LabelTitulo)
					.addContainerGap(367, Short.MAX_VALUE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelTitulo.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(LabelTitulo))
		);
		painelTitulo.setLayout(gl_painelTitulo);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}
}
