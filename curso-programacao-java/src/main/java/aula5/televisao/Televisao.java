package aula5.televisao;

public class Televisao {

	public void ligar() {
		System.out.println("ligar");

		ajustarVoltagem();
		regularDiodo();
		ligarTela();
	}

	public void desligar() {
		System.out.println("desligar");
	}

	public void aumentarVolume() {
		System.out.println("aumentarVolume");
	}

	public void diminuirVolume() {
		System.out.println("diminuirVolume");
	}

	public void aumentarCanal() {
		System.out.println("aumentarCanal");
	}

	public void diminuirCanal() {
		System.out.println("diminuirCanal");
	}

	private void ajustarVoltagem() {
		System.out.println("ajustarVoltagem");
	}

	private void ligarTela() {
		System.out.println("ligarTela");
	}

	private void regularDiodo() {
		System.out.println("regularDiodo");
	}
}
