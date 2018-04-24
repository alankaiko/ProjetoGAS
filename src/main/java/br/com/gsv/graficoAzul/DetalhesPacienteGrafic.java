package br.com.gsv.graficoAzul;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.formularios.DetalhesPacienteDialog;


public class DetalhesPacienteGrafic {
	private DetalhesPacienteDialog formulario;
	
	
	public DetalhesPacienteGrafic(DetalhesPacienteDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeral();
		Dados();
	}
	
	
	
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 680, 505);
		this.formulario.setUndecorated(true);
		
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197),1,true));
		this.formulario.getPanel().setBackground(Color.WHITE);
	}
	
	

	
	
	
	
	public void Dados(){
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
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
				.addContainerGap())
		);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(71,120,197));
		
		this.formulario.getLIndentif().setText("DADOS PESSOAIS");
		this.formulario.getLIndentif().setForeground(new Color(71,120,197));
		this.formulario.getLIndentif().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLNome().setText("Nome");
		this.formulario.getLNome().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLDataCad().setText("Data Cadastro");
		this.formulario.getLDataCad().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLRg().setText("RG");
		this.formulario.getLRg().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLCpf().setText("CPF");
		this.formulario.getLCpf().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLDataNasc().setText("Data Nasc.");
		this.formulario.getLDataNasc().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLConvenio().setText("Convênio / Plano");
		this.formulario.getLConvenio().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JSeparator separaDad = new JSeparator();
		separaDad.setForeground(new Color(71,120,197));
		
		this.formulario.getLEndereco().setText("ENDEREÇO");
		this.formulario.getLEndereco().setForeground(new Color(71, 120, 197));
		this.formulario.getLEndereco().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getLLogradouro().setText("Logradouro");
		this.formulario.getLLogradouro().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLNumero().setText("Número");
		this.formulario.getLNumero().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLComplemento().setText("Complemento");
		this.formulario.getLComplemento().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLBairro().setText("Bairro");
		this.formulario.getLBairro().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLCidade().setText("Cidade");
		this.formulario.getLCidade().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLEstado().setText("Estado");
		this.formulario.getLEstado().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLCep().setText("CEP");
		this.formulario.getLCep().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(71, 120, 197));
		
		this.formulario.getLContato().setText("CONTATO");
		this.formulario.getLContato().setForeground(new Color(71, 120, 197));
		this.formulario.getLContato().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getLObservacao().setText("Observação");
		this.formulario.getLObservacao().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLEmail().setText("E-mail");
		this.formulario.getLEmail().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLTelefone().setText("Telefone");
		this.formulario.getLTelefone().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLCelular().setText("Celular");
		this.formulario.getLCelular().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setBounds(215, 381, 84, 23);
		this.formulario.getCancelar().setBackground(new Color(71, 120, 197));
		this.formulario.getCancelar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getCancelar().setForeground(new Color(255, 255, 255));
		
		this.formulario.getTConvenio().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTId().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTNome().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTDataCadastro().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTRg().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTCpf().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTDataNasc().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTObservacao().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTLogradouro().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTNumero().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTComplemento().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTCidade().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTComboEstado().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTCep().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTEmail().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTTelefone().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTCelular().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		this.formulario.getTBairro().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLConvenio())
				.addContainerGap(577, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLEndereco(), GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(553, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLLogradouro())
				.addContainerGap(606, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(separaDad, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLId(), GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLRg())
				.addComponent(this.formulario.getLIndentif())
				.addComponent(this.formulario.getTId())
				.addComponent(this.formulario.getTRg(), GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLCpf())
				.addComponent(this.formulario.getLNome())
				.addComponent(this.formulario.getTNome(), GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTCpf(), GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
				.addGap(52)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getTDataNasc(), GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
				.addComponent(this.formulario.getLDataNasc())
				.addComponent(this.formulario.getLDataCad(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(this.formulario.getTDataCadastro(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTLogradouro(), GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
				.addGap(64)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLNumero())
				.addComponent(this.formulario.getTNumero(), GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTConvenio(), GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addGap(105)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLObservacao())
				.addPreferredGap(ComponentPlacement.RELATED, 300, Short.MAX_VALUE))
				.addComponent(this.formulario.getTObservacao(), GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTComplemento(), GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
				.addGap(71)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLBairro())
				.addComponent(this.formulario.getTBairro(), GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))))
				.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLComplemento())
				.addContainerGap(592, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLCidade())
				.addComponent(this.formulario.getTCidade(), GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
				.addGap(67)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLEstado())
				.addComponent(this.formulario.getTComboEstado(), GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLCep())
				.addComponent(this.formulario.getTCep(), GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(14, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 658, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLContato(), GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(553, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLEmail())
				.addComponent(this.formulario.getTEmail(), GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
				.addGap(36)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLTelefone())
				.addGap(109))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTTelefone(), GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
				.addGap(27)))
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLCelular())
				.addGap(113))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTCelular(), GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
				.addContainerGap())))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(274)
				.addComponent(this.formulario.getCancelar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(294, Short.MAX_VALUE))
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
				.addComponent(this.formulario.getLDataCad())
				.addComponent(this.formulario.getLNome()))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTId())
				.addComponent(this.formulario.getTNome())
				.addComponent(this.formulario.getTDataCadastro()))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLDataNasc())
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLRg())
				.addComponent(this.formulario.getLCpf())))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getTRg())
				.addComponent(this.formulario.getTCpf()))
				.addGap(13)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLConvenio())
				.addComponent(this.formulario.getLObservacao())))
				.addComponent(this.formulario.getTDataNasc()))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTConvenio())
				.addComponent(this.formulario.getTObservacao()))
				.addGap(8)
				.addComponent(separaDad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getLEndereco(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLLogradouro())
				.addComponent(this.formulario.getLNumero()))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTLogradouro())
				.addComponent(this.formulario.getTNumero()))
				.addGap(8)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLComplemento())
				.addComponent(this.formulario.getLBairro()))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTComplemento())
				.addComponent(this.formulario.getTBairro()))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLCidade())
				.addComponent(this.formulario.getLEstado())
				.addComponent(this.formulario.getLCep()))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTCidade())
				.addComponent(this.formulario.getTComboEstado())
				.addComponent(this.formulario.getTCep()))
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
				.addComponent(this.formulario.getTEmail())
				.addComponent(this.formulario.getTTelefone())
				.addComponent(this.formulario.getTCelular()))
				.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
				.addComponent(this.formulario.getCancelar())
				.addContainerGap())
		);
		
		JLabel lblIncluirDadosPaciente = new JLabel("Incluir Dados Paciente");
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
