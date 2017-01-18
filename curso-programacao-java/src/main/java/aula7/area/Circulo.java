package aula7.area;

public class Circulo implements AreaCalculavel {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(raio, 2);
	}
}
