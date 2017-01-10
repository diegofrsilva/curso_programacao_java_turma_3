package aula1;

import java.util.Scanner;

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