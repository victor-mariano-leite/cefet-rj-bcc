package Aula_3;

import java.util.Scanner;

public class LeituraTeclado {

    System.out.println("Insira uma linha: ");
    Scanner sc = new Scanner(System.in);
    String lendoLinha sc.nextLine();
    System.out.println("A linha de entrada foi: "+ lendoLinha);

    System.out.println("Insira uma idade: ");
    int lendoInteiro = sc.nextInt();
    System.out.println("A idade é: " + lendoInteiro);

    sc.close();

}
