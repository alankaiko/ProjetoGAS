package br.com.projeto.gsv.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConverteDadosUtil {
	
	
	//Converte as datas de String para Date para ser armazenadas
	public static Date TransformandoEmDate(String data){
		Date dat = null;
		
		try {
			DateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
			dat = (Date)formata.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return dat;
	}
	
	
	//Faz o inverso, pega a variavel do tipo Date e transforma em String
	public static String TransformandoEmString(Date data){
		String dat;
		
		Calendar calen = Calendar.getInstance();
		calen.setTime(data);
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dat = df.format(calen.getTime());
		return dat;
	}
		
		
	
	//Pega a data do dia atual e transforma em String para ser apresentada pra quem chamar
	public static String RetornaDataAtual(){
		String valor;
		
		Date data = new Date();
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		
		valor = df.format(calendario.getTime());
		return valor;
	}
	
	
}
