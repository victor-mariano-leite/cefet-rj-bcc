package Aula_2.Exercício_2;

public class Conta {
	String nomeCliente;
	double saldo;
	public void sacar(double valor) {
		saldo = saldo - valor;
		System.out.println("Saldo = "+saldo);
	}
	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Saldo = "+saldo);
	}
	public void transferir(Conta destino, double valor) {
		sacar(valor);
		destino.depositar(valor);
	}
}
