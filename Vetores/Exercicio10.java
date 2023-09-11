package Vetores;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        /*Faça um algoritmo em que quem preenche os valores do vetor é o usuário, por fim printe o vetor (vetor de 5 posições).
	         */

	        int[] vetor = new int[5];

	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite um valor inteiro para preencher o vetor: ");
	            vetor[i] = scanner.nextInt();
	        }
	        System.out.println("Vetor preenchido: ");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(vetor[i] + " ");
	        }
	    }

	}

