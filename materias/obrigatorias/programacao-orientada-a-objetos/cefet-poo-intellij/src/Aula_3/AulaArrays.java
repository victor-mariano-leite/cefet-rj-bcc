package Aula_3;

import java.util.Scanner;
import

public class AulaArrays {
    int[] numInteiros = new int[26];
    String str[] = new String[10];
    str[0] = new String("Cabana");

    Scanner sc = new Scanner(System.in);
    Scanner arraySc[] = new Scanner[10];
    arraySc[0] = new Scanner(System.in);

    // método length funciona em qualquer array, retorna a quantidade de elementos nela

    int numeroDeElementos = arraySc.length;

    // você pode usar a mesma referência de um array para outro novo, assim redimensionando ele

    int myArray[] = new int[6];
    myArray = new int[10];

    // Java possui o método especial na classe System.arraycopy() para copiar arrays inteiros

    //original
    int[] Array1 = {1,2,3,4};

    //nova
    int[] Array2 = {10,9,8,7,6,5};

    //copia todos elementos de Array1 para Array2, começando com o índice 0
    //System.arraycopy(Array1, 0, Array2, 0, Array1.length);

    for (String i:str){
        System.out.println("Imprime todos elementos de str como iteráveis" + str);
    }
}
