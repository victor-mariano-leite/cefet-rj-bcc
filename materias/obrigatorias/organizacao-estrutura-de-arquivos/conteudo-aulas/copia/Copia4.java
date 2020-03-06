import java.io.*;

public class Copia4
{
	public static final int TAMANHO = 4096;

	public static void main(String args[])
	{
		InputStream entrada = null;
		OutputStream saida = null;
		byte buffer[] = new byte[TAMANHO];
		int qtd;

		long inicio = System.currentTimeMillis();

		if(args.length != 2)
		{

			System.err.println("Erro na chamada do comando.");
			System.err.println("Uso: java Copia4 [ARQUIVO ORIGEM] [ARQUIVO DESTINO].");
			System.exit(1);
		}

		try
		{
			entrada = new FileInputStream(args[0]);
		}
		catch(IOException ex)
		{
			System.err.println("Arquivo " + args[0] + " não pode ser aberto para leitura\n");
			System.exit(1);
		}

		try
		{
			saida = new FileOutputStream(args[1]);
		}
		catch(IOException ex)
		{
			System.err.println("Arquivo " + args[1] + " não pode ser aberto para escrita\n");
			System.exit(1);
		}

		try
		{
			qtd = entrada.read(buffer);
			while(qtd > 0)
			{
				saida.write(buffer,0,qtd);
				qtd = entrada.read(buffer);
			}

			entrada.close();
			saida.close();
		}
		catch(IOException ex)
		{
			System.err.println("Erro ao copiar o arquivo");
		}

		long fim = System.currentTimeMillis();
		System.out.println("Tempo Gasto na Cópia: " + (fim-inicio));

	}



}
