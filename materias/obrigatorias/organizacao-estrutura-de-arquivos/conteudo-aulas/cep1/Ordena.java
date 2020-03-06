import java.io.RandomAccessFile;
import java.util.*;

class ComparaCEP implements Comparator<Endereco>
{
	public int compare(Endereco e1, Endereco e2)
	{
		return e1.getCep().compareTo(e2.getCep());
	}
}

public class Ordena {

	public static void main(String[] args) throws Exception 
	{
		ArrayList<Endereco> a = new ArrayList<Endereco>();
		RandomAccessFile f = new RandomAccessFile("cep.dat", "r");
		while( f.getFilePointer() < f.length() ) // para Detectar EOF
		{
			Endereco e = new Endereco();
			e.leEndereco(f);
			a.add(e);
		}
		f.close();
		Collections.sort(a,new ComparaCEP());
		RandomAccessFile f2 = new RandomAccessFile("cep_ordenado_java.dat", "rw");
		for(Endereco e: a)
		{
			e.escreveEndereco(f2);
		}
		f2.close();
	}

}
