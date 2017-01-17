package aula6.equipamento;

public class TestarEquipamentos {

	public static void main(String[] args) {
		Cadeira cadeira = new Cadeira("Fabricante qualquer", 500, "Madeira");
		Televisao televisao = new Televisao("Sony", 3000, 32);
		Impressora impressora = new Impressora("HP", 350, 100);

		System.out.println("Cadeira: " + cadeira.calcularPrecoFinal());
		System.out.println("Televisao: " + televisao.calcularPrecoFinal());
		System.out.println("Impressora: " + impressora.calcularPrecoFinal());
	}
}
