package aula9.colecoes;

import java.util.Comparator;

import aula6.pessoa.PessoaFisica;

public class PessoaPorCpfComparator implements Comparator<PessoaFisica> {

	@Override	
	public int compare(PessoaFisica pessoa, PessoaFisica outraPessoa) {
		return pessoa.getCpf().compareTo(outraPessoa.getCpf());
	}
}
