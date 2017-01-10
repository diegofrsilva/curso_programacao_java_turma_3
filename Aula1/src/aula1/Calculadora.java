package aula1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Primeiro numero: ");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Segundo numero: ");
		int segundoNumero = scanner.nextInt();

		System.out.println(primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
		System.out.println(primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
		System.out.println(primeiroNumero + " * " + segundoNumero + " = " + (primeiroNumero * segundoNumero));
		System.out.println(primeiroNumero + " / " + segundoNumero + " = " + (primeiroNumero / segundoNumero));
		System.out.println(primeiroNumero + " % " + segundoNumero + " = " + (primeiroNumero % segundoNumero));
		scanner.close();
	}
}
