package a2019.s01.p1.slide7;

import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;


public class Principal {

	public static void main(String[] args) {
		
		int total = 0;
		
		// Exercício de aula 1:
		
		Set x = new HashSet();
		
		x.add("bola");
		x.add("mesa");
		x.add("arvore");
		x.add("bola");
		x.add("pano");
		
		System.out.println(x.size());
		System.out.println(x);
		
		Iterator it = x.iterator();
		
		while( it.hasNext() ) {
			
			Object o = it.next();
			String s = (String) o;
			total += s.length();
			
		}
		
		System.out.println("\n" + total + " letras");
		
		// Exercício 2:
		
		int media2 = 0, total2 = 0;
		
		Map m = new HashMap();
		
		Carro c1 = new Carro();
		c1.setAno(1996);
		c1.setNomeDono("que");
		c1.setPlaca("XYZ1540");
		
		Carro c2 = new Carro();
		c2.setAno(2996);
		c2.setNomeDono("que");
		c2.setPlaca("XYZ2540");
		
		Carro c3 = new Carro();
		c3.setAno(3996);
		c3.setNomeDono("que");
		c3.setPlaca("XYZ3540");
		
		m.put(c1.getPlaca(), c1);
		m.put(c2.getPlaca(), c2);
		m.put(c3.getPlaca(), c3);
		
		// Como percorrer o mapa/hash map?
		
		Iterator it2 = (m.keySet()).iterator();
		
		while( it2.hasNext() ) {
			
			String str = (String) (it2.next());
			Carro c0 = (Carro) (m.get(str));
			total2 += c0.getAno();
			
		}
		
		System.out.println(total2/(m.size()));
		
		// Exercício 3:
		
		Conta c = new Conta();
		
		try {
			c.sacar(10);
			System.out.println("Liberando dinheiro no caixa");
		} catch( SemDinheiroException e) {
			
			System.out.println(" ");
			
		} finally {
			System.out.println("Alguma operacao obrigatoria tanto para try se tiver ou nao catch.");
		}
		
		

	}

}
