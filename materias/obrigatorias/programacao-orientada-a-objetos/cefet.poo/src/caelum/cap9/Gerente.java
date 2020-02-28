package caelum.cap9;

public class Gerente extends Funcionario{
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
    public boolean autentica(int senha) {
    	
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    public int getNumeroDeFuncionariosGerenciados() {
    	return numeroDeFuncionariosGerenciados;
    }
    
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
    
	@Override
	public double getBonificacao() {
        return this.salario * 0.15;
    }
	
}
