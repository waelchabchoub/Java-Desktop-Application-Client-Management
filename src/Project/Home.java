package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/Webp.net-resizeimage (1).jpg")));
		setTitle("maracas events");
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1052, 688);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, -7, 400, 697);
		contentPane.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Home.class.getResource("/images/Webp.net-resizeimage (7).jpg")));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Webp.net-resizeimage (7).jpg"));
		panel.add(lblNewLabel);
		
		JButton button = new JButton("SIGN IN");
		button.setBorderPainted(false);
		panel.getRootPane().setDefaultButton(button);

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb","mpass");
					String sql = "select * from login where user_name='"+textField.getText()+"'and password = '"+passwordField.getText()+"'";
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs= ps.executeQuery();
					if(rs.next()) {
						dispose();
						Fenetre1 frame = new Fenetre1();
						frame.setVisible(true);

					}else {
						JOptionPane.showMessageDialog(null, "login failed");
					}
				}catch(Exception e) {System.out.println(e);}
			}
		});
		button.setFont(new Font("Dialog", Font.PLAIN, 17));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(241,57,83));
		button.setBounds(561, 497, 367, 59);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(561, 268, 367, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD\t\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(555, 350, 140, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("USERNAME");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(555, 222, 140, 35);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(561, 395, 367, 46);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Home.class.getResource("/images/Webp.net-resizeimage (2).png")));
		lblNewLabel_2.setBounds(612, -25, 287, 260);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("CHANGER MOT DE PASSE ");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Password frame = new Password();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			lblNewLabel_4.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
		});
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(671, 571, 367, 13);
		contentPane.add(lblNewLabel_4);
	}
}
