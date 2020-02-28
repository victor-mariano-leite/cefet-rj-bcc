package a2019.s01.p1.lista1;

public class Principal {

	public static void main(String[] args) {
		
		Ponto2D p1 = new Ponto2D( 20, 40 );
		Ponto2D p2 = new Ponto2D( 40, 50 );
		
		p1.equals(p2);
		p1.distancia(p2);
		p1.toString();
		
		p2.equals(p1);
		p2.distancia(p1);
		p2.toString();
	}
}
