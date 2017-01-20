package aula10.format.date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ExemploDateFormat {

    public static void main(String[] args) {
        /*
         * Metodo recebe o estilo e o locale
         */
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG/*, Locale.CHINESE*/);
        String dataFormatada = dateFormat.format(new Date());

        System.out.println("Locale: " + Locale.getDefault());
        System.out.println("Data formatada: " + dataFormatada);
    }
}
