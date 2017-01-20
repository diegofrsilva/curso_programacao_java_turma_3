package aula9.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import aula6.pessoa.PessoaFisica;

public class ExemploListaPessoas {

	public static void main(String[] args) {
		List<PessoaFisica> pessoas = new ArrayList<>();

		pessoas.add(new PessoaFisica("Joaozinho", "000000003", 10));
		pessoas.add(new PessoaFisica("Diego", "000000001", 2));
		pessoas.add(new PessoaFisica("Andreia", "000000005", 15));
		pessoas.add(new PessoaFisica("Mariana", "000000004", 12));
		pessoas.add(new PessoaFisica("Juquinha", "000000002", 3));

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Ordenar por nome");
		System.out.println("2. Ordenar por cpf");
		int tipoOrdenacao = scanner.nextInt();

		if (tipoOrdenacao == 1) {
			Collections.sort(pessoas, new PessoaPorNomeComparator());
		} else if (tipoOrdenacao == 2) {
			Collections.sort(pessoas, new PessoaPorCpfComparator());
		}
		for (PessoaFisica pessoaFisica : pessoas) {
			System.out.println(pessoaFisica);
		}
		scanner.close();
	}
}
