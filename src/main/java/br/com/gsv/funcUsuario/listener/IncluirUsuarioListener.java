package br.com.gsv.funcUsuario.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.gsv.funcUsuario.domain.Usuario;
import br.com.gsv.funcUsuario.formularios.IncluirUsuarioForm;
import br.com.gsv.funcionario.domain.Funcionario;
import br.com.gsv.funcionario.formularios.BuscarFuncionarioDialog;
import br.com.projeto.gsv.controller.FuncionarioController;
import br.com.projeto.gsv.controller.PacienteController;
import br.com.projeto.gsv.controller.UsuarioController;
import br.com.projeto.gsv.util.ConverteDadosUtil;

public class IncluirUsuarioListener implements ActionListener{
	private IncluirUsuarioForm formulario;
	private Usuario usuario;
	private Funcionario funcionario;
	
	public IncluirUsuarioListener(IncluirUsuarioForm formulario) {
		this.formulario = formulario;
		AdicionaListener();
	}

	private void AdicionaListener(){
		this.formulario.getBGravar().addActionListener(this);
		this.formulario.getBCancelar().addActionListener(this);
		this.formulario.getBPesquisar().addActionListener(this);
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBPesquisar())){
			BuscarFuncionarioDialog dialog = new BuscarFuncionarioDialog();
			dialog.setLocationRelativeTo(this.formulario.getTela());
			dialog.setVisible(true);
			BuscarFuncionario(dialog.getListener().getCodigo());
		}
		
	}
	
	
	private void BuscarFuncionario(Long id){
		FuncionarioController controller = new FuncionarioController();
		this.funcionario = controller.BuscarPelaID(id);
		
		this.formulario.getTFuncionario().setText(this.funcionario.getNome());
		this.formulario.getJCpf().setText(this.funcionario.getCpf());
		this.formulario.getTCpf().setText(this.formulario.getJCpf().getText());
		this.formulario.getTRg().setText(this.funcionario.getRg());
	}
	
	
	
}
