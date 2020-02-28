//
//  lista-linear-encadeada.c
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#include "lista-linear-encadeada.h"
#include <iostream>

using namespace std;

struct no{
    int info;
    struct no *prox;
};

typedef struct no *noPtr; // A estrutura recebe nome de noPtr agora, e sempre será um ponteiro para uma estrutura noPtr

int main(){
    int op;
    
    noPtr início = NULL; // O elemento início feito com noPtr é sempre um endereço de memória
                         // Por que noPtr foi definido como um ponteiro
    
    do{
        op = menu();
        
        switch (op) {
            case 1:
                insere();
                break;
                
            case 2:
                retira();
                break;
                
            case 3:
                listar();
                break;
        
        }
    } while( op != 0 );
}
