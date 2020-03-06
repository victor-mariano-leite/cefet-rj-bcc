import struct
import sys

if len(sys.argv) != 2:
	print ("USO %s [CEP]" % sys.argv[0])
	quit()

registroCEP = struct.Struct("72s72s72s72s2s8s2s")
cepColumn = 5
print ("Tamanho da Estrutura: %d" % registroCEP.size)
f = open("cep.dat","rb")
line = f.read(registroCEP.size)
counter = 0
while len(line) == registroCEP.size:
	record = registroCEP.unpack(line)
	cep = str(record[cepColumn],'latin1')
	if cep == sys.argv[1]:
		for i in range(0,len(record)-1):
			print (str(record[i],'latin1'))
		break
	line = f.read(registroCEP.size)
	counter += 1
print ("Total de Registros Lidos: %d" % counter)
f.close()

