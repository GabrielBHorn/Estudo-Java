package com.horn.estudos.exercicios;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe a velocidade da net: ");
		double veloNet = scan.nextDouble();
		
		double tempo = tamanhoArquivo / veloNet;
		
		System.out.println("o Tempo para conclusão do Download é: " + tempo);
		
		
		

	}

}
