package aula4.arrays;

import java.util.Scanner;

public class ExemploArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[3];

		System.out.println("Primeira nota: ");
		notas[0] = scanner.nextDouble();

		System.out.println("Segunda nota: ");
		notas[1] = scanner.nextDouble();

		System.out.println("Terceira nota: ");
		notas[2] = scanner.nextDouble();

		double media = (notas[0] + notas[1] + notas[2]) / 3;
		System.out.println("Media: " + media);
		
		scanner.close();
	}
}
