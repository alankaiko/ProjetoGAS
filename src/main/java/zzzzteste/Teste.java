package zzzzteste;

import java.io.IOException;
import java.util.Calendar;

import br.com.gsv.relatorios.TestandoCelulas;

import com.itextpdf.text.DocumentException;

public class Teste {
	
	public static void main(String[] args){
		
		try {
			TestandoCelulas celulas = new TestandoCelulas();
			
			celulas.CriarPdf();
			
		} catch (IOException | DocumentException e) {
			e.printStackTrace();
		}
		
		
	}
}
