package aula6.pessoa;

public class TestarHerancaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Pessoa");
		PessoaFisica pessoaFisica = new PessoaFisica("Pessoa Fisica", "00124354");
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Pessoa Fisica", "1");

		pessoa.setNome("Pessoa");

		pessoaFisica.setNome("Pessoa fisica");
		pessoaFisica.setCpf("000000000");

		pessoaJuridica.setNome("Pessoa juridica");
		pessoaJuridica.setCnpj("10000000");

		System.out.println(pessoa);
		System.out.println(pessoaFisica);
		System.out.println(pessoaJuridica);
	}
}
