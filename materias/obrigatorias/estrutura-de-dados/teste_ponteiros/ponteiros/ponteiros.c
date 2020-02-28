//
//  ponteiros.c
//  teste_ponteiros
//
//  Created by Victor Mariano Leite on 29/10/18.
//

#include "ponteiros.h"
#include <stdlib.h>
#include <stdio.h>

using namespace std;

int main(){
    
    float a = 30.0;
    int *b = &a;
    
    printf('Oi o número dentro é %f e o endereço é %d', &a, &b);
    
    
    
    return 0;
}
