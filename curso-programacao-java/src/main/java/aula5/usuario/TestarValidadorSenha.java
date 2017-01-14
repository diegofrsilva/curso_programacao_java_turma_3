package aula5.usuario;

public class TestarValidadorSenha {

	public static void main(String[] args) {
		String senhaValida = "abc123456";
		String senhaMenorQueMinimo = "abc1";
		String senhaSemLetra = "123456";
		String senhaSemNumero = "abcdef";

		System.out.println(senhaValida + ": " + ValidadorSenha.valida(senhaValida));
		System.out.println(senhaMenorQueMinimo + ": " + ValidadorSenha.valida(senhaMenorQueMinimo));
		System.out.println(senhaSemLetra + ": " + ValidadorSenha.valida(senhaSemLetra));
		System.out.println(senhaSemNumero + ": " + ValidadorSenha.valida(senhaSemNumero));

		Usuario usuarioDiego = new Usuario("Diego", "diegofrsilva@gmail.com", "123abc");
		usuarioDiego.setSenha("a");
		System.out.println("Senha: " + usuarioDiego.getSenha());

		Usuario usuarioJose = new Usuario("Jose", "jose@email.com", "1");
		System.out.println("Senha: " + usuarioJose.getSenha());
	}
}
