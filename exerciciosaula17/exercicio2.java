package com.horn.estudos.exerciciosaula17;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		boolean senhaValida  = false;
		
		do {
		
		System.out.println("Por favor informe o seu nome: ");
		String nome = scan.next();
		
		System.out.println("Por favor informe a sua senha:");
		String senha = scan.next();
		
		if (senha.equals(nome)) {
			senhaValida = false;
			System.out.println("A senha não pode ser igual o nome, digite novamente: ");
		} else {
			senhaValida = true;
			System.out.println("Usuário e senha cadastrados com sucesso !!! ");
							
		}
		
		}while (!senhaValida);
		
		}

	}


