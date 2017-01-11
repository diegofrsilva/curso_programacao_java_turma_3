package aula2;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = new Random().nextInt(10) + 1;

		System.out.println("Chute: ");
		int chute = scanner.nextInt();
		int numeroTentativas = 1;

		while (chute != numero) {
			numeroTentativas++;

			System.out.println("Chute errado, tente novamente!");
			System.out.println("Chute: ");
			chute = scanner.nextInt();
		}
		System.out.println("Vc acertou em " + numeroTentativas + " tentativas");
		scanner.close();
	}
}
