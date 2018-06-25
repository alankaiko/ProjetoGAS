package br.com.gsv.agenda.formulario;



import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class Teste {

	public static void main(String[] args) {
		DateTime dateTime = new DateTime(2018, 01, 01, 06, 00, 00);
        DateTimeFormatter fmt = DateTimeFormat.forPattern("HH:mm");
    
        
        
        
       // LocalDate localDate = new LocalDate();
       // LocalDate moreDays = localDate.withYear(2008).plusDays(8);
      //  System.out.println(moreDays.toString("dd/MM/yyyy"));
        // 29/02/2008
        
        
        DateTime hoje = new DateTime();
       // String quase = fmt.print(hoje);
        dateTime.getHourOfDay();
       
        hoje.getMinuteOfHour();
        System.out.println(dateTime.getMinuteOfHour());
        System.out.println(fmt.print(dateTime));
        dateTime = dateTime.minusMinutes(30);
        System.out.println(fmt.print(dateTime));
	}


	

}













