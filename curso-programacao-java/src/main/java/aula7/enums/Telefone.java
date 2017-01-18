package aula7.enums;

public class Telefone {

	private String numero;
	private TipoTelefone tipo;

	public Telefone(String numero, TipoTelefone tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + ", tipo=" + tipo + "]";
	}
}
