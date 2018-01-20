package br.com.projeto.gsv.TESTE;

import java.util.Date;

import br.com.projeto.gsv.controller.ControlCadFuncionario;
import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.Funcionario;
import br.com.projeto.gsv.domain.SexoType;

public class Teste {

	public static void main(String[] args) {
		ControlCadFuncionario controle = new ControlCadFuncionario();
		controle.Inicializar();
		
		Funcionario fun = new Funcionario();
		fun.setId(1);
		fun.setNome("funcioneris");
		fun.setCpf("97515475414");
		fun.setRg("5224485");
		fun.setDataNasc(new Date());
		fun.setObservacoes("nenhum observacao");
		fun.setSexo(SexoType.MASCULINO);
		
		Contato con = new Contato();
		con.setId(1);
		con.setEmail("funcio@gmail.com");
		con.setCelular("9 9999 9555");
		con.setTelefone("3225 8445");
		
		Endereco end = new Endereco();
		end.setId(1);
		end.setLogradouro("rua qualquer");
		end.setComplemento("de qualquer lugar");
		end.setNumero(5);
		end.setCidade("gyn");
		end.setEstado("GO");
		end.setBairro("setor das matas");
		
		controle.setFuncionario(fun);
		controle.setEndereco(end);
		controle.setContato(con);
		
		controle.SalvarFuncionario();
	}

}
