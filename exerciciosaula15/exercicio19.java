package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		
		
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Por favor informe o primeiro numero : ");
		int numero1 = scan.nextInt();
		
		System.out.println("Por favor informe o segundo numero: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe a operação que deseja utilizar: (+ - * ): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+": resultado = numero1 + numero2; break;
		case "-": resultado = numero1 - numero2; break;
		case "*": resultado = numero1 * numero2; break;
		case ")": resultado = numero1 / numero2; break;
		default: System.out.println("Operação inválida"); valida = false;
		}
		
		if (valida) {
			System.out.println("Resultado: " + resultado);
			if (resultado >= 0) {
				System.out.println("Resultado é positivo. ");
			} else {
				System.out.println("Resultado é negativo. ");
				
				if (resultado % 2 ==0) {
					System.out.println("Resultado é par");
				} else {
					System.out.println("Resultado é impar");
				}
				
			}
		}
		

	}

}
