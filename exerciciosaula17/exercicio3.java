package com.horn.estudos.exerciciosaula17;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		
		Scanner scan  = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		do {
			System.out.println("Por favor informe o seu nome: ");
			nome = scan.next();
			
			if (nome.length() >=3) {
				infoValida = true;
			} else {
				System.out.println("O nome deve possuir mais de 3 letra, digite novamente: ");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Por favor informe a sua idade: ");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 100) {
				infoValida = true;
			} else {
				System.out.println("A idade informada deve estar entre 0 ou 100 anos:");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Por favor informe o seu salário: ");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("O salario a ser informado, deve ser maior que 0: ");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Por favor informe o seu genero sexual F ou M: ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase(sexo)) {
				infoValida = true;
			} else {
				System.out.println("O genero sexual deve ser informado através de F ou M digite novamente");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Por favor informe seu estado civil S, C, V, D: ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase(estadoCivil)) {
				infoValida = true;
			} else {
				System.out.println("O estado civil dever ser informado através de S, C, V ou D: ");
			}
		} while (!infoValida);
		
		
		

	}

}
