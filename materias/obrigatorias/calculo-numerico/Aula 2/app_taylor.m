function app_taylor ()
f=input('Digite o nome da funçao derivada: ');
a=input('Digite o centro da serie: ');
x=input('Digite o ponto de investigacao: ');
k=input('Digite o numero de termos: ');
s=aprox_taylor(f,a,x,k);

fprintf('O valor aproximado = %f\n', s);
  
endfunction
