package a2019.s01.p2.revisao;

public class Bird extends Animal implements Flyer{
	public void takeOff() {
		
	}
	public void land() {
		
	}
	public void fly() {
		
	}
	public void buildNest() {
		
	}
	public void layEggs() {
		
	}
	// eat já foi herdado a nao ser se eu quiser sobrescrever, se sim ficaria assim
	
	@Override
	public void eat() {
		System.out.println("comendo...");
	}
	
}

