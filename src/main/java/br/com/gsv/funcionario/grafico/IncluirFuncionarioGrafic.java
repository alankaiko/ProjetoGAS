package br.com.gsv.funcionario.grafico;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.funcionario.formularios.IncluirFuncionariosForm;

public class IncluirFuncionarioGrafic {
	private IncluirFuncionariosForm formulario;
	
	public IncluirFuncionarioGrafic(IncluirFuncionariosForm formulario) {
		this.formulario = formulario;
		CriarTelaGeral();
		DadosFuncionario();
	}
	
	
	private void CriarTelaGeral(){
		this.formulario.setBounds(100, 100, 680, 590);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.setModal(true);
	}
		
		
	private void DadosFuncionario(){
		GroupLayout groupLayout = new GroupLayout(this.formulario.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
		);
		
		JPanel panelLabel = new JPanel();
		panelLabel.setBackground(new Color(0,83,158));
		
		this.formulario.getLIndentif().setText("DADOS PESSOAIS");
		this.formulario.getLIndentif().setForeground(new Color(71,120,197));
		this.formulario.getLIndentif().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getLCpf().setText("CPF");
		this.formulario.getLCpf().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getJCpf().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getJCpf().setColumns(10);
		
		JSeparator separaFun = new JSeparator();
		separaFun.setForeground(new Color(71,120,197));
		
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTId().setColumns(10);
		this.formulario.getTId().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLRg().setText("RG");
		this.formulario.getLRg().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTRg().setColumns(10);
		this.formulario.getTRg().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLNome().setText("Nome");
		this.formulario.getLNome().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTNome().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTNome().setColumns(10);
		
		this.formulario.getLEndereco().setText("ENDEREÇO");
		this.formulario.getLEndereco().setForeground(new Color(71, 120, 197));
		this.formulario.getLEndereco().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getLLogradouro().setText("Logradouro");
		this.formulario.getLLogradouro().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTLogradouro().setColumns(10);
		this.formulario.getTLogradouro().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getTComplemento().setColumns(10);
		this.formulario.getTComplemento().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLComplemento().setText("Complemento");
		this.formulario.getLComplemento().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTNumero().setColumns(10);
		this.formulario.getTNumero().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLNumero().setText("Número");
		this.formulario.getLNumero().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getLBairro().setText("Bairro");
		this.formulario.getLBairro().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTBairro().setColumns(10);
		this.formulario.getTBairro().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getTCidade().setColumns(10);
		this.formulario.getTCidade().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLCidade().setText("Cidade");
		this.formulario.getLCidade().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getLEstado().setText("Estado");
		this.formulario.getLEstado().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getJCep().setColumns(10);
		this.formulario.getJCep().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLCep().setText("CEP");
		this.formulario.getLCep().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JSeparator separaEnd = new JSeparator();
		separaEnd.setForeground(new Color(71, 120, 197));
		
		this.formulario.getLContato().setText("CONTATO");
		this.formulario.getLContato().setForeground(new Color(71, 120, 197));
		this.formulario.getLContato().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getTEmail().setColumns(10);
		this.formulario.getTEmail().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLEmail().setText("E-mail");
		this.formulario.getLEmail().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTCelular().setColumns(10);
		this.formulario.getTCelular().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLCelular().setText("Celular");
		this.formulario.getLCelular().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTTelefone().setColumns(10);
		this.formulario.getTTelefone().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLTelefone().setText("Telefone");
		this.formulario.getLTelefone().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getBTGravar().setText("Cadastrar");
		this.formulario.getBTGravar().setBounds(215, 381, 84, 23);
		this.formulario.getBTGravar().setBackground(new Color(71, 120, 197));
		this.formulario.getBTGravar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getBTGravar().setForeground(new Color(255, 255, 255));
		
		
		this.formulario.getBTCancelar().setText("Cancelar");
		this.formulario.getBTCancelar().setBounds(215, 381, 84, 23);
		this.formulario.getBTCancelar().setBackground(new Color(71, 120, 197));
		this.formulario.getBTCancelar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getBTCancelar().setForeground(new Color(255, 255, 255));
		
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(19)
				.addComponent(separaFun, GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
				.addGap(19))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLEndereco(), GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(553, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(10)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(this.formulario.getLLogradouro(), GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLComplemento(), GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLNumero(), GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLCidade(), GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLCep(), GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(this.formulario.getTComplemento(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
				.addComponent(this.formulario.getTLogradouro(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getTNumero(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTCidade(), GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getJCep(), GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLEstado(), GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getComboEstado(), 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLBairro(), GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTBairro(), GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)))))
				.addGap(60))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(separaEnd, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)
				.addContainerGap())))))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(10)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLId(), GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLCpf(), GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLNome(), GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addGap(53)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getTComplemento(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getTNome(), GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getJCpf(), GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
				.addComponent(this.formulario.getLRg(), GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(this.formulario.getTRg(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
				.addGap(58))))
				.addComponent(this.formulario.getLIndentif()))
				.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(this.formulario.getLEmail(), GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLCelular(), GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTCelular(), GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(this.formulario.getLTelefone(), GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTTelefone(), GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
				.addComponent(this.formulario.getTEmail(), GroupLayout.PREFERRED_SIZE, 507, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(61, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap(430, Short.MAX_VALUE)
				.addComponent(this.formulario.getBTGravar())
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getBTCancelar())
				.addGap(62))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLContato(), GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(576, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(this.formulario.getLIndentif())
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getTId(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLId()))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getJCpf(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLCpf(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getLRg(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getTRg(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(16)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getTNome(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLNome(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separaFun, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(this.formulario.getLEndereco(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getTLogradouro(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLLogradouro(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getTComplemento(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLComplemento(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getTNumero(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLNumero(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getTBairro(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLBairro(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getTCidade(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLCidade(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getComboEstado(), GroupLayout
							.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLEstado(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getJCep(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLCep(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separaEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(this.formulario.getLContato(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getLEmail(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getTEmail(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getTCelular(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLCelular(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getTTelefone(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getLTelefone(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(this.formulario.getBTCancelar())
					.addComponent(this.formulario.getBTGravar()))
					.addContainerGap())
		);

		
		
		JLabel LInserirDados = new JLabel("Incluir Dados de Funcionários");
		LInserirDados.setForeground(Color.WHITE);
		LInserirDados.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panelLabel);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
				.addContainerGap()
				.addComponent(LInserirDados)
				.addContainerGap(467, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(LInserirDados))
		);
		
		
		panelLabel.setLayout(gl_panel_1);
		this.formulario.getPanel().setLayout(gl_panel);
		this.formulario.getContentPane().setLayout(groupLayout);
		
	}
	
		
		
}
