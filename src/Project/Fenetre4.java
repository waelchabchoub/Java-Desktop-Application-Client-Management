package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


public class Fenetre4 extends JFrame {
	String num,civilite,prenom,nom,cin,num1,adresse_cl,ville,date_ev,adresse_ev,prix_total,prix_reste,prix_avance,prix_payement;
	String num2,type,autre;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre4 frame = new Fenetre4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fenetre4() {
		setTitle("maracas events");
		setResizable(false);
		num = Fenetre3.num_contrat();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fenetre1.class.getResource("/images/Webp.net-resizeimage (1).jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1052, 688);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//load database 
		
		  Connection conn;
		try {
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb","mpass");
			 String query ="SELECT civilite,prenom,nom,cin,num1,num2,adresse_cl,ville,to_char(date_ev,'dd/mm/yy'),adresse_ev,type,prix_total,prix_reste,prix_avance,prix_payement,autre FROM client where num_contrat = '"+num+"'";
		     PreparedStatement pat = conn.prepareStatement(query);    
		     ResultSet rs = pat.executeQuery();
		     rs.next();
		     civilite = rs.getObject("civilite").toString();
		     prenom = rs.getObject("prenom").toString();
		     nom =  rs.getObject("nom").toString();
		     cin = rs.getObject("cin").toString();
		     num1 = rs.getObject("num1").toString();
		     if(rs.getObject("num2") == null){num2 = "null";}
		     adresse_cl = rs.getObject("adresse_cl").toString();
		     ville = rs.getObject("ville").toString();
		     date_ev = rs.getObject("to_char(date_ev,'dd/mm/yy')").toString();
		     adresse_ev = rs.getObject("adresse_ev").toString();
		     if(rs.getObject("type") == null){type = "null";}
		     prix_total = rs.getObject("prix_total").toString();
		     prix_reste = rs.getObject("prix_reste").toString();
		     prix_avance = rs.getObject("prix_avance").toString();
		     prix_payement = rs.getObject("prix_payement").toString();
		     if(rs.getObject("autre") == null){autre = "null";}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	      
	    	    
	   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////:
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, -11, 1038, 678);
		layeredPane.setBorder(null);
		contentPane.add(layeredPane);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(30, 59, 982, 564);
		panel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));

		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("INFORMATION CLIENT");
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(65, 105, 225));
		lblNewLabel_1.setBounds(30, 26, 426, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CIVILITE :\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(39, 87, 77, 19);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("PRENOM :\r\n");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(39, 136, 77, 19);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("NOM :");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(39, 178, 77, 19);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("CIN :\r\n");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(39, 226, 77, 19);
		panel.add(lblNewLabel_2_1_1_1);
		
		ButtonGroup grp = new ButtonGroup();
		
		textField = new JTextField(nom);
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(135, 138, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(prenom);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(135, 180, 96, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField(cin);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(135, 228, 96, 19);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("NUM 1 :");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1.setBounds(39, 267, 77, 19);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		textField_3 = new JTextField(num1);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(135, 269, 96, 19);
		panel.add(textField_3);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("NUM 2 :");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1_1.setBounds(264, 267, 77, 19);
		panel.add(lblNewLabel_2_1_1_1_1_1);
		
		textField_4 = new JTextField(num2);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(360, 269, 96, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField(adresse_cl);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(360, 138, 96, 19);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(360, 180, 96, 19);
		panel.add(textField_6);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("ADRESSE :");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2.setBounds(264, 136, 77, 19);
		panel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("C.POSTAL :");
		lblNewLabel_2_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2_1.setBounds(264, 183, 77, 19);
		panel.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("VILLE :");
		lblNewLabel_2_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2_1_1.setBounds(264, 231, 77, 19);
		panel.add(lblNewLabel_2_1_2_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("INFORMATION SUR L'EVENEMENT");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1_1.setBackground(new Color(65, 105, 225));
		lblNewLabel_1_1.setBounds(527, 26, 426, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("DATE :\r\n");
		lblNewLabel_2_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_3.setBounds(541, 87, 77, 19);
		panel.add(lblNewLabel_2_1_3);
		
		textField_7 = new JTextField(date_ev);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(628, 89, 301, 19);
		panel.add(textField_7);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("ADRESSE :");
		lblNewLabel_2_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2_2.setBounds(541, 136, 77, 19);
		panel.add(lblNewLabel_2_1_2_2);
		
		textField_8 = new JTextField(adresse_ev);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(628, 138, 301, 19);
		panel.add(textField_8);
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("TYPE :");
		lblNewLabel_2_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2_1_1_1.setBounds(541, 180, 77, 19);
		panel.add(lblNewLabel_2_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("INFORMATION D'ACCORD");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1_2.setBackground(new Color(65, 105, 225));
		lblNewLabel_1_2.setBounds(30, 343, 909, 32);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("PRIX TOTAL :");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(39, 404, 119, 19);
		panel.add(lblNewLabel_2_2);
		
		textField_9 = new JTextField(prix_total);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(168, 406, 96, 19);
		panel.add(textField_9);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("PRIX RESTE :");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1.setBounds(39, 459, 119, 19);
		panel.add(lblNewLabel_2_2_1);
		
		textField_10 = new JTextField(prix_reste);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(168, 461, 96, 19);
		panel.add(textField_10);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("PRIX AVANCE :");
		lblNewLabel_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_2.setBounds(309, 404, 119, 19);
		panel.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("DATE PAYEMENT :");
		lblNewLabel_2_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_2_1.setBounds(309, 459, 137, 19);
		panel.add(lblNewLabel_2_2_2_1);
		
		textField_11 = new JTextField(prix_avance);
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(468, 406, 96, 19);
		panel.add(textField_11);
		
		textField_12 = new JTextField(prix_payement);
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(468, 461, 96, 19);
		panel.add(textField_12);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("NUMERO CONTRAT :");
		lblNewLabel_2_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_2_2.setBounds(609, 404, 174, 19);
		panel.add(lblNewLabel_2_2_2_2);
		
		textField_13 = new JTextField(num);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(805, 406, 96, 19);
		panel.add(textField_13);
		
		
		JLabel lblNewLabel_2_2_2_2_1 = new JLabel("AUTRE :");
		lblNewLabel_2_2_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_2_2_1.setBounds(609, 459, 174, 19);
		panel.add(lblNewLabel_2_2_2_2_1);
		
		textField_14 = new JTextField(autre);
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(693, 461, 208, 19);
		panel.add(textField_14);
		
		JButton btnNewButton = new JButton("SUPPRIMER");
		
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225)));
		btnNewButton.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));

		btnNewButton.setBounds(541, 519, 124, 35);
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					  Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb","mpass");
				      String query = "delete from client where num_contrat='"+num+"'" ;
				      PreparedStatement pat = conn.prepareStatement(query);     //******** FAILS HERE ********
				      ResultSet rs = pat.executeQuery();
				      dispose();
				      Fenetre3 f = new Fenetre3();
				  	  f.setVisible(true);

				    } catch (Exception e1) {
				      e1.printStackTrace();
				    }
				
			}
		});
		
		textField_15 = new JTextField(type);
		textField_15.setColumns(10);
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(628, 180, 301, 19);
		panel.add(textField_15);
		
		JButton btnRetour = new JButton("RETOUR");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Fenetre3 frame = new Fenetre3();
				frame.setVisible(true);
			}
		});
		btnRetour.setForeground(Color.WHITE);
		btnRetour.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225)));
		btnRetour.setBackground(new Color(65, 105, 225));
		btnRetour.setBounds(360, 519, 124, 35);
		btnRetour.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));

		panel.add(btnRetour);
		
		textField_16 = new JTextField(civilite);
		textField_16.setColumns(10);
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(135, 89, 96, 19);
		panel.add(textField_16);
		
		textField_17 = new JTextField(ville);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(360, 228, 96, 19);
		panel.add(textField_17);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 45, 13);
		panel.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(168, 92, 45, 13);
		panel.add(label_1);
		btnNewButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(65, 105, 225));
				btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));


								
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnRetour.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRetour.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRetour.setBackground(new Color(65, 105, 225));
				btnRetour.setCursor(new Cursor(Cursor.HAND_CURSOR));


			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-26, -20, 1072, 708);
		layeredPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Fenetre1.class.getResource("/images/Webp.net-resizeimage (1).jpg")));
		panel_1.add(lblNewLabel);
	}
}
