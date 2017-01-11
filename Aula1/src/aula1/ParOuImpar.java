package aula1;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		
		String mensagem = 
				numero % 2 == 0 
				? " é par" 
				: " é impar";
		
		System.out.println(numero + mensagem);
		teclado.close();
	}
}
