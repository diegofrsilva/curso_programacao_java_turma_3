package aula1;

import java.util.Scanner;

/**
 * Faça um programa que leia dois números inteiros imprima o resultado da soma, subtração, divisão, multiplicação e resto da divisão. Seu programa deve imprimir:
 * 		“{NUMERO1} + {NUMERO2} = {RESULTADO}”
 * 		“{NUMERO1} - {NUMERO2} = {RESULTADO}”
 * 		“{NUMERO1} * {NUMERO2} = {RESULTADO}”
 * 		“{NUMERO1} / {NUMERO2} = {RESULTADO}”
 * 		“{NUMERO1} % {NUMERO2} = {RESULTADO}”
 * 
 * Crie a classe Calculadora e coloque sua lógica no método main dentro dessa classe.
 *
 */
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
