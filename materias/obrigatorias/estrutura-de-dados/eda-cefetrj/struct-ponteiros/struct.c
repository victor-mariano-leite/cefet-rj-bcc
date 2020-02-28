//
//  struct.c
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#include "struct.h"
#include <iostream>
#include <stdlib.h>

using namespace std;

typedef struct{
    
    int num;
    string nome;
    float saldo;
    
} Conta;

int main(){
    
    int opcao, achou = 0, T, i = 0;
    
    cin >> T;
    
    Conta cc[T];
    
    do{
        
        opcao = menu();
        
        switch (opcao) {
                
            case 1:
                cadastrar(&i, cc)
                break;
                
            case 2:
                consultar(cc);
                break;
            
            case 3:
                listar(cc);
                break;
            
            case 4:
                clfCresc(cc);
                break;
                
            case 5:
                listGeral();
                break;
                
            case 6:
                exclConta(cc);
                break;
                
            case 7:
                sair();
                break;
                
        }
        
    } while ( opcao != 7 );
}
