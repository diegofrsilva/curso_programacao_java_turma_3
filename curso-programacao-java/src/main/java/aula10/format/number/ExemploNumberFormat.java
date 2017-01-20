package aula10.format.number;

import java.text.NumberFormat;
import java.util.Locale;

public class ExemploNumberFormat {

    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("pt-br");
        double valor = 10.5998989854154;

        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();

        numberFormat.setMinimumFractionDigits(5); // quantidade de numeros apos a virgula

        System.out.println("numberFormat: " + numberFormat.format(valor));
        System.out.println("currencyInstance: " + currencyInstance.format(valor));
        System.out.println("percentInstance: " + percentInstance.format(valor));
    }
}
