package aula5.biblioteca;

public class Livro {
	public static int QUANTIDADE = 0;

	String autor;
	String titulo;
	String codigo;
	String dataPublicacao;

	public Livro() {
		Livro.QUANTIDADE++;
	}

	public String toString() {
		return codigo + " - " + titulo;
	}
}
