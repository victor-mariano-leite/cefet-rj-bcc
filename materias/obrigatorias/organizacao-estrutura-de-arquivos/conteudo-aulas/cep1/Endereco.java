import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.charset.Charset;

public class Endereco {
	
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String sigla;
	private String cep;

	public void leEndereco(DataInput din) throws IOException
	{
		byte logradouro[] = new byte[72];
		byte bairro[] = new byte[72];
		byte cidade[] = new byte[72];
		byte estado[] = new byte[72];
		byte sigla[] = new byte[2];
		byte cep[] = new byte[8];
		
		din.readFully(logradouro);
		din.readFully(bairro);
		din.readFully(cidade);
		din.readFully(estado);
		din.readFully(sigla);
		din.readFully(cep);
		din.readByte(); // Ultimo espaco em branco 
		din.readByte(); // Quebra de linha
		
		// Definie a forma como caracteres especias estão codificados.
		Charset enc = Charset.forName("ISO-8859-1");
		
		this.logradouro = new String(logradouro,enc);
		this.bairro = new String(bairro,enc);
		this.cidade = new String(cidade,enc);
		this.estado = new String(estado,enc);
		this.sigla = new String(sigla,enc);
		this.cep = new String(cep,enc);
	}


	public void escreveEndereco(DataOutput dout) throws IOException
	{		
		// Definie a forma como caracteres especias estão codificados.
		Charset enc = Charset.forName("ISO-8859-1");
		dout.write(this.logradouro.getBytes(enc));
		dout.write(this.bairro.getBytes(enc));
		dout.write(this.cidade.getBytes(enc));
		dout.write(this.estado.getBytes(enc));
		dout.write(this.sigla.getBytes(enc));
		dout.write(this.cep.getBytes(enc));
		dout.write(" \n".getBytes(enc));
	}
		
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
			
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}

}
