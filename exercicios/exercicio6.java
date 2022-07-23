package com.horn.estudos.exercicios;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo : ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow (raio, 2);
		
		System.out.println(" A área do círculo é: " + area);
		
		
		

	}

}
