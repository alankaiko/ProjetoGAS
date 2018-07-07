package br.com.gsv.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.domain.Funcionario;
import br.com.gsv.domain.Usuario;
import br.com.gsv.formularios.BuscarFuncionarioDialog;
import br.com.gsv.formularios.IncluirUsuarioForm;
import br.com.gsv.util.MensagemPainelUtil;
import br.com.gsv.util.ValidaCampos;
import br.com.projeto.gsv.controller.FuncionarioController;
import br.com.projeto.gsv.controller.UsuarioController;

public class IncluirUsuarioListener implements ActionListener{
	private IncluirUsuarioForm formulario;
	private Usuario usuario;
	private Funcionario funcionario;
	private UsuarioController control;
	
	public IncluirUsuarioListener(IncluirUsuarioForm formulario) {
		this.formulario = formulario;
		control = new UsuarioController();
		AdicionaListener();
		UsandoTAB();
		TeclaEsc();
		UpCase();
	
	}

	private void AdicionaListener(){
		this.formulario.getBGravar().addActionListener(this);
		this.formulario.getBCancelar().addActionListener(this);
		this.formulario.getBPesquisar().addActionListener(this);
	}
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
	public void AlterandoObjetos() {
		this.funcionario = this.usuario.getFuncionario();
		this.formulario.getTFuncionario().setText(this.usuario.getFuncionario().getNome());
		this.formulario.getJCpf().setText(this.usuario.getFuncionario().getCpf());
		this.formulario.getTCpf().setText(this.formulario.getJCpf().getText());
		this.formulario.getTRg().setText(this.usuario.getFuncionario().getRg());
		
		this.formulario.getTLogin().setText(this.usuario.getLogin());
	}

	public void IniciaObjetos(){
		this.usuario = new Usuario();
	}
	
	
	private void FormToUsuario(){
		usuario.setFuncionario(this.funcionario);
		usuario.setLogin(this.formulario.getTLogin().getText());
		usuario.setSenha(this.formulario.getTSenha().getText());
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBPesquisar())){
				BuscarFuncionarioDialog dialog = new BuscarFuncionarioDialog();
			dialog.setLocationRelativeTo(this.formulario.getTela());
			dialog.setVisible(true);
			
			if(dialog.getListener().getCodigo() != null)
				BuscarFuncionario(dialog.getListener().getCodigo());
			
		}else if(event.getSource().equals(this.formulario.getBGravar()) && Validando()){
			FormToUsuario();
			
			control.setUsuario(this.usuario);
			control.SalvarUsuario();
			
			this.formulario.dispose();
			
		}else if(event.getSource().equals(this.formulario.getBCancelar())){
			this.formulario.dispose();
			
		}else{
			MensagemPainelUtil.Advertencia();
		}
		
	}
	
	
	private boolean Validando(){
		return ValidaCampos.Validar(this.formulario.getTFuncionario().getText())
				&& ValidaCampos.Validar(this.formulario.getTLogin().getText());
	}
	
	
	private void BuscarFuncionario(Long id){
		FuncionarioController controller = new FuncionarioController();
		this.funcionario = controller.BuscarPelaID(id);
		
		this.formulario.getTFuncionario().setText(this.funcionario.getNome());
		this.formulario.getJCpf().setText(this.funcionario.getCpf());
		this.formulario.getTCpf().setText(this.formulario.getJCpf().getText());
		this.formulario.getTRg().setText(this.funcionario.getRg());
	}
	
	
	private void UsandoTAB() {
		this.formulario.getRootPane().setDefaultButton(
				this.formulario.getBGravar());
		this.formulario.getBGravar().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					formulario.getBGravar().doClick();
				}
			}
		});

		this.formulario.getBCancelar().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					formulario.getBCancelar().doClick();
				}
			}
		});
	}

	
	
	private void UpCase(){
		this.formulario.getTLogin().addKeyListener(new KeyAdapter() {  
			public void keyReleased(KeyEvent ke) {  
				if (ke.getKeyCode() != KeyEvent.VK_HOME) {  
					String s = formulario.getTLogin().getText();  
					formulario.getTLogin().setText(s.toUpperCase());  
				}  
			}  
		}); 	
	}
	
	
	
	
	public void TeclaEsc() {
		JRootPane meurootpane = this.formulario.getRootPane();
		meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
		meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
			public void actionPerformed(ActionEvent e) {
				formulario.dispose();
			}
		});
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
