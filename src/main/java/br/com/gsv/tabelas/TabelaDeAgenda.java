package br.com.gsv.tabelas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.gsv.domain.Agenda;

public class TabelaDeAgenda extends AbstractTableModel{
	DateFormat df = new SimpleDateFormat ("EEEE dd-MM-yyyy");
	private String[] colunas = new String[7];
	private List<Agenda> linhas;
	private static final int PRIMEIRA = 0;
    private static final int SEGUNDA = 1;
    private static final int TERCEIRA = 2;
    private static final int QUARTA = 3;
    private static final int QUINTA = 4;
    private static final int SEXTA = 5;
    private static final int SETIMA = 6;
    
	

    public TabelaDeAgenda() {
		CriaColunas();
	    linhas = new ArrayList<Agenda>();   
    }
 

	public TabelaDeAgenda(List<Agenda> dados) {
        linhas = new ArrayList<Agenda>(dados);	
    }
	
	
	
	
	 public void CriaColunas(){
    	Calendar calAntes = Calendar.getInstance();
		colunas[3]= df.format (calAntes.getTime());
		
		PopulaDiasAnteriores(calAntes);
		
		Calendar calDepois = Calendar.getInstance();
		PopulaDiasPosteriores(calDepois);
    }
 
	private void PopulaDiasAnteriores(Calendar cal){
		cal.add (Calendar.DATE, -1);
		colunas[2]= df.format (cal.getTime());
		
		cal.add (Calendar.DATE, -1);
		colunas[1]= df.format (cal.getTime());
		
		cal.add (Calendar.DATE, -1);
		colunas[0]= df.format (cal.getTime());
	}
	
	private void PopulaDiasPosteriores(Calendar cal){
		cal.add (Calendar.DATE, +1);
		colunas[4]= df.format (cal.getTime());
		
		cal.add (Calendar.DATE, +1);
		colunas[5]= df.format (cal.getTime());
		
		cal.add (Calendar.DATE, +1);
		colunas[6]= df.format (cal.getTime());
	}
	    
	
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    };
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
	        case PRIMEIRA:
	            return String.class;
	        case SEGUNDA:
	            return String.class;
	        case TERCEIRA:
	            return String.class;
	        case QUARTA:
	            return String.class;
	        case QUINTA:
	            return String.class;
	        case SEXTA:
	            return String.class;
	        case SETIMA:
	            return String.class;
	        default:
	       
	        throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
	public int getRowCount() {
	    return linhas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
        
		Agenda dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
	        case PRIMEIRA:
	            return dados.getId();
	        case SEGUNDA:
	            return dados.getId();
	        case TERCEIRA:
	            return dados.getId();
	        case QUARTA:
	            return dados.getId();
	        case QUINTA:
	            return dados.getId();
	        case SEXTA:
	            return dados.getId();
	        case SETIMA:
	            return dados.getId();
	        default:
           
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
	
	 
	
	public void addAgenda(Agenda dados) {
	    linhas.add(dados);
	    int ultimoIndice = getRowCount() - 1;
	    fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	 
	 
	
	public void addListaAgenda(List<Agenda> dados) {
	    int indice = getRowCount();
	    linhas.addAll(dados);
	    fireTableRowsInserted(indice, indice + dados.size());
	}
	 

	public void limpar() {
	    linhas.clear();
	    fireTableDataChanged();
	}
	
	
	
	
	
	
	@Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       
        Agenda dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
	        case PRIMEIRA:
	        	dados.setId((Long) aValue);
	            break;
	        case SEGUNDA:
	        	dados.setId((Long) aValue);
	            break;
	        case TERCEIRA:
	        	dados.setId((Long) aValue);
	            break;
	        case QUARTA:
	        	dados.setId((Long) aValue);
	            break;
	        case QUINTA:
	        	dados.setId((Long) aValue);
	            break;
	        case SEXTA:
	        	dados.setId((Long) aValue);
	            break;
	        case SETIMA:
	        	dados.setId((Long) aValue);
	            break;
	        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }         
        fireTableCellUpdated(rowIndex, columnIndex); 
    }
}