package com.dextraining.garagem;

import java.util.Collection;
import java.util.Scanner;

/**
 * Classe responsavel pela apresentacao do menu e leitura dos dados do usuario.
 * 
 * @author java04
 *
 */
public class InterfaceUsuarioGaragem {

	private static final int OPCAO_SAIR = 5;

	public static void main(String[] args) {
		// TODO: alterar para criar objeto da sua classe.
		Garagem garagem = null;

		Scanner scanner = new Scanner(System.in);
		int opcao = mostrarMenu(scanner);

		while (opcao != OPCAO_SAIR) {
			if (opcao == 1) {
				adicionar(garagem, scanner);
			} else if (opcao == 2) {
				vender(garagem, scanner);
			} else if (opcao == 3) {
				buscar(garagem, scanner);
			} else if (opcao == 4) {
				listar(garagem);
			} else {
				System.out.println("Opcao invalida!");
			}
			opcao = mostrarMenu(scanner);
		}
		scanner.close();
	}

	private static void listar(Garagem garagem) {
		Collection<Carro> carros = garagem.getCarros();
		if (carros.isEmpty()) {
			System.out.println("\nNenhum carro cadastrado!\n");
		} else {
			System.out.println("\nCarros encontrados: ");
			for (Carro carro : garagem.getCarros()) {
				System.out.println(carro);
			}
			System.out.println();
		}
	}

	private static void buscar(Garagem garagem, Scanner scanner) {
		System.out.println("Placa: ");
		String placa = scanner.nextLine();
		Carro carro = garagem.buscar(placa);
		if (carro != null) {
			/*
			 * TODO: reescrever metodo toString na classe carro para imprimir os
			 * dados
			 */
			System.out.println("\nCarro encontrado: ");
			System.out.println(carro);
			System.out.println();
		} else {
			System.out.println("\nNenhum carro encontrado!\n");
		}
	}

	private static void vender(Garagem garagem, Scanner scanner) {
		System.out.println("Placa: ");
		String placa = scanner.nextLine();
		boolean vendeu = garagem.vender(placa);
		if (vendeu) {
			System.out.println("\nCarro vendido com sucesso!\n");
		} else {
			System.out.println("\nCarro nao encontrado!\n");
		}
	}

	private static void adicionar(Garagem garagem, Scanner scanner) {
		System.out.println("Marca: ");
		String marca = scanner.nextLine();

		System.out.println("Modelo: ");
		String modelo = scanner.nextLine();

		System.out.println("Placa: ");
		String placa = scanner.nextLine();

		System.out.println("Ano: ");
		int ano = scanner.nextInt();

		System.out.println("Preco: ");
		double preco = scanner.nextDouble();

		// TODO: Atribuir valores lidos para o carro instanciado abaixo
		Carro carro = new Carro();
		boolean adicionou = garagem.adicionar(carro);
		if (adicionou) {
			System.out.println("\nCarro adicionado com sucesso!\n");
		} else {
			System.out.println("\nJa existe um carro com a placa informada!\n");
		}
	}

	private static int mostrarMenu(Scanner scanner) {
		System.out.println("1. Cadastrar");
		System.out.println("2. Vender");
		System.out.println("3. Buscar");
		System.out.println("4. Listar");
		System.out.println("5. Sair");

		int opcao = scanner.nextInt();
		scanner.nextLine();
		return opcao;
	}
}