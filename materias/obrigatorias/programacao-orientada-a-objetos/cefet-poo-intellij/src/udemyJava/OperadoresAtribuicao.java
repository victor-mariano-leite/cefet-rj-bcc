package udemyJava;

public class OperadoresAtribuicao {

    public static void main(String[] args){
        int a = 10;
        System.out.printf("%nAtribuição: %d",a);

        a += 105;
        System.out.printf("%n%nSoma e atribui: %d",a);

        a -= 20;
        System.out.printf("%n%nSubtração e atribui: %d",a);

        a *= 30;
        System.out.printf("%n%nMultiplica e atribui: %d",a);

        a /= 2;
        System.out.printf("%n%nDivide e atribui: %d",a);

        a %= 3;
        System.out.printf("%n%nModulo de a por b, ou seja, resto e atribui: %d%n",a);

        String nome = "Victor";
        System.out.printf("Nome inicial: %s", nome);

        nome += " Mariano";

        System.out.printf("%nNome depois: %s", nome);
    }
}
