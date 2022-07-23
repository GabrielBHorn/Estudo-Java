package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		

		System.out.println("Informe o preço do primeiro prudto: ");
			double produto1 = scan.nextDouble();
			
		System.out.println("Informe o preço do segundo produto: ");	
			double produto2 = scan.nextDouble();
		
		System.out.println("Informe o preço do terceiro: ");	
			double produto3 = scan.nextDouble();	
			
			if  (produto1 <= produto2 && produto1 <= produto3) {
				System.out.println("Você deve comprar o produto de nº 1. ");
			} else if (produto2 <= produto1 && produto2 <= produto3) {
				System.out.println("Você deve comprar o produto de nº 2. ");
			} else if (produto3 <= produto1 && produto3 <= produto2) {
				System.out.println("Você deve comprar o produto de nº 3. ");	
			}	
				
			}

	}


