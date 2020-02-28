package udemyJava;

import java.util.Locale;

public class SaidaDeDados {

    public static void main(String[] args){
        // Comandos de saída padrão:
        // System.out.println ( next line, imprime e automaticamente pula linha
        // System.out.print
        // System.out.printf ( f de formatação, como restringir casas decimais etc, como
        // em C/C++

        char g = 'O';
        int idade = 32;
        float pi = 3.14307F;
        String nome = "Caio";

        System.out.print("Hello World");
        System.out.println("Bom dia");
        System.out.println("---------");
        System.out.printf("%.2f%n", pi); // %n quebra de linha
        Locale.setDefault(Locale.US); // defini que ao inves de , vai ser . para separar
                                      // casas decimais
        System.out.printf("%s tem %d anos", nome, idade);

        // %s para strings, % para inteiros, %.f para floats;
    }
}
