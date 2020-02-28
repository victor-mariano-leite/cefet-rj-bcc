package udemyJava;

public class ConversaoCasting {

    public static void main(String[] args) {
        // Exemplo 1

        double a; // Contêm 64 bits
        float b; // Contêm 32 bits

        a = 5.0;
        b = (float)a; /* Se fosse b = a; daria erro, por que o espaço reservado para double
                         é 32 bits a mais que o pra double, 64 bits, botando o tipo na frente,
                         tipo destino, perdemos um pouco de informação de a possivelmente
                         mas podemos botá-la em b agora, esse processo é o casting.*/

        System.out.println(b);

        double x;
        int y;

        x = 6.542;
        y = (int)x;

        System.out.println(y);

        // ocorreu como em a e b

        int p,q;
        double result;

        p = 3;
        q = 2;

        result = p/q;

        System.out.println(result);

        /* Essa impressão funciona por que como inteiros são feitos de 32 bits, eles
           "cabem" num double, ou seja, a conversão é feita automaticamente, a chamada
           conversão implícita. Mas é necessário botar variaveis compativeis entre si,
           */

        // Porém, é possível converter um texto que possui um número inteiro para inteiro

        String s = "100";
        int numero_s = Integer.parseInt(s);

        System.out.println(numero_s);
    }
}
