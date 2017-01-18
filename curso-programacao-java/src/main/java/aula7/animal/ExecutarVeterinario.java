package aula7.animal;

public class ExecutarVeterinario {

	public static void main(String[] args) {
		Object array = new int[10];
		Object o = new Jacare();
		Baleia b = (Baleia) o;

		System.out.println("b: " + b);

		Examinavel baleia = new Baleia();
		Jacare jacare = new Jacare();
		Humano humano = new Humano();

		Veterinario veterinario = new Veterinario();
		veterinario.examinar(baleia);
		veterinario.examinar(jacare);
		// veterinario.examinar(humano);
		// veterinario.examinar(veterinario);
	}
}
