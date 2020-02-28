//
//  recursion-sorting.h
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#ifndef recursion_sorting_h
#define recursion_sorting_h

#include <stdio.h>

void quickSort( int *A, int começo, int fim ){
    int pivo;
    if( fim > começo ){
        pivo = particiona(V, começo, fim); // separa o vetor em dois, menores que pivo e maiores
        
        quickSort( V, inicio, pivo - 1); // chama quickSort para os menores que o pivo
        
        quickSort( V, pivo + 1, fim); // chama quickSort para os maiores que o pivo
    }
}

void particiona(int *V, int começo, int fim){
    int aux; // Variável auxiliar para trocar elementos do vetor de posição
    
    int esq = começo; // Extrema esquerda do vetor está no índice começo
    
    int dir = fim; // Extrema direita do vetor está no índice fim
    
    int pivo = V[começo]; /* Uma das posições possiveis para começar um pivo
                             é no primeiro elemento do vetor */
    while ( esq < dir ){
        while( V[esq] <= pivo ){
            esq = esq + 1; /* Quando encontra um elemento, na iteração que é V[esq] é menor que o pivo, vai para o
                              próximo, até acabar, quando acaba, o elemento que parou será o trocado. */
        }
        while( V[dir] > pivo ){
            dir = dir - 1;
        }
        if ( esq < dir ){
            aux = V[esq];
            V[esq] = V[dir];
            V[dir] = aux;
        }
    }
    V[começo] = V[dir];
    V[dir] = pivo;
}

void mergeSort( int *A, int começo, int fim ){
 /*
  Ordenação por Intercalação/Merge Sort:
  
  Entrada: - *A, ponteiro para o endereço do primeiro elemento do vetor a ser ordenado ( lembrar que vetores têm espaço de memória adjacentes, diferentes de listas );
           - começo, o índice do ínicio do vetor;
           - fim, o índice do fim do vetor.
  
  Saída:
  
*/
    int meio;
    if ( começo < fim ){
        meio = (( começo + fim )/2);
        mergeSort( A, começo, meio);
        mergeSort( A, meio+1, fim);
        merge( A, começo, meio, fim);
    }
}

void merge(int *A, int começo, int meio, int fim){
/*
 Função de intercalação dos vetores:
 
 O que faz: Dado o vetor e seu começo, meio e fim, dividimos ele no meio, e associamos um índice no começo da primeira metade ( p1 = começo ), e outro no começo da segunda metade ( p2 = meio + 1 ). Consideramos essas marcações como dois novos vetores, um que começa em p1 e termina em meio, e outro que começa em p2 e termina no fim. Dados esses dois vetores hipotéticos ( por que não são propriamente alocados, mas considerados como vetores em função dos índices ), criamos um vetor temporário ( temp ) com a função malloc, e o seu tamanho seria o tamanho do vetor que começa em p1 mais o do que começa em p2, que é o mesmo que o tamanho do vetor A inteiro ( fim - inicio + 1 ). Criado o vetor, vamos escolher quais elementos botar nele, de acordo com a ordem ( crescente ou decrescente ), comparando o vetor de início p1 e o vetor de início p2. Nisso os elementos de cada vão sendo progressivamente alocados para temp de acordo com a sua ordem desejada. Quando um vetor terminar de organizar seus elementos em temp, o outro vetor vai ser sequencialmente copiado para temp se ainda tiver elementos para organizar. Depois que todo processo for concluido, o vetor temp é copiado integralmente em A, sobrescrevendo-o, e assim ordenando o vetor A.
 
 Entrada: - *A, ponteiro para o endereço do primeiro elemento do vetor a ser ordenado ( lembrar que vetores têm espaço de memória adjacentes, diferentes de listas );
          - começo, o índice do ínicio do vetor;
          - meio, o índice do meio do vetor, definido pela média aritmética simples de começo e fim;
          - fim, o índice do fim do vetor.
 
 Saída: não tem, função do tipo void, mas altera o vetor original.
 
*/
    int *temp; // ponteiro que vai armazenar o endereço do vetor
    
    int i, j, k; // parâmetros de iteração
    
    int fim1 = 0, fim2 = 0; // Índices indicadores se o vetor 1 ou 2 chegou ao não ao fim.
    
    int p1 = começo, p2 = meio + 1; // Índices do ínicio dos dois vetores a serem intercalados de forma ordenada.
    
    int tamanho = fim - começo + 1; // Tamanho do vetor A.
    
    temp = (int *) malloc(tamanho*sizeof(int)); // Nesse caso 'temp' recebe um ponteiro que aponta para o endereço de memória alocada de tamanho*sizeof(int) bytes, onde sizeof(int) depende do compilador normalmente, ou seja, temp é um vetor temporário que armazena os elementos do vetor principal A até que terminada a ordenação copie de temp para A.
    
    if ( temp != NULL ){
        for( i = 0; i<tamanho; i++ ){
            if( !fim1 && !fim2){
                /*
                 Se fim1 e fim2 forem 0, !fim1 e !fim2 são 1, então 1 e 1 pela lógica booleana implica em 1, logo prossegue no if. O if só termina quando algum dos vetores acabar de copiar antes do outro.
                 */
                if( A[ p1 ] < A[ p2 ]){
                    temp[i] = A[ p1 ];
                    p1 = p1 + 1;
                }else{
                    temp[i] = A[ p2 ];
                    p2 = p2 + 1;
                }
                
                /*
                 Se algum vetor, seja o do índice p1 ou do índice p2, acabar de copiar para temp, então sai do if comentado acima, mudando o valor de fim1 ou fim2.
                 */
                
                if( p1 > meio ) fim1 = 1;
                
                if( p2 > fim ) fim2 = 1;
            }else{
                /*
                 Se um dos 2 vetores a serem ordenados passados para temp acabou, na interação de intercalação, pode copiar o outro inteiro, sequencialmente para temp.
                 */
                if( !fim1 ){
                    temp[i] = A[ p1 ];
                    p1 = p1 + 1;
                }else{
                    temp[i] = A[ p2 ];
                    p2 = p2 + 1;
                }
            }
            /*
             Copia do vetor temporário para o vetor original
            */
            for( j = 0; k = inicio; j < tamanho; j++; k++){
                A[k] = temp[j];
            }
        }
    }
    free(temp);
}

#endif /* recursion_sorting_h */
