package aula3;

public class Tela {

	int largura;
	int altura;

	public Tela(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public void ligar() {
		System.out.println("Ligando tela... ");
	}

	public void desligar() {
		System.out.println("Desligando tela... ");
	}
}
