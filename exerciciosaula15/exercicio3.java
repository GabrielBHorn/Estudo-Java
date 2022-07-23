package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
        Scanner scan  = new Scanner(System.in);
		
		System.out.println("Por favor informe o seu genero através de F ou M:");
				String genero = scan.next();				
				
		if (genero.equalsIgnoreCase("F") ) {
		    System.out.println("Sexo Feminino. ");
		} else if (genero.equals("M")) {
	    	System.out.println("Sexo Masculino");
		}	else {
	 		System.out.println("O genero informado é inválido.");	    
		} 
		
		
		
		}
		
	    
	    }
		
		
		
		
		
		
		
		
	    
		

	


