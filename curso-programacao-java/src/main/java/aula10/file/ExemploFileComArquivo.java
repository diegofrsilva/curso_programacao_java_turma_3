package aula10.file;

import java.io.File;
import java.io.IOException;

public class ExemploFileComArquivo {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/java04/novo-arquivo.txt");
        if (file.exists()) {
            System.out.println("Arquivo nao existe. Criando arquivo!");
            file.createNewFile();
        }
        System.out.println(file.isDirectory());
        System.out.println("Finalizando.... ");
    }
}
