function [X] = gaussJacobi_iter(A ,b, iter)

[linhas, colunas] = size(A);
X = zeros(colunas, 1);

SymI = ones(colunas)-eye(colunas);
S = reshape(A-A.*SymI, linhas*colunas, 1);
S(S == 0) = NaN;
S = rmmissing(S);
S = ones(linhas,1)./S;

size(S)
size(A)
size(b)
size(X)

for k = 1:linhas
    
    X(k) = S.*(b-A*X()); como 
    
end

end

