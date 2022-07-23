package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		
		
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Telefonou para á vitíma? : ");
		String resposta1 = scan.next();
		
		System.out.println("Você esteve no local do crime? : ");
		String resposta2 = scan.next();
		
		System.out.println("Você mora perto da casa da vitíma? :");
		String resposta3 = scan.next();
		
		System.out.println("Tinha alguma divida com a vitima? :");
		String resposta4 = scan.next();
		
		System.out.println("Já trabalhou com vitíma? :");
		String resposta5 = scan.next();
		
		int contador = 0;
		
		if (resposta1.equalsIgnoreCase("Sim")) {
			contador++;
			
		if (resposta2.equalsIgnoreCase("Sim")) {
			contador++;	
		
		if (resposta3.equalsIgnoreCase("Sim")) {
			contador++;	
			
		if (resposta4.equalsIgnoreCase("Sim")) {
			contador++;	
			
		if (resposta5.equalsIgnoreCase("Sim")) {
			contador++;	
			
		if (contador == 2) {
			System.out.println("Suspeito");
		} else if (contador == 3 || contador == 4) {
			System.out.println("Você é cumplice");
		} else if (contador == 5) {
			System.out.println("Você é o assasino e está preso !!!");
		} else if (contador == 0) {
			System .out.println("Você é inocente. ");
							
		}
	}
}
	}
	}
}
	}
}


