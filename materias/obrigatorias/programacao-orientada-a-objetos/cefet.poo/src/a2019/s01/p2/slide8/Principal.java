package a2019.s01.p2.slide8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Principal {
	public static void main(String[] args) throws Exception {
		
		//Exercício 1
		
		List<String> x = new ArrayList<String>();
		x.add("x");
		
		Map<String, ArrayList> m = new HashMap<String, ArrayList>();
		Iterator<String> it = m.keySet().iterator();

		while( it.hasNext() ) {
			String s = it.next();
		}
		
		
		// Exercício 2
		
		List<String> z = new ArrayList<String>();
		
		z.add("zebra");
		z.add("gorila");
		z.add("tartaruga");
		z.add("abelha");
		
		System.out.println(z);
		
		Collections.sort(z);
		
		System.out.println(z);
		
		// Exercício 3
		
		List<Pessoa> w = new ArrayList<Pessoa>();
		
		w.add(new Pessoa("Ana", 15));
		w.add(new Pessoa("Mariana", 3));
		w.add(new Pessoa("Fabio", 8));
		
		// Collections.sort(w); ta dando erro, como corrigir?
		
		// Exercício 4
		
		List y = new ArrayList();
		
		y.add("casa");
		y.add("casa");
		y.add("bola");
		
		System.out.println(Collections.frequency(x, "casa"));
		
		// outro método, de copiar uma collection para outra, cujo destino tem que ser maior ou igual tamanho
		
		List arg0 = new ArrayList();
		List arg1 = new ArrayList();
		
		arg0.add(3);
		arg0.add(3);
		arg0.add(8);
		arg1.add(1);
		arg1.add(2);
		
		Collections.copy(arg0, arg1);
		
		System.out.println(arg0);
		System.out.println(arg1);
		
		// Exercício 5
		
		ArrayList<Pessoa> p = new ArrayList<Pessoa>();
		
		p.add(new Pessoa("Ana", 33));
		p.add(new Pessoa("Pedro", 31));
		
		try {
			salvar(p, "arquivo");
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		
		// Exercício 6
		
		try {
			Object o = ler("arquivo");
			ArrayList<Pessoa> q = new ArrayList<Pessoa>();
			System.out.println(x.size());
		} catch ( ClassNotFoundException e ) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		
	}
	
	public static void salvar( Object o, String s) throws Exception{
		FileOutputStream fos = new FileOutputStream(s);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(o);
		oos.flush();
		oos.close();
	}
	
	public static Object ler ( String caminho ) throws Exception{
		FileInputStream fis = new FileInputStream(caminho);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object o = ois.readObject();
		ois.close();
		return o;
	}
	
}
