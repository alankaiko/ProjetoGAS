package zzzzteste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class VamosVer {
	DateFormat df = new SimpleDateFormat ("EEEE dd-MM-yyyy");
	private String[] colunas = new String[7];
	
	public void denovo(){
		
		Calendar cal = Calendar.getInstance();
		System.out.println (df.format (cal.getTime()));	
		
		System.out.println("Antes");
		antes(cal);
		
		Calendar xcal = Calendar.getInstance();
		System.out.println("Depois");
		depois(xcal);
	}
	
	private void antes(Calendar cal){
		cal.add (Calendar.DATE, -1);
		System.out.println (df.format (cal.getTime()));
		
		cal.add (Calendar.DATE, -1);
		System.out.println (df.format (cal.getTime()));
		
		cal.add (Calendar.DATE, -1);
		System.out.println (df.format (cal.getTime()));
	}
	
	private void depois(Calendar cal){
		cal.add (Calendar.DATE, +1);
		System.out.println (df.format (cal.getTime()));
		
		cal.add (Calendar.DATE, +1);
		System.out.println (df.format (cal.getTime()));
		
		cal.add (Calendar.DATE, +1);
		System.out.println (df.format (cal.getTime()));
	}
}
