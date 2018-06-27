package br.com.gsv.tabelas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.gsv.domain.Agenda;
import br.com.gsv.domain.Fabricante;

public class TabelaDeAgenda extends AbstractTableModel{
	DateFormat df = new SimpleDateFormat ("EEEE dd-MM-yyyy");
	DateFormat dias = new SimpleDateFormat("");
	private String[] colunas = new String[3];
	private List<Agenda> linhas;
	private static final int HORA = 0;
    private static final int DIA = 1;
    private static final int TIPO = 2;
    
	

    public TabelaDeAgenda() {
		CriaColunas();
	    linhas = new ArrayList<Agenda>();   
    }
 

	public TabelaDeAgenda(List<Agenda> dados) {
        linhas = new ArrayList<Agenda>(dados);	
    }
	
	
	
	
	 public void CriaColunas(){
		colunas[0] = "HORA";
		 
    	Calendar cal = Calendar.getInstance();
		colunas[1]= df.format (cal.getTime());
		
		colunas[2]= "TIPO DE CONSULTA";
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
	        case HORA:
	            return String.class;
	        case DIA:
	            return String.class;
	        case TIPO:
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
	        case HORA:
	            return dados.getHoraDesejada();
	        case DIA:
	            return dados.getPaciente().getNome();
	        case TIPO:
	            return dados.getTipoAgendamento();
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
	        case HORA:
	        	dados.setHoraDesejada((String) aValue);
	            break;
	        case DIA:
	        	dados.getPaciente().setNome((String) aValue);
	            break;
	       // case TIPO:
	        //	dados.getTipoAgendamento()
	         //   break;
	        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }         
        fireTableCellUpdated(rowIndex, columnIndex); 
    }
}