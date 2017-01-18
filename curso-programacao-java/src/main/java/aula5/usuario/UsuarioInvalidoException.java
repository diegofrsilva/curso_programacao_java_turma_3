package aula5.usuario;

public class UsuarioInvalidoException extends Exception {

	private static final long serialVersionUID = 5344007488257789053L;

	public UsuarioInvalidoException(String mensagem) {
		super(mensagem);
	}
}
