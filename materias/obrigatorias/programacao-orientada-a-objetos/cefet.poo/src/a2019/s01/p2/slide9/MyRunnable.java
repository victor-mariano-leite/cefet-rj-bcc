package a2019.s01.p2.slide9;

public class MyRunnable implements Runnable{
	
	private int numThread;
	private static int Threads = 0;
	
	public MyRunnable(){
		Threads ++;
		this.numThread = Threads;
	}
	
	@Override
	public void run() {
		System.out.println("Thread número " + this.numThread + " executando...");
	}

}
