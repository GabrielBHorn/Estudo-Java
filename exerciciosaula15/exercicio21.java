package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de litros que sedeja comprar: ");
		double quantidadeLitros = scan.nextDouble();
		
		System.out.println("Deseja ácool ou gasosilna ?");
		String tipo = scan.next();
		
		double gasolina = 2.5;
		double alcool = 1.9;
		int percentualDesconto = 0;
		double total = 0;
		double totalDesc = 0;
		
		if (tipo.equalsIgnoreCase("a")) {
			if (quantidadeLitros <= 20) {
				percentualDesconto = 3;
			} else {
				percentualDesconto = 5;
			}
			
			total = quantidadeLitros * alcool;
			
		} else if (tipo.equalsIgnoreCase("g")){
			
			if (quantidadeLitros <= 20) {
				percentualDesconto = 4;
		} else {
				percentualDesconto = 6;
			}
			
			total = quantidadeLitros * gasolina;
		}
	    
		totalDesc = (total / 100) * percentualDesconto;
		
		double precoAPagar = total - totalDesc;
		
		System.out.println("O valor a ser pago é: " + precoAPagar);
		
		
		
		
	} 
        
	}



