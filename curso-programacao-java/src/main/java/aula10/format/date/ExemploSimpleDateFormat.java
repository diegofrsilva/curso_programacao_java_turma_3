package aula10.format.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploSimpleDateFormat {

    public static void main(String[] args) throws ParseException {
        // hh minusculo am/pm
        // HH maiusculo formato 24 horas
    	Date dataAtual = new Date();
    	
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(simpleDateFormat.format(dataAtual));
        
        Date date = simpleDateFormat.parse("01/01/1990 10:00:00");
        System.out.println(date);
    }
}
