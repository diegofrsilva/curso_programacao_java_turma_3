package aula1;

public class ExemploDeclaracaoVariavel {

	public static void main(String[] args) {
		int meuInteiro = 10;
		long meuLong = 100L;
		double meuDouble = 11.89;
		float meuFloat = 99.89F;
		char meuChar = 'X';
		String meuNome = "Java";
		String meuNomeUppercase = meuNome.toUpperCase();

		System.out.println(10 / 0.0);
		System.out.println(-10 / 0.0);
		// System.out.println(-10 / 0);

		String outroNome = "Java";

		// Incremento
		meuInteiro++;
		++meuInteiro;

		// Decremento
		meuInteiro--;
		--meuInteiro;

		System.out.println(meuNome);
		System.out.println(meuNomeUppercase);
		System.out.println(meuNome == outroNome);

		System.out.println(meuInteiro);
		System.out.println(meuLong);
		System.out.println(meuDouble);
		System.out.println(meuFloat);
		System.out.println(meuChar);
	}
}
