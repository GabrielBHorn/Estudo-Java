package com.horn.estudos.aula18;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = scan.nextInt();		
		
		System.out.println("Informe um limite: ");
		int maximo = scan.nextInt();

		
		for (int i=numero; i<=maximo; i++) {
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
				
				
				
				
			}
		}
	}

}
