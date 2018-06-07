package br.com.gsv.agenda.formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import javax.swing.JScrollPane;

import org.hibernate.type.descriptor.java.CalendarTypeDescriptor.CalendarMutabilityPlan;

public class GerenciarAgendas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	Date comeco;
    Calendar calendario;

	
	public static void main(String[] args) {
		try {
			GerenciarAgendas dialog = new GerenciarAgendas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GerenciarAgendas() {
		setBounds(100, 100, 760, 531);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		Date comeco = new Date();
	    Calendar calendario = Calendar.getInstance();
	    calendario.setTime(comeco);
	    
	   String hoje = new DateFormatSymbols().getWeekdays()[calendario.get(Calendar.DAY_OF_WEEK)];
	   System.out.println(hoje);
		
		
	    
	/* System.out.println(Calendar.DAY_OF_WEEK);
	 System.out.println("Dias da semana");
	 System.out.println(Calendar.SUNDAY);
	 System.out.println(Calendar.MONDAY);
	 System.out.println(Calendar.TUESDAY);
	 System.out.println(Calendar.WEDNESDAY);
	 System.out.println(Calendar.THURSDAY);
	 System.out.println(Calendar.FRIDAY);
	 System.out.println(Calendar.SATURDAY);*/
	}
	
	public String DiaDaSemana(Calendar cal) {			
		String hoje = new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
		System.out.println(hoje);
		
		
		/*		 
		String antesAntesOntem = new DateFormatSymbols().getWeekdays()[calendario.get(Calendar.DAY_OF_WEEK)-3];
	    String antesOntem = new DateFormatSymbols().getWeekdays()[calendario.get(Calendar.DAY_OF_WEEK)-2];
	    String ontem = new DateFormatSymbols().getWeekdays()[calendario.get(Calendar.DAY_OF_WEEK)-1];	    
	    
	    String amanha = new DateFormatSymbols().getWeekdays()[calendario.get(Calendar.DAY_OF_WEEK)+1];
	    String depoisAmanha = new DateFormatSymbols().getWeekdays()[calendario.get(Calendar.DAY_OF_WEEK)+2];
	    String depoisDepoisAmanha = new DateFormatSymbols().getWeekdays()[calendario.get(Calendar.DAY_OF_WEEK)+3];*/
	    
	    
	    return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
	}
	
	
}
