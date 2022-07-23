package com.horn.estudos.aula14;

import java.util.Scanner;

public class aula14 {

	public static void main(String[] args) {
		
		
      Scanner scan  = new Scanner(System.in);
		
		/*System.out.println(" Informe a sua idade : ");
		
		int idade = scan.nextInt();
		
		if (idade >= 18){
				System.out.println("È maior de idade !!!");
		
		} else { 
			    System.out.println("Não maior de idade !!!");
		  }*/
		
		System.out.println("Informe o preço do item: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10){
			System.out.println(" Está barato, pode comprar");
		} else if (valor > 10 && valor < 15) {
			System.out.println(" Você pode pedir um desconto");
		} else if (valor >=15 && valor < 17) {	
			System.out.println(" Você pode pesquisar um pouco mais ");
		} else { // valor == 17
			System.out.println("Muito caro !");
			
		}	
			
			
		}
		
		

		
		
		
		
		
		
	}


