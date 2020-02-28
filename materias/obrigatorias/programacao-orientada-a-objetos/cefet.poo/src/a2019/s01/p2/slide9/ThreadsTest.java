package a2019.s01.p2.slide9;


public class ThreadsTest {

	public static void main(String[] args) {
		
		Thread myThread1 = new Thread(new MyRunnable());
		Thread myThread2 = new Thread(new MyRunnable());
		
		myThread1.start();
		myThread2.start();
		
		MyThread primeira = new MyThread("Primeira...");
		MyThread segunda = new MyThread("Segunda...");
		MyThread terceira = new MyThread("Terceira...");
		MyThread quarta = new MyThread("Quarta...");
		MyThread quinta = new MyThread("Quinta...");
		
		primeira.start();
		segunda.start();
		terceira.start();
		quarta.start();
		quinta.start();
		
	}

}
