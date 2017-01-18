package aula7.area;

public class Retangulo implements AreaCalculavel {
	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public double getArea() {
		return altura * largura;
	}
}
