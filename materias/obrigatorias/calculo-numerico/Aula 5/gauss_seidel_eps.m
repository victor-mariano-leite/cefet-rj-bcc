function y = gauss_seidel_eps(A,b,x0,eps)
[L,C] = size(A); fim=0; it=1;
while(fim==0)
    fprintf('%d: ',it);        
    for i = 1:L
        soma=0;
        for j = 1:C
            if(j < i)
                soma=soma+A(i,j)*xk(j);
            elseif (j > i)
                soma=soma+A(i,j)*x0(j);
	    end
        end
        xk(i)=1/A(i,i)*(b(i)-soma);
        %xk(i)=round(xk(i)*10000)/10000;
        vdif(i)=abs(x0(i)-xk(i));
        fprintf('%.4f  ', xk(i));
    end
   fprintf('  :%f\n', max(vdif));
   if(max(vdif)<eps)
        fim=1;
   end
   x0=xk;
   it=it+1;
end
y=xk;
end
