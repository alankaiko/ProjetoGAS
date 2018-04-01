package br.com.projeto.gsv.util;

import javax.swing.JOptionPane;

public class MensagemPainelUtil {
	private static JOptionPane mensagem = new JOptionPane();
	
	@SuppressWarnings("static-access")
	public static void Advertencia(){
		mensagem.showMessageDialog(mensagem, "Preencha os campos Obrigatórios");
	}
	
	@SuppressWarnings("static-access")
	public static void AutenticaUsuario(){
		mensagem.showMessageDialog(mensagem, "Usuário inexistente");
	}
	
	
	
}
