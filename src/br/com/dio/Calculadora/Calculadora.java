package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor");
		a = entrada.nextInt();
		System.out.println("Digite o segundo valor");
		b = entrada.nextInt();
		
		double adicao = soma(a, b);
		double subtracao = subtracao(a, b);
		double divisao = divisao(a, b);
		double multiplicacao = multiplicacao(a, b);

		System.out.println(adicao);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);
	}
	
	public static double soma( double a, double b) {
		return a + b;
	}
	
	public static double subtracao( double a, double b) {
		return a - b;
	}
	
	public static double divisao( double a, double b) {
		return a / b;
	}
	
	public static double multiplicacao( double a, double b) {
		return a * b;
	}
}
