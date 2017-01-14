package aula5.usuario;

public class ValidadorSenha {

	public static boolean valida(String senha) {
		if (senha.length() < 5) {
			return false;
		}
		if (!contemNumero(senha)) {
			return false;
		}
		if (!contemLetra(senha)) {
			return false;
		}
		return true;
	}

	private static boolean contemLetra(String senha) {
		char[] digitos = senha.toCharArray();
		for (char digito : digitos) {
			if (Character.isLetter(digito)) {
				return true;
			}
		}
		return false;
	}

	private static boolean contemNumero(String senha) {
		char[] digitos = senha.toCharArray();
		for (char digito : digitos) {
			if (Character.isDigit(digito)) {
				return true;
			}
		}
		return false;
	}
}
