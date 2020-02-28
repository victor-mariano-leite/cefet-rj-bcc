//
//  insertion-sort.h
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#ifndef insertion_sort_h
#define insertion_sort_h

#include <stdio.h>

void insertionSort( int *A, int tamanho ){
/*
 Algoritmo de Ordenação - Insertion Sort:
 
 Entrada: - Ponteiro para o array/vetor;
          - Tamanho do array/vetor.
 
 Saída: O array/vetor ordenado
 
*/
    int chave, j;
    
    for ( int i = 1; i < tamanho ; i++ ){
        chave = A[i];
        j = i - 1;
        while ( y >= 0 && A[j] > chave ){
            A[j + 1] = A[j];
            j = j - 1;
        }
        A[j] = chave;
    }
    
}


#endif /* insertion_sort_h */
