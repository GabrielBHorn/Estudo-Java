package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {


		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Por favor informe dois números: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();

		if  (numero1 >= numero2) {
		System.out.println("O primeiro valor é maior. ");
		
		} else System.out.println("O segundo valor é maior. ");
		
			
		

	}

}
