package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfazGrafica extends JFrame {
	
	static String nivel = "";
	static String tipo= "";
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfazGrafica frame = new interfazGrafica();
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
	public interfazGrafica() {
		setBackground(new Color(0, 204, 255));
		setTitle("MathApp- Menu Principal");
		setBounds(100, 100, 1005, 558);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00A1Bienvenido a MathApp!");
		lblNewLabel.setBackground(new Color(102, 204, 51));
		lblNewLabel.setFont(new Font("Javanese Text", Font.PLAIN, 50));
		lblNewLabel.setBounds(221, 60, 619, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione el tipo de contenido del cual quiere probar su habilidad en esa materia");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(94, 132, 824, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("¡Intente superar todos los niveles posibles, y seras el rey de las Mates!");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(239, 177, 619, 23);
		contentPane.add(lblNewLabel_2);
		
		JButton descomposicionPrimo = new JButton("Descomposicion numeros primos");
		descomposicionPrimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tipo = "descomposicion";
				nivelDificultad nivel = new nivelDificultad();
				nivel.setVisible(true);
				setVisible(false);
			}
		});
		descomposicionPrimo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		descomposicionPrimo.setBounds(720, 274, 198, 46);
		contentPane.add(descomposicionPrimo);
		
		JButton sumaFracciones = new JButton("Suma de Fracciones");
		sumaFracciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				tipo = "suma";
				nivelDificultad nivel = new nivelDificultad();
				nivel.setVisible(true);
				setVisible(false);
				
				
				
				
			}
		});
		sumaFracciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sumaFracciones.setBounds(81, 274, 188, 47);
		contentPane.add(sumaFracciones);
		
		JButton divisionFraccion = new JButton("Division Fracciones");
		divisionFraccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tipo = "division";
				nivelDificultad nivel = new nivelDificultad();
				nivel.setVisible(true);
				setVisible(false);
				
			}
		});
		divisionFraccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		divisionFraccion.setBounds(400, 361, 198, 46);
		contentPane.add(divisionFraccion);
		
		JButton simplificacionFraccion = new JButton("Simplificar Fracciones");
		simplificacionFraccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tipo = "simplificar";
				nivelDificultad nivel = new nivelDificultad();
				nivel.setVisible(true);
				setVisible(false);
			}
		});
		simplificacionFraccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		simplificacionFraccion.setBounds(81, 361, 188, 46);
		contentPane.add(simplificacionFraccion);
		
		JButton multiplicacionFraccion = new JButton("Multiplicacion Fracciones");
		multiplicacionFraccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		multiplicacionFraccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tipo = "multiplicacion";
				nivelDificultad nivel = new nivelDificultad();
				nivel.setVisible(true);
				setVisible(false);
			}
		});
		multiplicacionFraccion.setBounds(400, 272, 198, 46);
		contentPane.add(multiplicacionFraccion);
		
		JButton minimoComun = new JButton("Minimo comun multiplo");
		minimoComun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tipo = "mcm";
				nivelDificultad nivel = new nivelDificultad();
				nivel.setVisible(true);
				setVisible(false);
			}
		});
		minimoComun.setFont(new Font("Tahoma", Font.PLAIN, 15));
		minimoComun.setBounds(720, 361, 198, 46);
		contentPane.add(minimoComun);
		
		JButton maximoComun = new JButton("maximo comun multiplo");
		maximoComun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tipo = "mcd";
				nivelDificultad nivel = new nivelDificultad();
				nivel.setVisible(true);
				setVisible(false);
				
			}
		});
		maximoComun.setFont(new Font("Tahoma", Font.PLAIN, 15));
		maximoComun.setBounds(400, 450, 198, 46);
		contentPane.add(maximoComun);
	}
}
