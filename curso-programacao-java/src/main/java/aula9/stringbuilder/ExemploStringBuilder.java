package aula9.stringbuilder;

public class ExemploStringBuilder {

	public static void main(String[] args) {
		// Suporta concorrencia
		// StringBuffer builder = new StringBuffer();

		// Nao suporta concorrencia
		StringBuilder builder = new StringBuilder();
		builder.append("Valor qualquer ")
			.append(" , ");
		builder.append(10);
		builder.setCharAt(5, 'X');
		builder.insert(2, "NOVO_TEXTO");
		builder.setLength(builder.length() - 4);
		builder.append("final do meu texto");

		String conteudoDaString = builder.toString();
		System.out.println(conteudoDaString);

		String minhaString = "Teste" + 10 + "teste Y" + "outroTeste" + 50;
		String resultado = minhaString.replace("Y", "X");

		System.out.println(resultado);
	}
}
