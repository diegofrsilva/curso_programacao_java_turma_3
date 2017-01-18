package aula7.enums;

public class TestarTelefones {

	public static void main(String[] args) {

		TipoTelefone residencial = TipoTelefone
				.valueOf("RESIDENCIAL");

		TipoTelefone[] values = TipoTelefone.values();
		TipoTelefone tipoTelefone = values[0];

		Telefone telefone1 = new Telefone("123456", TipoTelefone.CELULAR);
		Telefone telefone2 = new Telefone("12345678", TipoTelefone.RESIDENCIAL);

		System.out.println(telefone1);
		System.out.println(telefone2);
	}
}
