package com.horn.estudos.exerciciosaula19;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		
Scanner scan = new Scanner (System.in);
		
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();

	}

}
