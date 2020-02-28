//
//  exerciciosListaSEnc.hpp
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 29/11/18.
//

#ifndef exerciciosListaSEnc_hpp
#define exerciciosListaSEnc_hpp

#include <stdio.h>
#include <iostream>

using namespace std;

// Exercício 1: Implemente uma função que tenha como valor de retorno o comprimento de uma lista encadeada, isto é, que calcule o número de nós de uma lista.

int Tamanho(noPtr head){
    noPtr aux = head;
    int qtd = 0;
    
    if ( aux->prox == NULL ){
        cout << "Lista esta vazia.";
        return qtd;
    }
    else{
        while ( aux->prox != NULL ){
            qtd += 1;
            aux = aux->prox;
        }
        return qtd;
    }
}

// Exercício 2: Considere listas encadeadas de valores inteiros e implemente uma função para retornar o número de nós da lista que possuem o campo info com valores maiores que n.

int Maiores_N( noPtr head, int n ){
    
    assert (typeid((head->prox)->valor) == typeid(int));
    
    noPtr aux = head;
    int qtd = 0;
    
    if ( aux->prox == NULL ){
        
        cout << "Lista esta vazia.";
        
        return qtd;
    }
    
    else {
        while ( aux->prox != NULL ){
            
            if ( aux->valor >= n ){
                qtd += 1;
            }
            
            aux = aux->prox;
        }
        return qtd;
    }
}

// Exercício 3: Implemente uma função que receba duas listas encadeadas de valores inteiros e retorne a lista resultante da concatenação das duas listas recebidas como parâmetros, isto é, após a concatenação, o último elemento da primeira lista deve apontar para o primeiro elemento da segunda lista.

noPtr ConcListas( noPtr* h1, noPtr h2 ){
    // Parametros passados devem ser tipo &h1 e h2 ( o único que altera é h1, cujo ultimo ponteiro aponta para h2, mas h2 nao aponta para h1, então essa lista não é alterada.
    
    assert( (*h1)->prox != NULL && h2->prox != NULL );
    assert( typeid((((*h1)->prox)->valor)&&(h2->prox)->valor)) == typeid(int) );
    
    noPtr aux = *h1;
    
    while ( (aux)->prox != NULL ){
        aux = aux->prox;
    }
    
    aux->prox = h2;
    
    noPtr nova_lista = *h1;
    
    return nova_lista;
    
}


// Exercício 4: Considere listas de valores inteiros e implemente uma função que receba como parâmetro uma lista encadeada e um valor inteiro n, retire da lista todas as ocorrências de n e retorne a lista resultante.

noPtr TiraRepeticao( noPtr* lista, int n ){
    
    noPtr aux = *lista;
    noPtr aux2 = NULL;
    
    while ( aux->prox != NULL ){
        
        if ( (aux->prox)->valor == n ){
            aux2 = aux->prox;
            aux->prox = (aux->prox)->prox;
            aux2->prox = NULL;
            delete(aux2);
        }
        
        aux = aux->prox;
    }
    
    return aux;
}

// Exercício 5: Considere listas de valores inteiros e implemente uma função que receba como parâmetro uma lista encadeada e um valor inteiro n e divida a lista em duas, de forma à segunda lista começar no primeiro nó logo após na primeira ocorrência de n na lista original.

noPtr UmaLDuasL( noPtr* head1, int n ){
    noPtr head2 = new no;
    noPtr aux = (*head1);
    bool achou = true;
    while ( achou == true ){
        if ( (aux)->valor == n ){
            achou = true;
            head2 = (aux)->prox;
            (aux)->prox = NULL;
        }
        else{
            aux =(aux)->prox
        }
    }
    return head2;
}

// Exercício 6: A função deve retornar um ponteiro para a segunda subdivisão da lista original, enquanto l deve continuar apontando para o primeiro elemento da primeira subdivisão da lista.

noPtr UmaLDuasL( noPtr* head1, int n ){
    noPtr head2 = new no;
    noPtr aux = (*head1);
    bool achou = true;
    while ( achou == true ){
        if ( (aux)->valor == n ){
            achou = true;
            head2 = (aux)->prox;
            (aux)->prox = NULL;
        }
        else{
            aux =(aux)->prox
        }
    }
    return head2;
}


// Exercício 7: Implemente uma função que construa uma nova lista com a intercalação dos nós de outras duas listas passadas como parâmetros. Essa função deve retornar a lista resultante.

noPtr Intercala( noPtr* lst1, noPtr* lst2 ){
    
}

// Exercício 8: Considere listas que armazenam inteiros e implemente uma função para testar se duas listas passadas como parâmetros são iguais.
           
// Exercício 9: Elabore uma função que insira elementos numa lista simplesmente encadeada ordenada de maneira decrescente.
           
// Exercício 10: Faça uma função para inserir elementos numa lista circular simplesmente encadeada.


#endif /* exerciciosListaSEnc_hpp */
