package zzzzteste;

import java.io.IOException;

import br.com.gsv.relatorios.AbstractRelatorios;
import br.com.gsv.relatorios.RelatorioConvenio;
import br.com.gsv.relatorios.RelatorioFornecedores;
import br.com.gsv.relatorios.RelatorioFuncionario;
import br.com.gsv.relatorios.RelatorioPaciente;
import br.com.gsv.relatorios.RelatorioProdutos;

import com.itextpdf.text.DocumentException;

public class Teste {

	public static void main(String[] args) {

		try {
			AbstractRelatorios rela = new RelatorioConvenio();
			rela.Iniciar();
			//TestandoCelulas teste = new TestandoCelulas();
			//teste.CriarPdf();
		} catch (IOException | DocumentException e) {
			e.printStackTrace();
		}
	}
}
