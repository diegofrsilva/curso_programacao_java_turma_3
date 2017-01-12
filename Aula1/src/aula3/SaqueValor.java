package aula3;

import java.util.Scanner;

public class SaqueValor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		int quantidade100, quantidade50, quantidade20, quantidade10, quantidade5;

		// R$100
		quantidade100 = valor / 100;
		valor = valor % 100;

		// R$50
		quantidade50 = valor / 50;
		valor = valor % 50;

		// R$20
		quantidade20 = valor / 20;
		valor = valor % 20;

		// R$10
		quantidade10 = valor / 10;
		valor = valor % 10;

		// R$5
		quantidade5 = valor / 5;
		valor = valor % 5;

		if (valor != 0) {
			System.out.println("Impossivel sacar o valor informado!");
		} else {
			if (quantidade100 > 0) {
				System.out.println(quantidade100 + " nota(s) de R$ 100");
			}
			if (quantidade50 > 0) {
				System.out.println(quantidade50 + " nota(s) de R$ 50");
			}
			if (quantidade20 > 0) {
				System.out.println(quantidade20 + " nota(s) de R$ 20");
			}
			if (quantidade10 > 0) {
				System.out.println(quantidade10 + " nota(s) de R$ 10");
			}
			if (quantidade5 > 0) {
				System.out.println(quantidade5 + " nota(s) de R$ 5");
			}

		}
		scanner.close();
	}
}
