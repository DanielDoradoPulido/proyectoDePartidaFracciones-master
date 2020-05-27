package mcm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import interfazGrafica.interfazGrafica;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mcmFacil extends JFrame {

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
					mcmFacil frame = new mcmFacil();
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
	public mcmFacil() {
		setTitle("MathApp - Operaciones de Minimo Comun Multiplo  (Facil)");
		setBounds(100, 100, 797, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 102));
		contentPane.setForeground(new Color(51, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton exit = new JButton("salir");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				setVisible(false);
				interfazGrafica atras = new interfazGrafica();
				atras.setVisible(true);
				
			}
		});
		exit.setBounds(342, 355, 89, 23);
		contentPane.add(exit);
		
		//inputs y labels
		
		
		JLabel lblNewLabel_1 = new JLabel("M.C.M (5   Y   10)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(70, 136, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		
		lblNewLabel_3 = new JLabel("M.C.M (3   Y   18)");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(451, 136, 145, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("M.C.M (3  Y   15)");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(70, 273, 153, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("M.C.M (2   Y   6)");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(451, 273, 145, 14);
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
		
		JLabel lblNewLabel = new JLabel("CALCULE EL MINIMO COMUN MULTIPLO");
		lblNewLabel.setFont(new Font("Noto Serif Cond", Font.PLAIN, 26));
		lblNewLabel.setBounds(159, 25, 692, 71);
		contentPane.add(lblNewLabel);
	}

}
