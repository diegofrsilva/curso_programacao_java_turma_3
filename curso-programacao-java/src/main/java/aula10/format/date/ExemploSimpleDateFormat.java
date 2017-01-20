package aula10.format.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploSimpleDateFormat {

    public static void main(String[] args) {
        // hh minusculo am/pm
        // HH maiusculo formato 24 horas

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm/MM/yyyy hh:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
