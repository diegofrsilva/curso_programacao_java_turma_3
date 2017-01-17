package aula6.equipamento;

public class Televisao extends Equipamento {

	private int polegadas;

	public Televisao(String fabricante, double preco, int polegadas) {
		super(fabricante, preco);
		this.polegadas = polegadas;
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}

	@Override
	public double calcularPrecoFinal() {
		return getPreco() * 1.02;
	}
}
