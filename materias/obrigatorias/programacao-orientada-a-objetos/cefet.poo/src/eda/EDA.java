package eda;

public abstract class EDA {
	
	//acho que seria melhor como classe abstrata pq posso botar atributos padrão
	
	protected int numNos;
	protected String tipoDeEDA;
	protected String buscaPadrao;
	protected String complexidadeBusca;
	protected String complexidadeInsercao;
	protected String complexidadeRemocao;
	protected String complexidadeOrdenacao;
	
	// Classes abstratas não têm corpo.
	
	// Classes de interface têm corpo, mas não têm implementação e depois da chaves que fecha o corpo
	// têm ponto e vírgula depois.
	
	public abstract void listar();
	
	public abstract void busca();
	
	public abstract void insercaoNo();
	
	public abstract void remocaoNo();
	
	public abstract void ordenacao();

}
