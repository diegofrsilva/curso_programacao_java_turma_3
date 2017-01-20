package aula6.equipamento;

/**
 * Classe que representa uma cadeira.
 * 
 * @author Diego Farias da Silva
 *
 */
public class Cadeira extends Equipamento {

	/**
	 * Atributo que armazena o material. Ex.: Madeira, Metal.
	 */
	private String material;

	/**
	 * 
	 * @param fabricante Fabricante da cadeira
	 * @param preco Preco da cadeira
	 * @param material Material de fabrica&ccedil;&atilde;o da cadeira
	 */
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
