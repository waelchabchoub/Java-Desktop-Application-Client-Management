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

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Fenetre2 extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre2 frame = new Fenetre2();
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
	public Fenetre2() {
		setResizable(false);
		setTitle("maracas events");
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Monsieur");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(135, 88, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Madame\r\n");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBounds(278, 88, 103, 21);
		panel.add(rdbtnNewRadioButton_1);
		
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
		grp.add(rdbtnNewRadioButton);
		grp.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(135, 138, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(135, 180, 96, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(135, 228, 96, 19);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("NUM 1 :");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1.setBounds(39, 267, 77, 19);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(135, 269, 96, 19);
		panel.add(textField_3);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("NUM 2 :");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1_1.setBounds(264, 267, 77, 19);
		panel.add(lblNewLabel_2_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(360, 269, 96, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tunis", "Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gabes", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "Kebili", "La Manouba", "Le Kef", "Mahdia", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"}));
		comboBox.setBounds(360, 227, 96, 19);
		panel.add(comboBox);
		
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
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(628, 89, 301, 19);
		panel.add(textField_7);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("ADRESSE :");
		lblNewLabel_2_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2_2.setBounds(541, 136, 77, 19);
		panel.add(lblNewLabel_2_1_2_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(628, 138, 301, 19);
		panel.add(textField_8);
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("TYPE :");
		lblNewLabel_2_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2_1_1_1.setBounds(541, 180, 77, 19);
		panel.add(lblNewLabel_2_1_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1_1_1 = new JLabel("HEURE DEBUT :\r\n");
		lblNewLabel_2_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2_1_1_1_1.setBounds(541, 226, 111, 19);
		panel.add(lblNewLabel_2_1_2_1_1_1_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		comboBox_2.setBounds(663, 228, 52, 19);
		panel.add(comboBox_2);
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1 = new JLabel("h");
		lblNewLabel_2_1_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2_1_1_1_1_1.setBounds(737, 226, 46, 19);
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_2_1.setBounds(766, 228, 52, 19);
		panel.add(comboBox_2_1);
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_3 = new JLabel("HEURE DEBUT :\r\n");
		lblNewLabel_2_1_2_1_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2_1_1_1_1_3.setBounds(541, 267, 111, 19);
		panel.add(lblNewLabel_2_1_2_1_1_1_1_3);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		comboBox_2_2.setBounds(663, 268, 52, 19);
		panel.add(comboBox_2_2);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_2_1_1.setBounds(766, 268, 52, 19);
		panel.add(comboBox_2_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1_1 = new JLabel("h");
		lblNewLabel_2_1_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2_1_1_1_1_1_1.setBounds(737, 272, 46, 19);
		panel.add(lblNewLabel_2_1_2_1_1_1_1_1_1);
		
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
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(168, 406, 96, 19);
		panel.add(textField_9);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("PRIX RESTE :");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1.setBounds(39, 459, 119, 19);
		panel.add(lblNewLabel_2_2_1);
		
		textField_10 = new JTextField();
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
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(468, 406, 96, 19);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(468, 461, 96, 19);
		panel.add(textField_12);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("NUMERO CONTRAT :");
		lblNewLabel_2_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_2_2.setBounds(609, 404, 174, 19);
		panel.add(lblNewLabel_2_2_2_2);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(805, 406, 96, 19);
		panel.add(textField_13);
		
		JLabel lblNewLabel_2_2_2_2_1 = new JLabel("AUTRE :");
		lblNewLabel_2_2_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_2_2_1.setBounds(609, 459, 174, 19);
		panel.add(lblNewLabel_2_2_2_2_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(693, 461, 208, 19);
		panel.add(textField_14);
		
		JButton btnNewButton = new JButton("AJOUTTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					  String txt1 = textField_13.getText();
					  String txt2 =  " ";
					  String txt3 = textField.getText();
					  String txt4 = textField_1.getText();
					  String txt5 = textField_2.getText();
					  String txt6 = textField_3.getText();
					  String txt7 = textField_4.getText();
					  String txt8 = textField_5.getText();
					  String txt9 = comboBox.getSelectedItem().toString();
					  String txt10 = textField_7.getText();
					  String txt11 = textField_8.getText();
					  String txt12 = textField_15.getText();

					  String txt13 = comboBox_2.getSelectedItem().toString();
					  String txt14 = comboBox_2_1.getSelectedItem().toString();
					  String txt15 = comboBox_2_1_1.getSelectedItem().toString();
					  String txt16= comboBox_2_2.getSelectedItem().toString();
					  String txt17 = textField_9.getText();
					  String txt18 = textField_10.getText();
					  String txt19 = textField_11.getText();
					  String txt20 = textField_12.getText();
					  String txt21 = textField_14.getText();

					  if (rdbtnNewRadioButton.isSelected()) {
						  
		                    txt2 = "Monsieur";
		                }

		                else {
		  
		                    txt2 = "Madame";
		                }
					   
					  
					   Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb","mpass");
						String sql = "insert into client values('"+txt1+"','"+txt2+"','"+txt3+"','"+txt4+"','"+txt5+"','"+txt6+"','"+txt7+"','"+txt8+"','"+txt9+"','"+txt10+"','"+txt11+"','"+txt12+"','"+txt13+"','"+txt14+"','"+txt15+"','"+txt16+"','"+txt17+"','"+txt18+"','"+txt19+"','"+txt20+"','"+txt21+"')";
						PreparedStatement ps = conn.prepareStatement(sql);
						ResultSet rs= ps.executeQuery();
						dispose();
						Fenetre2 frame = new Fenetre2();
						frame.setVisible(true);

				    } catch (Exception e1) {
				      JOptionPane.showMessageDialog(null, "des informations manquant");
				      e1.printStackTrace();
				    }}
			
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225)));
		btnNewButton.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));

		btnNewButton.setBounds(541, 519, 124, 35);
		panel.add(btnNewButton);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(628, 180, 301, 19);
		panel.add(textField_15);
		
		JButton btnRetour = new JButton("RETOUR");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Fenetre1 frame = new Fenetre1();
				frame.setVisible(true);
			}
		});
		btnRetour.setForeground(Color.WHITE);
		btnRetour.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225), new Color(65, 105, 225)));
		btnRetour.setBackground(new Color(65, 105, 225));
		btnRetour.setBounds(360, 519, 124, 35);
		btnRetour.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));

		panel.add(btnRetour);
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
