package aula7.classesabstratas;


public class ExecutaClasses {

	public static void main(String[] args) {
		ClasseFilhaConcreta c = new ClasseFilhaConcreta();
		System.out.println(c.x);
		System.out.println(c.getValorDaSuperClasse());
	}
}
