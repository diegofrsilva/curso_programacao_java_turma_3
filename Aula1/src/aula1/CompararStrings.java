package aula1;

import java.util.Scanner;

/**
 * Faça um programa que leia dois nomes (strings) e imprima true caso sejam
 * iguais e false caso contrário. Crie a classe CompararStrings e coloque sua
 * lógica no método main dentro dessa classe.
 *
 */
public class CompararStrings {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o nome: ");
		String nome = leitor.nextLine();

		System.out.println("Informe o segundo nome: ");
		String segundoNome = leitor.nextLine();

		System.out.println(nome == segundoNome);
		/*
		 * IMPORTANTE: Para comparar conteudo de objetos devemos usar o metodo
		 * equals ao inves do operador ==
		 */
		System.out.println(nome.equals(segundoNome));
		leitor.close();
	}
}
