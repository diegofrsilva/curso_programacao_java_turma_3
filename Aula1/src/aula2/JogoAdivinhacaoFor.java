package aula2;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = new Random().nextInt(10) + 1;
		int numeroTentativas, chute;

		System.out.println("Chute: ");
		chute = scanner.nextInt();

		for (numeroTentativas = 1; numero != chute; numeroTentativas++) {
			System.out.println("Chute errado, tente novamente!");
			System.out.println("Chute: ");
			chute = scanner.nextInt();
		}
		System.out.println("Vc acertou em " + numeroTentativas + " tentativas");
		scanner.close();
	}
}
