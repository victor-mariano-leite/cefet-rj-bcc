package a2017.s02.p2.prova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("oi", 12);
		ArrayList<Integer> arrList = (ArrayList<Integer>) map.values();
		System.out.println(arrList);
	}
}
