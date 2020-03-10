#include "FileSearch.cpp"
#include <string>

class FileSearch{
public:
    FILE *file;
    void read_file(std::string path, std::string file_ext);
    std::string get_file(int head, int tail);
    void sort(bool inplace = true);
    int search(int value, std::string by="cep");
    void get_file(); // deve ser do tipo File, retorna o objeto File o qual podemos pegar o indice e buscar o cpf

};