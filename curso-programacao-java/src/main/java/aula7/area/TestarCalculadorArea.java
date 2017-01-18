package aula7.area;

public class TestarCalculadorArea {

	public static void main(String[] args) {
		CalculadorArea calculadorArea = new CalculadorArea();

		System.out.println(calculadorArea.calcular(new Circulo(5)));
		System.out.println(calculadorArea.calcular(new Quadrado(10)));
		System.out.println(calculadorArea.calcular(new Retangulo(5, 10)));
	}
}
