package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		
		
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Por favor informe um numero inteiro: ");
		
		int numero = scan.nextInt();
		
		if((numero  % 2) == 0)  
	         System.out.println("par");
	      else 
	         System.out.println("impar");
		}

	}

