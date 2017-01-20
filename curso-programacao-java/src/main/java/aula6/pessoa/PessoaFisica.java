package aula6.pessoa;

public class PessoaFisica extends Pessoa implements Comparable<PessoaFisica> {

	private String cpf;
	private int idade;

	public PessoaFisica(String nome, String cpf, int idade) {
		super(nome);
		this.cpf = cpf;
		this.idade = idade;
	}

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return getNome() + " - " + cpf + " - " + idade;
	}
	
	public int getIdade() {
		return idade;
	}

	@Override
	public int compareTo(PessoaFisica outraPessoa) {
		return idade - outraPessoa.idade;
	}
}