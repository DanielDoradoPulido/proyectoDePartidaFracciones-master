package com.ejercicioDelCurso.proyectoDePartidaFracciones;

public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public static Fraccion simplifica(Fraccion entrada) {}

	
	
	
	public static void suma(Fraccion sumando1, Fraccion sumando2) {
		int numN = sumando1.getNumerador()*sumando2*getDenominador() + 
				sumando2.getNumerador()*sumando1.getDenominador();
		
		int denN = sumando1.getDenominador()*sumando2.getDenominador();
		
		Fraccion suma=new Fraccion(numN,denN);
	
		Fraccion.simplifica(suma);
			
	}
	
	public static void resta(Fraccion sumando1, Fraccion sumando2) {
		int numN = sumando1.getNumerador()*sumando2*getDenominador() - 
				sumando2.getNumerador()*sumando1.getDenominador();
		
		int denN = sumando1.getDenominador()*sumando2.getDenominador();
		
		Fraccion resta=new Fraccion(numN,denN);
	
		Fraccion.simplifica(resta);
			
	}

	public static Fraccion multiplicacion(Fraccion factor1, Fraccion factor2) {
		int numN = factor1.getNumerador()*factor1.getNumerador;
		
		int denN = factor1.getDenominador()*factor2.getDenominador();
		
		Fraccion resultado=new Fraccion(numN,denN);
	
		Fraccion.simplifica(resultado);
			



}

	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
        int numN = factor1.getNumerador()*factor1.getDenominador;
		
		int denN = factor1.getDenominador()*factor2.getNumerador();
		
		Fraccion resultado=new Fraccion(numN,denN);
	
		Fraccion.simplifica(resultado);
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
