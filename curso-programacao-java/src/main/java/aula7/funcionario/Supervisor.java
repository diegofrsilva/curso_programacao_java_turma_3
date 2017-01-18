package aula7.funcionario;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getPorcentagemAdicional() {
		return 0.10;
	}
}
