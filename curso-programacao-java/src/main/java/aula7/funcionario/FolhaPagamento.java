package aula7.funcionario;

public class FolhaPagamento {

	public double calcular(Funcionario... funcionarios) {
		double soma = 0;
		for (Funcionario funcionario : funcionarios) {
			soma += funcionario.getSalarioComBonificacao();
		}
		return soma;
	}
}
