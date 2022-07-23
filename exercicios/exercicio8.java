package com.horn.estudos.exercicios;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		
        Scanner scan  = new Scanner(System.in);
		
		System.out.println(" Informe o valor da hora trabalhada : ");
		double valorHora = scan.nextDouble();
		
		System.out.println(" Informe o valor de horas trabalhadas no mês : ");
		double valorMes = scan.nextDouble();
		
		double salario = valorHora * valorMes;
		System.out.println("O valor do seu sálario é: " + salario);
		
		

	}

}
