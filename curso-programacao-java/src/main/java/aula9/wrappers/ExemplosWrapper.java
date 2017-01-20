package aula9.wrappers;

import java.util.ArrayList;
import java.util.List;

public class ExemplosWrapper {

	public static void main(String[] args) {
		List<Integer> inteiros = new ArrayList<>();
		inteiros.add(10);

		Long meuLong = new Long(500);
		Character digito = 'a';

		int x = 10;
		Integer i = new Integer(10);

		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(2));
	}
}
