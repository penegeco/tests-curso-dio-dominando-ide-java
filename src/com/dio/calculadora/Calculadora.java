package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite o primeiro numero:\n");
		a = scan.nextInt();
		System.out.println("Digite o segundo numero:\n");
		b = scan.nextInt();
		
		int adicao = adicao(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("Soma " + adicao);
		System.out.println("Soma " + subtracao);
		System.out.println("Soma " + multiplicacao);
		System.out.println("Soma " + divisao);

	}
	
	public static int adicao(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static double divisao(int a, int b) {
		return a / b;
	}

}
