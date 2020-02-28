package caelum.cap4;

import java.util.Date;

public class Conta {
	
	private static int numeroConta = 0;
	private double saldo = 0.0;
	private String titular;
	private String agencia;
	private String dataDeAbertura;
	
	//Construtor alterado
	Conta(String titular_nome, String agencia_nome ){
		Date date = new Date();
		Conta.numeroConta = Conta.numeroConta + 1;
		this.dataDeAbertura = date.toString();
		this.agencia = agencia_nome;
		this.titular = titular_nome;
	}
	
	//Getters and setters
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	// Métodos, os exercícios desse capítulo 
	// são extremamente importantes.

	public void sacar(double valor) {
		if (this.getSaldo() < valor) {
			double y = this.getSaldo() - valor;
			this.setSaldo(y);
			System.out.println("O saldo de " + this.getTitular() + " agora é: " + this.getSaldo());
		}
		else {
			System.out.println("Não é possível efetuar essa operação.");
		}
	}
	
	public void depositar(double valor) {
		double y = this.getSaldo() + valor;
		this.setSaldo(y);
	}
	
	public double calculaRendimento() {
		return 0.0;
	}
}

