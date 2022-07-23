package com.horn.estudos.exerciciosaula17;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
						
		Scanner scan  = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
		
		System.out.println("Por favor informe uma entra 0 & 10: ");
		
		double nota = scan.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
			notaValida = true;
			System.out.println("Você digitou: " + nota);
		} else {
			System.out.println("A nota informa é inválida, por favor digite novamente: ");
			
		}	
		} while (!notaValida);

	}

}