package aula5.biblioteca;

import java.util.Scanner;

public class MenuBiblioteca {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		final Biblioteca biblioteca = new Biblioteca(100);
		int opcao = mostrarMenu(leitor);

		while (opcao != 5) {
			if (opcao == 1) {
				adicionarLivro(leitor, biblioteca);
			} else if (opcao == 2) {
				buscarLivro(leitor, biblioteca);
			} else if (opcao == 3) {
				removerLivro(leitor, biblioteca);
			} else if (opcao == 4) {
				listarLivros(biblioteca);
			} else {
				System.out.println("Opcao invalida!");
			}
			opcao = mostrarMenu(leitor);
		}
		System.out.println("Foram criados " + Livro.QUANTIDADE + " livros");
	}

	private static void listarLivros(Biblioteca biblioteca) {
		System.out.println("Livros cadastrados: ");
		for (Livro livro : biblioteca.getLivros()) {
			if (livro != null) {
				System.out.println(livro);
			}
		}
	}

	private static void removerLivro(Scanner leitor, Biblioteca biblioteca) {
		System.out.println("Codigo: ");
		String codigo = leitor.nextLine();

		boolean removeu = biblioteca.remover(codigo);
		if (removeu) {
			System.out.println("Livro removido com sucesso!");
		} else {
			System.out.println("Livro nao encontrado!");
		}
	}

	private static void buscarLivro(Scanner leitor, Biblioteca biblioteca) {
		System.out.println("Codigo: ");
		String codigo = leitor.nextLine();

		Livro livro = biblioteca.buscar(codigo);
		if (livro == null) {
			System.out.println("Nenhum livro encontrado!");
		} else {
			System.out.println("Livro encontrado: ");
			System.out.println(livro);
		}
	}

	private static void adicionarLivro(Scanner leitor, Biblioteca biblioteca) {
		Livro livro = new Livro();

		System.out.println("Codigo: ");
		livro.codigo = leitor.nextLine();

		System.out.println("Autor: ");
		livro.autor = leitor.nextLine();

		System.out.println("Titulo: ");
		livro.titulo = leitor.nextLine();

		System.out.println("Data publicacao: ");
		livro.dataPublicacao = leitor.nextLine();

		boolean adicionou = biblioteca.adicionar(livro);
		if (adicionou) {
			System.out.println("Livro adicionado com sucesso!");
		} else {
			System.out.println("Jah existe um livro com o codigo informado!");
		}
	}

	private static int mostrarMenu(Scanner leitor) {
		System.out.println("1. Adicionar Livro");
		System.out.println("2. Buscar Livro");
		System.out.println("3. Remover Livro");
		System.out.println("4. Listar livros");
		System.out.println("5. Sair");
		int opcao = leitor.nextInt();
		leitor.nextLine();

		return opcao;
	}
}
