package br.tela.principal.form;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.domain.Usuario;
import br.tela.principal.listeners.BarraDeStatusGrafic;
import br.tela.principal.listeners.TelaPrincipalGraficListener;

public class TelaPrincipalGrafic extends JFrame {
	private Container tela;
	private JPanel panel, painelEsquerdo, botaoFuncionario, botaoPaciente;
	private JPanel botaoProdutos, botaoRelPacientes, botaoRelItens;
	private JLabel LFuncionario,iconeFuncionario,LStatusUsuario,LStatusData,LStatusHora,iconePaciente;
	private JLabel LPaciente,iconeProduto, LProduto, iconeRelPaciente,LRelPaciente,iconeRelItens,LRelItens;
	private TelaPrincipalGraficListener listener;
	private Usuario usuario;
	private BarraDeStatusGrafic status;
	private JMenuBar menuBar;
	private JMenu menuArquivo,menuAtendimento, menuCadastro, menuUsuario, menuFarmacia, menuRelatorio, menuSair;
	private JMenuItem arquivoAgCli, arquivoConAte, arquivoAcomodacoes, cadastroConvenio;
	private JMenuItem cadastroClinica, cadastroPaciente, relatorioFuncionario;
	private JMenuItem usuarioFuncionario, usuarioConFun,usuarioUser,relatorioConvenio,relatorioProntuario;
	private JMenuItem farmaciaFabricante, farmaciaGruProduto, relatorioClinica;
	private JMenuItem farmaciaProduto, farmaciaDevolucoes, relatorioItens, relatorioFornecedores;
	private JMenuItem relatorioGruItens, relatorioPaciente, atendimentoProntuario,atendimentoAnotacoes;
	private JPanel botaoProntuario;
	private JLabel iconProntuario, LProntuarios;
	private int xx,xy;
	
	
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalGrafic frame = new TelaPrincipalGrafic();
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	
	
