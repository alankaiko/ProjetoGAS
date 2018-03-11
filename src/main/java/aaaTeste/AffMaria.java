package aaaTeste;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.Panel;
import javax.swing.BoxLayout;
import java.awt.SystemColor;

public class AffMaria extends JFrame {
	private Container tela= getContentPane();


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AffMaria frame = new AffMaria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AffMaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 520);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		tela = new JPanel();
		setContentPane(tela);
		tela.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 461);
		tela.add(panel);
		panel.setLayout(null);
		
		
		JPanel painelEsquerdo = new JPanel();
		painelEsquerdo.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(191, 205, 219)));
		painelEsquerdo.setBounds(0, 38, 230, 400);
		painelEsquerdo.setBackground(new Color(71,120,197));
		
		JPanel botaoFuncionario = new JPanel();
		botaoFuncionario.setBorder(new LineBorder(new Color(0, 0, 0)));
		botaoFuncionario.setBackground(new Color(71,120,197));
		
		JPanel botaoPaciente = new JPanel();
		botaoPaciente.setBorder(new LineBorder(new Color(0, 0, 0)));
		botaoPaciente.setBackground(new Color(71, 120, 197));
		
		JLabel iconePaciente = new JLabel("");
		iconePaciente.setIcon(new ImageIcon(AffMaria.class.getResource("/imagens/icons8-adicionar-usuário-masculino-25.png")));
		
		JLabel LPaciente = new JLabel("<html><u>Pacientes</u></html>");
		LPaciente.setForeground(Color.WHITE);
		LPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		GroupLayout gl_botaoPaciente = new GroupLayout(botaoPaciente);
		gl_botaoPaciente.setHorizontalGroup(
			gl_botaoPaciente.createParallelGroup(Alignment.LEADING)
				.addGap(0, 231, Short.MAX_VALUE)
				.addGroup(gl_botaoPaciente.createSequentialGroup()
					.addGap(18)
					.addComponent(iconePaciente)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(LPaciente)
					.addContainerGap(86, Short.MAX_VALUE))
		);
		gl_botaoPaciente.setVerticalGroup(
			gl_botaoPaciente.createParallelGroup(Alignment.LEADING)
				.addGap(0, 37, Short.MAX_VALUE)
				.addGroup(gl_botaoPaciente.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_botaoPaciente.createParallelGroup(Alignment.LEADING)
						.addComponent(iconePaciente, Alignment.TRAILING)
						.addComponent(LPaciente, Alignment.TRAILING)))
		);
		botaoPaciente.setLayout(gl_botaoPaciente);
		
		JPanel botaoProdutos = new JPanel();
		botaoProdutos.setBorder(new LineBorder(new Color(0, 0, 0)));
		botaoProdutos.setBackground(new Color(71, 120, 197));
		
		JLabel iconeProduto = new JLabel("");
		iconeProduto.setIcon(new ImageIcon(AffMaria.class.getResource("/imagens/icons8-pílula-24.png")));
		
		JLabel LProduto = new JLabel("<html><u>Produtos</u></html>");
		LProduto.setForeground(Color.WHITE);
		LProduto.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		GroupLayout gl_botaoProdutos = new GroupLayout(botaoProdutos);
		gl_botaoProdutos.setHorizontalGroup(
			gl_botaoProdutos.createParallelGroup(Alignment.LEADING)
				.addGap(0, 231, Short.MAX_VALUE)
				.addGroup(gl_botaoProdutos.createSequentialGroup()
					.addGap(18)
					.addComponent(iconeProduto)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(LProduto)
					.addContainerGap(84, Short.MAX_VALUE))
		);
		gl_botaoProdutos.setVerticalGroup(
			gl_botaoProdutos.createParallelGroup(Alignment.LEADING)
				.addGap(0, 37, Short.MAX_VALUE)
				.addGroup(gl_botaoProdutos.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_botaoProdutos.createParallelGroup(Alignment.LEADING)
						.addComponent(iconeProduto, Alignment.TRAILING)
						.addComponent(LProduto, Alignment.TRAILING)))
		);
		botaoProdutos.setLayout(gl_botaoProdutos);
		
		JPanel botaoRelPacientes = new JPanel();
		botaoRelPacientes.setBorder(new LineBorder(new Color(0, 0, 0)));
		botaoRelPacientes.setBackground(new Color(71, 120, 197));
		
		JLabel iconeRelPaciente = new JLabel("");
		iconeRelPaciente.setIcon(new ImageIcon(AffMaria.class.getResource("/imagens/icons8-empresa-cliente-24.png")));
		
		JLabel LRelPaciente = new JLabel("<html><u>Relatório de Pacientes</u></html>");
		LRelPaciente.setForeground(Color.WHITE);
		LRelPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		GroupLayout gl_botaoRelPacientes = new GroupLayout(botaoRelPacientes);
		gl_botaoRelPacientes.setHorizontalGroup(
			gl_botaoRelPacientes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_botaoRelPacientes.createSequentialGroup()
					.addGap(18)
					.addComponent(iconeRelPaciente)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(LRelPaciente, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_botaoRelPacientes.setVerticalGroup(
			gl_botaoRelPacientes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_botaoRelPacientes.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_botaoRelPacientes.createParallelGroup(Alignment.LEADING)
						.addComponent(iconeRelPaciente, Alignment.TRAILING)
						.addComponent(LRelPaciente, Alignment.TRAILING)))
		);
		botaoRelPacientes.setLayout(gl_botaoRelPacientes);
		
		JPanel botaoRelItens = new JPanel();
		botaoRelItens.setBorder(new LineBorder(new Color(0, 0, 0)));
		botaoRelItens.setBackground(new Color(71, 120, 197));
		
		JLabel iconeRelItens = new JLabel("");
		iconeRelItens.setIcon(new ImageIcon(AffMaria.class.getResource("/imagens/icons8-boletim-24.png")));
		
		JLabel LRelItens = new JLabel("<html><u>Relatório de Itens</u></html>");
		LRelItens.setForeground(Color.WHITE);
		LRelItens.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		GroupLayout gl_botaoRelItens = new GroupLayout(botaoRelItens);
		gl_botaoRelItens.setHorizontalGroup(
			gl_botaoRelItens.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_botaoRelItens.createSequentialGroup()
					.addGap(18)
					.addComponent(iconeRelItens)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(LRelItens, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_botaoRelItens.setVerticalGroup(
			gl_botaoRelItens.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_botaoRelItens.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_botaoRelItens.createParallelGroup(Alignment.LEADING)
						.addComponent(iconeRelItens, Alignment.TRAILING)
						.addComponent(LRelItens, Alignment.TRAILING)))
		);
		botaoRelItens.setLayout(gl_botaoRelItens);
		GroupLayout gl_painelEsquerdo = new GroupLayout(painelEsquerdo);
		gl_painelEsquerdo.setHorizontalGroup(
			gl_painelEsquerdo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelEsquerdo.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addGroup(gl_painelEsquerdo.createParallelGroup(Alignment.LEADING)
						.addComponent(botaoPaciente, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoFuncionario, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoProdutos, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoRelPacientes, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoRelItens, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)))
		);
		gl_painelEsquerdo.setVerticalGroup(
			gl_painelEsquerdo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelEsquerdo.createSequentialGroup()
					.addGap(50)
					.addComponent(botaoPaciente, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botaoFuncionario, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botaoProdutos, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botaoRelPacientes, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botaoRelItens, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(94, Short.MAX_VALUE))
		);
		
		JLabel LFuncionario = new JLabel("<html><u>Funcionário</u></html>");
		LFuncionario.setForeground(Color.WHITE);
		LFuncionario.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		
		JLabel iconeFuncionario = new JLabel("");
		iconeFuncionario.setIcon(new ImageIcon(AffMaria.class.getResource("/imagens/icons8-crachá-25.png")));
		GroupLayout gl_botaoFuncionario = new GroupLayout(botaoFuncionario);
		gl_botaoFuncionario.setHorizontalGroup(
			gl_botaoFuncionario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_botaoFuncionario.createSequentialGroup()
					.addGap(18)
					.addComponent(iconeFuncionario)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(LFuncionario)
					.addContainerGap(86, Short.MAX_VALUE))
		);
		gl_botaoFuncionario.setVerticalGroup(
			gl_botaoFuncionario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_botaoFuncionario.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_botaoFuncionario.createParallelGroup(Alignment.LEADING)
						.addComponent(iconeFuncionario, Alignment.TRAILING)
						.addComponent(LFuncionario, Alignment.TRAILING)))
		);
		botaoFuncionario.setLayout(gl_botaoFuncionario);
		painelEsquerdo.setLayout(gl_painelEsquerdo);
		panel.add(painelEsquerdo);
		
		Panel painelStatus = new Panel();
		painelStatus.setBackground(new Color(71,120,197));
		painelStatus.setBounds(0, 440, 784, 20);
		panel.add(painelStatus);
		painelStatus.setLayout(new BoxLayout(painelStatus, BoxLayout.X_AXIS));
	}
}
