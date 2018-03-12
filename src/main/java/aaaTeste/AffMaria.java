package aaaTeste;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.com.projeto.gsv.util.HibernateUtil;
import aaaTesteListener.AffMariaListener;
import aaaTesteListener.BarraDeStatusAffMaria;

public class AffMaria extends JFrame {
	private Container tela;
	private JPanel panel, painelEsquerdo, botaoFuncionario, botaoPaciente;
	private JPanel botaoProdutos, botaoRelPacientes, botaoRelItens;
	private JLabel LFuncionario,iconeFuncionario,LStatusUsuario,LStatusData,LStatusHora,iconePaciente;
	private JLabel LPaciente,iconeProduto, LProduto, iconeRelPaciente,LRelPaciente,iconeRelItens,LRelItens;
	private AffMariaListener listener;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AffMaria frame = new AffMaria();
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public AffMaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 590);
		
		PainelPrincipal();
		GruposPainelEsquerdo();
		GruposPainelStatus();
		BarraDeStatusAffMaria status = new BarraDeStatusAffMaria(this);
		listener = new AffMariaListener(this);
		HibernateUtil.getSessionFactory();
	}

	private void PainelPrincipal(){
		tela = new JPanel();
		setContentPane(tela);
		tela.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 900, 570);
		tela.add(panel);
		panel.setLayout(null);
	}
	
	
	private void GruposPainelEsquerdo(){
		painelEsquerdo = new JPanel();
		painelEsquerdo.setBounds(0, 122, 245, 416);
		painelEsquerdo.setBackground(new Color(71,120,197));
		
		botaoFuncionario = new JPanel();
		botaoFuncionario.setBackground(new Color(71,120,197));
		
		botaoPaciente = new JPanel();
		botaoPaciente.setBackground(new Color(71, 120, 197));
		
		iconePaciente = new JLabel("");
		iconePaciente.setIcon(new ImageIcon(AffMaria.class.getResource("/imagens/icons8-adicionar-usuário-masculino-25.png")));
		
		LPaciente = new JLabel("<html><u>Pacientes</u></html>");
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
		
		
		
		botaoProdutos = new JPanel();
		botaoProdutos.setBackground(new Color(71, 120, 197));
		
		iconeProduto = new JLabel("");
		iconeProduto.setIcon(new ImageIcon(AffMaria.class.getResource("/imagens/icons8-pílula-24.png")));
		
		LProduto = new JLabel("<html><u>Produtos</u></html>");
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
		
		
		
		botaoRelPacientes = new JPanel();
		botaoRelPacientes.setBackground(new Color(71, 120, 197));
		
		iconeRelPaciente = new JLabel("");
		iconeRelPaciente.setIcon(new ImageIcon(AffMaria.class.getResource("/imagens/icons8-empresa-cliente-24.png")));
		
		LRelPaciente = new JLabel("<html><u>Relatório de Pacientes</u></html>");
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
		
		
		
		botaoRelItens = new JPanel();
		botaoRelItens.setBackground(new Color(71, 120, 197));
		
		iconeRelItens = new JLabel("");
		iconeRelItens.setIcon(new ImageIcon(AffMaria.class.getResource("/imagens/icons8-boletim-24.png")));
		
		LRelItens = new JLabel("<html><u>Relatório de Itens</u></html>");
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
		
		
		
		LFuncionario = new JLabel("<html><u>Funcionário</u></html>");
		LFuncionario.setForeground(Color.WHITE);
		LFuncionario.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		
		iconeFuncionario = new JLabel("");
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
	}
	
	
	private void GruposPainelStatus(){
		Panel painelStatus = new Panel();
		painelStatus.setBackground(new Color(71,120,197));
		painelStatus.setBounds(0, 540, 890, 20);
		panel.add(painelStatus);
		
		LStatusUsuario = new JLabel();
		LStatusData = new JLabel();
		LStatusHora = new JLabel();
		
		
		
		GroupLayout gl_painelStatus = new GroupLayout(painelStatus);
		gl_painelStatus.setHorizontalGroup(
			gl_painelStatus.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelStatus.createSequentialGroup()
				.addContainerGap()
				.addComponent(LStatusUsuario, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
				.addGap(33)
				.addComponent(LStatusData, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
				.addComponent(LStatusHora, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelStatus.setVerticalGroup(
			gl_painelStatus.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelStatus.createSequentialGroup()
				.addGroup(gl_painelStatus.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelStatus.createParallelGroup(Alignment.BASELINE)
				.addComponent(LStatusData, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addComponent(LStatusUsuario, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
				.addComponent(LStatusHora, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addContainerGap())
		);
		painelStatus.setLayout(gl_painelStatus);
	}
	
	
	
	
	
	
	
	
	
	
	
	


	public JPanel getBotaoFuncionario() {
		return botaoFuncionario;
	}



	public void setBotaoFuncionario(JPanel botaoFuncionario) {
		this.botaoFuncionario = botaoFuncionario;
	}



	public JPanel getBotaoPaciente() {
		return botaoPaciente;
	}



	public void setBotaoPaciente(JPanel botaoPaciente) {
		this.botaoPaciente = botaoPaciente;
	}



	public JPanel getBotaoProdutos() {
		return botaoProdutos;
	}



	public void setBotaoProdutos(JPanel botaoProdutos) {
		this.botaoProdutos = botaoProdutos;
	}



	public JPanel getBotaoRelPacientes() {
		return botaoRelPacientes;
	}



	public void setBotaoRelPacientes(JPanel botaoRelPacientes) {
		this.botaoRelPacientes = botaoRelPacientes;
	}



	public JPanel getBotaoRelItens() {
		return botaoRelItens;
	}



	public void setBotaoRelItens(JPanel botaoRelItens) {
		this.botaoRelItens = botaoRelItens;
	}



	public JLabel getLStatusUsuario() {
		return LStatusUsuario;
	}



	public void setLStatusUsuario(JLabel lStatusUsuario) {
		LStatusUsuario = lStatusUsuario;
	}



	public JLabel getLStatusData() {
		return LStatusData;
	}



	public void setLStatusData(JLabel lStatusData) {
		LStatusData = lStatusData;
	}



	public JLabel getLStatusHora() {
		return LStatusHora;
	}



	public void setLStatusHora(JLabel lStatusHora) {
		LStatusHora = lStatusHora;
	}



	public Container getTela() {
		return tela;
	}



	public void setTela(Container tela) {
		this.tela = tela;
	}
	
	
}