	public TelaPrincipalGrafic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 590);
		
		PainelPrincipal();
		GruposPainelEsquerdo();
		GruposPainelStatus();
	}

	private void PainelPrincipal(){
		tela = new JPanel();
		setContentPane(tela);
		tela.setLayout(null);
		setUndecorated(true);
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 900, 590);
		tela.add(panel);
	}
	
	
	public void IniciaComponentesSecundarios(){
		status = new BarraDeStatusGrafic(this);
		listener = new TelaPrincipalGraficListener(this);
	}
	
	
	private void GruposPainelEsquerdo(){
		painelEsquerdo = new JPanel();
		painelEsquerdo.setBounds(1, 106, 245, 462);
		painelEsquerdo.setBackground(new Color(71,120,197));
		
		botaoFuncionario = new JPanel();
		botaoFuncionario.setBackground(new Color(71,120,197));
		
		botaoPaciente = new JPanel();
		botaoPaciente.setBackground(new Color(71, 120, 197));
		
		iconePaciente = new JLabel("");
		iconePaciente.setIcon(new ImageIcon(TelaPrincipalGrafic.class.getResource("/imagens/icons8-adicionar-usuário-masculino-25.png")));
		
		LPaciente = new JLabel("Pacientes");
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
		iconeProduto.setIcon(new ImageIcon(TelaPrincipalGrafic.class.getResource("/imagens/icons8-pílula-24.png")));
		
		LProduto = new JLabel("Produtos");
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
		iconeRelPaciente.setIcon(new ImageIcon(TelaPrincipalGrafic.class.getResource("/imagens/icons8-empresa-cliente-24.png")));
		
		LRelPaciente = new JLabel("Relatório de Pacientes");
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
		iconeRelItens.setIcon(new ImageIcon(TelaPrincipalGrafic.class.getResource("/imagens/icons8-boletim-24.png")));
		
		LRelItens = new JLabel("Relatório de Itens");
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
		
		JLabel lblMenuRpido = new JLabel("MENU RÁPIDO");
		lblMenuRpido.setFont(new Font("Segoe UI Light", Font.PLAIN, 28));
		lblMenuRpido.setForeground(SystemColor.textHighlightText);
		
		JSeparator separator = new JSeparator();
		
		botaoProntuario = new JPanel();
		botaoProntuario.setBackground(new Color(71, 120, 197));
		
		iconProntuario = new JLabel("");
		iconProntuario.setIcon(new ImageIcon(TelaPrincipalGrafic.class.getResource("/imagens/icons8-modo-de-leitura-do-chrome-25.png")));
		
		LProntuarios = new JLabel("Prontuários");
		LProntuarios.setForeground(Color.WHITE);
		LProntuarios.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		GroupLayout gl_botaoProntuario = new GroupLayout(botaoProntuario);
		gl_botaoProntuario.setHorizontalGroup(
			gl_botaoProntuario.createParallelGroup(Alignment.LEADING)
				.addGap(0, 231, Short.MAX_VALUE)
				.addGroup(gl_botaoProntuario.createSequentialGroup()
				.addGap(18)
				.addComponent(iconProntuario)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(LProntuarios)
				.addContainerGap(105, Short.MAX_VALUE))
		);
		gl_botaoProntuario.setVerticalGroup(
			gl_botaoProntuario.createParallelGroup(Alignment.LEADING)
				.addGap(0, 37, Short.MAX_VALUE)
				.addGroup(gl_botaoProntuario.createSequentialGroup()
				.addContainerGap(12, Short.MAX_VALUE)
				.addGroup(gl_botaoProntuario.createParallelGroup(Alignment.LEADING)
				.addComponent(iconProntuario, Alignment.TRAILING)
				.addComponent(LProntuarios, Alignment.TRAILING)))
		);
		botaoProntuario.setLayout(gl_botaoProntuario);
		
		
		
		GroupLayout gl_painelEsquerdo = new GroupLayout(painelEsquerdo);
		gl_painelEsquerdo.setHorizontalGroup(
			gl_painelEsquerdo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelEsquerdo.createSequentialGroup()
				.addGap(35)
				.addComponent(lblMenuRpido)
				.addContainerGap(32, Short.MAX_VALUE))
				.addGroup(gl_painelEsquerdo.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
				.addGap(148))
				.addGroup(gl_painelEsquerdo.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_painelEsquerdo.createParallelGroup(Alignment.LEADING)
				.addComponent(botaoPaciente, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
				.addComponent(botaoFuncionario, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
				.addComponent(botaoProdutos, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
				.addComponent(botaoRelPacientes, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
				.addComponent(botaoRelItens, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(132, Short.MAX_VALUE))
				.addGroup(gl_painelEsquerdo.createSequentialGroup()
				.addContainerGap()
				.addComponent(botaoProntuario, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_painelEsquerdo.setVerticalGroup(
			gl_painelEsquerdo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelEsquerdo.createSequentialGroup()
				.addGap(23)
				.addComponent(lblMenuRpido)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(botaoProntuario, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addGap(12)
				.addComponent(botaoPaciente, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(botaoFuncionario, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(botaoProdutos, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(botaoRelPacientes, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(botaoRelItens, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(119, Short.MAX_VALUE))
		);
		
		
		
		LFuncionario = new JLabel("Funcionário");
		LFuncionario.setForeground(Color.WHITE);
		LFuncionario.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		
		iconeFuncionario = new JLabel("");
		iconeFuncionario.setIcon(new ImageIcon(TelaPrincipalGrafic.class.getResource("/imagens/icons8-crachá-25.png")));
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
	}
	
	
	private void GruposPainelStatus(){
		Panel painelStatus = new Panel();
		painelStatus.setBounds(1, 570, 900, 20);
		painelStatus.setBackground(new Color(71,120,197));
		
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
				.addComponent(LStatusData, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
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
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 900, 26);
		menuBar.setBorder(null);
		menuBar.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		menuBar.setBackground(new Color(26,35,51));
		
		menuArquivo = new JMenu("Arquivo");
		menuArquivo.setForeground(SystemColor.textHighlightText);
		menuArquivo.setBackground(new Color(26,35,51));
		menuArquivo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(menuArquivo);
		
		arquivoAgCli = new JMenuItem("Agenda Clínica");
		menuArquivo.add(arquivoAgCli);
		
		arquivoConAte = new JMenuItem("Consulta Atendimentos");
		menuArquivo.add(arquivoConAte);
		
		arquivoAcomodacoes = new JMenuItem("Acomodações");
		menuArquivo.add(arquivoAcomodacoes);
		
		menuAtendimento = new JMenu("Atendimento");
		menuAtendimento.setForeground(SystemColor.textHighlightText);
		menuAtendimento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(menuAtendimento);
		
		atendimentoProntuario = new JMenuItem("Gerenciar Prontuários");
		menuAtendimento.add(atendimentoProntuario);
		
		atendimentoAnotacoes = new JMenuItem("Agendar anotações");
		menuAtendimento.add(atendimentoAnotacoes);
		
		menuCadastro = new JMenu("Cadastro");
		menuCadastro.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuCadastro.setForeground(SystemColor.textHighlightText);
		menuCadastro.setBackground(new Color(26,35,51));
		menuBar.add(menuCadastro);
		
		cadastroConvenio = new JMenuItem("Gerenciar Convênio");
		menuCadastro.add(cadastroConvenio);
		
		cadastroClinica = new JMenuItem("Gerenciar Clinicas");
		menuCadastro.add(cadastroClinica);
		
		cadastroPaciente = new JMenuItem("Gerenciar Pacientes");
		menuCadastro.add(cadastroPaciente);
		
		menuUsuario = new JMenu("Usuário");
		menuUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuUsuario.setForeground(SystemColor.textHighlightText);
		menuUsuario.setBackground(new Color(26,35,51));
		menuBar.add(menuUsuario);
		
		usuarioFuncionario = new JMenuItem("Cadastro de Funcionários");
		menuUsuario.add(usuarioFuncionario);
		
		usuarioConFun = new JMenuItem("Gerenciar Funcionários");
		menuUsuario.add(usuarioConFun);
		
		usuarioUser = new JMenuItem("Gerenciar Usuários");
		menuUsuario.add(usuarioUser);
		
		menuFarmacia = new JMenu("Farmácia");
		menuFarmacia.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuFarmacia.setForeground(SystemColor.textHighlightText);
		menuFarmacia.setBackground(new Color(26,35,51));
		menuBar.add(menuFarmacia);
		
		farmaciaFabricante = new JMenuItem("Cadastro de Fabricantes");
		menuFarmacia.add(farmaciaFabricante);
		
		farmaciaGruProduto = new JMenuItem("Grupo de Produtos");
		menuFarmacia.add(farmaciaGruProduto);
		
		farmaciaProduto = new JMenuItem("Cadastro de Produto");
		menuFarmacia.add(farmaciaProduto);
		
		farmaciaDevolucoes = new JMenuItem("Motivos de Devoluções");
		menuFarmacia.add(farmaciaDevolucoes);
		
		menuRelatorio = new JMenu("Relatórios");
		menuRelatorio.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuRelatorio.setForeground(SystemColor.textHighlightText);
		menuRelatorio.setBackground(new Color(26,35,51));
		menuBar.add(menuRelatorio);
		
		relatorioItens = new JMenuItem("Relatório de Itens");
		menuRelatorio.add(relatorioItens);
		
		relatorioConvenio = new JMenuItem("Relatório de Convênios");
		menuRelatorio.add(relatorioConvenio);
		
		relatorioFornecedores = new JMenuItem("Relatório de Fornecedores");
		menuRelatorio.add(relatorioFornecedores);
		
		relatorioGruItens = new JMenuItem("Relatório de Grupo de Itens");
		menuRelatorio.add(relatorioGruItens);
		
		relatorioPaciente = new JMenuItem("Relatório de Pacientes");
		menuRelatorio.add(relatorioPaciente);
		
		relatorioFuncionario = new JMenuItem("Relatório de Funcionários");
		menuRelatorio.add(relatorioFuncionario);
		
		relatorioClinica = new JMenuItem("Relatório de Clínicas");
		menuRelatorio.add(relatorioClinica);
		
		relatorioProntuario = new JMenuItem("Relatório de Prontuários");
		menuRelatorio.add(relatorioProntuario);
		
		menuSair = new JMenu("Sair");
		menuSair.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuSair.setForeground(SystemColor.textHighlightText);
		menuSair.setBackground(new Color(26,35,51));
		menuBar.add(menuSair);
		menuSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		panel.setLayout(null);
		panel.add(painelEsquerdo);
		panel.add(painelStatus);
		panel.add(menuBar);
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



	public JMenuItem getArquivoAgCli() {
		return arquivoAgCli;
	}



	public void setArquivoAgCli(JMenuItem arquivoAgCli) {
		this.arquivoAgCli = arquivoAgCli;
	}



	public JMenuItem getArquivoConAte() {
		return arquivoConAte;
	}



	public void setArquivoConAte(JMenuItem arquivoConAte) {
		this.arquivoConAte = arquivoConAte;
	}



	public JMenuItem getArquivoAcomodacoes() {
		return arquivoAcomodacoes;
	}



	public void setArquivoAcomodacoes(JMenuItem arquivoAcomodacoes) {
		this.arquivoAcomodacoes = arquivoAcomodacoes;
	}



	public JMenuItem getCadastroConvenio() {
		return cadastroConvenio;
	}



	public void setCadastroConvenio(JMenuItem cadastroConvenio) {
		this.cadastroConvenio = cadastroConvenio;
	}



	public JMenuItem getCadastroClinica() {
		return cadastroClinica;
	}



	public void setCadastroClinica(JMenuItem cadastroClinica) {
		this.cadastroClinica = cadastroClinica;
	}



	public JMenuItem getCadastroPaciente() {
		return cadastroPaciente;
	}



	public void setCadastroPaciente(JMenuItem cadastroPaciente) {
		this.cadastroPaciente = cadastroPaciente;
	}



	public JMenuItem getRelatorioFuncionario() {
		return relatorioFuncionario;
	}



	public void setRelatorioFuncionario(JMenuItem relatorioFuncionario) {
		this.relatorioFuncionario = relatorioFuncionario;
	}





	public JMenuItem getUsuarioFuncionario() {
		return usuarioFuncionario;
	}



	public void setUsuarioFuncionario(JMenuItem usuarioFuncionario) {
		this.usuarioFuncionario = usuarioFuncionario;
	}



	public JMenuItem getUsuarioConFun() {
		return usuarioConFun;
	}



	public void setUsuarioConFun(JMenuItem usuarioConFun) {
		this.usuarioConFun = usuarioConFun;
	}



	public JMenuItem getFarmaciaFabricante() {
		return farmaciaFabricante;
	}



	public void setFarmaciaFabricante(JMenuItem farmaciaFabricante) {
		this.farmaciaFabricante = farmaciaFabricante;
	}



	public JMenuItem getFarmaciaGruProduto() {
		return farmaciaGruProduto;
	}



	public void setFarmaciaGruProduto(JMenuItem farmaciaGruProduto) {
		this.farmaciaGruProduto = farmaciaGruProduto;
	}



	public JMenuItem getRelatorioClinica() {
		return relatorioClinica;
	}



	public void setRelatorioClinica(JMenuItem relatorioClinica) {
		this.relatorioClinica = relatorioClinica;
	}



	public JMenuItem getFarmaciaProduto() {
		return farmaciaProduto;
	}



	public void setFarmaciaProduto(JMenuItem farmaciaProduto) {
		this.farmaciaProduto = farmaciaProduto;
	}



	public JMenuItem getFarmaciaDevolucoes() {
		return farmaciaDevolucoes;
	}



	public void setFarmaciaDevolucoes(JMenuItem farmaciaDevolucoes) {
		this.farmaciaDevolucoes = farmaciaDevolucoes;
	}



	public JMenuItem getRelatorioItens() {
		return relatorioItens;
	}



	public void setRelatorioItens(JMenuItem relatorioItens) {
		this.relatorioItens = relatorioItens;
	}



	public JMenuItem getRelatorioFornecedores() {
		return relatorioFornecedores;
	}



	public void setRelatorioFornecedores(JMenuItem relatorioFornecedores) {
		this.relatorioFornecedores = relatorioFornecedores;
	}



	public JMenuItem getRelatorioGruItens() {
		return relatorioGruItens;
	}



	public void setRelatorioGruItens(JMenuItem relatorioGruItens) {
		this.relatorioGruItens = relatorioGruItens;
	}



	public JMenuItem getRelatorioPaciente() {
		return relatorioPaciente;
	}



	public void setRelatorioPaciente(JMenuItem relatorioPaciente) {
		this.relatorioPaciente = relatorioPaciente;
	}



	public JPanel getBotaoProntuario() {
		return botaoProntuario;
	}



	public void setBotaoProntuario(JPanel botaoProntuario) {
		this.botaoProntuario = botaoProntuario;
	}



	public JMenuItem getAtendimentoAnotacoes() {
		return atendimentoProntuario;
	}



	public void setAtendimentoAnotacoes(JMenuItem atendimentoAnotacoes) {
		this.atendimentoProntuario = atendimentoAnotacoes;
	}



	public JMenuItem getAtendimentoProntuario() {
		return atendimentoAnotacoes;
	}



	public JMenuItem getUsuarioUser() {
		return usuarioUser;
	}

	public void setUsuarioUser(JMenuItem usuarioUser) {
		this.usuarioUser = usuarioUser;
	}

	public JMenuItem getRelatorioConvenio() {
		return relatorioConvenio;
	}

	public void setRelatorioConvenio(JMenuItem relatorioConvenio) {
		this.relatorioConvenio = relatorioConvenio;
	}

	public JMenuItem getRelatorioProntuario() {
		return relatorioProntuario;
	}

	public void setRelatorioProntuario(JMenuItem relatorioProntuario) {
		this.relatorioProntuario = relatorioProntuario;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void setAtendimentoProntuario(JMenuItem atendimentoProntuario) {
		this.atendimentoAnotacoes = atendimentoProntuario;
	}

	public int getXx() {
		return xx;
	}

	public void setXx(int xx) {
		this.xx = xx;
	}

	public int getXy() {
		return xy;
	}

	public void setXy(int xy) {
		this.xy = xy;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenu getMenuArquivo() {
		return menuArquivo;
	}

	public void setMenuArquivo(JMenu menuArquivo) {
		this.menuArquivo = menuArquivo;
	}

	public JMenu getMenuAtendimento() {
		return menuAtendimento;
	}

	public void setMenuAtendimento(JMenu menuAtendimento) {
		this.menuAtendimento = menuAtendimento;
	}

	public JMenu getMenuCadastro() {
		return menuCadastro;
	}

	public void setMenuCadastro(JMenu menuCadastro) {
		this.menuCadastro = menuCadastro;
	}

	public JMenu getMenuFarmacia() {
		return menuFarmacia;
	}

	public void setMenuFarmacia(JMenu menuFarmacia) {
		this.menuFarmacia = menuFarmacia;
	}

	public JMenu getMenuRelatorio() {
		return menuRelatorio;
	}

	public void setMenuRelatorio(JMenu menuRelatorio) {
		this.menuRelatorio = menuRelatorio;
	}

	public JMenu getMenuSair() {
		return menuSair;
	}

	public void setMenuSair(JMenu menuSair) {
		this.menuSair = menuSair;
	}

	public JMenu getMenuUsuario() {
		return menuUsuario;
	}

	public void setMenuUsuario(JMenu menuUsuario) {
		this.menuUsuario = menuUsuario;
	}
	
	
}