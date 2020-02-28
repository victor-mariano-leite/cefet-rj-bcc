package udemyJava;

public class TiposPrimitivos {

    public static void main(String[] args){
        /*
        boolean True ou False - 1 bit
        char Unicode character - 16 bits
        byte - inteiro de 8 bits - (-128 a 127)
        short - inteiro de 16 bits (-32768 a 32767)
        int - inteiro de 32 bits - etc
        long - inteiro de 64 bits
        float - floating point de 32 bits
        double - floating point de 64 bits
         */

        byte x = 10;
        boolean qual = false; // False
        char letra = 'a'; // aspas simples para char
        char gender = '\u0041'; //código unicode do caractere
        int numero = 1000;
        long grande = 999999999999L; // tem que botar L no final para representar um long
        double ngrande = 9999999999999.;
        float numerofloat = 111.2f; //compilador exige o f para caracterizar o float, como no
                                    // long precisava do L, se nao eh automatico o double

        // byte y = 150; daria erro por que 150 está fora do alcance de byte ( -128 a 127 )

        System.out.println(x); // printLN com LN minusculo, achava que era print in
        System.out.println(qual); // acho que é tipo print e pula linha junto
        System.out.println(letra); // como em C++ bota endl no final do cout
        System.out.println(gender);
        System.out.println(numero);
        System.out.println(grande);
        System.out.println(ngrande);
        System.out.println(numerofloat);

        /*
        Sobre strings em Java:

        Uma cadeia de caracteres Unicode, imutável ( diferente de Python ), isso garante
        em Java a segurança, simplicidade e evita conflito de threads na hora de ocorrer.

        Sobre object em Java:

        Um objeto genérico(como se fosse o espaço vetorial dos objetos em Java, contêm
        vários subespaços vetoriais), no caso, toda classe em Java é subclasse de object.

        getClass
        equals
        hashCode
        toString

         */

        String name = "Victor e Mariana."; // como em C/C++, string é um ponteiro
                                           // para uma sequencia lista estatica de chars
        Object objetonome = "Ue mas...";
        Object que = 6.f;
        System.out.println(name);
        System.out.println(objetonome);
        System.out.println(que);

    }
}
