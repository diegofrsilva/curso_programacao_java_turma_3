package aula7.funcionario;

public abstract class Funcionario {

	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public double getSalarioComBonificacao() {
		return salario * (1 + getPorcentagemAdicional());
	}

	public String getNome() {
		return nome;
	}

	public abstract double getPorcentagemAdicional();
}
