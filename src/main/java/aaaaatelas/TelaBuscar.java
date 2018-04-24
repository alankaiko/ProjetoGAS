package aaaaatelas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JRadioButton;

public class TelaBuscar extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LConvenio;
	private JTextField TId, TConvenio;
	private JButton BTGravar, BTCancelar;
	private JTable table;
	private JTextField TBuscar;
	
	
	
	
	
	public static void main(String[] args) {
		try {
			TelaBuscar dialog = new TelaBuscar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public TelaBuscar() {
		this.setBounds(100, 100, 514, 344);
		tela.setLayout(null);
		this.setUndecorated(true);
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 514, 344);
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
		
		JLabel buscarUsuario = new JLabel("Escolha Uma Opção");
		buscarUsuario.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JRadioButton buscaId = new JRadioButton("Código");
		buscaId.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		buscaId.setBackground(Color.WHITE);
		
		JRadioButton buscaNome = new JRadioButton("Convênio");
		buscaNome.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		buscaNome.setBackground(Color.WHITE);
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(buscarUsuario, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(buscaId, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(buscaNome, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(TBuscar, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
				.addComponent(buscar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(150)
				.addComponent(ok, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(162, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
				.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buscarUsuario)
					.addGap(4)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(buscaId)
						.addComponent(buscaNome))
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(buscar, 0, 0, Short.MAX_VALUE)
						.addComponent(TBuscar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(ok, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(8))
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
