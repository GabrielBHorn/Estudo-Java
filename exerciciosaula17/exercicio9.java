package com.horn.estudos.exerciciosaula17;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Por favor informe qual a tabuada que você deseja ver: ");
		int numero = scan.nextInt();
		
		System.out.println("Tabuada de " + numero + ":");
		for (int i=1; i<=10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero*i));
		}
		
		
		
		

	}

}
