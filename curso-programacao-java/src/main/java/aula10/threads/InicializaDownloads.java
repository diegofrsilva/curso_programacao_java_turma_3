package aula10.threads;

public class InicializaDownloads {

	public static void main(String[] args) {
		Download downloadFilme = new Download("filme.avi", 20);
		Download downloadMusica = new Download("musica.mp3", 10);
		Download downloadDocumento = new Download("documento.docx", 5);

		Thread threadFilme = new Thread(downloadFilme);
		Thread threadMusica = new Thread(downloadMusica);
		Thread threadDocumento = new Thread(downloadDocumento);

		threadFilme.start();
		threadMusica.start();
		threadDocumento.start();

		threadMusica.interrupt();
		System.out.println("Chegou no fim!");
	}
}
