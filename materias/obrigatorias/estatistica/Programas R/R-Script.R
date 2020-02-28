rm(list=ls())
ano = c(2000,2001,2002,2003,2004)
alunos = c(40, 59, 63, 69, 71)
ano
alunos
tab2 = cbind(ano, alunos)
tab2

dados = read.table("D:\\Dropbox\\Estatistica\\Aulas\\Tabela 1.csv", header = TRUE, sep = ",")
names(dados)
attach(dados)
Procedencia
summary(Procedencia)

x = table(Procedencia)
x
x = sort(x, decreasing = TRUE)
x
tab3 = c(x, sum(x))
tab3
names(tab3)[4]=" Total"
tab3

tab5 = table(Transp.)
tab5
tab5 = c(tab5, sum(tab5))
tab5
names(tab5)[3]=" Total"
tab5

tab6 = table(Transp.,Sexo)
tab6
tab6 = addmargins(tab6)
tab6

ni = N.Ir.
Freq = table(ni)
Relativa = 100*prop.table(Freq)
Acumulada = cumsum(Freq)
AcumuladaRelativa = cumsum(Relativa)
tab8 = cbind(Freq, Relativa, Acumulada, AcumuladaRelativa)
tab8 = round(tab8, digits = 2)
tab8

Id
tab9 = table(Id)
tab9

xmax = max(Id)
xmin = min(Id)
AT = xmax - xmin
AT

n = length(Id)
k = sqrt(n)
k
k = round(k)
k 
h = AT/k
h
h = round(h)
h

Id
xmax = xmax + 1
Fi = table(cut(Id, breaks = seq(xmin, xmax, h), right = FALSE))
xi = seq(xmin+h/2, xmax, h)
fi = 100*prop.table(Fi)
Fai = cumsum(Fi)
fai = cumsum(fi)
tab10 = cbind(xi, Fi, fi, Fai, fai)
tab10 = round(tab10, digits = 2)
tab10

fig2 = table(Trabalho)
fig2
barplot(fig2)
barplot(sort(fig2), horiz = TRUE)
barplot(sort(fig2), horiz = TRUE, xlab = "Numero de alunos")

fig3 = table(Inform)
barplot(fig3, ylab = "Numero de alunos")

fig4 = table(Transp., Procedencia)
barplot(fig4, beside = TRUE)
barplot(fig4, beside = TRUE, legend = rownames(fig4))
barplot(fig4, beside = TRUE, legend = rownames(fig4), col = c("pink", "green"))

fig5 = table(Procedencia)
fig5 = round(100*prop.table(fig5))
lab = paste(names(fig5), round(fig5))
lab = paste(lab, "%", sep = "")
pie(fig5, labels = lab)

ano = c(2000, 2001, 2002, 2003, 2004)
alunos = c(40, 59, 63, 69, 71)
plot(ano, alunos, ylim = c(0, 80), xlim = c(1999, 2004))
lines(ano, alunos)

N.Ir.
fig7 = table(N.Ir.)
fig7
plot(fig7, type = "h")
par(new = TRUE)
plot(fig7, type = "p") 

y = c(0, 1, 2, 3, 6)
yai = c(1, 1, 7, 19, 21, 22)
fig8 = stepfun(y, yai)
plot(fig8)
plot(fig8, xlim = c(0, 7))

hist(Id, breaks = seq(xmin-h, xmax, h), right = FALSE, xaxt = "n", ylim = c(0, 12))
axis(1, seq(xmin-h, xmax, h))

fig9 = table(cut(Id, breaks = seq(xmin, xmax, h), right = FALSE))
fig9
barplot(fig9)
barplot(fig9, ylim = c(0, 12))

Fi = table(cut(Id, breaks = seq(xmin, xmax, h), right = FALSE))
xi = seq(xmin-h/2, xmax+h/2, h)
xi
Fi0 = c(0, Fi, 0)
Fi0
plot(xi, Fi0, ylim = c(0, 12), xaxt = "n")
lines(xi, Fi0)
axis(1, xi)

x = seq(xmin, xmax+h, h)
x
Fi0
fi0 = cumsum(Fi0)
fi0
plot(x, fi0, xaxt = "n", ylim = c(0, 25))
lines(x, fi0)
axis(1, x) 

