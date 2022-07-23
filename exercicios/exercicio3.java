package com.horn.estudos.exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = scan.nextInt();
		
		int resultado = valor1 + valor2;
		
		System.out.println("A soma dos valores é: " + resultado);
		
		

	}

}
