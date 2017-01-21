package aula10.file;

import java.io.File;

public class ExemploFileComDiretorio {

	public static void main(String[] args) {
		String pastaUsuario = System.getProperty("user.home");

		System.out.println("Diretorio do usuario: " + pastaUsuario);

		File diretorio = new File(pastaUsuario);
		String[] filesNames = diretorio.list();
		for (String fileName : filesNames) {
			File file = new File(diretorio.getAbsolutePath() + 
					File.separator + 
					fileName);

			if (!file.isHidden()) {
				System.out.println(fileName);
			}
		}
	}
}
