package aula6.equipamento;

public class Impressora extends Equipamento {

	private int dpi;

	public Impressora(String fabricante, double preco, int dpi) {
		super(fabricante, preco);
		this.dpi = dpi;
	}

	public int getDpi() {
		return dpi;
	}

	public void setDpi(int dpi) {
		this.dpi = dpi;
	}

	@Override
	public double calcularPrecoFinal() {
		return super.calcularPrecoFinal() * 1.05;
	}
}
