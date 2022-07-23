package com.horn.estudos.exerciciosaula15;

import java.util.Scanner;

public class exercicio12 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		System.out.println(" Informe o valor da hora trabalhada : ");
		double valorHora = scan.nextDouble();
		
		System.out.println(" Informe o valor de horas trabalhadas no mês : ");
		double valorMes = scan.nextDouble();
		
		double salarioBruto = valorHora * valorMes;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double irf = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + irf;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println("O valor do seu sálario é: " + salarioBruto);
		System.out.println(" INSS" + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IRF" + irf);
		System.out.println("Total Descontos: " + totalDescontos);
		System.out.println("Salario Liquido" + salarioLiquido);

	}

}
