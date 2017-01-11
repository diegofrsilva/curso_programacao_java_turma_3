package aula2;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		if (x > 10) {
			System.out.println("Maior que 10");
		} else if (x == 10) {
			System.out.println("X eh 10");
		} else if (x > 4) {
			System.out.println("X esta entre 4 e 9");
		} else {
			System.out.println("Menor que 10");
		}
		System.out.println("Finalizando..");
		scanner.close();
	}
}
