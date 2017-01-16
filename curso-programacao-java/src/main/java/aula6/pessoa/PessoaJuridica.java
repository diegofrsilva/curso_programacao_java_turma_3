package aula6.pessoa;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica(String cnpj) {
		this("teste", cnpj);
	}

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return getNome() + " - " + cnpj;
	}
}
