package a2019.s01.p1.lista1;

public class NumeroComplexo {
	
	//Variáveis privadas
	private double real;
	private double imaginario;
	
	// Construtores
	NumeroComplexo(){
		setReal(0);
		setImaginario(0);
	}
	NumeroComplexo(double real, double imaginario){
		setReal(real);
		setImaginario(imaginario);
	}
	
	// Getters e Setters
	public double getReal() {
		return real;
	}
	public void setReal(double real) {

		this.real = real;
	}

	public double getImaginario() {
		return imaginario;
	}
	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}
	
	// Métodos
	public NumeroComplexo somar( NumeroComplexo c1 ) {
		NumeroComplexo c2 = new NumeroComplexo();
		c2.real = c1.real + this.real;
		c2.imaginario = c1.imaginario + this.imaginario;
		return c2;
	}
	public NumeroComplexo subtrair( NumeroComplexo c1 ) {
		NumeroComplexo c2 = new NumeroComplexo();
		c2.real = c1.real - this.real;
		c2.imaginario = c1.imaginario - this.imaginario;
		return c2;
	}
	public NumeroComplexo multiplicar( NumeroComplexo c1 ) {
		NumeroComplexo c2 = new NumeroComplexo();
		c2.real = c1.real * this.real - c1.imaginario * this.imaginario;
		c2.imaginario = this.real * c1.imaginario + this.imaginario * c1.real;
		return c2;
	}
	public NumeroComplexo dividir( NumeroComplexo c1 ) {
		NumeroComplexo c2 = new NumeroComplexo();
		c2.real = (c1.real * this.real + c1.imaginario * this.imaginario )  / ( Math.pow(this.imaginario, 2) + Math.pow(c1.imaginario, 2) );
		c2.imaginario =  (this.imaginario * c1.real - this.real * c1.imaginario) / ( Math.pow(this.imaginario, 2) + Math.pow(c1.imaginario, 2) );
		return c2;
		
	}

	public boolean equals( NumeroComplexo c1 ) {
		return true;
	}
	public String toString() {
		return this.real+" + "+this.imaginario + "i";
	}
	public double modulo( NumeroComplexo c1 ) {
		return 0;
	}

}