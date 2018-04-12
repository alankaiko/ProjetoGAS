package zzzzteste;

import java.io.IOException;

import br.com.gsv.relatorios.AbstractRelatorios;
import br.com.gsv.relatorios.RelatorioPaciente;
import br.com.gsv.relatorios.TestandoCelulas;

import com.itextpdf.text.DocumentException;

public class Teste {

	public static void main(String[] args) {

		try {
			AbstractRelatorios rela = new RelatorioPaciente();
			rela.Iniciar();
			//TestandoCelulas teste = new TestandoCelulas();
			//teste.CriarPdf();
		} catch (IOException | DocumentException e) {
			e.printStackTrace();
		}
	}
}
