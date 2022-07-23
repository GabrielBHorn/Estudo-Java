package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Por favor digite uma letra de A á Z: ");
		String letra = scan.next();
		
		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": System.out.println("A letra informada corresponde á uma vogal."); break;
		default: System.out.println("A letra informada, trata-se de uma consoante");
		
		}
	
		
		}
		
		

	}


