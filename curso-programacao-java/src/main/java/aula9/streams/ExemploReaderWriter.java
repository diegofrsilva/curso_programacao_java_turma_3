package aula9.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploReaderWriter {

	private static final String NOME_ARQUIVO = "/home/java04/meu-arquivo-02.txt";

	public static void main(String[] args) throws IOException {
		escreverNoArquivoComReader();
		System.out.println("Arquivo gravado com sucesso!");

		String conteudo = lerDoArquivoComReader();
		System.out.println("Conteudo do arquivo: " + conteudo);
	}

	private static String lerDoArquivoComReader() throws IOException {
		StringBuilder builder = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
			String linha = reader.readLine();
			while (linha != null) {
				builder.append(linha);
				linha = reader.readLine();
			}
		}
		return builder.toString();
	}

	private static void escreverNoArquivoComReader() throws IOException {
		try (FileWriter fileWriter = new FileWriter(NOME_ARQUIVO)) {
			fileWriter.write("Conteudo do meu arquivo usando writer!");
		}
	}
}
