package grafos;

public class Principal {
	public static void main(String[] args) {
		
		
		
		// Tive uma ideia melhor, se converter o subarray em Set, os repetidos somem, se os repetidos sumirem
		// e o array ainda ficar com tamanho diferente de 2, aí sim o programa solta um erro
		
		int[][] b = {{1,2},{2,3}, {2,3,2,3}};
		
		Grafo g1 = new Grafo( b );
		
		int[] a = {3,4};
		
		try {

			g1.botaAresta(a);
			
		} catch (ArestaMalDefinidaException | VerticeNaoExisteException e) {
			
			e.printStackTrace();
			
		}  finally {
			System.out.println("\nSe der merda, já viu.");
		}
	}
}
