package br.com.gsv.tabelas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.gsv.domain.Evolucao;
import br.com.gsv.domain.sub.EnumEvolucaoEstGeral;
import br.com.gsv.domain.sub.EnumEvolucaoNivelConsciencia;

public class TabelaDeEvolucao extends AbstractTableModel {
	private String[] colunas = new String[] { "DATA DA INCLUSÃO", "PACIENTE", "TEMPO DE INTERNAÇÃO", "NÍVEL CONSCIÊNCIA", "ESTADO GERAL"};
	private List<Evolucao> linhas;
	private static final int DATA = 0;
    private static final int PACIENTE = 1;
    private static final int INTERNACAO = 2;
    private static final int CONSCIENCIA = 3;
    private static final int ESTADOGERAL = 4; 
    
    
    public TabelaDeEvolucao() {
        linhas = new ArrayList<Evolucao>();       
    }
 
    
    public TabelaDeEvolucao(List<Evolucao> dadosEvolucao) {
        linhas = new ArrayList<Evolucao>(dadosEvolucao);
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
        case DATA:
            return String.class;
        case PACIENTE:
            return String.class;
        case INTERNACAO:
            return String.class;
        case CONSCIENCIA:
            return String.class;
        case ESTADOGERAL:
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
        Evolucao dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
        case DATA:
            return dados.getData();
        case PACIENTE:
            return dados.getPaciente().getNome();
        case INTERNACAO:
            return dados.getTempoInternacao();
        case CONSCIENCIA:
            return dados.getEnumNivelConsciencia().getValor();
        case ESTADOGERAL:
            return dados.getEnumEstadoGeral().getValor();
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
	
	 
	
	public void addSocio(Evolucao dados) {
	    linhas.add(dados);
	    int ultimoIndice = getRowCount() - 1;
	    fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	 
	 
	
	public void addListaEvolucao(List<Evolucao> dados) {
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
       
        Evolucao dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
        case DATA:
        	dados.setData((Date) aValue);
            break;
        case PACIENTE:
        	dados.getPaciente().setNome((String) aValue);
            break;
        case INTERNACAO:
        	dados.setTempoInternacao((String) aValue);
            break;
        case CONSCIENCIA:
        	dados.setEnumNivelConsciencia( (EnumEvolucaoNivelConsciencia) aValue);
            break;
        case ESTADOGERAL:
        	dados.setEnumEstadoGeral( (EnumEvolucaoEstGeral) aValue);
            break;
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
         
        fireTableCellUpdated(rowIndex, columnIndex); 
    }
}
