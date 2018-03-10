package aaaTeste;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



public class TelaPrincipal extends JFrame {
	private JPanel contentPane;
	private Container tela = getContentPane();
	GroupLayout ind_1Layout, btn_1Layout, ind_2Layout, btn_2Layout, ind_3Layout, btn_3Layout, ind_4Layout;
	GroupLayout btn_4Layout, jPanel2Layout, jPanel5Layout, jPanel7Layout, jPanel6Layout, jPanel3Layout;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    setBackground(new Color(255, 255, 255));
	    setLocationByPlatform(true);
	    setUndecorated(true);
        
        
        InicializaComponentes();
        Renderiza();
    	AdicionaListeners();
    	GrupoAdiciona();
    	InicializaComponentes();
    	Tabelas();
	}
	
	
	private void Renderiza(){
		btn_1.setBackground(new Color(23, 35, 51));
		btn_2.setBackground(new Color(23, 35, 51));
		
		jLabel8.setFont(new Font("Segoe UI", 0, 12));
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Home");
        
        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new Dimension(3, 43));

        jLabel9.setFont(new Font("Segoe UI", 0, 12));
        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText("Settings");
        
        jLabel10.setFont(new Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new Color(255, 255, 255));
        jLabel10.setText("Users");

        btn_3.setBackground(new java.awt.Color(23, 35, 51));
        
        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new Dimension(3, 43));

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new Dimension(3, 43));
        
        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new Dimension(3, 43));

        jLabel11.setFont(new Font("Segoe UI", 0, 12)); 
        jLabel11.setForeground(new Color(255, 255, 255));
        jLabel11.setText("Profile");

        jTextField1.setBackground(new Color(123, 156, 225));
        jTextField1.setForeground(new Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new Color(255, 255, 255));
        jTextField1.setPreferredSize(new Dimension(2, 20));
        
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Search_18px.png")));
        jPanel3.setBackground(new Color(71, 120, 197));
        jPanel4.setBackground(new Color(120, 168, 252));
        jPanel5.setBackground(new Color(84, 127, 206));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Contacts_25px.png")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Calendar_25px.png")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Lock_25px.png")));

        jProgressBar1.setBackground(new Color(84, 127, 206));
        jProgressBar1.setForeground(new Color(0, 204, 204));
        jProgressBar1.setPreferredSize(new Dimension(146, 10));
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel5.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Water_25px.png")));
        jLabel15.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Secured_Letter_25px_2.png")));

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/images/imge_1.jpg")));
        jLabel12.setFont(new Font("Segoe UI", 0, 12));
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText("Amos");

        jLabel6.setFont(new Font("Segoe UI", 0, 52));
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("04");

        button1.setBackground(new Color(71, 120, 197));
        button1.setFont(new Font("Segoe UI", 0, 14));
        button1.setForeground(new Color(255, 255, 255));
        button1.setLabel("Book");

        jLabel13.setFont(new Font("Segoe UI", 0, 12));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText("May 2018");

        jLabel16.setFont(new Font("Segoe UI", 0, 12));
        jLabel16.setForeground(new Color(255, 255, 255));
        jLabel16.setText("Friday 23 Feb ");
        
        jPanel6.setBackground(new Color(255, 255, 255));
        jPanel7.setBackground(new Color(242, 247, 247));
        jLabel14.setFont(new Font("Segoe UI", 0, 12)); 
        jLabel14.setForeground(new Color(102, 102, 102));
        jLabel14.setText("Launch dates for the items listed ");
        
        jScrollPane1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jTable1.setGridColor(new Color(255, 255, 255));
        jTable1.setRowHeight(22);
        jScrollPane1.setViewportView(jTable1);
        side_pane.setBackground(new Color(23, 35, 51));
        
	}
	
	
	
	private void AdicionaListeners(){
		btn_1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });
		 
		btn_2.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent evt) {
                btn_2MouseReleased(evt);
            }
        });
		
		
		btn_3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });
		
		btn_4.setBackground(new Color(23, 35, 51));
	        btn_4.addMouseListener(new MouseAdapter() {
	            public void mousePressed(MouseEvent evt) {
	                btn_4MousePressed(evt);
	            }
        });
	        
	    jPanel2.setBackground(new Color(71, 120, 197));
	    jPanel2.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
	        
        jPanel2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        
        btn_exit.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Exit_25px.png")));
        btn_exit.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
            	btn_exitMousePressed(evt);
            }
        });
	}
	
	
	private void GrupoAdiciona(){
		ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
    		ind_1Layout.createParallelGroup(
				GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE)
		); 
        
        ind_1Layout.setVerticalGroup(
    		ind_1Layout.createParallelGroup(
				GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE)
		);

        
		btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ind_2Layout = new GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGap(0, 3, Short.MAX_VALUE)
        );
        
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGap(0, 43, Short.MAX_VALUE)
        );
      
        
        btn_2Layout = new GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(btn_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGap(0, 3, Short.MAX_VALUE)
        );
        
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGap(0, 43, Short.MAX_VALUE)
        );
        
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGap(0, 3, Short.MAX_VALUE)
        );
        
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGap(0, 43, Short.MAX_VALUE)
        );

        
        btn_4Layout = new GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(btn_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(747, Short.MAX_VALUE)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(34, 34, 34))
        );
        
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel15)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
                .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jProgressBar1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator1))))
                .addGap(40, 40, 40))
        );
        
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
                .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        
        jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            	.addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13))
                .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel6))
                .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel16)
                .addContainerGap(195, Short.MAX_VALUE)))
        );
        
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel16, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(285, 285, 285)))
        );


        jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addComponent(jLabel14)
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );


        jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            	.addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
	}
	
	
	private void InicializaComponentes() {
		side_pane = new JPanel();
	    btn_1 = new JPanel();
	    ind_1 = new JPanel();
	    jLabel8 = new JLabel();
	    btn_2 = new JPanel();
	    ind_2 = new JPanel();
	    jLabel9 = new JLabel();
	    btn_3 = new JPanel();
	    ind_3 = new JPanel();
	    jLabel10 = new JLabel();
	    btn_4 = new JPanel();
	    ind_4 = new JPanel();
	    jLabel11 = new JLabel();
	    jPanel2 = new JPanel();
	    jTextField1 = new JTextField();
	    jLabel7 = new JLabel();
	    jPanel3 = new JPanel();
	    jPanel4 = new JPanel();
	    jPanel5 = new JPanel();
	    jLabel1 = new JLabel();
	    jLabel3 = new JLabel();
	    jLabel4 = new JLabel();
	    jSeparator1 = new JSeparator();
	    jProgressBar1 = new JProgressBar();
	    jLabel5 = new JLabel();
	    jLabel15 = new JLabel();
	    btn_exit = new JLabel();
	    jLabel2 = new JLabel();
	    jLabel12 = new JLabel();
	    jLabel6 = new JLabel();
	    button1 = new Button();
	    jLabel13 = new JLabel();
	    jLabel16 = new JLabel();
	    jPanel6 = new JPanel();
	    jPanel7 = new JPanel();
	    jLabel14 = new JLabel();
	    jScrollPane1 = new JScrollPane();
	    jTable1 = new JTable();
	    ind_1Layout = new GroupLayout(ind_1);
	    btn_1Layout = new GroupLayout(btn_1);
	    ind_3Layout = new GroupLayout(ind_3);
	    btn_3Layout = new GroupLayout(btn_3);
	    ind_4Layout = new GroupLayout(ind_4);
	    btn_4Layout = new GroupLayout(btn_4);
	    jPanel2Layout = new GroupLayout(jPanel2);
	    jPanel5Layout = new GroupLayout(jPanel5);
        
	    //getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
	    // side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
	    // side_pane.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));
        //side_pane.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, -1));
	    // side_pane.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));
	    // side_pane.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, -1));
        //getContentPane().add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 590));
	    //getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 950, 50));
	    // jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        //jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, 130));
	    //jPanel4.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 24, -1, 46));
	    // jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 86, -1));
	    // jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 30));
	    // getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 300, 540));
	    // getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        
        pack();
	}
	
	
	@SuppressWarnings({ "unused", "serial" })
	private void Tabelas(){
		jTable1.setFont(new Font("Segoe UI", 0, 12));
        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {"12/1/2018", "Expresso POS", "Kenya", null},
                {"12/1/2018", "ROM Gen", "US", null},
                {"12/1/2018", "Text Ed", "UK", null},
                {"12/1/2018", "Mola Con", "China", null}
            },
            new String [] {
                "Date", "Item", "Location", "Completed"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                String.class, String.class, String.class, Boolean.class
            };

            @SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
	}
	
	
	private void btn_1MousePressed(MouseEvent evt) {
        setColor(btn_1); 
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_4}, new JPanel[]{ind_2,ind_3, ind_4});
    }

    private void btn_3MousePressed(MouseEvent evt) {
        setColor(btn_3); 
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_1,btn_4}, new JPanel[]{ind_2,ind_1, ind_4});
    }

    private void btn_4MousePressed(MouseEvent evt) {
    	setColor(btn_4); 
        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_1}, new JPanel[]{ind_2,ind_3, ind_1});
    }

    private void btn_2MouseReleased(MouseEvent evt) {
        setColor(btn_2); 
        ind_2.setOpaque(true);
        resetColor(new JPanel[]{btn_1,btn_3,btn_4}, new JPanel[]{ind_1,ind_3, ind_4});
    }

    int xx,xy;
    private void jPanel2MousePressed(MouseEvent evt) {
        xx = evt.getX();
        xy = evt.getY();
    }

    private void jPanel2MouseDragged(MouseEvent evt) {        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }

    private void btn_exitMousePressed(MouseEvent evt) {        
        System.exit(0);
    }

    private void setColor(JPanel pane){
    	pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators){
        for(int i=0;i<pane.length;i++){
        	pane[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicators.length;i++){
        	indicators[i].setOpaque(false);           
        }
        
    }
    
	
    
    private JLabel btn_exit, jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16,  jLabel2;
    private JLabel jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;
    private JPanel btn_1, btn_2, btn_3, btn_4, ind_1, ind_2, ind_3, ind_4, jPanel2, jPanel3, jPanel4, jPanel5;
    private JPanel jPanel6, jPanel7, side_pane;
    private JProgressBar jProgressBar1;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JTable jTable1;
    private JTextField jTextField1;
    private Button button1;
    
}
