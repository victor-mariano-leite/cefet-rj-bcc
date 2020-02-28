package a2019.s01.p2.slide8;

public class Pessoa {
	
	private int idade;
	private String nome;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Pessoa(String n, int i) {
		this.idade = i;
		this.nome = n;
	}
	
	public int compareTo( Pessoa p ) {
		return nome.compareTo(p.nome);  // Retorna o compareTo padrao com base no nome, ordenacao pelo nome quando fizer
										// o sort(), e pode ser return idade - p.idade, para fazer o compareTo para 
										// ordenar com base na idade
										// seria: return ( this.idade - p.idade )
	}
	
}
