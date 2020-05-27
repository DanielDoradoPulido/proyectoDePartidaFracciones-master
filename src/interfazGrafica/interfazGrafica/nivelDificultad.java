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
		setTitle("MathApp- Eleccion de Dificultad");
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
					
					div.divFacil sf = new div.divFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("multiplicacion")) {
					
					multi.multiFacil sf = new multi.multiFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("mcd")) {
					
					mcd.mcdFacil sf = new mcd.mcdFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("simplificar")) {
					
					simplificacion.simpFacil sf = new simplificacion.simpFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("descomposicion")) {
					
					descom.descomFacil sf = new descom.descomFacil();
					sf.setVisible(true);
					setVisible(false);
					
				}
					
				
				
			}
		});
		btnNewButton.setBounds(155, 183, 89, 35);
		contentPane.add(btnNewButton);
		
		JButton dificil = new JButton("dificil");
		dificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(interfazGrafica.tipo.contentEquals("suma")) {
					
					suma.sumaDificil sf = new suma.sumaDificil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("mcm")) {
					
					mcm.mcmDificil sf = new mcm.mcmDificil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("division")) {
					
					div.divDificil sf = new div.divDificil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("multiplicacion")) {
					
					multi.multiDificil sf = new multi.multiDificil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("mcd")) {
					
					mcd.mcdDificil sf = new mcd.mcdDificil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("simplificar")) {
					
					simplificacion.simpDificil sf = new simplificacion.simpDificil();
					sf.setVisible(true);
					setVisible(false);
					
				}
				
				else if(interfazGrafica.tipo.contentEquals("descomposicion")) {
					
					descom.descomDificil sf = new descom.descomDificil();
					sf.setVisible(true);
					setVisible(false);
					
				}
			}
		});
		dificil.setBounds(417, 183, 89, 35);
		contentPane.add(dificil);
		
		JButton atras = new JButton("atras");
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				interfazGrafica atras = new interfazGrafica();
				atras.setVisible(true);
			}
		});
		atras.setBounds(284, 298, 89, 23);
		contentPane.add(atras);
	}





	

}
