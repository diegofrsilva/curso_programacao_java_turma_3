package aula1;

import java.util.Scanner;

public class CompararStrings {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o nome: ");
		String nome = leitor.nextLine();

		System.out.println("Informe o segundo nome: ");
		String segundoNome = leitor.nextLine();

		System.out.println(nome == segundoNome);
		System.out.println(nome.equals(segundoNome));
		leitor.close();
	}
}
