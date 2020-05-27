package mcd;

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

public class mcdDificil extends JFrame {

	private JPanel contentPane;
	private JTextField resultadoAI;
	private JTextField resultadoAD;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField resultadoABI;
	private JTextField resultadoABD;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mcdDificil frame = new mcdDificil();
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
	public mcdDificil() {
		setTitle("MathApp - Operaciones de Maximo Comun Divisor  (Dificil)");
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
		
		
		JLabel lblNewLabel_1 = new JLabel("M.C.D (10   100  1000)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(36, 136, 187, 14);
		contentPane.add(lblNewLabel_1);
		
		
		lblNewLabel_3 = new JLabel("M.C.D (84   Y   1540)");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(432, 136, 174, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("M.C.D(90   Y   175)");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(70, 273, 179, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("M.C.D (15 34  1309 )");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(419, 273, 187, 14);
		contentPane.add(lblNewLabel_6);
		
		//INPUTS DEL USUARIO
		
		resultadoAI = new JTextField();
		resultadoAI.setBounds(233, 136, 86, 20);
		contentPane.add(resultadoAI);
		resultadoAI.setColumns(10);
		
		resultadoAD = new JTextField();
		resultadoAD.setBounds(602, 136, 86, 20);
		contentPane.add(resultadoAD);
		resultadoAD.setColumns(10);
		
		resultadoABI = new JTextField();
		resultadoABI.setBounds(233, 273, 86, 20);
		contentPane.add(resultadoABI);
		resultadoABI.setColumns(10);
		
		resultadoABD = new JTextField();
		resultadoABD.setBounds(602, 273, 86, 20);
		contentPane.add(resultadoABD);
		resultadoABD.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CALCULE EL MAXIMO DIVISOR COMUN");
		lblNewLabel.setFont(new Font("Noto Serif Cond", Font.PLAIN, 26));
		lblNewLabel.setBounds(164, 37, 692, 71);
		contentPane.add(lblNewLabel);
	}

}
