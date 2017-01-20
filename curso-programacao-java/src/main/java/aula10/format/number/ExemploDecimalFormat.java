package aula10.format.number;

import java.text.DecimalFormat;

public class ExemploDecimalFormat {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        System.out.println(decimalFormat.format(10.5));
    }
}
