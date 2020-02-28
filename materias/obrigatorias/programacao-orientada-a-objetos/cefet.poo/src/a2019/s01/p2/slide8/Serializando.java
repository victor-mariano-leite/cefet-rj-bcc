package a2019.s01.p2.slide8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import a2019.s01.p1.slide7.Carro;

public class Serializando {
	public static void main(String[] args) throws Exception {
		Object o = carregarObjeto("/Users/gpgs1978/Temp/teste.ser");
		ArrayList lista = (ArrayList) o;

		if (o != null) {
			System.out.println(o);
		}

		Scanner sc = new Scanner(System.in);
		ArrayList x = new ArrayList();
		System.out.println("Insira um numero.");
		int numero = sc.nextInt();
		while (numero != -1) {
			x.add(numero);
			System.out.println("Insira um numero.");
			numero = sc.nextInt();
		}
		x.add(new Carro());
		persistirObjeto(x);
	}

	public static void persistirObjeto(Object o) throws IOException {
		ObjectOutputStream objGravar = new ObjectOutputStream(new FileOutputStream("/Users/gpgs1978/Temp/teste.ser"));
		// Grava o objeto cliente no arquivo
		objGravar.writeObject(o);
		objGravar.close();
	}

	public static Object carregarObjeto(String nomeArquivo) throws Exception {
		ObjectInputStream objLeitura = new ObjectInputStream(new FileInputStream(nomeArquivo));
		Object o = objLeitura.readObject();
		objLeitura.close();
		return o;

	}
}
