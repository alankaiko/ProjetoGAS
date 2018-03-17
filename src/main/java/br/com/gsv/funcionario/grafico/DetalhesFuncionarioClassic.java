package br.com.gsv.funcionario.grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.funcionario.formularios.DetalhesFuncionarioDialog;

public class DetalhesFuncionarioClassic {
	private DetalhesFuncionarioDialog formulario;
	
	public DetalhesFuncionarioClassic(DetalhesFuncionarioDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralClassic();
		DadosFuncionario();
	}
	
	
	public void CriarTelaGeralClassic() {
		this.formulario.setTitle("Dados de Funcionário");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 650, 460);
		
		this.formulario.getTela().setLayout(null);		
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		
	}
	

	public void DadosFuncionario() {
		this.formulario.getLIndentif().setText("DADOS PESSOAIS");
		this.formulario.getLIndentif().setBounds(15,10,300,20);
		this.formulario.getLIndentif().setFont(new Font("Calibri", Font.BOLD, 13));
		this.formulario.getLIndentif().setForeground(Color.black);
									
					
			this.formulario.getLId().setText("Código:");
			this.formulario.getLId().setBounds(65,30,50,20);
			this.formulario.getLId().setFont(new Font("Arial",Font.BOLD,11));
				this.formulario.getTId().setBounds(111,31,84,20);
				this.formulario.getTId().setFont(new Font("Arial",Font.BOLD,10));
				this.formulario.getTId().setForeground(Color.black);
					
						 
				this.formulario.getLCpf().setText("CPF:");
				this.formulario.getLCpf().setBounds(75,60,35,20);
				this.formulario.getLCpf().setFont(new Font("Arial" , Font.BOLD,11));
				this.formulario.getTCpf().setBounds(111,62,173,16);							
					
												
			this.formulario.getLRg().setText("RG:");
			this.formulario.getLRg().setBounds(456,60,29,20);
			this.formulario.getLRg().setFont(new Font("Arial" , Font.BOLD,11));;
				this.formulario.getTRg().setBounds(489,61,120,19);
				this.formulario.getTRg().setFont(new Font("Arial",Font.BOLD,10));
						
						
					
			this.formulario.getLNome().setText("Nome:");
			this.formulario.getLNome().setBounds(65,90,50,20);
			this.formulario.getLNome().setFont(new Font("Arial" , Font.BOLD,11));;
				this.formulario.getTNome().setBounds(111,91,500,19);
				this.formulario.getTNome().setFont(new Font("Arial",Font.BOLD,10));					
		
				
		this.formulario.getLEndereco().setText("ENDEREÇO");
		this.formulario.getLEndereco().setFont(new Font("Calibri", Font.BOLD, 13));
		this.formulario.getLEndereco().setBounds(10, 142, 64, 14);
		
				
			this.formulario.getLLogradouro().setText("Logradouro: ");
			this.formulario.getLLogradouro().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLLogradouro().setBounds(31, 167, 84, 14);
				this.formulario.getTLogradouro().setBounds(111, 164, 506, 20);
				
					
			this.formulario.getLComplemento().setText("Complemento: ");
			this.formulario.getLComplemento().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLComplemento().setBounds(15, 195, 100, 14);
				this.formulario.getTComplemento().setBounds(111, 192, 506, 20);
					
			this.formulario.getLNumero().setText("Numero:");
			this.formulario.getLNumero().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLNumero().setBounds(57, 228, 58, 14);
				this.formulario.getTNumero().setBounds(111, 225, 106, 20);
				
					
			this.formulario.getLBairro().setText("Bairro: ");
			this.formulario.getLBairro().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLBairro().setBounds(363, 228, 46, 14);
				this.formulario.getTBairro().setBounds(419, 225, 192, 20);
				
						
			this.formulario.getLCidade().setText("Cidade: ");
			this.formulario.getLCidade().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLCidade().setBounds(65, 253, 46, 14);
				this.formulario.getTCidade().setBounds(111, 250, 208, 20);
				
			this.formulario.getLEstado().setText("UF: ");
			this.formulario.getLEstado().setBounds(429, 253, 46, 14);
				this.formulario.getTComboEstado().setBounds(456, 250, 86, 20);
				
						
			this.formulario.getLCep().setText("CEP:");
			this.formulario.getLCep().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLCep().setBounds(75, 284, 35, 14);
				this.formulario.getTCep().setBounds(111, 281, 86, 20);
					
				
		this.formulario.getLContato().setText("CONTATO");
		this.formulario.getLContato().setFont(new Font("Calibri", Font.BOLD, 13));
		this.formulario.getLContato().setBounds(15, 308, 72, 14);
		
			this.formulario.getLEmail().setText("Email:");
			this.formulario.getLEmail().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLEmail().setBounds(50, 325, 46, 14);
				this.formulario.getTEmail().setBounds(109, 322, 263, 20);
				
			
			this.formulario.getLCelular().setText("Celular:");
			this.formulario.getLCelular().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLCelular().setBounds(404, 284, 46, 14);
				this.formulario.getTCelular().setBounds(456, 284, 155, 20);
				
			
			this.formulario.getLTelefone().setText("Telefone:");
			this.formulario.getLTelefone().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLTelefone().setBounds(394, 325, 72, 14);
				this.formulario.getTTelefone().setBounds(456, 322, 155, 20);
		
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getCancelar().setBounds(522, 398, 89, 23);
	}

}
