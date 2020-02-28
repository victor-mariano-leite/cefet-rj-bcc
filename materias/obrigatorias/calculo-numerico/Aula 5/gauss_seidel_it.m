function y = gauss_seidel_it(A,b,x0,k)
[L,C] = size(A);
for it = 1:k
    fprintf('%d: ',it);        
    for i = 1:L
        soma=0;
        for j = 1:C
             if(j<i)
                soma=soma+A(i,j)*xk(j);
             elseif (j>i)
                soma=soma+A(i,j)*x0(j);
            end
        end
        xk(i)=1/A(i,i)*(b(i)-soma);
        %xk(i)=round(xk(i)*10000)/10000;
        fprintf('%.4f  ', xk(i));
    end
    x0=xk;
    fprintf('\n');
end
y=xk;
end
