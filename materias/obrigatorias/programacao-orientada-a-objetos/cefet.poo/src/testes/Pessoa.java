package testes;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private int idade;
	private String endereco;
	
	public Pessoa( String nome, int cpf ) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void setNome( String nome ) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCPF( int cpf ) {
		this.cpf=cpf;
	}
	public int getCPF() {
		return this.cpf;
	}
	
	public void setIdade( int idade ) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void setEndereco( String endereco ) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return this.endereco;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nCPF: " + this.getCPF() + "\n";
	}
	
}


