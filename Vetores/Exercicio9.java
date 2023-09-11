package Vetores;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
		  Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. 
		  Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. */

		// Declarar os vetores com 10 elementos cada
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] vetor3 = new int[10];

		// Ler os valores do primeiro vetor
		System.out.println("Digite os valores do primeiro vetor:");
		for (int i = 0; i < 10; i++) {
			vetor1[i] = scanner.nextInt();
		}

		// Ler os valores do segundo vetor
		System.out.println("Digite os valores do segundo vetor:");
		for (int i = 0; i < 10; i++) {
			vetor2[i] = scanner.nextInt();
		}

		// Calcular a soma dos elementos dos vetores
		for (int i = 0; i < 10; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}

		// Exibir os três vetores na tela
		System.out.println("Vetor 1:");
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor1[i] + " ");
		}
		System.out.println();

		System.out.println("Vetor 2:");
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor2[i] + " ");
		}
		System.out.println();

		System.out.println("Vetor 3 (soma dos vetores 1 e 2):");
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor3[i] + " ");
		}

	}
}