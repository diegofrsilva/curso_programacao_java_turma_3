package aula3;

public class TestarCarro {

	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "HLK-1111", "Uno", 1990, 180);
		carro.ligar();
		for (int i = 0; i < 200; i++) {
			carro.acelerar();
		}
		carro.frear();
		carro.frear();
		System.out.println("Velocidade: " + carro.velocidadeAtual);
		carro.desligar();
		System.out.println("Velocidade apos desligar: " + carro.velocidadeAtual);
	}
}
