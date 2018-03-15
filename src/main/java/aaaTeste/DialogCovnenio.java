package aaaTeste;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import br.com.projeto.gsv.util.FieldListener;

public class DialogCovnenio extends JDialog {
	private Container tela = getContentPane();
	private JTextField TId;
	private JTextField TConvenio;

	
	public static void main(String[] args) {
		try {
			DialogCovnenio dialog = new DialogCovnenio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public DialogCovnenio() {
		CriarTelaGeral();
	}
	
	// cria e tela geral onde todos os componentes serao inseridos, é a tela
	// geral do sistema
	private void CriarTelaGeral() {
		this.setTitle("Inserir Convenio / Plano / Credencial");
		this.setModal(true);
		this.setResizable(false);
		this.setBounds(100, 100, 401, 215);
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(71, 120, 197)));
		panel.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
		);
		
		JLabel LId = new JLabel("Código: ");
		LId.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel LConvenio = new JLabel("Convênio: ");
		LConvenio.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		TId = new JTextField();
		TId.setBorder(new LineBorder(new Color(71, 120, 197)));
		TId.setColumns(10);
		
		TConvenio = new JTextField();
		TConvenio.setColumns(10);
		TConvenio.setBorder(new LineBorder(new Color(71, 120, 197)));
		
		FieldListener f1 = new  FieldListener();
		
		TId.addFocusListener(f1);
		TConvenio.addFocusListener(f1);
		
		
		JButton BTGravar = new JButton("Cadastrar");
		BTGravar.setBounds(215, 381, 84, 23);
		BTGravar.setBackground(new Color(71, 120, 197));
		BTGravar.setFont(new Font("Segoe UI", 0, 14));
		BTGravar.setForeground(new Color(255, 255, 255));
		
		JButton BTCancelar = new JButton("Cancelar");
		BTCancelar.setBounds(215, 381, 84, 23);
		BTCancelar.setBackground(new Color(71, 120, 197));
		BTCancelar.setFont(new Font("Segoe UI", 0, 14));
		BTCancelar.setForeground(new Color(255, 255, 255));
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(37)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(LConvenio)
				.addComponent(LId))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(TId, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
				.addComponent(TConvenio, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(87)
				.addComponent(BTGravar)
				.addGap(26)
				.addComponent(BTCancelar)))
				.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap(20, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(TId, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				.addComponent(LId))
				.addGap(30)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(LConvenio)
				.addComponent(TConvenio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(BTGravar)
				.addComponent(BTCancelar))
				.addContainerGap())
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);

	}
}
