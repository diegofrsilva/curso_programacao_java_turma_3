package aula10.format.message;

import java.text.MessageFormat;
import java.util.Date;

/**
 * Created by diego.farias on 20/01/17.
 */
public class ExemploMessageFormat {

    public static void main(String[] args) {
        String nome = "Juquinha";
        Date dataHoraAtual = new Date();
        
        String mensagemFormatada = MessageFormat.format("Ola, meu nome eh {0} e minha idade eh {1}", nome, 15);
        System.out.println(mensagemFormatada);

        String pattern = "Às {2,time,short} em {2,date,long} foram realizados {1,number,integer} vestibulares no {0}";
        String outraMensagemFormatada = MessageFormat
        		.format(pattern, "Brasil", 50, dataHoraAtual);
        System.out.println(outraMensagemFormatada);
    }
}
