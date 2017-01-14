package aula5.biblioteca;

public class Biblioteca {
	private Livro[] livros;
	private final int maxLivros;
	private int quantidadeLivros;

	public Biblioteca(int maxLivros) {
		this.maxLivros = maxLivros;
		this.livros = new Livro[maxLivros];
		this.quantidadeLivros = 0;
	}

	public Biblioteca() {
		this(100);
	}

	public final boolean adicionar(Livro livro) {
		Livro livroEncontrado = buscar(livro.codigo);

		if (livroEncontrado != null) {
			return false;
		}
		livros[quantidadeLivros] = livro;
		quantidadeLivros++;
		return true;
	}

	public final Livro buscar(String codigo) {
		int posicao = buscarPosicao(codigo);
		if (posicao > -1) {
			return livros[posicao];
		}
		return null;
	}

	public final boolean remover(String codigo) {
		final int posicao = buscarPosicao(codigo);

		if (posicao > -1) {

			for (int i = posicao; i < quantidadeLivros - 1; i++) {
				livros[i] = livros[i + 1];
			}
			livros[quantidadeLivros - 1] = null;
			quantidadeLivros--;

			return true;
		}
		return false;
	}

	private final int buscarPosicao(String codigo) {
		for (int i = 0; i < quantidadeLivros; i++) {
			Livro livro = livros[i];

			if (livro.codigo.equals(codigo)) {
				return i;
			}
		}
		return -1;
	}

	public final Livro[] getLivros() {
		return livros;
	}

	class ClasseInterna {
		double x;
		double y;
		double z;
	}

	class ClasseInterna2 {
	}
}
