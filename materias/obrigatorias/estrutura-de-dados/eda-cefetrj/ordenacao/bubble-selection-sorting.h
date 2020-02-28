//
//  bubble-selection-sorting.h
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#ifndef bubble_selection_sorting_h
#define bubble_selection_sorting_h

#include <stdio.h>

void bubbleSort( int *A, int tamanho){
/*
Algoritmo de ordenação Bubbble Sort:
 
   Entrada: - Um ponteiro para o primeiro elemento do vetor/array;
            - O tamanho do vetor.
 
   Saída: - O vetor ordernado decrescente ( 'd' ) ou crescente ( 'c' ).
 */
    
// Declarando a variável auxiliar, e os índices.
    int aux, i, j;
    char cd;

// Imprimindo se o usuário prefere ordem decrescente ou crescente para a ordenação.
    cout << "Para ordenar na ordem crescente digite c, e na ordem descrescente digite d:  ";
    cin >> cd;
    
// crescente ( char cd = 'c' )
    if ( cd == 'c'){
        for ( i = 0; i < tamanho - 1; i++){
            for ( j = i + 1; j < tamanho; j++){
                if ( A[j] > A[j + 1]){
                    aux = A[j];
                    A[j] = A[j+1];
                    A[j+1] = aux;
                }
            }
        }
    }
    
// decrescente ( char cd = 'd' )
    else if ( cd == 'd'){
        for ( i = tamanho; i > 1; i--){
            for ( j = i - 1; j > 0; j--){
                if ( A[j] < A[j + 1]){
                    aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
            }
        }
    }
// se não for nenhum dos dois, mensagem de erro
    else{
        assert((cd == 'd')^(cd == 'c'));
    }
    
}



void selectionSort( int *A, int tamanho){
/*
Algoritmo de ordenação Selection Sort:
     
     Entrada: - Um ponteiro para o primeiro elemento do vetor/array;
              - O tamanho do vetor.
     
     Saída: - O vetor ordernado decrescente ( 'd' ) ou crescente ( 'c' ).
*/
    
// Declarando os índices e auxiliar do menor número da lista.
    int i, j, min_idx;
    
// Imprimindo se o usuário prefere ordem decrescente ou crescente para a ordenação.
    scanf('Para ordenar na ordem crescente digite c, e na ordem descrescente digite d:\n\n %c', &cd);
    
// crescente ( char cd = 'c' )
    if ( cd == 'c'){
        for ( int i = 0; i < tamanho - 1; i++){
            int min_idx = i;
            for ( j = i + 1; j < tamanho; j++){
                if ( A[j] < A[min_idx] ){
                    min_idx = j;
                }
                int aux = A[i];
                A[i] = A[idx_min];
                A[idx_min] = aux;
            }
        }
    }

// decrescente ( char cd = 'd' )
    if else ( cd == 'd'){
        for ( int i = tamanho - 1 ; i > 0 ; i--){
            int min_idx = i;
            for ( j = i - 1; j > -1; j--){
                if ( A[j] < A[min_idx] ){
                    min_idx = j;
                }
                int aux = A[i];
                A[i] = A[idx_min];
                A[idx_min] = aux;
            }
        }
    }
    else{
        assert((cd == 'd')^(cd == 'c'));
    }
    
}



#endif /* bubble_selection_sorting_h */
