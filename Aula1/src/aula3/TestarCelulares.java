package aula3;


public class TestarCelulares {

	public static void main(String[] args) {
		Tela tela = new Tela(800, 600);
		Tela telaSamsung = new Tela(1024, 768);

		Bateria bateria = new Bateria();
		bateria.carga = 50;
		Bateria bateriaSamsung = new Bateria();

		Celular celular = 
				new Celular(
						"6", 
						"Nokia", 
						"1", 
						bateria, 
						tela);

		Celular celularSamsung = 
				new Celular(
						"S7", 
						"Samsung", 
						"2",
						bateriaSamsung, 
						telaSamsung);

		celular.carregar();
		celular.ligar();
		
		celularSamsung.ligar();
	}
}
