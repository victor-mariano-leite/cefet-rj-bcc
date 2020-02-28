package udemyJava;

import java.lang.Math;

public class OperadoresAritmeticos {
    public static void main(String[] args){
        // operadores * / % são de maior precedencia que + -

        float n = 50F / 9;
        float n_decimal = 50.0F / 9;

        System.out.printf("%nPrimeiro vem %.2f depois vem %.2f", n, n_decimal);

        int a = 10;
        int b = 20;
        int c = 10;

        double delta = Math.sqrt((b*b) - 4*a*c);

        double Bhaskara =  (-b + delta)  / (2*a) ;

        System.out.printf("%n%nResultado de Bhaskara nesse caso é %.4f%n", Bhaskara);


    }
}
