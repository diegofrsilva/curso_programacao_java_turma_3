package aula9.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class ExemploStream {

	private static final String NOME_ARQUIVO = "/home/java04/meu-arquivo.txt";

	public static void main(String[] args) throws IOException {
		escreverNoArquivo();
		System.out.println("Arquivo gravado com sucesso!");
		
		String conteudo = lerArquivo();
		System.out.println("Conteudo do arquivo: " + conteudo);
	}

	private static String lerArquivo() throws IOException {
		StringBuilder conteudo = new StringBuilder();
		FileInputStream fileInputStream = new FileInputStream(NOME_ARQUIVO);

		try {
			int read = fileInputStream.read();
			while (read != -1) {
				conteudo.append((char) read);
				read = fileInputStream.read();
			}
		} finally {
			fileInputStream.close();
		}
		return conteudo.toString();
	}

	private static void escreverNoArquivo() throws IOException {
		boolean incluirNoFinal = false;
		FileOutputStream fileOutputStream = new FileOutputStream(NOME_ARQUIVO,
				incluirNoFinal);

		try {
			Charset charset = Charset.forName("UTF-8");
			String conteudo = "Conteudo do meu arquivo\n";
			fileOutputStream.write(conteudo.getBytes(charset));
		} finally {
			fileOutputStream.close();
		}
	}
}
