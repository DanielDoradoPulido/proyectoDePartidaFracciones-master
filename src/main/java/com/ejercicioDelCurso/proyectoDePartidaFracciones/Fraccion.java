package com.ejercicioDelCurso.proyectoDePartidaFracciones;


import java.util.ArrayList;
import java.util.LinkedList;

public class Fraccion {

	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public static int minimoComunMultiplo(int num1, int num2) {

		int mcm, i;

		mcm = 1;
		i = 2;
		while (i != num1 || i != num2) {
			if (num1 % i == 0 || num2 % i == 0) {
				mcm = mcm * i;
				if (num1 % i == 0)
					num1 = num1 / i;
				if (num2 % i == 0)
					num2 = num2 / i;
			} else
				i = i + 1;
		}

		return mcm;
	}

	public static int minimoComunDivisor(int a, int b) {
		int resto;
		do {
			resto = Math.abs(a) % Math.abs(b);
			if (resto == 0)
				break;

			a = b;
			b = resto;
		} while (resto > 0);
		return b;
	}

	public static Fraccion simplifica(Fraccion entrada) {
		int mcd = minimoComunDivisor(entrada.getNumerador(), entrada.getDenominador());
		int n = entrada.getNumerador() / mcd;
		int d = entrada.getDenominador() / mcd;
		entrada.setNumerador(n);
		entrada.setDenominador(d);
		return entrada;

	}

	public static void suma(Fraccion sumando1, Fraccion sumando2) {
		int numN = sumando1.getNumerador() * sumando2.getDenominador()
				+ sumando2.getNumerador() * sumando1.getDenominador();

		int denN = sumando1.getDenominador() * sumando2.getDenominador();

		Fraccion suma = new Fraccion(numN, denN);

		Fraccion.simplifica(suma);

	}

	public static Fraccion resta(Fraccion sumando1, Fraccion sumando2) {
		int numN = sumando1.getNumerador() * sumando2.getDenominador()
				- sumando2.getNumerador() * sumando1.getDenominador();

		int denN = sumando1.getDenominador() * sumando2.getDenominador();

		Fraccion resta = new Fraccion(numN, denN);

		return Fraccion.simplifica(resta);

	}

	public static Fraccion multiplicacion(Fraccion factor1, Fraccion factor2) {
		int numN = factor1.getNumerador() * factor1.getNumerador();

		int denN = factor1.getDenominador() * factor2.getDenominador();

		Fraccion resultado = new Fraccion(numN, denN);

		return Fraccion.simplifica(resultado);

	}

	public static Fraccion division(Fraccion divisor1, Fraccion divisor2) {
		int numN = divisor1.getNumerador() * divisor1.getDenominador();

		int denN = divisor1.getDenominador() * divisor2.getNumerador();

		Fraccion resultado = new Fraccion(numN, denN);

		return Fraccion.simplifica(resultado);
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public static String descomponEnFactoresPrimos(int valor) {
		assert valor > 1;
		int factor = 2;
		ArrayList<Integer> factores = new ArrayList<Integer>();
		int factorLimite = (int) Math.sqrt(valor);
		while (factor <= factorLimite) {

			while (valor % factor == 0) {
				factores.add(factor);
				valor = valor / factor;
			}

			if (factor == 2)
				factor++;
			else
				factor += 2;
		}

		if (valor != 1)
			factores.add(valor);

		String rdo = valor + " = ";

		for (int i = 0; i < factores.size(); i++) {
			rdo += " * " + factores.get(i);

		}
		return rdo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(numerador).append(" / ").append(denominador);
		return sb.toString();
	}
	
}

			int numN = sumando1.getNumerador()*sumando2.getDenominador() - 
					sumando2.getNumerador()*sumando1.getDenominador();
			
			int denN = sumando1.getDenominador()*sumando2.getDenominador();
			
			Fraccion resta=new Fraccion(numN,denN);
		
			return Fraccion.simplifica(resta);
				
		}

		public static Fraccion multiplicacion(Fraccion factor1, Fraccion factor2) {
			int numN = factor1.getNumerador()*factor1.getNumerador();
			
			int denN = factor1.getDenominador()*factor2.getDenominador();
			
			Fraccion resultado=new Fraccion(numN,denN);
		
			return Fraccion.simplifica(resultado);

	}

		public static Fraccion division(Fraccion divisor1, Fraccion divisor2) {
	        int numN = divisor1.getNumerador()*divisor1.getDenominador();
			
			int denN = divisor1.getDenominador()*divisor2.getNumerador();
			
			Fraccion resultado=new Fraccion(numN,denN);
		
			return Fraccion.simplifica(resultado);
		}

		public int getNumerador() {
			return numerador;
		}

		public int getDenominador() {
			return denominador;
		}

		public void setNumerador(int numerador) {
			this.numerador = numerador;
		}

		public void setDenominador(int denominador) {
			this.denominador = denominador;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(numerador).append(" / ").append(denominador);
			return sb.toString();
		}

}
