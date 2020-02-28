//
//  lista-circular.h
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#ifndef lista_circular_h
#define lista_circular_h

#include <stdio.h>
#include <iostream>

void insere(noPtr* inicio, int *q){ // tem que alterar, pq nao é ainda circular
    noPtr p = new no;
    cout << "\nDigite o valor do elemento: ";
    cin >> p->info;
    
    if(listaVazia(inicio)){
        inicio = p;
        p->prox = inicio;
    }
    else{
        p->prox = inicio;
        inicio = p;
    }
    *q = *q + 1; //  mudei qtde por referência, ou seja, não preciso retornar um inteiro q para fazer
                 // qtde = insere(&inicio, &qtde);
}

void retira(noPtr* inicio, int *q){ // tem que alterar pq nao é ainda circular
    noPtr p = inicio;
    if(!listaVazia(inicio)){ //só roda se a lista não(estiver vazia) -> !(listaVazia(...))
        if(*q==1){
            inicio = NULL;
        }
        else{
            inicio = p->prox;
            (q_1)_ésimo_nó->prox = inicio;
        }
        delete(p);
        cout << "\nO elemento foi retirado da lista." << endl;\
        *q = *q - 1;
    }
    else{
        cout << "\n\nLista vazia." << endl;
    }
}

void listar(noPtr inicio, int q){
    noPtr p = inicio;
    if( !listaVazia(p) ){
        for( int j = 0; j < q; j++){
            cout << p->info << "\t";
            p = p->prox;
        }
    }
    else{
        cout << "\n\nLista vazia!";
    }
}

bool listaVazia(noPtr inicio){
    if(inicio){
        return false;
    }
    else{
        return true;
    }
}

#endif /* lista_circular_h */
