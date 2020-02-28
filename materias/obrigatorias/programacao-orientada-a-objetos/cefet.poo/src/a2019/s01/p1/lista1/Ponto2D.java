package a2019.s01.p1.lista1;

public class Ponto2D {
	
	// Variáveis privadas
	
	private double x;
	private double y;
	
	// Construtores
	
	Ponto2D(){
		setX(0);
		setY(0);
	}
	Ponto2D(double X, double Y){
		setX(X);
		setY(Y);
	}
	
	// Getters e setters
	
	public void setX( double X ) {
		x = X;
	}
	public double getX() {
		return x;
	}
	
	public void setY( double Y ) {
		y = Y;
	}
	public double getY() {
		return y;
	}
	
	// Métodos
	
	public boolean equals( Ponto2D p ) {
		
		if ( p.x == this.x && p.y == this.y ) {
			return true;
		}
		else {
			return false;
		}
	
	}
	public String toString( ) {
		String str = "X: " + this.x + "\nY: " + this.y;
		return str;
	}
	public double distancia( Ponto2D p ) {
		double dx2 = Math.pow( p.x  - this.x , 2);
		double dy2 = Math.pow( p.y - this.y , 2);
		double dist = Math.sqrt( dx2 + dy2 ); 
		return dist;
	}
	/*
	 * (RESOLVIDO) Que mensagem é essa que comenta pro problema abaixo
	 * g) Método que permita a criação de um novo ponto no mesmo
	 *  local do ponto que recebeu a mensagem (clone);
	 * Cada mensagem é implementada como uma chamada de método que informa a um método
	 * do objeto a maneira de realizar sua tarefa. Por exemplo, um programa pode chamar 
	 * o método depósito de um objeto conta bancária para aumentar o saldo da conta.
	*/
	public void sobrescrevePonto(double x, double y) {
		this.x = x;
		this.y = y;
	}

}
