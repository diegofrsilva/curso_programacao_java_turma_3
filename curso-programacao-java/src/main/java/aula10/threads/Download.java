package aula10.threads;

public class Download implements Runnable {

	private int tamanho;
	private String nomeArquivo;

	public Download(String nomeArquivo, int tamanho) {
		this.nomeArquivo = nomeArquivo;
		this.tamanho = tamanho;
	}

	@Override
	public void run() {
		int contador = 0;

		while (contador < Integer.MAX_VALUE) {
			System.out.println("Baixando " + contador + " ... " + nomeArquivo);
			contador++;
		}
		System.out.println("download finalizado: " + nomeArquivo);
	}
}
