package br.com.projeto.gsv.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class SomenteNumerosUtil  implements KeyListener{
	private int valor;
	
	
	
	@Override
	public void keyTyped(KeyEvent event) {
		JTextField jtf = (JTextField) event.getSource();
		char key = event.getKeyChar();
		boolean press = (key == KeyEvent.VK_SPACE || key == KeyEvent.VK_DELETE || Character
				.isDigit(key));
		if (!press || jtf.getText().length() == getValor()) {
			event.consume();
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}

}
