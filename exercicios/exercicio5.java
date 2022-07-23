package com.horn.estudos.exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de metros: ");
		double metros = scan.nextDouble();
		
		double cm = metros * 100;
		
		System.out.println(metros + " m é igual a: " + cm + "cm");
		
		

	}

}
