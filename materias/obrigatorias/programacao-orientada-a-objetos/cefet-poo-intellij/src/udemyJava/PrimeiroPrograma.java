package udemyJava; // declaracao do pacote, essa classe pertence ao pacote udemyJava

import java.util.Scanner; // importa função/classe de entrada

public class PrimeiroPrograma { // minha classe se chama primeiroPrograma, ou seja
                                // a classe tem que ser do mesmo nome do arquivo .class

    public static void main(String[] args){ // entering point, tipo o main de C/C++, nesse
                                            // como é void nao retorna nada

        Scanner sc = new Scanner(System.in); // variavel scanner

        System.out.println("Hello World!"); // CTRL + SHIFT + F, identação automatica

        sc.close(); // variavel local fechada
    }
}
