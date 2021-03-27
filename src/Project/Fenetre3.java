package Project;

import java.awt.BorderLayout;
import java.awt.Button;
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

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.List;
import javax.swing.JButton;

public class Fenetre3 extends JFrame {
	static String num_con = "";
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre3 frame = new Fenetre3();
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
	public Fenetre3() {
		setTitle("maracas events");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fenetre1.class.getResource("/images/Webp.net-resizeimage (1).jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1052, 688);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, -11, 1038, 678);
		layeredPane.setBorder(null);
		contentPane.add(layeredPane);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(30, 140, 663, 374);
		panel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));

		layeredPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setForeground(Color.WHITE);
		comboBox.setBounds(33, 61, 475, 38);
		comboBox.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("AFFICHER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String s = comboBox.getSelectedItem().toString();
				 String[] arr  = s.split(":", 2);
				 num_con = arr[0];
				 dispose();
				 Fenetre4 frame = new Fenetre4();
				 frame.setVisible(true);
				 
			}
		});
		btnNewButton.setBounds(532, 61, 96, 38);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225)));
		btnNewButton.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
		panel.add(btnNewButton);
		
		
		
		JButton btnNewButton_1_1 = new JButton("QUITTER");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
		btnNewButton_1_1.setBounds(389, 294, 102, 46);
		
		
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225)));
		btnNewButton_1_1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("RETOUR");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Fenetre1 frame = new Fenetre1();
				frame.setVisible(true);
			}
		});
		btnNewButton_1_1_1.setBounds(171, 294, 115, 46);
		
	
		btnNewButton_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225)));
		btnNewButton_1_1_1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
		panel.add(btnNewButton_1_1_1);
		
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

btnNewButton_1_1.addMouseListener(new MouseListener() {
	
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
		btnNewButton_1_1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		btnNewButton_1_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));


						
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
});
btnNewButton_1_1_1.addMouseListener(new MouseListener() {
	
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
		btnNewButton_1_1_1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		btnNewButton_1_1_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));


						
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
});
		
		try {
			  Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb","mpass");
		      String query ="SELECT num_contrat,prenom,nom,to_char(date_ev,'dd/mm/yy') FROM client order by date_ev desc";
		      PreparedStatement pat = conn.prepareStatement(query);     //******** FAILS HERE ********
		      ResultSet rs = pat.executeQuery();
		      while(rs.next()){
		    	    Object element = rs.getObject("num_contrat").toString() + ":  PRENON : " + rs.getObject("prenom").toString() + "  | NOM : " + rs.getObject("nom").toString() + "  | DATE : " +  rs.getObject("to_char(date_ev,'dd/mm/yy')").toString();
		    	    comboBox.addItem(element);
		    	  
		    	    }

		    } catch (Exception e1) {
		      e1.printStackTrace();}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-26, -20, 1072, 708);
		layeredPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Fenetre1.class.getResource("/images/Webp.net-resizeimage (1).jpg")));
		panel_1.add(lblNewLabel);
	}
	
	public static String num_contrat()
    {
        return num_con;
    }
}





















