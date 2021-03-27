package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JLayeredPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Fenetre1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre1 frame = new Fenetre1();
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
	public Fenetre1() {
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
		
		panel.setBounds(75, 129, 394, 429);
		panel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));

		layeredPane.add(panel);
		panel.setLayout(null);
		
		Button button = new Button("LISTE DE CLIENTS");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Fenetre3 frame = new Fenetre3();
				frame.setVisible(true);
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		button.setBounds(81, 86, 241, 53);
		button.setBackground(new Color(65, 105, 225));

		panel.add(button);
		
		Button button_1 = new Button("AJOUTER UN CLIENT");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_1.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Fenetre2 frame = new Fenetre2();
				frame.setVisible(true);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		button_1.setBackground(new Color(65, 105, 225));
		button_1.setBounds(81, 190, 241, 53);
		panel.add(button_1);
		
		Button button_1_1 = new Button("QUITTER");
		button_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
		});
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_1_1.setForeground(Color.WHITE);
		button_1_1.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		button_1_1.setBackground(new Color(65, 105, 225));
		button_1_1.setBounds(81, 297, 241, 53);
		panel.add(button_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-26, -20, 1072, 708);
		layeredPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Fenetre1.class.getResource("/images/Webp.net-resizeimage (1).jpg")));
		panel_1.add(lblNewLabel);
	}
}
