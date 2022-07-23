package com.horn.estudos.exercicios;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int valor2 = scan.nextInt();
		
		System.out.println("Informe o terceiro valor: ");
		double valor3 = scan.nextDouble();
		
		int resultado1 = (valor1 * 2) * (valor2 / 2);
		double resultado2 = (valor1 * 3) + valor3;
		double resultado3 = Math.pow (valor3, 3);
		
		System.out.println(" Resultado 1: " + resultado1);
		System.out.println(" Resultado 2: " + resultado2);
		System.out.println(" Resultado 2: " + resultado3);
		
		
		
		

	}

}
