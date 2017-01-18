package aula7.classesabstratas;

public class ClasseFilhaConcreta extends ClasseFilhaAbstrata {

	public int x = 10;

	@Override
	public void outroMetodoQualquer() {
		System.out.println("outroMetodoQualquer");
	}

	public int getValorDaSuperClasse() {
		return super.x;
	}
}