stem(Id)

vet = c(0, 1, 1, 2, 2, 2, 3, 4)
vet
mean(vet)
vet2 = c(vet, 10)
vet2
mean(vet2)

Id
mean(Id)

Fi
xi = seq(xmin+h/2, xmax, h)
xi
n
m = sum(Fi*xi)/n
m

moda = function(x) {
  t = table(x)
  return(as.numeric(names(t)[t == max(t)])) 
}

moda(Id)

modaclass = function(li, h, F1, F2, F3) {
  modaclass = li + h*(F2 - F1)/((F2 - F1) + F2 - F3) 
  modaclass
}

modaclass(x[1],h,0,Fi[1],Fi[2])

vet = c(0, 1, 1, 2, 2, 2, 3, 4)
median(vet)

vet2
median(vet2)

Id
sort(Id)
median(Id)

medianaclass = function(li, h, p, Fa1, F2) {
  medianaclass = li + h*(p - Fa1)/F2 
  medianaclass 
}

medianaclass(x[1], h, Fi[1], 0, Fi[1])

summary(Id)
quantile(Id, seq(0.1, 0.9, 0.1))
quantile(Id, c(0.4))

x
Fi
Fai
n
h

k = 1
p = n/4*k
p
i = 1
Q1 = medianaclass(x[i], h, p, 0, Fi[i])
Q1

k = 3
p = n/4*k
p
i = 2
Q3 = medianaclass(x[i], h, p, Fai[i-1], Fi[i])
Q3

k = 7
p = n/10*k
p
i = 2
D7 = medianaclass(x[i], h, p, Fai[i-1], Fi[i])
D7

k = 90
p = n/100*k
p
i = 4
P90 = medianaclass(x[i], h, p, Fai[i-1], Fi[i])
P90

xmax = max(Id)
xmin = min(Id)
AT = xmax - xmin
AT

dq = Q3 - Q1
dq

dqm = dq/2
dqm

variancia = function(n, m, x) {
  soma = 0
  for (i in 1:n){
    soma = soma + (x[i]-m)^2
  }
  soma
  variancia  = soma/(n-1)
  variancia
}

y = Id
variancia(n, m, y)

var(Id)
sqrt(var(Id))
sd(Id)

varianciaclass = function(k, n, m, x, F) {
  soma = 0
  for (i in 1:k){
    soma = soma + (x[i]-m)^2*F[i]
  }
  soma
  varianciaclass = soma/(n-1)
  varianciaclass
}

n = length(Id)
n
k = round(sqrt(n))
k
m
xi = seq(xmin+h/2, xmax, h)
xi
Fi

s2 = varianciaclass (k, n, m, xi, Fi)
s2
s = sqrt(s2)
s

s
m
CV = 100*s/m
CV

x
h
Fi

mo = modaclass(x[1],h,0,Fi[1],Fi[2])
mo
As = (m - mo)/s
As

Q3
Q1
P90

k = 10
p = n/100*k
p
i = 1
P10 = medianaclass(x[i], h, p, 0, Fi[i])
P10

K = (Q3 - Q1)/(2*(P90 - P10))
K

boxplot(Id)
boxplot(Id, horizontal = TRUE)

tab = cbind(Id, Sexo)
tab

tabf = tab[which(tab[,2] == 1),]
tabf

tabm = tab[which(tab[,2] == 2),]
tabm

boxplot(tabf[,1], tabm[,1], ylab = "Idades", ylim = c(xmin, xmax))
axis(1, at = 1:2, labels = c("Feminino", "Masculino")) 

detach(dados)

dados = read.table("D:\\Dropbox\\Estatistica\\Aulas\\BD.csv", sep = ',', header = TRUE)
attach(dados)
summary(dados)
summary(Salario)
var(Salario)
summary(Experiencia)
var(Experiencia)

plot(Experiencia,Salario)
cor(Experiencia,Salario)

ajuste = lm(Salario ~ Experiencia)
ajuste

plot(Experiencia,Salario)
abline(lm(Salario ~ Experiencia))
