#include "FileSearch.hpp"

// vai carregar arquivo do S3
// https://organizacao-estrutura-de-arquivos-cefet-rj.s3-sa-east-1.amazonaws.com/cep.dat
// tem que carregar do dockerfile 

int main(int argc, char**argv){
    FileSearch f;
    // 
    // try-catch, se nao ler nada, ou der erro na leitura, retorna a excessao
    // teste unitario aqui tbm
    // f.read_file(path, type);
    // 
    // f.get_file(5); printa as cinco primeiras linhas
    //
    // f.sort(inplace = True); se for, if inplace = True, chama a funcao sort_inplace, 
    //                         implementada na classe, se nao ( else ) faz o sort 
    //                         retornando o objeto ordenado 
    //
    // em sort tem que ter um teste unitario garantindo que os atribbutos do arquivo se conservaram 
    // testar exemplos, se passar por tudo conclui a funcao, se nao retorna uma excessao 
    //
    // position = f.search(argv, "cpf"); procura o cpf de valor argv, retorna indice
    //
    // descricao = f.get_value(position) retorna uma string com a descriçao do lugar;
    //                                   deveria seruma nova classe File, que herda de FILE
    // 
    // printf(descricao)
    // 
}
