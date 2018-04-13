package zzzzteste;

import java.io.IOException;

import br.com.gsv.relatorios.AbstractRelatorios;
import br.com.gsv.relatorios.RelatorioProdutos;
import br.com.gsv.relatorios.RelatorioProntuario;

import com.itextpdf.text.DocumentException;

public class Teste {

	public static void main(String[] args) {

		try {
			AbstractRelatorios rela = new RelatorioProntuario();
			rela.Iniciar();
			
		} catch (IOException | DocumentException e) {
			e.printStackTrace();
		}
	}
}
