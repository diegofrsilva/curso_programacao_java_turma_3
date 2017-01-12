package aula3;

public class Carro {
	String marca;
	String placa;
	String modelo;
	int anoFabricacao;
	int velocidadeAtual;
	int velocidadeMaxima;
	boolean ligado;

	public Carro(String marca, String placa, String modelo, int anoFabricacao,
			int velocidadeMaxima) {
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.velocidadeMaxima = velocidadeMaxima;
		this.ligado = false;
	}

	public void ligar() {
		this.ligado = true;
	}

	public void desligar() {
		this.ligado = false;
		this.velocidadeAtual = 0;
	}

	public void acelerar() {
		if (ligado && velocidadeAtual < velocidadeMaxima) {
			velocidadeAtual++;
		}
	}

	public void frear() {
		if (velocidadeAtual > 0) {
			velocidadeAtual--;
		}
	}
}
