package aula4;

public class Conta {

	double saldo;

	public boolean sacar(double valor) {
		if (valor > saldo) {
			return false;
		}
		// saldo = saldo - valor;
		saldo -= valor;
		return true;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public double obterSaldo() {
		return saldo;
	}
}
