package caelum.cap9;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	
	private int horasDeAula;
	public double getGastos() {
		return this.getSalario() + this.horasDeAula * 10;
	}
	
	public String getInfo() {
		
		String informacaoBasica = super.getInfo();
		
		/*
		 * Estou escrevendo super.getInfo() por que estou
		 * modificando o getInfo() da superclasse, mas quero
		 * reaproveita-la no getInfo() reescrito, ou seja, 
		 * pegar ela para acrescentar, ou subtrair informacao
		 * 
		 */
		
		String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula;
		
		return informacao;
	
	}
}
