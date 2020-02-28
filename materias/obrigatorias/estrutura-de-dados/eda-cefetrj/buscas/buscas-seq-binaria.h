//
//  buscas-seq-binaria.h
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#ifndef buscas_seq_binaria_h
#define buscas_seq_binaria_h

#include <stdio.h>

int buscaBinaria( int *vetor, int tamanho, int elemento){
   
    int inicio, meio, fim;
    
    /* Início e fim na primeira iteração são só o primeiro, que em C/C++ é 0, e o último elemento da lista que normalmente é calculado pelo tamanho - 1 */
    
    inicio = 0;
    fim = tamanho - 1;
    
    while ( inicio <= fim ){
        meio = ( inicio + fim ) / 2;
        
        // A busca passa a ser na primeira metade do vetor
        if ( elemento < vetor[meio] ){
            fim = meio - 1;
        }
        
        // A busca passa a ser na segunda metade do vetor
        if ( elemento > vetor[meio] ){
            inicio = meio + 1;
        }
        
        // Encontrou o elemento que está na posição meio
        else{
            return meio;
        }
    }
    // Se passar para cá, na lista toda o elemento não foi encontrado.
    printf("Elemento %d não foi encontrado.", &elemento);
    return -1;
}

int buscaSequencial( int *vetor, int tamanho, int elemento ){
    
    for ( int i = 0; i < tamanho; i++ ){
        if ( elemento == vetor[i] ){
            return i; // Elemento encontrado na busca sequencial
        }
    }
    
    // Se passar para cá, na lista toda o elemento não foi encontrado.
    printf("Elemento %d não foi encontrado.", &elemento);
    return -1;

}


#endif /* buscas_seq_binaria_h */
