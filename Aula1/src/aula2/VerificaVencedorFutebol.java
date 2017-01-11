package aula2;

import java.util.Scanner;

public class VerificaVencedorFutebol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Primeiro time: ");
		String primeiroTime = scanner.nextLine();

		System.out.println("Segundo time: ");
		String segundoTime = scanner.nextLine();

		int quantidadeJogos = scanner.nextInt();
		int vitoriasPrimeiroTime = 0, 
			vitoriasSegundoTime = 0, 
			saldoGolsPrimeiroTime = 0, 
			saldoGolsSegundoTime = 0;

		for (int i = 0; i < quantidadeJogos; i++) {
			System.out.println("Gols primeiro time: ");
			int golsPrimeiroTime = scanner.nextInt();

			System.out.println("Gols segundo time: ");
			int golsSegundoTime = scanner.nextInt();

			if (golsPrimeiroTime > golsSegundoTime) {
				// incrementar numero de vitorias do primerio
			} else if (golsSegundoTime > golsPrimeiroTime) {
				// incrementar numero de vitorias do segundo
			}
			// Acumular saldo de gols dos times
		}
	}
}
