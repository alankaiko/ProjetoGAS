package zzzzteste;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class Abre {
	
	
	
	public static void main(String[] args) {
		VamosVer v = new VamosVer();
		v.denovo();
	}
	
	
	
	
	private static String weekDay(Calendar cal) {
	    return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
	}

}
