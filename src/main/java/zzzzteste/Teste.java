package zzzzteste;

import java.io.IOException;

import com.itextpdf.text.DocumentException;

import br.com.gsv.relatorios.Relatorio;
import br.com.gsv.relatorios.TestandoCelulas;

public class Teste {
	
	
	public static void main(String[] args){
		Relatorio rela = new Relatorio();
		//rela.ConfiguraRelTotal();
		
		TestandoCelulas t = new TestandoCelulas();
		try {
			t.CriarPdf();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
