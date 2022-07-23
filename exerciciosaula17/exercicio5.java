package com.horn.estudos.exerciciosaula17;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		int numero;
		int maior = Integer.MIN_VALUE;
		
		for (int i=0; i<5; i++) {
			
			System.out.println("Informe um nº: ");
			
			numero = scan.nextInt();
			
			if (numero > maior) {
				maior = numero;
			}
			}
			
		System.out.println("O maior número informado é: " + maior);

	}
	}

