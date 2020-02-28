package testes;

public class TT2 {
	private static int k;
	private int j;
	
	public TT2() {
		j++;
	}
	
	public static void main(String[] args) {
		TT2 x = new TT2();
		x.k = 55;
		x.j = 33;
		x = new TT2();
		x.j = 25;
		x.k = 42;
		System.out.println(x.j);
		System.out.println(x.k);
		teste(x.j,x);
		System.out.println(x.k);
		System.out.println(x.j);
		teste2(x.j, x);
		System.out.println(x.j);
		System.out.println(x.k);
		TT2 y = new TT2();
		x = teste3(x, y);
	}
	
	public static void teste(int x, TT2 y ) {
		y.k = 111;
		x = 91;
	}
	
	public static void teste2( int x, TT2 y) {
		y = new TT2();
		y.k = 37;
		y.j = 39;
	}
	
	public static TT2 teste3(TT2 x, TT2 y) {
		x = y;
		TT2 k = x;
		x = new TT2();
		x.j = 11;
		return k;
	}
}

