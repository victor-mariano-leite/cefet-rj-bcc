#include "FileReader.hpp"
#include "FileSort.hpp"
#include <string>

#include <cmath>

void FileSort::search(int value, std::string by = "cep"){ // poderia fazer um template do search para aceitar outros tipos e generalizar melhor
												          // teria que reimplementar o operador de < ou > para caracteres eu acho
	int middle_idx = floor(f.get_size() / 2);
	int binary_search(int begin_idx, int end_idx){ // tenho que alterar para botar a funcao como lambda
												   // essa format nao eh suportada pelo c++14, prog funcional

		middle_value = f.get_value(by = "cep", index = middle_idx);								

		if (middle_value == value){
			return middle_idx;
		} else if (middle_value > value) {
			return binary_search(begin_idx, middle_idx);
		} else{
			return binary_search(middle_idx+1, end_idx);
		}

	}
}