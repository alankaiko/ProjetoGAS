package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.DetalhesFuncionariDialog;

public class DetalhesFuncionarioClassic {
	private DetalhesFuncionariDialog formulario;
	
	public DetalhesFuncionarioClassic(DetalhesFuncionariDialog formulario) {
		this.formulario = formulario;
		CriarTela();
		OrganizarComponentes();
	}
	
	private void CriarTela(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 650, 460);
		this.formulario.getTela().setLayout(new BorderLayout());
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		this.formulario.getPanel().setLayout(null);
	}
	
	private void OrganizarComponentes(){
		this.formulario.getLDados().setText("DADOS PESSOAIS");
		this.formulario.getLDados().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		this.formulario.getLDados().setBounds(10, 11, 130, 14);
		
		this.formulario.getLCodigo().setText("Código:");
		this.formulario.getLCodigo().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLCodigo().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLCodigo().setBounds(42, 36, 59, 14);
		
		this.formulario.getTCodigo().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTCodigo().setBounds(111, 33, 39, 20);
		
		this.formulario.getLCpf().setText("CPF:");
		this.formulario.getLCpf().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLCpf().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLCpf().setBounds(64, 67, 37, 14);
		
		this.formulario.getTCpf().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTCpf().setBounds(111, 64, 113, 20);
		
		this.formulario.getLNome().setText("Nome:");
		this.formulario.getLNome().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLNome().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLNome().setBounds(52, 94, 49, 14);
		
		this.formulario.getTNome().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTNome().setBounds(111, 91, 337, 20);
		
		this.formulario.getTRegistro().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTRegistro().setBounds(458, 30, 165, 20);
		
		this.formulario.getLRegistro().setText("Registro:");
		this.formulario.getLRegistro().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLRegistro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLRegistro().setBounds(364, 33, 84, 14);
		
		this.formulario.getLRg().setText("RG:");
		this.formulario.getLRg().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLRg().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLRg().setBounds(411, 64, 37, 14);
		
		this.formulario.getTRg().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		this.formulario.getTRg().setBounds(458, 61, 113, 20);
		
		this.formulario.getLEndereco().setText("ENDEREÇO");
		this.formulario.getLEndereco().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		this.formulario.getLEndereco().setBounds(10, 122, 130, 14);
		
		this.formulario.getLLogradouro().setText("Logradouro:");
		this.formulario.getLLogradouro().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLLogradouro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLLogradouro().setBounds(10, 150, 91, 14);
		
		this.formulario.getTLogradouro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTLogradouro().setBounds(111, 147, 340, 20);
		
		this.formulario.getLComplemento().setText("Complemento:");
		this.formulario.getLComplemento().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLComplemento().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLComplemento().setBounds(10, 175, 91, 14);
		
		this.formulario.getTComplemento().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTComplemento().setBounds(111, 173, 340, 20);
		
		this.formulario.getLNumero().setText("Número:");
		this.formulario.getLNumero().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLNumero().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLNumero().setBounds(20, 203, 81, 14);
		
		this.formulario.getTNumero().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTNumero().setBounds(111, 200, 59, 20);
		
		this.formulario.getLCidade().setText("Cidade:");
		this.formulario.getLCidade().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLCidade().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLCidade().setBounds(20, 228, 81, 14);
		
		this.formulario.getTCidade().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTCidade().setBounds(111, 225, 198, 20);
		
		this.formulario.getLBairro().setText("Bairro:");
		this.formulario.getLBairro().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLBairro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLBairro().setBounds(332, 203, 71, 14);
		
		this.formulario.getTBairro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTBairro().setBounds(413, 200, 187, 20);
		
		this.formulario.getLUf().setText("UF:");
		this.formulario.getLUf().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLUf().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLUf().setBounds(364, 228, 39, 14);
		
		this.formulario.getTEstado().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTEstado().setBounds(413, 225, 187, 20);
		
		this.formulario.getLCep().setText("CEP:");
		this.formulario.getLCep().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLCep().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLCep().setBounds(20, 259, 81, 14);
		
		this.formulario.getTCep().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getTCep().setBounds(111, 256, 81, 20);
		
		this.formulario.getLContato().setText("CONTATO");
		this.formulario.getLContato().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		this.formulario.getLContato().setBounds(10, 284, 130, 14);
		
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
		
		this.formulario.getLTelefone().setText("Telefone:");
		this.formulario.getLTelefone().setHorizontalAlignment(SwingConstants.RIGHT);
		this.formulario.getLTelefone().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getLTelefone().setBounds(322, 340, 81, 14);
		
		this.formulario.getBTCancelar().setText("Voltar");
		this.formulario.getBTCancelar().setBounds(269, 388, 89, 23);
	}
	
	

}
