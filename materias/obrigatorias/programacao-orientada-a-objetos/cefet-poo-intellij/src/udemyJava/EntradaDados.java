package udemyJava;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        // Uma das formas de ler dados em Java é pelo objeto tipo Scanner
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // Quando nao precisar mais do objeto sc, feche ela, sc.close(), como se fosse alocacao dinamica

        //Criei um scanner, e ai posso usar os métodos de leitura
        int x = sc.nextInt();
        double y = sc.nextDouble();
        String z = sc.next();

        // Exercício:

        String sentence = sc.nextLine();

        System.out.println(sentence);
        String x, y, z;
        x = sc.next();
        y = sc.next();
        z = sc.next();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();

    }
}