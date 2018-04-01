package br.com.gsv.zprincipal.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.postgresql.util.MD5Digest;

import br.com.gsv.funcUsuario.domain.Usuario;
import br.com.gsv.zprincipal.form.TelaLogin;
import br.com.gsv.zprincipal.form.TelaPrincipalClassic;
import br.com.projeto.gsv.controller.UsuarioController;

public class TelaLoginListener implements ActionListener, MouseListener{
	private TelaLogin formulario;
	private Usuario usuario;
	
	public TelaLoginListener(TelaLogin formulario) {
		this.formulario = formulario;
		AdicionarListener();
		UpCase();
		ArrastandoPainel();
	}

	private void AdicionarListener(){
		this.formulario.getBotaoEntrar().addActionListener(this);
		this.formulario.getBotaoFechar().addMouseListener(this);
	}
	
	
	
	private void Autenticando(){
		UsuarioController control = new UsuarioController();
		
		String login = this.formulario.getCampoTexto().getText();
		String senha = this.formulario.getCampoSenha().getText();
		
		this.usuario = control.AutenticaLogin(login, senha);
	}
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent event) {
		if(event.getSource().equals(this.formulario.getBotaoFechar())){
			System.exit(0);
		}
	}
	@Override
	public void mousePressed(MouseEvent event) {
	}
	@Override
	public void mouseReleased(MouseEvent event) {
	}
	@Override
	public void mouseEntered(MouseEvent event) {
	}
	@Override
	public void mouseExited(MouseEvent event) {
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBotaoEntrar())){
			Autenticando();
			
			if(this.usuario != null){
				this.formulario.dispose();
				TelaPrincipalClassic classic = new TelaPrincipalClassic();
				classic.setLocationRelativeTo(this.formulario.getContentPane());
				classic.setVisible(true);
			}
			
		}
		
	}
	
	
	
	private void UpCase(){
		this.formulario.getCampoTexto().addKeyListener(new KeyAdapter() {  
			public void keyReleased(KeyEvent ke) {  
				if (ke.getKeyCode() != KeyEvent.VK_HOME) {  
					String s = formulario.getCampoTexto().getText();  
					formulario.getCampoTexto().setText(s.toUpperCase());  
				}  
			}  
		}); 	
	}
	
	private void ArrastandoPainel(){
		
		this.formulario.getPainelDrag().addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                arrastaPainel(evt);
            }
        });
		
		this.formulario.getPainelDrag().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                arrastaPressionado(evt);
            }
        });
	}
	
	private void arrastaPressionado(MouseEvent evt) {
		this.formulario.setXx(evt.getX());
		this.formulario.setXy(evt.getY());
        //this.formulario.xx = evt.getX();
        //this.formulario.xy = evt.getY();
    }

    private void arrastaPainel(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.formulario.setLocation(x-this.formulario.getXx(),y-this.formulario.getXy());
    }
	
		
}
