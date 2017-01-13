package aula4.arrays;

import java.util.Scanner;

public class ExemploArraysFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[3];

		// Erro de posicao nao existente.
		// notas[3] = 10;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": ");
			notas[i] = scanner.nextDouble();
		}
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		double media = soma / notas.length;
		System.out.println("Media: " + media);

		scanner.close();
	}
}