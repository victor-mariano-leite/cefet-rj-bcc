package a2019.s01.p2.slide9;

public class Wrappers {
	
	private int inteiro;
	private	float floater;
	private double doubler;
	private char charer;
	private boolean boler;
	private long longer;
	private byte byter;
	private short shorter;
	
	// Usando as Wrapper classes, sao classes que encapsulam os tipos primitivos, sao menos eficientes
	// mas necessarias para funcoes que so recebem objetos, e tipos primitivos nao sao objetos, sao tipos
	// primitivos, as wrapper classes resolvem isso, encapsulando os tipos.
	
	public Integer getInteiro() {
		return inteiro;
	}
	public void setInteiro(int inteiro) {
		this.inteiro = inteiro;
	}
	
	public Float getFloater() {
		return floater;
	}
	public void setFloater(float floater) {
		this.floater = floater;
	}
	
	public Double getDoubler() {
		return doubler;
	}
	public void setDoubler(double doubler) {
		this.doubler = doubler;
	}
	
	public Character getCharer() {
		return charer;
	}
	public void setCharer(char charer) {
		this.charer = charer;
	}
	
	public Boolean isBoler() {
		return boler;
	}
	public void setBoler(boolean boler) {
		this.boler = boler;
	}
	
	public Long getLonger() {
		return longer;
	}
	public void setLonger(long longer) {
		this.longer = longer;
	}
	
	public Byte getByter() {
		return byter;
	}
	public void setByter(byte byter) {
		this.byter = byter;
	}
	
	public Short getShorter() {
		return shorter;
	}
	public void setShorter(short shorter) {
		this.shorter = shorter;
	}
	
	
	Integer x = 6;
	
	
}
