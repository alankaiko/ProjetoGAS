package aaaTeste;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;

public class TelaBeta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel botao1, botao2, botao3, botao4;
	private JPanel panHome, panUser, panProfile, panSettings;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBeta frame = new TelaBeta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public TelaBeta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setLocationByPlatform(true);
        setUndecorated(true);
		
		JPanel painelEsquerdo = new JPanel();
		painelEsquerdo.setBackground(new Color(26,35,51));
		painelEsquerdo.setBounds(0, 0, 121, 452);
		contentPane.add(painelEsquerdo);
		
		botao1 = new JPanel();
		botao1.setBackground(new Color(41,57,80));
		
		botao2 = new JPanel();
		botao2.setBackground(new Color(41, 57, 80));
		
		panUser = new JPanel();
		
		JLabel LUser = new JLabel("Users");
		LUser.setForeground(Color.WHITE);
		LUser.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LUser.setBackground(Color.WHITE);
		GroupLayout gl_botao2 = new GroupLayout(botao2);
		gl_botao2.setHorizontalGroup(
			gl_botao2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 121, Short.MAX_VALUE)
				.addGroup(gl_botao2.createSequentialGroup()
					.addComponent(panUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(LUser)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		gl_botao2.setVerticalGroup(
			gl_botao2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 33, Short.MAX_VALUE)
				.addComponent(panUser, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_botao2.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(LUser)
					.addContainerGap())
		);
		botao2.setLayout(gl_botao2);
		
		botao3 = new JPanel();
		botao3.setBackground(new Color(41, 57, 80));
		
		panProfile = new JPanel();
		
		JLabel LProfile = new JLabel("Profile");
		LProfile.setForeground(Color.WHITE);
		LProfile.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LProfile.setBackground(Color.WHITE);
		GroupLayout gl_botao3 = new GroupLayout(botao3);
		gl_botao3.setHorizontalGroup(
			gl_botao3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 121, Short.MAX_VALUE)
				.addGroup(gl_botao3.createSequentialGroup()
					.addComponent(panProfile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(LProfile)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		gl_botao3.setVerticalGroup(
			gl_botao3.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 33, Short.MAX_VALUE)
				.addComponent(panProfile, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
				.addGroup(gl_botao3.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(LProfile)
					.addContainerGap())
		);
		botao3.setLayout(gl_botao3);
		
		botao4 = new JPanel();
		botao4.setBackground(new Color(41, 57, 80));
		
		panSettings = new JPanel();
		
		JLabel LSettings = new JLabel("Settings");
		LSettings.setForeground(Color.WHITE);
		LSettings.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LSettings.setBackground(Color.WHITE);
		GroupLayout gl_botao4 = new GroupLayout(botao4);
		gl_botao4.setHorizontalGroup(
			gl_botao4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 121, Short.MAX_VALUE)
				.addGroup(gl_botao4.createSequentialGroup()
					.addComponent(panSettings, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(LSettings)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		gl_botao4.setVerticalGroup(
			gl_botao4.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 33, Short.MAX_VALUE)
				.addComponent(panSettings, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
				.addGroup(gl_botao4.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(LSettings)
					.addContainerGap())
		);
		botao4.setLayout(gl_botao4);
		GroupLayout gl_painelEsquerdo = new GroupLayout(painelEsquerdo);
		gl_painelEsquerdo.setHorizontalGroup(
			gl_painelEsquerdo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelEsquerdo.createSequentialGroup()
					.addGroup(gl_painelEsquerdo.createParallelGroup(Alignment.LEADING)
						.addComponent(botao1, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
						.addComponent(botao2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addComponent(botao3, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addComponent(botao4, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_painelEsquerdo.setVerticalGroup(
			gl_painelEsquerdo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelEsquerdo.createSequentialGroup()
					.addGap(103)
					.addComponent(botao1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botao2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botao3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botao4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(199, Short.MAX_VALUE))
		);
		
		panHome = new JPanel();
		
		JLabel LHome = new JLabel("Home");
		LHome.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LHome.setForeground(Color.WHITE);
		LHome.setBackground(Color.WHITE);
		GroupLayout gl_botao1 = new GroupLayout(botao1);
		gl_botao1.setHorizontalGroup(
			gl_botao1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_botao1.createSequentialGroup()
					.addComponent(panHome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(LHome)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		gl_botao1.setVerticalGroup(
			gl_botao1.createParallelGroup(Alignment.LEADING)
				.addComponent(panHome, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_botao1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(LHome)
					.addContainerGap())
		);
		botao1.setLayout(gl_botao1);
		painelEsquerdo.setLayout(gl_painelEsquerdo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(71,120,197));
		panel_1.setBounds(122, 0, 802, 48);
		contentPane.add(panel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(123, 156, 225));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBorder(null);
		textField.setCaretColor(new Color(255, 255, 255));
		textField.setPreferredSize(new Dimension(2, 20));
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Search_18px.png")));
		
		JDesktopPane desktopPane = new JDesktopPane();
		
		JToolBar toolBar = new JToolBar();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(24)
					.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addGap(130)
					.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_7)
					.addGap(71))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_7)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
						.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(71,120,197));
		panel_2.setBounds(122, 48, 281, 404);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(120,168,252));
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(SystemColor.text);
		panel_4.setBackground(new Color(84,127,206));
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Exit_25px.png")));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addContainerGap(213, Short.MAX_VALUE)
					.addComponent(label_5)
					.addGap(22))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(27)
					.addComponent(label_5)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Secured_Letter_25px_2.png")));
		
		JSeparator separator = new JSeparator();
		
		JLabel label_1 = new JLabel("");
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Contacts_25px.png")));
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Calendar_25px.png")));
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(TelaBeta.class.getResource("/images/icons8_Lock_25px.png")));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(9)
							.addComponent(label)
							.addGap(28)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(56, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel label_6 = new JLabel("04");
		label_6.setForeground(SystemColor.text);
		label_6.setFont(new Font("Segoe UI", Font.PLAIN, 52));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(107)
					.addComponent(label_6))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(label_6))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255,255,255));
		panel_5.setBounds(400, 48, 524, 404);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(47)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(253, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		Button btnBook = new Button("Book");
		btnBook.setBounds(215, 381, 84, 23);
		btnBook.setBackground(new Color(71, 120, 197));
		btnBook.setFont(new Font("Segoe UI", 0, 14));
		btnBook.setForeground(new Color(255, 255, 255));
		contentPane.add(btnBook);
		
		AdicionaListeners();
	}
	
	
	
	private void AdicionaListeners(){
		botao1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                Botao1Pressionado(evt);
            }
        });
		 
		botao2.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent evt) {
                Botao2Pressionado(evt);
            }
        });
		
		
		botao3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                Botao3Pressionado(evt);
            }
        });
		
        botao4.addMouseListener(new MouseAdapter() {
	            public void mousePressed(MouseEvent evt) {
	                Botao4Pressionado(evt);
	            }
        });
	   
	}	
	
	private void Botao1Pressionado(MouseEvent evt) {
        AtivaBotao(botao1); 
        panHome.setOpaque(true);
        ResetaBotao(new JPanel[]{botao2, botao3, botao4}, new JPanel[]{panUser, panProfile, panSettings});
    }

    private void Botao2Pressionado(MouseEvent evt) {
        AtivaBotao(botao2); 
        panUser.setOpaque(true);
        ResetaBotao(new JPanel[]{botao1, botao3, botao4}, new JPanel[]{panHome, panProfile, panSettings});
    }

    private void Botao3Pressionado(MouseEvent evt) {
    	AtivaBotao(botao3); 
        panProfile.setOpaque(true);
        ResetaBotao(new JPanel[]{botao1, botao2, botao4}, new JPanel[]{panHome, panUser, panSettings});
    }

    private void Botao4Pressionado(MouseEvent evt) {
        AtivaBotao(botao4); 
        panSettings.setOpaque(true);
        ResetaBotao(new JPanel[]{botao1, botao2, botao3}, new JPanel[]{panHome, panUser, panProfile});
    }
    
    
    private void AtivaBotao(JPanel painel){
		painel.setBackground(new Color(41,57,80));
	}
	
    private void ResetaBotao(JPanel [] painel, JPanel [] indicadores){
        for(int i=0;i<painel.length;i++){
        	painel[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicadores.length;i++){
        	indicadores[i].setOpaque(false);           
        }
        
    }
}
























