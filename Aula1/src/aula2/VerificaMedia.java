package aula2;

import java.util.Scanner;

public class VerificaMedia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome = teclado.nextLine();

		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		double nota3 = teclado.nextDouble();
		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println(nome + " foi aprovado!");
		} else if (media >= 4) {
			System.out.println(nome + " esta de exame!");
		} else {
			System.out.println(nome + " foi reprovado!");
		}
		teclado.close();
	}
}
