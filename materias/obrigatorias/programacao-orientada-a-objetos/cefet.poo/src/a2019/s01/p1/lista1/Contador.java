package a2019.s01.p1.lista1;

public class Contador {
	private int itens_eventos;
	
	public int getContador() {
		return itens_eventos;
	}
	
	public void setContador(int val) {
		itens_eventos = val;
	}
	
	public void zerarContador() {
		itens_eventos = 0;
	}
	
	public void incrementaContador() {
		itens_eventos += 1;
	}
	
}
