package aula1;

import java.util.Scanner;

/**
 * Faça um programa que leia uma idade do teclado e imprima true caso seja maior de idade (18 anos) ou false caso seja menor;
 * Crie a classe VerificaIdade e coloque sua lógica no método main dentro dessa classe.
 */
/**
 * Altere a classe VerificaIdade para imprimir “Maior de idade” ou “Menor de idade” (ao invés de true/false) utilizando o operador condicional.
 * condicao ? valor_se_verdadeiro : valor_se_false
 */
public class VerificaIdade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a idade: ");
		int idade = teclado.nextInt();
		String resultado = idade >= 18 
				? "Maior de idade" 
				: "Menor de idade";
		
		System.out.println(resultado);
		teclado.close();
	}
}