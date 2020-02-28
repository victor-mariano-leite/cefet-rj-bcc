package a2019.s01.p2.revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class RevisaoStrings {
	
	public static void main(String[] args) {
		String original = new String(" A B C D E F GH IJ KL MN PQ RS TUV WZ    ");
		
		List<Object> testesString = new ArrayList<Object>();
		
		String test1 = original.toLowerCase();
		testesString.add(test1);
		char[] test2 = original.toCharArray(); // toCharArray gera um array de chars da String
		testesString.add(test2);
		String test3 = original.concat(" caralho");
		testesString.add(test3);
		String[] test4 = original.split(" "); // o split gera um array de strings
		testesString.add(test4);
		String test5 = original.toUpperCase();
		testesString.add(test5);
		String test6 = original.trim();
		testesString.add(test6);
		String test7 = original.replaceAll(" ", "_");
		testesString.add(test7);
		
		Iterator it = testesString.iterator();
		
		int i = 1;
		while( it.hasNext() ) {
			System.out.println( i + ". " + it.next() + "\n" );
			i++;
		}
		// if-else simplificado ( condicao ) ? ( se_for_verdade) : ( se_for_falso );
		
	}
	
}
