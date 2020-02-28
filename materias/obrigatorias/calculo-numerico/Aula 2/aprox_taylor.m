function y = aprox_taylor(f,a,x,k)
px = 0;
for n=0:k-1
    fl = feval(f,n);
    px = px + (fl*(x-a).^n)/factorial(n);
end;
y = px;
end

