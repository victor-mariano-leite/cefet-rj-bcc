function y= bissecao_eps(f,a,b,eps)
fa=feval(f,a);
fb=feval(f,b);
xi=(a+b)/2;
fxi=feval(f,xi);
it=1;
fprintf('\n');
fprintf('%d: a=%.4f , b=%.4f, xi=%.4f, f(xi)=%.4f\n',it,a,b,xi,fxi);
%while ((abs(fxi)>eps) && (abs(a-b)> eps ))         	
while ((abs(fxi)>eps))         	
	if(fxi*fb)>0
		b=xi;
		fb=fxi;
	else
		a=xi;
		fa=fxi;
	end
	xi=(a+b)/2;
    %xi=round(xi*10000)/10000;
	fxi=feval(f,xi);
	it=it+1;
	fprintf('%d: a=%.4f , b=%.4f, xi=%.4f, f(xi)=%.4f\n',it,a,b,xi,fxi);
end 
y=xi;
end