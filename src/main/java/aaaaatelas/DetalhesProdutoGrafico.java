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
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class DetalhesProdutoGrafico extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();

	
	public static void main(String[] args) {
		try {
			DetalhesProdutoGrafico dialog = new DetalhesProdutoGrafico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public DetalhesProdutoGrafico() {
		this.setBounds(100, 100, 400, 300);
		tela.setLayout(null);
		this.setUndecorated(true);
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 400, 300);
		tela.add(panel);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel("");
		LFechar.setIcon(new ImageIcon(DetalhesProdutoGrafico.class.getResource("/imagens/icons8-não-22.png")));
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
		
		JLabel LAdicionar = new JLabel("Detalhes Produtos");
		LAdicionar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel LCodigo = new JLabel("Código");
		LCodigo.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));;
		
		JLabel LDescricao = new JLabel("Descrição");
		LDescricao.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JButton BCancelar = new JButton("Cancelar");
		BCancelar.setForeground(Color.WHITE);
		BCancelar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		BCancelar.setBackground(new Color(71, 120, 197));
		
		JLabel TCodigo = new JLabel("New label");
		TCodigo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel TDescricao = new JLabel("New label");
		TDescricao.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TQuantidae = new JLabel("New label");
		TQuantidae.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel LFabricante = new JLabel("Fabricante");
		LFabricante.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TFabricante = new JLabel("New label");
		TFabricante.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JSeparator separa = new JSeparator();
		separa.setBackground(new Color(71, 120, 197));
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LAdicionar, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(266, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(separa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(LFabricante, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
								.addComponent(lblQuantidade, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
								.addComponent(LDescricao, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
								.addComponent(LCodigo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(TQuantidae, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
								.addComponent(TDescricao, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
								.addComponent(TCodigo, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
								.addComponent(TFabricante, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))))
					.addGap(40))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(151)
					.addComponent(BCancelar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(168, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(LAdicionar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LCodigo)
						.addComponent(TCodigo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LDescricao)
						.addComponent(TDescricao))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantidade)
						.addComponent(TQuantidae))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LFabricante)
						.addComponent(TFabricante))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separa, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
					.addComponent(BCancelar)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
	}
}
