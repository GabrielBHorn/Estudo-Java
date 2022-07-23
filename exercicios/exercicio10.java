package com.horn.estudos.exercicios;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em graus C: ");
		double c = scan.nextDouble();
		
		double f = (c * 1.8) + 32;
		
		System.out.println("A temperatura " + f + "F é igual a: " + f + "F: ");

	}

}
