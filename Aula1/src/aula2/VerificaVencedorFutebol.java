package aula2;

import java.util.Scanner;

public class VerificaVencedorFutebol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Primeiro time: ");
		String primeiroTime = scanner.nextLine();

		System.out.println("Segundo time: ");
		String segundoTime = scanner.nextLine();

		System.out.println("Quantidade de jogos: ");
		int quantidadeJogos = scanner.nextInt();
		int vitoriasPrimeiroTime = 0, vitoriasSegundoTime = 0, saldoGolsPrimeiroTime = 0, saldoGolsSegundoTime = 0;

		for (int i = 0; i < quantidadeJogos; i++) {
			System.out.println("Gols primeiro time: ");
			int golsPrimeiroTime = scanner.nextInt();

			System.out.println("Gols segundo time: ");
			int golsSegundoTime = scanner.nextInt();

			if (golsPrimeiroTime > golsSegundoTime) {
				vitoriasPrimeiroTime++;
			} else if (golsSegundoTime > golsPrimeiroTime) {
				vitoriasSegundoTime++;
			}
			saldoGolsPrimeiroTime += (golsPrimeiroTime - golsSegundoTime);
			saldoGolsSegundoTime += (golsSegundoTime - golsPrimeiroTime);
		}

		if (vitoriasPrimeiroTime > vitoriasSegundoTime) {
			System.out.println("Vencedor: " + primeiroTime);
			System.out.println("Vitorias: " + vitoriasPrimeiroTime);
			System.out.println("Saldo de gols: " + saldoGolsPrimeiroTime);
		} else if (vitoriasSegundoTime > vitoriasPrimeiroTime) {
			System.out.println("Vencedor: " + segundoTime);
			System.out.println("Vitorias: " + vitoriasSegundoTime);
			System.out.println("Saldo de gols: " + saldoGolsSegundoTime);
		} else {
			System.out.println("Empate!");
		}
		scanner.close();
	}
}
