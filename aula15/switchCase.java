package com.horn.estudos.aula15;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero de 1 á 7: ");
		
		
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1) {
			System.out.println("Domingo !");
		} else if (diaSemana == 2) {
			System.out.println("Segunda-Feira !");
		} else if (diaSemana == 3) {
			System.out.println("Terça-Feira !");
		} else if (diaSemana == 4) {
			System.out.println("Quarta-Feira !");
		} else if (diaSemana == 5) {
			System.out.println("Quinra-Feira !");
		} else if (diaSemana == 6) {
			System.out.println("Sexta-Feira !");
		} else if (diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("O numero informado, não corresponde à nenhum dia da semana !!");
					
		}
		
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
		
		
		
		

	


