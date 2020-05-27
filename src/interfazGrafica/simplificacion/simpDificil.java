package simplificacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import interfazGrafica.interfazGrafica;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class simpDificil extends JFrame {

	private JPanel contentPane;
	private JTextField numAI;
	private JTextField denAI;
	private JLabel lblNewLabel_2;
	private JTextField numAD;
	private JTextField denAD;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField numABI;
	private JTextField denABI;
	private JTextField numABD;
	private JTextField denABD;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simpDificil frame = new simpDificil();
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
	public simpDificil() {
		setTitle("MathApp - Operaciones de Simplificacion  (Dificil)");
		setBounds(100, 100, 797, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				interfazGrafica atras = new interfazGrafica();
				atras.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(342, 355, 89, 23);
		contentPane.add(btnNewButton);
		
		//inputs y labels
		
		
		JLabel lblNewLabel_1 = new JLabel(" _______  = ");
		lblNewLabel_1.setBounds(105, 136, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("_______________");
		lblNewLabel_2.setBounds(171, 136, 116, 14);
		contentPane.add(lblNewLabel_2);
		
		
		lblNewLabel_3 = new JLabel("_______  = ");
		lblNewLabel_3.setBounds(531, 136, 145, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("________________");
		lblNewLabel_4.setBounds(602, 136, 136, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel(" _______  = ");
		lblNewLabel_5.setBounds(105, 276, 153, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel(" _______  = ");
		lblNewLabel_6.setBounds(531, 276, 145, 14);
		contentPane.add(lblNewLabel_6);
		
		//INPUTS DEL USUARIO
		
		numAI = new JTextField();
		numAI.setBounds(172, 121, 86, 20);
		contentPane.add(numAI);
		numAI.setColumns(10);
		
		denAI = new JTextField();
		denAI.setBounds(172, 152, 86, 20);
		contentPane.add(denAI);
		denAI.setColumns(10);
		
		numAD = new JTextField();
		numAD.setBounds(606, 121, 86, 20);
		contentPane.add(numAD);
		numAD.setColumns(10);
		
		denAD = new JTextField();
		denAD.setBounds(606, 152, 86, 20);
		contentPane.add(denAD);
		denAD.setColumns(10);
		
		numABI = new JTextField();
		numABI.setBounds(172, 258, 86, 20);
		contentPane.add(numABI);
		numABI.setColumns(10);
		
		denABI = new JTextField();
		denABI.setBounds(172, 296, 86, 20);
		contentPane.add(denABI);
		denABI.setColumns(10);
		
		numABD = new JTextField();
		numABD.setBounds(606, 258, 86, 20);
		contentPane.add(numABD);
		numABD.setColumns(10);
		
		denABD = new JTextField();
		denABD.setBounds(606, 296, 86, 20);
		contentPane.add(denABD);
		denABD.setColumns(10);
		
		//FIN INPUTS USUARIO
		
		JLabel lblNewLabel_7 = new JLabel("_______________");
		lblNewLabel_7.setBounds(172, 276, 115, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("_______________");
		lblNewLabel_8.setBounds(603, 276, 135, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_11 = new JLabel("14");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(115, 122, 28, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("18");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(115, 153, 18, 14);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_15 = new JLabel("24");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(115, 274, 28, 14);
		contentPane.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("27");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_16.setBounds(115, 297, 28, 14);
		contentPane.add(lblNewLabel_16);
		
		lblNewLabel_19 = new JLabel("12");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_19.setBounds(541, 122, 46, 14);
		contentPane.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("18");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_20.setBounds(541, 153, 22, 14);
		contentPane.add(lblNewLabel_20);
		
		lblNewLabel_23 = new JLabel("8");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_23.setBounds(550, 264, 13, 14);
		contentPane.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("14");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_24.setBounds(548, 297, 46, 14);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel = new JLabel("SIMPLIFIQUE LAS FRACCIONES A SU MINIMA EXPRESION");
		lblNewLabel.setFont(new Font("Noto Serif Cond", Font.PLAIN, 26));
		lblNewLabel.setBounds(79, 25, 692, 71);
		contentPane.add(lblNewLabel);
	}

}
