package aula5.usuario;


public class TestarGerenciadorUsuario {

	public static void main(String[] args) {
		GerenciadorUsuario gerenciador = new GerenciadorUsuario();
		try {
			gerenciador.validar("addmin@email.com", "123");
			System.out.println("Usuario valido!");
		} catch (UsuarioInvalidoException e) {
			System.out.println("especifico: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("generico: " + e.getMessage());
		} finally {
			System.out.println("Executando finally");
		}
		System.out.println("Finalizando... ");
	}
}
