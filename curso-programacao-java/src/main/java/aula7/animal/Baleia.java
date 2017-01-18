package aula7.animal;

public class Baleia extends Mamifero implements Examinavel {
	
	@Override
	public void emitirSom() {
		System.out.println("Som da baleia");
	}

	public void examinar() {
		this.emitirSom();
	}
}
