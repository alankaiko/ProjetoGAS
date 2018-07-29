package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.gsv.formularios.IncluirUsuarioForm;

public class IncluirUsuarioClassic {
	private IncluirUsuarioForm formulario;
	
	public IncluirUsuarioClassic(IncluirUsuarioForm formulario) {
		this.formulario = formulario;
		CriarTelaGeralClassic();
		DadosConvenio();
	}
	
	
	public void CriarTelaGeralClassic() {
		this.formulario.setTitle("Código");
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 516, 330);
		this.formulario.setResizable(false);
		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);

		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getPanel().setLayout(null);
	}
	

	public void DadosConvenio() {
		this.formulario.getLFuncionario().setText("Funcionário");
		this.formulario.getLFuncionario().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		this.formulario.getLFuncionario().setBounds(39, 34, 112, 14);
		
		this.formulario.getTFuncionario().setBorder(new LineBorder(Color.BLACK));
		this.formulario.getTFuncionario().setBounds(39, 48, 375, 20);
		this.formulario.getTFuncionario().setColumns(10);
		this.formulario.getTFuncionario().setEditable(false);
		this.formulario.getTFuncionario().setToolTipText("Clique no Botão Pesquisar");
		
		this.formulario.getLCpf().setText("CPF");
		this.formulario.getLCpf().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		this.formulario.getLCpf().setBounds(39, 79, 46, 14);
		
		this.formulario.getTCpf().setBorder(new LineBorder(Color.BLACK));
		this.formulario.getTCpf().setBounds(40, 93, 229, 20);
		this.formulario.getTCpf().setColumns(10);
		this.formulario.getTCpf().setEditable(false);
		this.formulario.getTCpf().setToolTipText("Clique no Botão Pesquisar");
		
		this.formulario.getLRg().setText("RG");
		this.formulario.getLRg().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		this.formulario.getLRg().setBounds(293, 79, 46, 14);
		
		this.formulario.getTRg().setBorder(new LineBorder(Color.BLACK));
		this.formulario.getTRg().setBounds(293, 93, 121, 20);
		this.formulario.getTRg().setColumns(10);
		this.formulario.getTRg().setEditable(false);
		this.formulario.getTRg().setToolTipText("Clique no Botão Pesquisar");
		
		this.formulario.getLAdicionar().setText("Adicionar Login de Usuário");
		this.formulario.getLAdicionar().setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		this.formulario.getLAdicionar().setBounds(39, 147, 205, 14);
		
		this.formulario.getLLogin().setText("Login");
		this.formulario.getLLogin().setBounds(39, 172, 46, 14);
	
		this.formulario.getLSenha().setText("Senha");
		this.formulario.getLSenha().setBounds(293, 172, 46, 14);
		
		this.formulario.getTLogin().setBorder(new LineBorder(Color.BLACK));
		this.formulario.getTLogin().setBounds(39, 188, 230, 20);
		this.formulario.getTLogin().setColumns(10);
		
		this.formulario.getTSenha().setBorder(new LineBorder(Color.BLACK));
		this.formulario.getTSenha().setBounds(293, 188, 121, 20);
		
		this.formulario.getBGravar().setText("Gravar");
		this.formulario.getBGravar().setBounds(142, 256, 100	, 23);
	
		this.formulario.getBCancelar().setText("Cancelar");
		this.formulario.getBCancelar().setBounds(252, 256, 100, 23);
		
		this.formulario.getBPesquisar().setText("Pesquisar");
		this.formulario.getBPesquisar().setIcon(new ImageIcon(IncluirUsuarioForm.class.getResource("/imagens/icons8-pesquisar-15.png")));
		this.formulario.getBPesquisar().setBackground(SystemColor.menu);
		this.formulario.getBPesquisar().setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		this.formulario.getBPesquisar().setMargin(new Insets(2, 0, 2, 0));
		this.formulario.getBPesquisar().setBorder(null);
		this.formulario.getBPesquisar().setBounds(421, 47, 73, 23);
	}

}
