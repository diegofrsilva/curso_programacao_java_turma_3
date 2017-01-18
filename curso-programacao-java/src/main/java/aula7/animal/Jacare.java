package aula7.animal;

public class Jacare extends Reptil implements Examinavel {

	@Override
	public void emitirSom() {
		System.out.println("Som do jacare");
	}

	@Override
	public void examinar() {
		this.emitirSom();
	}
}
