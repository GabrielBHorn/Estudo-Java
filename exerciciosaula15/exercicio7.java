package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int valor2 = scan.nextInt();
		
		System.out.println("Informe o terceiro valor: ");
		int valor3 = scan.nextInt();
		
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O primeiro numero informado é maior: " + valor1);
		}else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O segundo numero informado é maior: " + valor2);
		}else if (valor3 > valor1 && valor3 > valor2) {
		    System.out.println("O terceiro numero informado é maior: " + valor3);
		}    
		    if (valor1 < valor2 && valor1 < valor3) {
				System.out.println("O primeiro numero informado é menor: " + valor1);
			}else if (valor2 < valor1 && valor2 < valor3) {
				System.out.println("O segundo numero informado é menor: " + valor2);
			}else if (valor3 < valor1 && valor3 < valor2) {
			    System.out.println("O terceiro numero informado é menor: " + valor3);  
			}
	}
}
			
	


