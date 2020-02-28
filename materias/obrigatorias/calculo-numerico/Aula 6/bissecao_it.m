function y= bissecao_it(f,a,b,k)
fa=feval(f,a);
fb=feval(f,b);
xi=(a+b)/2;
fxi=feval(f,xi);
it=1;
fprintf('\n');
fprintf('%d: a=%.4f , b=%.4f, xi=%.4f, f(xi)=%.4f\n',it,a,b,xi,fxi);
for it = 2:k         	
	if(fxi*fb)>0
		b=xi;
		fb=fxi;
	else
		a=xi;
		fa=fxi;
	end
	xi=(a+b)/2;
    xi=round(xi*10000)/10000;
	fxi=feval(f,xi);
	fprintf('%d: a=%.4f , b=%.4f, xi=%.4f, f(xi)=%.4f\n',it,a,b,xi,fxi);
end 
y=xi;
end