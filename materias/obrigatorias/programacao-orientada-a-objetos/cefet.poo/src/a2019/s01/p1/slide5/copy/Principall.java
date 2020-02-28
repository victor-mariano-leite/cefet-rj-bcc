package a2019.s01.p1.slide5.copy;

import java.util.ArrayList;

public class Principall {

	public static void main(String[] args) {
		
		ArrayList<Object> alist = new ArrayList<Object>();
		
		Urso urso = new Urso();
		Carro carro = new Carro();
		Doce doce = new Doce();
		
		alist.add(urso);
		alist.add(carro);
		alist.add(doce);
		
		correrTodos(alist);
		
		
	}
	
	public static void correrTodos(ArrayList<Object> lista) {
			
		for( int i = 0; i < lista.size(); i++ ) {
			
			if ( lista.get(i) instanceof Urso ) { /*
												   *
			 									   * no caso de ArrayList, pega-se o elemento de indice i com o método .get(i)
												   * como ArrayList não é array, a indexação é diferente
												   * 
												   */ 
				
				Urso ur = (Urso) (lista.get(i));
				ur.correr();
				
			}
			
			else if( lista.get(i) instanceof Doce ) {
				
				System.out.println("Não faz nada pq doce nao corre.");
			
			}
			
			else {
			
				Carro cr = (Carro) (lista.get(i));
				cr.correr();
			
			}
		}
	}

}
