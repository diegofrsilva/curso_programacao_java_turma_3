package aula6.pessoa.sobrecarga;

public class TestarReescrita {

	public static void main(String[] args) {
		ClasseFilha c = new ClasseFilha();
		c.fazAlgumaCoisa();

		ClasseNeta n = new ClasseNeta();
		n.fazAlgumaCoisa();

		ClasseFilhaB b = new ClasseFilhaB();
		b.fazAlgumaCoisa(1);
		b.fazAlgumaCoisa();

		ClasseBase objeto = new ClasseFilha();
		objeto.fazAlgumaCoisa();
	}
}
