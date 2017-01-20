package aula6.equipamento;

public class Equipamento {
	private double preco;
	private String fabricante;

	public Equipamento(String fabricante, double preco) {
		this.preco = preco;
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	/**
	 * Metodo que calcula o preco final de um equipamento.
	 * 
	 * @return Retorna o preco final do equipamento acrescido do imposto caso
	 *         necessario.
	 */
	public double calcularPrecoFinal() {
		return preco;
	}
}
