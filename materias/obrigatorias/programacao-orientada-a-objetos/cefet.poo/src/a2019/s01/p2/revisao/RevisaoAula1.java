package a2019.s01.p2.revisao;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class RevisaoAula1 {
	
	public static void main(String[] args) {
		// 1o exercício
		System.out.println("Meu primeiro programa em Java...");
		
		// 3o exercicio: Tipos em Java

		short pequene;
		byte oitobits;
		int dezesseisbits;
		long trintaedoisbit;
		
		float fluantedezesseisbit;
		double dobrodefloat;
		
		char caracteres;
		
		boolean boleano;
		
		// Sub 3o: Wrapper Classes
		
		Short.parseShort("1");
		Byte.parseByte("1");
		Integer.parseInt("100");
		Long.parseLong("100000000000L");
		
		Float.parseFloat("1.0");
		Double.parseDouble("10000000000.0L");
		
		
		// 4o Exercício: Leitura do teclado
		
		Scanner scanner = new Scanner(System.in); //  instancia um objeto que capta entradas do teclado
		
		System.out.println("Insira uma linha: ");
		String lendoLinha = scanner.nextLine();
		System.out.println("Linha de entrada foi: "+ lendoLinha);
		
		System.out.println("Insira uma idade: ");
		int lendoInteiro = scanner.nextInt();
		System.out.println("A idade é: "+ lendoInteiro);
		
		scanner.close(); // fecha o stream de entrada padrão, meio que iostream de Java
		
		// 5o Exercício: Redimensionamento de arrays
		
		int[] myArray = {6,5,4,3,2,1};
		
		int[] hold = {10,9,8,7,6,5,4,3,2,1};
		
		System.arraycopy(myArray, 0, hold, 0, myArray.length); // copia referências, não altera os objetos
	
		// 6o Exercício: Percorrendo Arrays
		
		Mochila[] mchs = new Mochila[4];
		
		mchs[0] = new Mochila();
		mchs[1] = new Mochila();
		mchs[2] = new Mochila();
		mchs[3] = new Mochila();
		
		int total = 0, media = 0;
		
		for (Mochila mch:mchs) {
			total += mch.getAnoFabricacao();
		}
		
		media = total/4;
		
		// 7o Exercicio: Estaticas e medias
		
		double num1 = Utils.calculaMedia(1, 3);
		
		// Comentario sobre toString() e strings em geral
		
		/*
		 * Se algum argumento do operador + for um objeto String, o outro ¢  argumento é convertido em um objeto String.
		 *  Todos os objetos podem ser convertidos automaticamente para um objeto String, embora o resultado possa ficar um pouco inteligível. 
		 *  O objeto que não é um objeto String é convertido em uma String equivalente usando a função toString().
		 *  ( se ele tiver, todo Object possui, mas as vezes é necessaria reescrever o toString() dentro de uma
		 *  nova classe para funcionar, por exemplo o que o toString de uma mochila retornaria? a principio nada
		 *  teriamos que reescrever )
		 *  ¢  Experimente criar: Animal a = new Animal(); ¢  System.out.println(a);
		 */
		
		if (true | false & true ^ !false && true || false ) {
			System.out.println("esses sao os booleanos de Java");
		}
		
		// 8o Exercício testando como eh a chamada de metodos com polimorfismo
		
		Super1 sup1 = new sub1();
		Super1 sup2 = new sub2();
		
		sup1.mamar();
		sup2.mamar();
		
		// 10o Exercício 
		
		List lista = new ArrayList();
		
		lista.add(new Urso());
		lista.add(new Carro());
		lista.add(new Doce());
		
		todosCorrer(lista);
		
	}
	
	
	// 9o exercício
	
	public static Airplane[] retornaAleatorio() {
		
		int size = (int) ( Math.random() % 101);
		
		Airplane[] aeroporto = new Airplane[size];
		
		for (Airplane aero:aeroporto) {
			
			if ( alea() % 2 == 0 ) {
				aero = new SeaPlane();
			} else {
				aero = new Helicopter();
			}
		}
		
		return aeroporto;
	}
	
	public static int alea() {
		return (int) (Math.random());
	}
	
	public static void decolar( Airplane[] aeros ) {
		
		int tam = aeros.length;
		
		for( Airplane air: aeros) {
			if (air instanceof SeaPlane) {
				((SeaPlane) air).ligarTurbinas();
			}
			else if( air instanceof Helicopter ) {
				((Helicopter) air).ligarHelice();
			}
			air.takeOff();
		}
	}

	// 11o Exercício
	
	public static void todosCorrer( List lista ) {
		for ( Object c: lista ) {
			if ( c instanceof Corredor ) {
				( (Corredor) (c) ).correr();
			}else {
				continue;
			}
		}
	}

	
}
