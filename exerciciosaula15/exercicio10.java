package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Por favor informe o turno o qual você estudo através de M, V ou N:");
				String periodo = scan.next();				
				
		if (periodo.equalsIgnoreCase("M") ) {
		    System.out.println("Você estuda no período Matutino, Bom dia. ");
		} else if (periodo.equalsIgnoreCase("V")) {
	    	System.out.println("Você estuda no período Vespertino, Boa tarde. ");
		}	else if (periodo.equalsIgnoreCase("N")) {
	 		System.out.println("Você estuda no período Noturno, Boa noite. ");	
	 	} else {
	 		System.out.println("O periodo digitado é inválido");
	 	}

	}

}
