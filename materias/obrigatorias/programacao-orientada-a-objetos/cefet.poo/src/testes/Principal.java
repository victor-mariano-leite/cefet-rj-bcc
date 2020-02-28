package testes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList x = new ArrayList();

		String s = new String("oila");
		
		x.add(s);
		x.add("cacete");
		x.add("s");
		
		System.out.println(x.size());
		// Todo objeto possui toString(), alguns funcionam outros não, mas sempre pode fazer um override
		// neles.
		
		String x1 = new String("s2");
		String x2 = new String("ok");
		
		x.remove(x.indexOf(s));
		
		x.add(x1);
		x.add(x2);

		System.out.println(x.contains("ok"));
		System.out.println(x.size());
		
		x.remove(3);
		
		System.out.println(x.size());
		
		System.out.println(x.contains("ok"));
		
		System.out.println(x.toString());
		
		ArrayList l = new ArrayList();
		
		l.add("cacete");
		l.add("s");
		
		x.removeAll(l);
		
		System.out.println(x.toString());

		String[] que = new String[3];
	
		que[0] = new String("s2");
		que[1] = new String("que");
		que[2] = new String("fudeu");
	
		System.out.println(Double.parseDouble("190.0"));
		
		// Outro teste
		
		Set<String> conjunto = new HashSet<String>();
		Boolean tf = conjunto.add("mesa");
		Iterator<String> it = conjunto.iterator();
		
		while ( it.hasNext() ) {
			System.out.println( it.next() ); // se o next tiver toString definido, se não tem que
											// definir na classe correspondente
		}
		
		// Tem que fazer o casting de volta quando usa a interface Iterator pra iterar
		
		// Teste de Mapas
		
		Map<Integer, Pessoa> mapas = new HashMap<Integer, Pessoa>();
		
		Pessoa p0 = new Pessoa("nome0", 10);
		Pessoa p1 = new Pessoa("nome1", 11);
		Pessoa p2 = new Pessoa("nome2", 12);
		
		mapas.put(p0.getCPF(), p0);
		mapas.put(p1.getCPF(), p1);
		mapas.put(p2.getCPF(), p2);
		
		Iterator<Integer> iter = mapas.keySet().iterator();
		
		while ( iter.hasNext() ) {
			System.out.println(buscaMapKey(mapas, iter.next()));
		}
		
	}
	
	public static Object buscaMapKey( Map<Integer, Pessoa> mapas, Integer chave ) {
		return mapas.get(chave);
	}

}
