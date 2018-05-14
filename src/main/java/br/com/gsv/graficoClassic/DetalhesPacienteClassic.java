package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.DetalhesPacienteDialog;

public class DetalhesPacienteClassic {
	private DetalhesPacienteDialog formulario;
	
	public DetalhesPacienteClassic(DetalhesPacienteDialog formulario) {
		this.formulario = formulario;
		CriarTela();
		OrganizarComponentes();
	}
	
	private void CriarTela(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 580, 460);
		this.formulario.getTela().setLayout(new BorderLayout());
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		this.formulario.getPanel().setLayout(null);
	}
	
	private void OrganizarComponentes(){
		this.formulario.getLIndentif().setText("DADOS PESSOAIS");
		this.formulario.getLIndentif().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		this.formulario.getLIndentif().setBounds(10, 11, 130, 14);
		
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLId().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLId().setBounds(42, 33, 59, 14);
		
		this.formulario.getTId().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTId().setBounds(111, 30, 39, 20);
		
		this.formulario.getLCpf().setText("CPF:");
		this.formulario.getLCpf().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLCpf().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLCpf().setBounds(64, 58, 37, 14);
		
		this.formulario.getTCpf().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTCpf().setBounds(111, 55, 113, 20);
		
		this.formulario.getLNome().setText("Nome:");
		this.formulario.getLNome().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLNome().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLNome().setBounds(52, 85, 49, 14);
		
		this.formulario.getTNome().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTNome().setBounds(111, 82, 337, 20);
		
		this.formulario.getLRg().setText("RG:");
		this.formulario.getLRg().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLRg().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLRg().setBounds(411, 58, 37, 14);
		
		this.formulario.getTRg().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTRg().setBounds(458, 55, 113, 20);
		
		this.formulario.getLEndereco().setText("ENDEREÇO");
		this.formulario.getLEndereco().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		this.formulario.getLEndereco().setBounds(10, 134, 130, 14);
		
		this.formulario.getLLogradouro().setText("Logradouro:");
		this.formulario.getLLogradouro().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLLogradouro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLLogradouro().setBounds(10, 160, 91, 14);
		
		this.formulario.getTLogradouro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTLogradouro().setBounds(111, 157, 340, 20);
		
		this.formulario.getLComplemento().setText("Complemento:");
		this.formulario.getLComplemento().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLComplemento().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLComplemento().setBounds(10, 186, 91, 14);
		
		this.formulario.getTComplemento().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTComplemento().setBounds(111, 183, 340, 20);
		
		this.formulario.getLNumero().setText("Número");
		this.formulario.getLNumero().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLNumero().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLNumero().setBounds(20, 211, 81, 14);
		
		this.formulario.getTNumero().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTNumero().setBounds(111, 208, 59, 20);
		
		this.formulario.getLCidade().setText("Cidade:");
		this.formulario.getLCidade().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLCidade().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLCidade().setBounds(20, 237, 81, 14);
		
		this.formulario.getTCidade().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTCidade().setBounds(111, 234, 198, 20);
		
		this.formulario.getLBairro().setText("Bairro:");
		this.formulario.getLBairro().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLBairro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLBairro().setBounds(332, 211, 71, 14);
		
		this.formulario.getTBairro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTBairro().setBounds(413, 208, 141, 20);
		
		this.formulario.getLEstado().setText("UF:");
		this.formulario.getLEstado().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLEstado().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLEstado().setBounds(364, 237, 39, 14);
		
		this.formulario.getTComboEstado().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTComboEstado().setBounds(413, 234, 141, 20);
		
		this.formulario.getLCep().setText("CEP:");
		this.formulario.getLCep().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLCep().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLCep().setBounds(21, 260, 81, 14);
		
		this.formulario.getTCep().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTCep().setBounds(112, 257, 81, 20);
		
		this.formulario.getLContato().setText("CONTATO");
		this.formulario.getLContato().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		this.formulario.getLContato().setBounds(10, 292, 130, 14);
		
		this.formulario.getLEmail().setText("E-mail:");
		this.formulario.getLEmail().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLEmail().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLEmail().setBounds(20, 312, 81, 14);
		
		this.formulario.getTEmail().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTEmail().setBounds(111, 309, 292, 20);
		
		this.formulario.getLCelular().setText("Celular:");
		this.formulario.getLCelular().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLCelular().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLCelular().setBounds(20, 340, 81, 14);
		
		this.formulario.getTCelular().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTCelular().setBounds(111, 337, 113, 20);
		
		this.formulario.getTTelefone().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTTelefone().setBounds(411, 337, 113, 20);
		
		this.formulario .getLTelefone().setText("Telefone:");
		this.formulario .getLTelefone().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario .getLTelefone().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario .getLTelefone().setBounds(322, 340, 81, 14);
		
		this.formulario.getCancelar().setText("Voltar");
		this.formulario.getCancelar().setBounds(231, 388, 89, 23);
		
		this.formulario.getTDataCadastro().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTDataCadastro().setBounds(458, 30, 165, 20);
		
		this.formulario.getLDataCad().setText("Data Cadastro");
		this.formulario.getLDataCad().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLDataCad().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLDataCad().setBounds(364, 33, 84, 14);
		
		this.formulario.getLDataNasc().setText("Data Nasc.:");
		this.formulario.getLDataNasc().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLDataNasc().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLDataNasc().setBounds(20, 107, 81, 14);
		
		this.formulario.getTDataNasc().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTDataNasc().setBounds(111, 104, 113, 20);
		
		this.formulario.getTConvenio().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTConvenio().setBounds(423, 104, 177, 20);
		
		this.formulario.getLConvenio().setText("Plano");
		this.formulario.getLConvenio().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLConvenio().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLConvenio().setBounds(332, 107, 81, 14);
	}
	
}
