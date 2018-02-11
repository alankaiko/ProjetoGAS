package br.com.projeto.gsv.formularios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.formularios.FrmClienteDetail;
import br.com.projeto.gsv.util.ConverteDadosUtil;

public class DetailClienteListener implements ActionListener{
	private Cliente cliente;
	private FrmClienteDetail formulario;
	private ClienteController con;
	
	public DetailClienteListener(FrmClienteDetail formulario) {
		this.formulario = formulario;
		this.con = new ClienteController();
	}

	
	public void GetDados(){
		this.formulario.getTId().setText(String.valueOf(this.cliente.getId()));
		this.formulario.getTNome().setText(this.cliente.getNome());
		this.formulario.getTRg().setText(this.cliente.getRg());
		this.formulario.getJCpf().setText(this.cliente.getCpf());
		this.formulario.getTObservacao().setText(this.cliente.getObservacao());
		this.formulario.getJDataNasc().setText(ConverteDadosUtil.TransformandoEmString(this.cliente.getDataNasc()));
		this.formulario.getJDataCadastro().setText(ConverteDadosUtil.TransformandoEmString(this.cliente.getDataCad()));
		this.formulario.getTLogradouro().setText(this.cliente.getEndereco().get(0).getLogradouro());
		this.formulario.getTComplemento().setText(this.cliente.getEndereco().get(0).getComplemento());
		this.formulario.getTNumero().setText(String.valueOf(this.cliente.getEndereco().get(0).getNumero()));
		this.formulario.getTBairro().setText(this.cliente.getEndereco().get(0).getBairro());
		this.formulario.getTCidade().setText(this.cliente.getEndereco().get(0).getCidade());
		this.formulario.getTCep().setText(this.cliente.getEndereco().get(0).getCep());
		this.formulario.getTEmail().setText(this.cliente.getContato().get(0).getEmail());
		this.formulario.getTCelular().setText(this.cliente.getContato().get(0).getCelular());
		this.formulario.getTTelefone().setText(this.cliente.getContato().get(0).getTelefone());
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==(this.formulario.getCancelar())){
			this.formulario.dispose();
		}
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
