package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import suma.sumaFacil;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nivelDificultad extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nivelDificultad frame = new nivelDificultad();
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
	public nivelDificultad() {
		setTitle("MathApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 398);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elige el nivel de dificultad");
		lblNewLabel.setFont(new Font("Noto Sans", Font.PLAIN, 44));
		lblNewLabel.setBounds(87, 57, 540, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("facil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(interfazGrafica.tipo.contentEquals("suma")) {
					
					suma.sumaFacil sf = new suma.sumaFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("mcm")) {
					
					mcm.mcmFacil sf = new mcm.mcmFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("division")) {
					
					suma.sumaFacil sf = new suma.sumaFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("multiplicacion")) {
					
					suma.sumaFacil sf = new suma.sumaFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("mcd")) {
					
					suma.sumaFacil sf = new suma.sumaFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("simplificar")) {
					
					simplificacion.simpFacil sf = new simplificacion.simpFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("descomposicion")) {
					
					suma.sumaFacil sf = new suma.sumaFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
					
				
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(91, 206, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton normal = new JButton("normal");
		normal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(interfazGrafica.tipo.contentEquals("suma")) {
					
					suma.sumaNormal sf = new suma.sumaNormal();
					sf.setVisible(true);
					setVisible(false);
					
				}
				setVisible(false);
			}
		});
		normal.setBounds(297, 206, 89, 23);
		contentPane.add(normal);
		
		JButton dificil = new JButton("dificil");
		dificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(interfazGrafica.tipo.contentEquals("suma")) {
					
					suma.sumaDificil sf = new suma.sumaDificil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				setVisible(false);
			}
		});
		dificil.setBounds(500, 206, 89, 23);
		contentPane.add(dificil);
		
		JButton atras = new JButton("atras");
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				interfazGrafica atras = new interfazGrafica();
				atras.setVisible(true);
			}
		});
		atras.setBounds(297, 298, 89, 23);
		contentPane.add(atras);
	}

}
