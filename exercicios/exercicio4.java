package com.horn.estudos.exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
        Scanner scan  = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int valor2 = scan.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		int valor3 = scan.nextInt();
		
		System.out.println("Digite a quarta nota: ");
		int valor4 = scan.nextInt();
		
		int resultado = (valor1 + valor2 + valor3 + valor4) / 4;
		
		System.out.println("A média das notas é: " + resultado);

	}

}
