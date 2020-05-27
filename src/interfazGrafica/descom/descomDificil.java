package descom;

import java.awt.BorderLayout;
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
import java.awt.Color;

public class descomDificil extends JFrame {

	private JPanel contentPane;
	private JTextField resultadoAI;
	private JTextField resultadoEXPAD;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField resultadoABI;
	private JTextField resultadoAD;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JTextField resultadoEXPABD;
	private JTextField resultadoABD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					descomDificil frame = new descomDificil();
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
	public descomDificil() {
		setTitle("MathApp - Operaciones de Descomposicion  (Dificil)");
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
		
		
		JLabel lblNewLabel_1 = new JLabel("48 = 2     *     3");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(70, 153, 152, 14);
		contentPane.add(lblNewLabel_1);
		
		
		lblNewLabel_3 = new JLabel("1500=2     *3 * 5");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(432, 136, 174, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("135 = 3      *   5");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(70, 279, 179, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("1872=2   *      *    13");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(432, 279, 187, 14);
		contentPane.add(lblNewLabel_6);
		
		//INPUTS DEL USUARIO
		
		resultadoAI = new JTextField();
		resultadoAI.setBounds(130, 136, 18, 20);
		contentPane.add(resultadoAI);
		resultadoAI.setColumns(10);
		
		resultadoEXPAD = new JTextField();
		resultadoEXPAD.setBounds(495, 118, 24, 20);
		contentPane.add(resultadoEXPAD);
		resultadoEXPAD.setColumns(10);
		
		resultadoABI = new JTextField();
		resultadoABI.setBounds(143, 261, 16, 20);
		contentPane.add(resultadoABI);
		resultadoABI.setColumns(10);
		
		resultadoAD = new JTextField();
		resultadoAD.setBounds(579, 118, 18, 20);
		contentPane.add(resultadoAD);
		resultadoAD.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DESCOMPON LOS NUMEROS EN FACTORES PRIMOS");
		lblNewLabel.setFont(new Font("Noto Serif Cond", Font.PLAIN, 26));
		lblNewLabel.setBounds(103, 36, 692, 71);
		contentPane.add(lblNewLabel);
		
		resultadoEXPABD = new JTextField();
		resultadoEXPABD.setBounds(495, 261, 18, 20);
		contentPane.add(resultadoEXPABD);
		resultadoEXPABD.setColumns(10);
		
		resultadoABD = new JTextField();
		resultadoABD.setBounds(532, 270, 18, 23);
		contentPane.add(resultadoABD);
		resultadoABD.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(550, 254, 46, 14);
		contentPane.add(lblNewLabel_2);
	}
}
