package aula10.file;

import java.io.File;

public class ExemploFileComDiretorio {

    public static void main(String[] args) {
        System.out.println("Diretorio do usuario: " + System.getProperty("user.home"));

        File diretorio = new File(System.getProperty("user.home"));
        String[] filesNames = diretorio.list();
        for (String fileName : filesNames) {
            System.out.println(fileName);
        }
    }
}
