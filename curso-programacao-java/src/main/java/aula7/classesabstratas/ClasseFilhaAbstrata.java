package aula7.classesabstratas;

public abstract class ClasseFilhaAbstrata extends ClasseBaseAbstrata {

	public abstract void outroMetodoQualquer();

	@Override
	public void metodoQualquer() {
		System.out.println("metodoQualquer");
	}

	public void metodoConcreto() {
		System.out.println("metodoConcreto");
	}
}
