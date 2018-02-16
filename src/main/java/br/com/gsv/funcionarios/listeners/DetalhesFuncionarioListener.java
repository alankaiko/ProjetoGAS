package br.com.gsv.funcionarios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.funcionario.domain.Funcionario;
import br.com.gsv.funcionario.formularios.DetalhesFuncionarioDialog;

public class DetalhesFuncionarioListener implements ActionListener{
	private Funcionario funcionario;
	private DetalhesFuncionarioDialog formulario;

	
	public DetalhesFuncionarioListener(DetalhesFuncionarioDialog formulario) {
		this.formulario = formulario;
		AdicionarListener();
		UsandoTAB();
		TeclaEsc();
	}

	
	public void AdicionarListener(){
		this.formulario.getCancelar().addActionListener(this);
	}
	
	
	
	public void Detalhar(){
		this.formulario.getTId().setText(String.valueOf(this.funcionario.getId()));
		this.formulario.getTNome().setText(this.funcionario.getNome());
		this.formulario.getTRg().setText(this.funcionario.getRg());
		this.formulario.getJCpf().setText(this.funcionario.getCpf());
		this.formulario.getTCpf().setText(this.formulario.getJCpf().getText());
		this.formulario.getTLogradouro().setText(this.funcionario.getEndereco().get(0).getLogradouro());
		this.formulario.getTComplemento().setText(this.funcionario.getEndereco().get(0).getComplemento());
		this.formulario.getTNumero().setText(String.valueOf(this.funcionario.getEndereco().get(0).getNumero()));
		this.formulario.getTBairro().setText(this.funcionario.getEndereco().get(0).getBairro());
		this.formulario.getTCidade().setText(this.funcionario.getEndereco().get(0).getCidade());
		this.formulario.getTComboEstado().setText(this.funcionario.getEndereco().get(0).getEstado());
		this.formulario.getJCep().setText(this.funcionario.getEndereco().get(0).getCep());
		this.formulario.getTCep().setText(this.formulario.getJCep().getText());
		this.formulario.getTEmail().setText(this.funcionario.getContato().get(0).getEmail());
		this.formulario.getTCelular().setText(this.funcionario.getContato().get(0).getCelular());
		this.formulario.getTTelefone().setText(this.funcionario.getContato().get(0).getTelefone());
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getCancelar())){
			this.formulario.dispose();
		}
	}
	
	
	private void UsandoTAB(){
		this.formulario.getRootPane().setDefaultButton(this.formulario.getCancelar());
		this.formulario.getCancelar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getCancelar().doClick();  
                }  
            }  
        });
	}
	
	
	
	public void TeclaEsc(){
        JRootPane meurootpane = this.formulario.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
  
            public void actionPerformed(ActionEvent e) {  
            	formulario.dispose();  
            }  
        });  
    } 

	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
