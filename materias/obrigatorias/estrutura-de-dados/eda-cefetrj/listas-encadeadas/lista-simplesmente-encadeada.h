//
//  lista-simplesmente-encadeada.h
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#ifndef lista_simplesmente_encadeada_h
#define lista_simplesmente_encadeada_h

#include <stdio.h>
#include <iostream>

// Códigos para listas encadeadas sem passagem de parâmetro ( sP ):

int sPmenu(){
    int opcao;

     cout << "\n1: Insere elemento na lista" << endl;
     cout << "2: Retira elemento da lista" << endl;
     cout << "3: Listar elementos" << endl;
     cout << "0: Sair" << endl;
     cout << "\nDigite a opcao ( 0 - 3 ): " << endl;

    cin >> opcao;
    
    return opcao;
}

bool sPlistaVazia(){
    if(inicio){
        return false // lista não está vazia
    }
    else {
        return true; // lista está vazia por que inicio == NULL, que é false no ifelse
    }
}

void sPinsere(){
    noPtr p; // novo nó que vai entrar na lista
    int x; // valor do novo nó
    
    p = new no; // endereço de memória do novo nó tipo noPtr, como p é noPtr, a função new já considera o tipo noPtr
    
    cout << "\n Digite o valor do elemento: ";
    cin >> x;

    p->info = x;
    p->prox = inicio;
    inicio = p;
}

void sPretira(){
    noPtr p;

    if(!sPlistaVazia()){
        p = inicio;
        inicio = p->prox;
        delete(p);
        cout << "\n O elemento foi retirado." << endl;
    }
    else{
        cout << "\nA lista está vazia." << endl;
    }
}

void sPlistar(){
    noPtr p;
    p = inicio;
    if(!sPlistaVazia()){
        cout << "\nOs elementos da lista sao: " << endl;
        
        while ( p != NULL ){
            cout << p->info << endl;
            p = p->prox;
        }
    }
    else{
        cout << "\nLista Vazia!" << endl;
    }
}

// Implementação de filas

void insereFila(){
    noPtr aux = NULL, p = new no;
    
    cout << "\nDigite o valor do elemento: ";
    
    cin >> p->info;
    p->prox = NULL; /* Por questão de boas práticas, não inicie um ponteiro sem deixá-lo com NULL, e nas filas,
                       entramos no final dela, logo, o final seria pra onde p->prox é NULL, agora só precisamos
                       botar inicio em p, caso a lista esteja vazia, se não, botamos o nó anterior com ANT->prox
                       ao invés de NULL como antes, agora seria para ANT->prox = p */
    
    if(sPlistaVazia()):
        inicio = p;
    else{
        aux = inicio;
        while ( aux->prox != NULL ){
            aux = aux->prox;
        }
        aux->prox = p;
    }
}

void retiraFila(){
    noPtr p;
    
    if(sPlistaVazia()){
        cout << "\nFila Vazia.";
    }
    else{
        p = inicio;
        inicio = p->prox;
        delete(p);
        cout << "\nO elemento foi retirado da Fila!\n";
    }
}

void listarFila(){
    noPtr p = inicio;
    
    if(listaVazia()){
        cout << "\nFila vazia." << endl;
    }
    else{
        cout << "\nOs elementos da fila sao: \n";
        cout << "INICIO";
        while ( p != NULL ){
            cout << " --> " << p->info;
            p = p->prox;
        }
        cout << " --> NULL\n\n" << endl;
    }
}

void inserirLEO(){
    // LEO vem de Lista Simplesmente Encadeada Ordenada
    
    noPtr aux = NULL, ant = NULL, p = new no;
    
    cout << " Digite elemento: ";
    cin >> p->info;
    
    if(listaVazia()){
        p->prox = NULL;
        inicio = p;
    }
    else{
        aux = inicio;
        while( (aux != NULL) && (p->info > aux->info) ){
            ant = aux;
            aux = aux->prox;
        }
        
        if( aux == inicio ){
            p->prox = aux;
            inicio = p;
        }
        else{
            if( aux == NULL ){
                p->prox = NULL;
                ant->prox= = p;
            }
            else{
                p->prox = aux;
                ant->prox = p;
            }
        }
    }
}

void consultarLEO(){
    noPtr p = inicio;
    int x;
    bool achei = false;
    
    if (!sPlistaVazia()){
        cout << "\nDigite o elemento: ";
        cin >> x;
        while ( p != NULL && achei == false ){
            if( p->info == x ){
                cout << "Elemento " << p->info << " possui endereço: " << p;
                achei = true;
            }
            p = p->prox;
        }
        if (!achei){
            cout << "\nElemento nao encontrado.";
        }
    }
    else{
        cout << "\nLista Vazia!";
    }
}

void retirarLEO(){
    noPtr ant = inicio;
    int x;
    bool retirei = false;
    
    if(!sPlistaVazia()){
        cout << "\nDigite qual valor vai querer tirar da Lista Encadeada Ordenada: ";
        cin >> x;
        
        while( post != NULL && achei == false ){
            post = ant->prox;
            if( post->info == x ){
                ant->prox = post->prox;
                post->prox = NULL;
                delete(post);
                retirei = true;
            }
            ant = post;
        }
        if(!retirei){
            cout << "Elemento não foi encontrado na lista." << endl;
        }
    }
    else{
        cout << "Underflow, a lista está vazia." << endl;
    }
}

void crescLEO(){
    noPtr aux = inicio;
    if( !sPlistaVazia() ){
        int A[tamanhoLista()];
        for( int i = 0; aux != NULL;  i++ ){
            A[i] = aux->info;
            aux = aux->prox;
        }
        merge_n_print_cresc(A, 0, tamanhoLista() - 1);
    }
    else{
        cout << "\nLista está vazia." << endl;
    }
}

void decrescLEO(){
    noPtr aux = inicio;
    if( !sPlistaVazia() ){
        int A[tamanhoLista()];
        for( int i = 0; aux != NULL;  i++ ){
            A[i] = aux->info;
            aux = aux->prox;
        }
        merge_n_print_decresc(A, 0, tamanhoLista() - 1);
    }
    else{
        cout << "\nLista está vazia." << endl;
    }
}

int tamanhoLista(){
    noPtr aux = inicio;
    int tam = 0;
    while ( aux != NULL){
        tam += 1;
        aux = aux->prox;
    }
    return tam;
}

void merge_n_print_cresc( int *A, int inicio, int fim){
    
}


void merge_n_print_decresc( int *A, int inicio, int fim){
    
}



#endif /* lista_simplesmente_encadeada_h */
