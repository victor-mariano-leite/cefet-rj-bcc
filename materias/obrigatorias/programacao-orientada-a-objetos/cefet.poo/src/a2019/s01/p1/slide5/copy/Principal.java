package a2019.s01.p1.slide5.copy;

public class Principal {

	public static void main(String[] args) {
		Airplane[] airplanes = retornaAleatorio();
		decolarTodos(airplanes);
	}
	
	public static Airplane[] retornaAleatorio(){
		
		// o tipo de retorno é uma array do tipo Airplane, ahta
		
		int tam = ( (int) ( Math.random() * 100 ) ) + 1;
		
		Airplane[] planes = new Airplane[tam];
		
		for( int i = 0; i < tam; i++ ) {
			if ( Math.random() > 0.5 ) {
				planes[i] = new Helicopter();
			} else {
				planes[i] = new SeaPlane();
			}

		}
		
		return planes;
	}
	
	public static void decolarTodos(Airplane[] p) {
	
		for( int i = 0; i < p.length; i++ ) {;
		
			if ( p[i] instanceof Helicopter ) {
				Helicopter h = (Helicopter) (p[i]);
				h.ligarHelice();
			}
			else {
				SeaPlane s = (SeaPlane) (p[i]);
				s.ligarTurbinas();
			}
		}

	}
}
