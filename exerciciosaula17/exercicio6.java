package com.horn.estudos.exerciciosaula17;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		
Scanner scan  = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		double media;
		
		for (int i=0; i<5; i++) {
			
			System.out.println("Informe um nº: ");
			numero = scan.nextInt();
			
			soma += numero;
		}
		
		media = soma / 5;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
			

	}


	}

