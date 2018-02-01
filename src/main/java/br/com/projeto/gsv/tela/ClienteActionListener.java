package br.com.projeto.gsv.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.service.CadastroClienteService;

public class ClienteActionListener implements ActionListener{

	private FrmIncluirClienteCPF clienteForm;
	private CadastroClienteService service;
	
	public ClienteActionListener(FrmIncluirClienteCPF clienteForm) {
		this.clienteForm = clienteForm;
		service = new CadastroClienteService();
		AdicionarListener();
	}
	
private void Inserir(){
		
	}
	
	private void Salvar(){}
	
	
	public void AdicionarListener(){
		clienteForm.getBTNovo().addActionListener(this);
		clienteForm.getBTGravar().addActionListener(this);
		clienteForm.getBTCancelar().addActionListener(this);
	}
	
	private Cliente FormToCliente(){
		Cliente cliente = new Cliente();
		
		if(!"".equals(clienteForm.getLId().getText())){
			cliente.setId(Long.parseLong(clienteForm.getLId().getText()));
		}

		cliente.setNome(this.clienteForm.getTNome().getText());
		
	}
	
	

	
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Inserir")){
			
		}
		
		if(event.getActionCommand().equals("Salvar")){
			
		}
		
		if(event.getActionCommand().equals("Cancelar")){
			
		}
		
	}
	
}
