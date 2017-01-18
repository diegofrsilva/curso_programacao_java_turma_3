package aula7.forma;

public class TestarFormas {

	public static void main(String[] args) {
		/* Criando implementacao anonima para a classe forma */
		Forma forma = new Forma() {
			@Override
			public void desenhar() {
				System.out.println("Desenhando triangulo");
			}
		};
		Circulo circulo = new Circulo();
		desenharNaTela(forma);
		desenharNaTela(circulo);
		desenharNaTela(new Quadrado());
	}

	public static void desenharNaTela(Forma forma) {
		forma.desenhar();
	}
}
