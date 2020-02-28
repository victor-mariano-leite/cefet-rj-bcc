//
//  lista-duplamente-encadeada.h
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#ifndef lista_duplamente_encadeada_h
#define lista_duplamente_encadeada_h

#include <stdio.h>
#include <iostream>

void inserir(noPtr inicio){
    noPtr p = new no; // recebe da LED um conjunto de memória para o tipo noPtr
    
    cout<<"\nDigite o valor do elemento: ";
    cin >> p->info; // insere valor no novo nó, estou definindo ele
    
    if(listaVazia(inicio)){ // caso o endereço de inicio não tenha nada, ou seja, a lista esteja vazia
        inicio = p; // o novo endereço alocado da LED agora é o inicio da lista
        p->prox = NULL; // prox para NULL por que seria o final da lista, não é circular e é o nó que inicia ela
        p->ant = NULL; // ant para NULL por que a lista foi iniciada agora e não é circular
    }
    else{ // se a lista já tiver elementos
        p->ant = NULL
        p->prox = inicio;
        inicio->ant = p;
        inicio = p;
    }
}

void retirar(noPtr inicio){
    noPtr p = i;
    if( !listaVazia(inicio) ){
        if( p->prox == NULL ){
            inicio = NULL;
        }
        else{
            inicio = p->prox;
            inicio->ant = NULL;
        }
        delete(p); // devolve o espaço de memória reservado p à LED
        cout << "\nO elemento foi retirado da lista." << endl;
    }
    else{
        cout << "\n\nLista está vazia." << endl;
    }
}

void listar(noPtr p){
    if( !listaVazia(p) ){
        cout << "\nElementos da lista:" << endl;
        cout << "INICIO";
        while ( p != NULL ){
            cout << " --> " << p->info;
            p = p->prox;
        }
        cout << " --> NULL";
    }
    else{
        cout << "\n\nA lista está vazia." << endl;
    }
}

#endif /* lista_duplamente_encadeada_h */
