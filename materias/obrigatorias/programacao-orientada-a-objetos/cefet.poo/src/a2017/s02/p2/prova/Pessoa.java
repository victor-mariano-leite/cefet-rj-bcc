package a2017.s02.p2.prova;

public class Pessoa implements Comparable<Pessoa>{
	private String cpf;
	private String nome;
	private int idade;
	
	public void setCPF ( String cpf ) {
		this.cpf = cpf;
	}
	public String getCPF() {
		return this.cpf;
	}
	
	public void setNome ( String nome ) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade ( int idade ) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public boolean equals( Pessoa p ) {
		if (this.getCPF().equals(p.getCPF()) && this.getNome().contentEquals(p.getNome())) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int compareTo(Pessoa o) {
		return (this.getNome()).compareTo(o.getNome());
	}
	
}
