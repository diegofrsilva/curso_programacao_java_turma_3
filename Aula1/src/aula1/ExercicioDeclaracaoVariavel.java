package aula1;

/**
 * Crie uma classe chamada ExemploDeclaracaoVariaveis, crie o método main e então:
 * Crie uma variável chamada valorInteiro do tipo int e atribua o valor 1000;
 * Crie uma variável chamada valorByte do tipo byte e atribua o valor 1000;
 * Crie uma variável valorDouble do tipo double e atribua o valor 0.856;
 * Crie uma variável primeiroChar do tipo char e atribua o valor P;
 * Crie uma variável segundoChar do tipo char e atribua o valor 30;
 * Crie uma variável terceiroChar do tipo char e atribua o valor “Meu Caractere”;
 * Crie uma variável meuNome do tipo String e atribua seu nome.
 *
 */
public class ExercicioDeclaracaoVariavel {

	public static void main(String[] args) {
		int valorInteiro = 1000;
		byte valorByte = 127;
		double valorDouble = 0.856;
		char primeiroChar = 'P';
		char segundoChar = 30;
		// char terceiroChar = "Meu caractere";
		String meuNome = "Diego Farias da Silva";

		System.out.println(valorInteiro);
		System.out.println(valorByte);
		System.out.println(valorDouble);
		System.out.println(primeiroChar);
		System.out.println(segundoChar);
		System.out.println(meuNome);
	}
}