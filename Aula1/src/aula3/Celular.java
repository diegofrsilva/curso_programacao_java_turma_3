package aula3;

public class Celular {

	String modelo = "modelo qualquer";
	String marca;
	String numeroSerie;

	Tela tela;
	Bateria bateria;

	public Celular(String modelo) {
		this.modelo = modelo;
	}
	
	public Celular(String modelo, 
			String marca, 
			String numeroSerie,
			Bateria bateria, 
			Tela tela) {

		this.modelo = modelo;
		this.marca = marca;
		this.numeroSerie = numeroSerie;
		this.bateria = bateria;
		this.tela = tela;
	}

	public void ligar() {
		if (bateria.carga < 10) {
			System.out.println("Carga muito baixa!");
		} else {
			System.out.println("Ligando celular... ");
			tela.ligar();
		}
	}

	public void desligar() {
		System.out.println("Desligando celular... ");
		tela.desligar();
	}

	public void carregar() {
		System.out.println("Carregando... ");

		while (bateria.carga < bateria.capacidade) {
			bateria.carga++;
			System.out.println(bateria.carga + "%");

			pausar();
		}
		System.out.println("Carregado!");
	}

	private void pausar() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}