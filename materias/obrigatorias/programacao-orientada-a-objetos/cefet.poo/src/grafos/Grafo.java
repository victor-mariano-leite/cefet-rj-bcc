package grafos;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Grafo {
	
	/* Um grafo G(V,E) é definido por um conjunto finito não-vazio V, e um conjunto E de pares não ordenados
	   de elementos distintos de V. */
	private Set V;
	private Set E;
	
	private boolean conexo;
	private boolean hamiltoniano;
	private boolean euleriano;
	
	
	public Grafo( int[] vertices, int[][] arestas) {
		
		V = new HashSet();
		E = new HashSet();
		
		// talvez seja melhor construir a estrutura de dados de grafos com ArrayList ao inves de array, facilitaria
		// por que arraylist é dinamico, nessa hora do output acho que ficaria melhor talvez.
		
		for( int v: vertices) {
			
			V.add(v);
			
		}
		
		for ( int[] a: arestas ) {
			
			if ( a.length != 2 ) {
				
				System.out.println("Aresta inválida: " + Arrays.toString(a) );
				
				
			} else {
				
				
				
				Set subnovo = new HashSet();
				Set novo = new HashSet();
				
				for ( int i: a) {
					
					subnovo.add(i);
					
				}
				novo.add(subnovo);
				
				E.add(novo);
				
				
			}
			
			
		}
		
		System.out.println("\nGrafo definido!" );
		
	}
	
	public Grafo( int[] vertices) {
		
	}
	
	public Grafo (int[][] arestas ) {
		
		V = new HashSet();
		E = new HashSet();
				
		Set arestaDeE = new HashSet();
		
		for ( int[] i: arestas ) {
			
			if (i.length != 2) {
				
				System.out.println("Erro");
				
			} else {
				
				arestaDeE = new HashSet(); // Declaração local
				
				for( int j : i ) {
					
					V.add(j);
					arestaDeE.add(j);
					
				}
				
				E.add(arestaDeE);
				
			}
			
		}
		
		System.out.println("\nGrafo definido!" );
		
	}
	
	public void botaAresta( int[] aresta ) throws ArestaMalDefinidaException, VerticeNaoExisteException{
		
		if (aresta.length != 2){
			
			throw new ArestaMalDefinidaException("Numero de vertices de uma aresta são 2, inseriu " + aresta.length);
			
		} else {
			
			Set arestaNova = new HashSet();
			
			for( int i: aresta ) {
				if( V.contains( i ) ) {
					
					arestaNova.add(i);
					
				} else {
					
					throw new VerticeNaoExisteException("O vertice " + i + " não existe, adicione-o primeiro.");
					
				}
			}
			
			(this.E).add(arestaNova);
			
		}
		
	}
	
	public void tiraAresta( int[] aresta ) throws ArestaMalDefinidaException, VerticeNaoExisteException{
		
	}
	
	public void botaVertice( int vertice ) {
		
	}
	
	public void tiraVertice( int vertice ) {
		
	}
	
	public boolean existeVertice( int vertice ) {
		return true;
	}
	
	public boolean existeAresta( int[] aresta ) {
		return true;
	}
	
	public boolean isConexo(){
		return conexo;
	}
	
	public boolean isEuleriano() {
		return euleriano;
	}
	
	public boolean isHamiltoniano() {
		return hamiltoniano;
	}

	
	//	@Override
//	public String toString() {
//		return getGrafo();
//	}
	
}
