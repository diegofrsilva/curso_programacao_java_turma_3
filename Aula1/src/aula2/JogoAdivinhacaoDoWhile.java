package aula2;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = new Random().nextInt(10) + 1;
		int numeroTentativas = 0, chute;

		do {
			numeroTentativas++;

			System.out.println("Chute: ");
			chute = scanner.nextInt();

			if (numero != chute) {
				System.out.println("Chute errado, tente novamente!");
			}
		} while (numero != chute);
		
		System.out.println("Vc acertou em " + numeroTentativas + " tentativas");
		scanner.close();
	}
}
