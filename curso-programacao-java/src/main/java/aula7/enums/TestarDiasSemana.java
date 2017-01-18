package aula7.enums;

public class TestarDiasSemana {

	public static void main(String[] args) {
		DiaSemana diaSemana = DiaSemana.DOMINGO;
		System.out.println(diaSemana);
		System.out.println(diaSemana.ordinal());

		if (diaSemana == DiaSemana.DOMINGO) {
			System.out.println("Eh domingo!");
		}
		if (diaSemana == DiaSemana.SABADO) {
			System.out.println("Eh sabado!");
		}
	}
}
