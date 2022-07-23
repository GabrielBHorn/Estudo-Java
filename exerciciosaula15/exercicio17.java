package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		
		
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Por favor informe um numero equivalente a um ano: ");
		
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " é um ano Bissexto!");
		}
		else{
			System.out.println(ano + " não é um ano Bissexto!");
		
		
		
		

	}

	}
}
