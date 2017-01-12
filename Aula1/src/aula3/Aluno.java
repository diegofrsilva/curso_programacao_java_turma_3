package aula3;

public class Aluno {

	String nome;
	String ra;
	String cpf;

	double nota1;
	double nota2;
	double nota3;

	public double calcularMedia() {
		double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

	public void metodoQualquer() {
		if (nota1 > 7) {
			return;
		}
		System.out.println("Qualquer coisa!");
	}
}