package suma;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.ejercicioDelCurso.proyectoDePartidaFracciones.Fraccion;

import interfazGrafica.interfazGrafica;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sumaDificil extends JFrame {
	
	private boolean permitir=false;
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
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sumaDificil frame = new sumaDificil();
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
	public sumaDificil() {
		setTitle("MathApp - Operaciones Con Suma(Dificil)");
		setBounds(100, 100, 797, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 102));
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
		
		
		JLabel lblNewLabel_1 = new JLabel("_______ + _______  = ");
		lblNewLabel_1.setBounds(50, 136, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("_______________");
		lblNewLabel_2.setBounds(171, 136, 116, 14);
		contentPane.add(lblNewLabel_2);
		
		
		lblNewLabel_3 = new JLabel("_______ + _______  = ");
		lblNewLabel_3.setBounds(475, 136, 145, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("________________");
		lblNewLabel_4.setBounds(602, 136, 136, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("_______ + _______  = ");
		lblNewLabel_5.setBounds(50, 276, 153, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("_______ + _______  = ");
		lblNewLabel_6.setBounds(475, 276, 145, 14);
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
		
		JLabel lblNewLabel_9 = new JLabel("16");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(63, 127, 28, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("32");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(63, 153, 28, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("2");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(120, 127, 13, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("16");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(120, 153, 28, 14);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("4");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(63, 268, 13, 14);
		contentPane.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("24");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(63, 297, 28, 14);
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("1");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(120, 265, 13, 14);
		contentPane.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("8");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_16.setBounds(120, 298, 28, 14);
		contentPane.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("5");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_17.setBounds(494, 127, 13, 14);
		contentPane.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("32");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_18.setBounds(494, 153, 28, 14);
		contentPane.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("3");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_19.setBounds(550, 127, 46, 14);
		contentPane.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("8");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_20.setBounds(550, 155, 28, 14);
		contentPane.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("30");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_21.setBounds(490, 259, 32, 14);
		contentPane.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("30");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_22.setBounds(492, 297, 46, 14);
		contentPane.add(lblNewLabel_22);
		
		lblNewLabel_23 = new JLabel("12");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_23.setBounds(550, 264, 43, 14);
		contentPane.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("24");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_24.setBounds(548, 297, 46, 14);
		contentPane.add(lblNewLabel_24);
		
		JButton resolve = new JButton("\u00A1Resolver!");
		resolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
					try {
						//arriba
						
						Fraccion AI = new Fraccion(Integer.parseInt(numAI.getText()),Integer.parseInt(denAI.getText()));
						Fraccion AD = new Fraccion(Integer.parseInt(numAD.getText()),Integer.parseInt(denAD.getText()));
						
						//abajo
						
						Fraccion ABI = new Fraccion(Integer.parseInt(numABI.getText()),Integer.parseInt(denABI.getText()));
						Fraccion ABD = new Fraccion(Integer.parseInt(numABD.getText()),Integer.parseInt(denABD.getText()));
						
						//correccion
						
						int cont=0;
						/*
						if(CalculosMatematicos.suma(AI,AD)==CalculosMatematicos.suma(x,y))
							cont++;
						if(CalculosMatematicosTest.suma(AI,AD)==CalculosMatematicos.suma(x,y))
							cont++;
						if(CalculosMatematicosTest.suma(AI,AD)==CalculosMatematicos.suma(x,y))
							cont++;
						if(CalculosMatematicosTest.suma(AI,AD)==CalculosMatematicos.suma(x,y))
							cont++;
						*/
						if(cont==0)
							JOptionPane.showMessageDialog(contentPane, "Hay que repasar conceptos,la proxima vez lo haras mejor");
						else if((cont>0) &&( cont <=2))
							JOptionPane.showMessageDialog(contentPane, "Va bien la cosa, da un ultimo empujon!");
						
						else if((cont>2) &&( cont <=3))
							JOptionPane.showMessageDialog(contentPane, "Ya eres casi un experto!");
						
						else if (cont==4)
					
							JOptionPane.showMessageDialog(contentPane, "Este nivel es poco para ti,eres un campeon!");
						
					}catch(NumberFormatException f) {
						JOptionPane.showMessageDialog(contentPane, "Rellena todas las casillas y solamente con numeros....");
					}
					
					
					
				}}

				
			
		);
		resolve.setBounds(331, 321, 110, 23);
		contentPane.add(resolve);
		
		JLabel lblNewLabel = new JLabel("\u00A1RESUELVE LAS SUMAS!");
		lblNewLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
		lblNewLabel.setBounds(254, 11, 253, 83);
		contentPane.add(lblNewLabel);
		

	
	}
}
