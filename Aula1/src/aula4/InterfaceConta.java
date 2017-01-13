package aula4;

import java.util.Scanner;

public class InterfaceConta {

	public static void main(String[] args) {
		Conta conta = new Conta();

		Scanner leitor = new Scanner(System.in);
		int opcao = mostarMenu(leitor);
		while (opcao != 4) {
			if (opcao == 1) {
				System.out.println("Valor: ");
				double valor = leitor.nextDouble();
				boolean sacou = conta.sacar(valor);
				if (sacou) {
					System.out.println("Saque realizado!");
					System.out.println("Saldo atual: R$ " + conta.obterSaldo());
				} else {
					System.out.println("Saldo insuficiente!");

//					JOptionPane
//						.showMessageDialog(null, "Saldo insuficiente");
				}
			} else if (opcao == 2) {
				System.out.println("Deposito: ");
				double valor = leitor.nextDouble();
				conta.depositar(valor);
			} else if (opcao == 3) {
				System.out.println("Saldo: R$" + conta.obterSaldo());
			} else {
				System.out.println("Opcao invalida!");
			}
			opcao = mostarMenu(leitor);
		}
		leitor.close();
	}

	private static int mostarMenu(Scanner leitor) {
		System.out.println("1. Sacar");
		System.out.println("2. Depositar");
		System.out.println("3. Ver saldo");
		System.out.println("4. Sair");

		return leitor.nextInt();
	}
}
