package aula7.funcionario;


public class ExecutarFolhaPagamento {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Juquinha", 1000);
		Supervisor supervisor = new Supervisor("Juquinha supervisor", 1000);
		Secretaria secretaria = new Secretaria("Mariana", 1000);

		FolhaPagamento folha = new FolhaPagamento();
		double valor = folha.calcular(gerente, supervisor, secretaria);
		System.out.println("Valor total: " + valor);
	}
}
