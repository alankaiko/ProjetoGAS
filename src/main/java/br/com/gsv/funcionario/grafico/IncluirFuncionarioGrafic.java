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
import br.com.projeto.gsv.util.FieldListener;

public class IncluirFuncionarioGrafic {
	private IncluirFuncionariosForm formulario;
	private FieldListener field = new FieldListener();
	
	public IncluirFuncionarioGrafic(IncluirFuncionariosForm formulario) {
		this.formulario = formulario;
		CriarTelaGeral();
		DadosFuncionario();
	}
	
	
	private void CriarTelaGeral(){
		this.formulario.setModal(true);		
		this.formulario.setBounds(100, 100, 681, 482);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197),1,true));
		this.formulario.getPanel().setBackground(Color.WHITE);
		
	}
		
		
	private void DadosFuncionario(){
		GroupLayout groupLayout = new GroupLayout(this.formulario.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
				.addComponent(this.formulario.getPanel(), GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
				.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
				.addContainerGap())
		);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(71,120,197));
		
		this.formulario.getLIndentif().setText("DADOS PESSOAIS");
		this.formulario.getLIndentif().setForeground(new Color(71,120,197));
		this.formulario.getLIndentif().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getTId().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTId().setEditable(false);
		this.formulario.getTId().setColumns(10);
		
		this.formulario.getLNome().setText("Nome");
		this.formulario.getLNome().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getTNome().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTNome().setColumns(10);
		
		this.formulario.getLRg().setText("RG");
		this.formulario.getLRg().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getLCpf().setText("CPF");
		this.formulario.getLCpf().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		
		this.formulario.getTRg().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTRg().setColumns(10);
		
		this.formulario.getJCpf().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getJCpf().setColumns(10);
		
		JSeparator separaDad = new JSeparator();
		separaDad.setForeground(new Color(71,120,197));
		
		this.formulario.getLEndereco().setText("ENDEREÇO");
		this.formulario.getLEndereco().setForeground(new Color(71, 120, 197));
		this.formulario.getLEndereco().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getLLogradouro().setText("Logradouro");
		this.formulario.getLLogradouro().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getTLogradouro().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTLogradouro().setColumns(10);
		
		this.formulario.getLNumero().setText("Número");
		this.formulario.getLNumero().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getTNumero().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTNumero().setColumns(10);
		
		this.formulario.getLComplemento().setText("Complemento");
		this.formulario.getLComplemento().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getTComplemento().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTComplemento().setColumns(10);
		
		this.formulario.getLBairro().setText("Bairro");
		this.formulario.getLBairro().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getTBairro().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTBairro().setColumns(10);
		
		this.formulario.getLCidade().setText("Cidade");
		this.formulario.getLCidade().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getTCidade().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTCidade().setColumns(10);
		
		this.formulario.getLEstado().setText("Estado");
		this.formulario.getLEstado().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getComboEstado().setBackground(Color.WHITE);
		
		this.formulario.getLCep().setText("CEP");
		this.formulario.getLCep().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getJCep().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getJCep().setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(71, 120, 197));
		
		this.formulario.getLContato().setText("CONTATO");
		this.formulario.getLContato().setForeground(new Color(71, 120, 197));
		this.formulario.getLContato().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getLEmail().setText("E-mail");
		this.formulario.getLEmail().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getTEmail().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTEmail().setColumns(10);
		
		this.formulario.getLTelefone().setText("Telefone");
		this.formulario.getLTelefone().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getTTelefone().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTTelefone().setColumns(10);
		
		this.formulario.getLCelular().setText("Celular");
		this.formulario.getLCelular().setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		this.formulario.getTCelular().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTCelular().setColumns(10);
		
		this.formulario.getBTGravar().setText("Gravar");
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
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(this.formulario.getLId(), Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.formulario.getLRg(), Alignment.LEADING)
								.addComponent(this.formulario.getTRg(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addComponent(this.formulario.getLIndentif(), Alignment.LEADING))
							.addGap(49))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(this.formulario.getTId(), GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(this.formulario.getJCpf(), GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.formulario.getLCpf())
						.addComponent(this.formulario.getLNome())
						.addComponent(this.formulario.getTNome(), GroupLayout.PREFERRED_SIZE, 494, GroupLayout.PREFERRED_SIZE))
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(separaDad, GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(this.formulario.getLEndereco(), GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(563, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(this.formulario.getLLogradouro())
							.addPreferredGap(ComponentPlacement.RELATED, 597, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(this.formulario.getTLogradouro(), GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(this.formulario.getLNumero())
								.addComponent(this.formulario.getTNumero(), GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(457)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(this.formulario.getLBairro())
								.addComponent(this.formulario.getTBairro(), GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(this.formulario.getLComplemento())
							.addPreferredGap(ComponentPlacement.RELATED, 586, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(this.formulario.getTComplemento(), GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 308, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(this.formulario.getLCidade())
								.addComponent(this.formulario.getTCidade(), GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
							.addGap(51)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(this.formulario.getLEstado())
								.addComponent(this.formulario.getComboEstado(), GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(this.formulario.getLCep())
								.addComponent(this.formulario.getJCep(), GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 1, GroupLayout.PREFERRED_SIZE)))
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 658, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(this.formulario.getLContato(), GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 543, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(this.formulario.getLEmail())
								.addComponent(this.formulario.getTEmail(), GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(this.formulario.getLTelefone())
								.addComponent(this.formulario.getTTelefone(), GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(this.formulario.getLCelular())
								.addComponent(this.formulario.getTCelular(), GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(189)
					.addComponent(this.formulario.getBTGravar(), GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(this.formulario.getBTCancelar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(this.formulario.getLIndentif())
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getLId())
						.addComponent(this.formulario.getLNome()))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(this.formulario.getTId(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.formulario.getTNome(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getLRg())
						.addComponent(this.formulario.getLCpf()))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(this.formulario.getTRg(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.formulario.getJCpf(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separaDad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(this.formulario.getLEndereco(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getLLogradouro())
						.addComponent(this.formulario.getLNumero()))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getTLogradouro(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.formulario.getTNumero(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getLComplemento())
						.addComponent(this.formulario.getLBairro()))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getTComplemento(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.formulario.getTBairro(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getLCidade())
						.addComponent(this.formulario.getLEstado())
						.addComponent(this.formulario.getLCep()))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getTCidade(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.formulario.getComboEstado(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.formulario.getJCep(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(this.formulario.getLContato(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getLEmail())
						.addComponent(this.formulario.getLTelefone())
						.addComponent(this.formulario.getLCelular()))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getTEmail(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.formulario.getTTelefone(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.formulario.getTCelular(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.formulario.getBTGravar())
						.addComponent(this.formulario.getBTCancelar()))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		
		JLabel lblIncluirDadosPaciente = new JLabel("Incluir Dados Funcionário");
		lblIncluirDadosPaciente.setForeground(Color.WHITE);
		lblIncluirDadosPaciente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIncluirDadosPaciente)
					.addContainerGap(531, Short.MAX_VALUE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelTitulo.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblIncluirDadosPaciente))
		);
		painelTitulo.setLayout(gl_painelTitulo);
		this.formulario.getPanel().setLayout(gl_panel);
		this.formulario.getContentPane().setLayout(groupLayout);
	}
	
		
		
}
