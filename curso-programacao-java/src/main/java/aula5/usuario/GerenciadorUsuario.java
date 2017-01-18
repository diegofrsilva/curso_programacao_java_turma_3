package aula5.usuario;

public class GerenciadorUsuario {

	public void validar(String email, String senha)
			throws UsuarioInvalidoException {
		
		if (!email.equals("admin@email.com") || !senha.equals("123")) {
			throw new UsuarioInvalidoException("Login/senha invalidos. Tente novamente!");
		}
	}
}
