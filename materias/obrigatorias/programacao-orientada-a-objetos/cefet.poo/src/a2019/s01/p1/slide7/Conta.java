package a2019.s01.p1.slide7;

public class Conta {
	
	private double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo ( double saldo ) {
		this.saldo = saldo;
	}
	
	public void sacar ( double valor ) throws SemDinheiroException{
		
		if ( valor > saldo ) {
			throw new SemDinheiroException("valor: " + valor);
		} else {
			this.saldo -= valor;
		}
		
	}
}
