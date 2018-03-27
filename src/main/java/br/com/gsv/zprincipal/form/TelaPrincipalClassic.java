package br.com.gsv.zprincipal.form;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.gsv.zprincipal.listeners.BarraStatusListener;

public class TelaPrincipalClassic extends JFrame {

	private JPanel contentPane, panelPrincipal;
	private JMenuBar menuBar;
	private JMenu menuArquivo,menuAtendimento, menuCadastro, menuUsuario, menuFarmacia, menuRelatorio, menuSair;
	private JMenuItem arquivoAgCli, arquivoConAte, arquivoAcomodacoes, cadastroConvenio;
	private JMenuItem cadastroClinica, cadastroPaciente, relatorioFuncionario;
	private JMenuItem cadastroProntuario, usuarioFuncionario, usuarioConFun;
	private JMenuItem farmaciaFabricante, farmaciaGruProduto, relatorioClinica;
	private JMenuItem farmaciaProduto, farmaciaDevolucoes, relatorioItens, relatorioFornecedores;
	private JMenuItem relatorioGruItens, relatorioPaciente, atendimentoAnotacoes,atendimentoProntuario;
	private JLabel LStatusUsuario, LStatusData, LStatusHora;
	private JPanel panelStatus;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalClassic frame = new TelaPrincipalClassic();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public TelaPrincipalClassic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 590);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 884, 552);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		CriaComponentes();	
		BarraStatusListener teste = new BarraStatusListener(this);
	}
	
	
	
	private void CriaComponentes(){
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 884, 21);
		panelPrincipal.add(menuBar);
		
		menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		arquivoAgCli = new JMenuItem("Agenda Clínica");
		menuArquivo.add(arquivoAgCli);
		
		arquivoConAte = new JMenuItem("Consulta Atendimentos");
		menuArquivo.add(arquivoConAte);
		
		arquivoAcomodacoes = new JMenuItem("Acomodações");
		menuArquivo.add(arquivoAcomodacoes);
		
		menuAtendimento = new JMenu("Atendimento");
		menuBar.add(menuAtendimento);
		
		atendimentoAnotacoes = new JMenuItem("Incluir Anotações");
		menuAtendimento.add(atendimentoAnotacoes);
		
		atendimentoProntuario = new JMenuItem("Prontuários");
		menuAtendimento.add(atendimentoProntuario);
		
		menuCadastro = new JMenu("Cadastro");
		menuBar.add(menuCadastro);
		
		cadastroConvenio = new JMenuItem("Cadastro de Convênios");
		menuCadastro.add(cadastroConvenio);
		
		cadastroClinica = new JMenuItem("Cadastro de Clínicas");
		menuCadastro.add(cadastroClinica);
		
		cadastroPaciente = new JMenuItem("Cadastro de Pacientes");
		menuCadastro.add(cadastroPaciente);
		
		cadastroProntuario = new JMenuItem("Cadastro de Prontuários");
		menuCadastro.add(cadastroProntuario);
		
		menuUsuario = new JMenu("Usuário");
		menuBar.add(menuUsuario);
		
		usuarioFuncionario = new JMenuItem("Cadastro de Funcionários");
		menuUsuario.add(usuarioFuncionario);
		
		usuarioConFun = new JMenuItem("Consulta Funcionários");
		menuUsuario.add(usuarioConFun);
		
		menuFarmacia = new JMenu("Farmácia");
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
		menuBar.add(menuRelatorio);
		
		relatorioItens = new JMenuItem("Relatório de Itens");
		menuRelatorio.add(relatorioItens);
		
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
		
		menuSair = new JMenu("Sair");
		menuBar.add(menuSair);
		
		panelStatus = new JPanel();
		panelStatus.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelStatus.setBounds(0, 531, 884, 21);
		panelPrincipal.add(panelStatus);
		panelStatus.setLayout(null);
		
		LStatusUsuario = new JLabel("Usuário: ");
		LStatusUsuario.setBounds(10, 0, 282, 21);
		panelStatus.add(LStatusUsuario);
		
		LStatusData = new JLabel("Data: ");
		LStatusData.setBounds(336, 0, 214, 21);
		panelStatus.add(LStatusData);
		
		LStatusHora = new JLabel("Hora: ");
		LStatusHora.setBounds(581, 0, 239, 21);
		panelStatus.add(LStatusHora);
		
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
	
	
	
	
	
	
}








