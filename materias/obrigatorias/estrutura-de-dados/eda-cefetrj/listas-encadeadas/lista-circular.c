//
//  lista-circular.c
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#include "lista-circular.h"

using namespace std;

typedef struct no{
    int info;
    struct no *prox; // para listas duplamente encadeadas circulares também vale botar o no *ant
} *noPtr;

int insere(noPtr *, int *);
void retira(noPtr *, int *);
void listar(noPtr, int);
bool listaVazia(noPtr);
int menu();

int main(){
    int op, qtde = 0;
    noPtr inicio = NULL;
    
    do {
        op = menu();
        
        switch (op) {
            case 1:
                qtde = insere(inicio, &qtde); /* qtde é necessaria aqui?, não, pois passamos ela por referencia no insere
                                                 ao inves de qtde = insere(inicio, &qtde), seria suficiente insere(...)
                                                 inicio não é &inicio por que foi definido em noPtr, que ja é um
                                                 ponteiro */
                break;
                
            case 2:
                retira(&inicio, &qtde);
                break;
                
            case 3:
                listar(inicio, qtde);
                break;
                
            default:
                break;
        }
    } while ( op != 0 );
}
