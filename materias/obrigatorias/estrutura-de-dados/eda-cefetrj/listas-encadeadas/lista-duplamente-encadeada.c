//
//  lista-duplamente-encadeada.c
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#include "lista-duplamente-encadeada.h"

using namespace std;

typedef struct no{
    int info;
    struct no *ant;
    struct no *prox;
} *noPtr;

void inserir(noPtr *);
void retirar(noPtr *);
void listar(noPtr);
int listaVazia(noPtr);

int main(){
    int op;
    noPtr inicio = NULL;
    do{
        cout<< "opcoes pra escrever ainda";
        cin >> op;
        switch(op){
            case 1: inserir(&inicio);
                break;
                
            case 2: retirar(&inicio);
                break;
            
            case 3: listar(inicio);
                break;
        }
    }while( op != 0)
}
