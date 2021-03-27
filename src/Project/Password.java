package Project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Password extends JFrame {
    String password="";
    String password1="";

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password frame = new Password();
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
	public Password() {
		setTitle("maracas events");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fenetre1.class.getResource("/images/Webp.net-resizeimage (1).jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 588);
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
		
		panel.setBounds(80, 75, 511, 429);
		panel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));

		layeredPane.add(panel);
		panel.setLayout(null);
		
		Button button_1_1 = new Button("CHANGER ");
		button_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
		});
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb","mpass");
					String sql = "select password from login where user_name='wael'";
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs= ps.executeQuery();
					rs.next() ;
					password = rs.getObject("password").toString();
					password1=passwordField.getText().toString();
                    
					if(password.equals(password1)==false){
						JOptionPane.showMessageDialog(null,"mot de passe erroné");}
					else if(passwordField_1.getText().equals(passwordField_2.getText())==false){JOptionPane.showMessageDialog(null, "le nouveau mot de passe ne correspond pas ");}
					else if(passwordField_1.getText().equals(passwordField_2.getText())==false & password.equals(password1)==false){JOptionPane.showMessageDialog(null, "mot de passe erroné et le nouveau mot de passe ne correspond pas ");}


					else {
						Connection conn2= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb","mpass");
						String sql2 = "UPDATE login SET password ='"+passwordField_1.getText()+"' WHERE user_name ='wael'";
						PreparedStatement ps2 = conn.prepareStatement(sql2);
						ResultSet rs2= ps2.executeQuery();
						rs2.next() ;
						dispose();
						
					}
				}catch(Exception e) {System.out.println(e);}
			}
		});
		
		button_1_1.setForeground(Color.WHITE);
		button_1_1.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		button_1_1.setBackground(new Color(65, 105, 225));
		button_1_1.setBounds(144, 332, 241, 53);
		panel.add(button_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("ANCIEN MOT DE PASSE :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(34, 52, 231, 41);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ANCIEN MOT DE PASSE :");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(27, 136, 231, 41);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ANCIEN MOT DE PASSE :");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(34, 224, 231, 41);
		panel.add(lblNewLabel_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(235, 65, 211, 19);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(235, 149, 211, 19);
		panel.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(240, 237, 206, 19);
		panel.add(passwordField_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-26, -20, 1072, 708);
		layeredPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Fenetre1.class.getResource("/images/Webp.net-resizeimage (1).jpg")));
		panel_1.add(lblNewLabel);
	}
}
