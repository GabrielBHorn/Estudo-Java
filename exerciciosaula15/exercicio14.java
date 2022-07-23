package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Por favor informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Por favor informe a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		if (media >= 9) {
			 System.out.println("Você tirou nota A !");
			 
		} else if (media == 7.5 || media < 9) {
			System.out.println("Você tirou B !");
		} else if (media == 6 || media < 7.5) {
			System.out.println("Você tirou C !");
		} else if (media == 4 || media < 6) {
			System.out.println("Você tirou D ");
		} else if (media == 4 || media < 0) {
			System.out.println("Voce tirou E ");
		}	
			 
			 

	}

}
