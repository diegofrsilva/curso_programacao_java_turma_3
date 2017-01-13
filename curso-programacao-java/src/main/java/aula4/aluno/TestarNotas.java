package aula4.aluno;

import java.util.Scanner;

public class TestarNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantidade de alunos: ");
		int quantidadeAlunos = scanner.nextInt();

		Aluno[] alunos = new Aluno[quantidadeAlunos];

		// Leitura dos alunos
		for (int i = 0; i < alunos.length; i++) {
			scanner.nextLine();

			System.out.println("Informe o nome: ");
			String nome = scanner.nextLine();
			Aluno aluno = new Aluno(nome);

			lerNotas(aluno, scanner);
			alunos[i] = aluno;
		}

		// Imprime resultado
		for (Aluno aluno : alunos) {
			System.out.print(aluno.nome + " ");

			for (double nota : aluno.notas) {
				System.out.print(nota + " ");
			}
			System.out.println(aluno.getMedia());
		}
		scanner.close();
	}

	private static void lerNotas(Aluno aluno, Scanner scanner) {
		// Lendo notas do aluno atual
		for (int j = 0; j < aluno.notas.length; j++) {
			System.out.println("Nota " + (j + 1) + " do aluno " + aluno.nome
					+ ": ");
			aluno.notas[j] = scanner.nextDouble();
		}
	}
}
