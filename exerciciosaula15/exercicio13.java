package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Por favor informe um numero entre 1 á 7: ");
		
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo !"); break;
		case 2: System.out.println("Segunda - Feria !"); break;
		case 3: System.out.println("Terça - Feria !"); break;
		case 4: System.out.println("Qaurta - Feria !"); break;
		case 5: System.out.println("Quinta - Feria !"); break;
		case 6: System.out.println("Sexta - Feria !"); break;
		case 8: System.out.println("Sábado !!!"); break;
	    default: System.out.println("O numero informado, não corresponde à nenhum dia da semana !!");
		
				

	}

	}
}
