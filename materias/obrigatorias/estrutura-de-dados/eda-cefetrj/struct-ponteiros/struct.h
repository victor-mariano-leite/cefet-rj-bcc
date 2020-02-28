//
//  struct.h
//  eda-cefetrj
//
//  Created by Victor Mariano Leite on 16/10/18.
//

#ifndef struct_h
#define struct_h

#include <stdio.h>
#include <string>

int menu(){
    
    int op;
    
    cout << "\n\n **** Menu Principal **** ";
    cout << "\n\n1. Cadastrar conta";
    cout << "\n\n2. Consultar conta";
    cout << "\n\n3. Listar contas com saldo negativo";
    cout << "\n\n4. Classificação Crescente de saldo";
    cout << "\n\n5. Listagem Geral das Contas";
    cout << "\n\n6. Exclusão de Conta";
    cout << "\n\n7. Sair\n\n";
    cout << "Escolha uma opção : ";
    
    cin >> op;
    
    return op:
}

void cadastrar( int *i, Conta *conta ){
    int x;
    cout << "Cadastrar conta\n\n";
    if ( *i < T ){ // T foi definido como 3, #define T 3 no topo da função .c, i é zero no começo
        
        cout << "\nDigite o numero da conta a ser cadastrada: ";
        
        cin >> x;
        
        if ( achou(x, conta, i) == 0 ){
            cout << "\nDigite o nome: ";
            cin >> conta[*i].nome;
            cout << "\nDigite o valor a ser depositado: ";
            cin >> conta[*i].saldo;
            conta[*i].num = x;
            *i = *i + 1;
        }
        else{
            cout << "\nNumero ja cadastrado.\n";
        }
    }
    else{
        cout << "\nLimite maximo de contas ultrapassado.\n";
    }
}

void consultar( Conta *conta ){
    int x, t = 0;
    
    cout << "**************************\n";
    
    cout << "Consultar Conta\n";
    
    cout << "\nDigite o numero da conta para consulta: ";
    
    cin >> x;
    
    if ( achou(x, conta, &t) == 1 ){
        cout << "\n" << conta[*t].num << "\n" << conta[t].nome << "\n" << conta[t].saldo;
    }
    else{
        cout << "\nNumero de conta nao cadastrado.\n";
    }
}

void listar( Conta *conta ){
    cout << "\n*** Listagem das contas negativas ***\n";
    
    for ( int i = 0; i < T; i++ ){
        if ( conta[i].saldo < 0 ){
            cout << "\n" << conta[i].num << "\t" << conta[i].nome;
        }
    }
}

int achou( int num, Conta *conta, int *pos ){
    
    int j = 0, aux = 0;
    
    while ( aux == 0 && j < T ){
        if ( conta[j].num == num ){
            aux = 1;
            *pos = j;
        }
        else{
            j++;
        }
    }
    
    return aux;
}

void clfCresc( Conta *conta ){
    mergeSort( conta, 0, T - 1 ); // tenho que alterar a função mergeSort pra comportar elementos do tipo struct Conta
}


void listGeral( Conta *conta ){
    cout << "\n*** Listagem de todas as contas ***\n";
    for ( int i = 0; i < T; i++ ){
        cout << "\n" << conta[i].num << "\t" << conta[i].nome;
}

void exclConta( Conta *conta, int T ){
    // Função que excluí conta por nome ou por id
    int opr;
    string nome;
    int idnt;
    Conta *cPtr;
    cPtr = NULL;
    
    cout << "\n*** Você quer excluir uma conta por nome ou por id? ***\n\n";
    cout << "1. Por nome\n" << "2. Por id\n" << "3. Sair";
    cin >> opr;
    
    if ( opr == 1 ){
        cout << "\n\n-> Quero excluir por nome. " << "\n Digite o nome da pessoa cuja a conta será excluída:";
        
        cin >> nome;
        
        for ( int j = 0; j < T; j++){
            cPtr = &conta[j];
            
            if ( cPtr->nome == nome ){
                cPtr->num = NULL;
                cPtr->nome = NULL;
                cPtr->saldo = NULL;
            }
        }
        if ( cPtr->saldo != NULL ){
            cout << " Esse nome não consta no banco de dados. "
        }
        
        else{
            cout << " Conta excluída com sucesso. ";
        }
    }
    
    if ( opr == 2 ){
        cout << "\n\n-> Quero excluir por id. " << "\n Digite o id da conta que será exluída:";
        cin >> idnt;
        
        for ( int j = 0; j < T; j++){
            cPtr = &conta[j];
            
            if ( cPtr->num == idnt ){
                cPtr->num = NULL;
                cPtr->nome = NULL;
                cPtr->saldo = NULL;
        }
            
        if ( cPtr->saldo != NULL ){
            cout << " Esse nome não consta no banco de dados. "
        }
            
        else{
            cout << " Conta excluída com sucesso. "
        }
            
        }
        
    }

    else{
        cout << "\n\n-> Não quero excluir uma conta agora. "
    }
    
}

void mergeSort( Conta *conta, int começo, int fim ){
    int meio;
    if ( começo < fim ){
        meio = (( começo + fim )/2);
        mergeSort( conta[].saldo, começo, meio);
        mergeSort( conta[].saldo, meio + 1, fim);
        merge( conta[].saldo, começo, meio, fim);
    }
}

void merge( Conta *conta, int começo, int meio, int fim){
    int *temp;
    
    int i, j, k;
    
    int fim1 = 0, fim2 = 0;
    
    int p1 = começo, p2 = meio + 1;
    
    int tamanho = fim - começo + 1;
    
    temp = (Conta *) malloc(tamanho*sizeof(Conta));
    
    if ( temp != NULL ){
        for( i = 0; i<tamanho; i++ ){
            if( !fim1 && !fim2){

                if( conta[ p1 ].saldo < conta[ p2 ].saldo ){
                    temp[i] = conta[ p1 ].saldo;
                    p1 = p1 + 1;
                }else{
                    temp[i] = conta[ p2 ].saldo;
                    p2 = p2 + 1;
                }
                
                if( p1 > meio ) fim1 = 1;
                
                if( p2 > fim ) fim2 = 1;
            }else{
 
                if( !fim1 ){
                    temp[i] = A[ p1 ];
                    p1 = p1 + 1;
                }else{
                    temp[i] = A[ p2 ];
                    p2 = p2 + 1;
                }
            }

            for( j = 0; k = inicio; j < tamanho; j++; k++){
                A[k] = temp[j];
            }
        }
    }
    free(temp);
}


#endif /* struct_h */
