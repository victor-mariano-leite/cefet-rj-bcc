package a2017.s02.p2.prova;

import java.util.Collections;
import java.util.List;

public class Utils {
	
	public static boolean existe( List<Pessoa> x, Pessoa y ) {
		return x.contains(y);
	}
	
	public static void ordena ( List<Pessoa> x ) {
		Collections.sort(x);
	}
	
}
