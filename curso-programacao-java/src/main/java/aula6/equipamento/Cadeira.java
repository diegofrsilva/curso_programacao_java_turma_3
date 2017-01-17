package aula6.equipamento;

public class Cadeira extends Equipamento {

	private String material;

	public Cadeira(String fabricante, double preco, String material) {
		super(fabricante, preco);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
