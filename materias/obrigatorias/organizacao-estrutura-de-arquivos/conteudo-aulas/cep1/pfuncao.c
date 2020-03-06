#include <stdio.h>

typedef int (*TF)(int,int);


int soma(int a,int b)
{
    return a+b;
}

int multiplica(int a,int b)
{
    return a*b;
}

int executa2(TF comando,int a, int b)
{
    return comando(a,b);
} 

int executa(int(*comando)(int,int),int a, int b)
{
    return comando(a,b);
} 

int main(int argc, char** argv)
{
    int (*f)(int,int);

    printf("%d\n",soma(3,4));
    printf("%d\n",multiplica(3,4));
    f = soma;
    printf("%d\n",f(3,4));
    f = multiplica;
    printf("%d\n",f(3,4));
    printf("*** %d\n", executa(soma,9,9));
    printf("*** %d\n", executa(multiplica,9,9));
    printf("*** %ld\n", (unsigned long)multiplica);
    printf("*** %ld\n", (unsigned long)soma);
    printf("*** %ld\n", (unsigned long)executa);
    return 0;
}