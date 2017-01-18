package aula7.area;

public class Quadrado implements AreaCalculavel {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return Math.pow(lado, 2);
	}
}
