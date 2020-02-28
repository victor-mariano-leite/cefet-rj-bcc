package Aula_2.Exercício_1;

public class Principal {

	public static void main(String[] args) {
		Conta x = new Conta();
		x.nomeCliente = "Ana";
		x.depositar(1000);
		Conta y = new Conta();
		x.transferir(y, 100);
		System.out.println(x.saldo);
		System.out.println(y.saldo);
	}

}
