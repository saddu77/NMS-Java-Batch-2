package javathreads;

public class Test1 extends Thread{
	
	public void run() {
		System.out.println("Thread is Running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Java Threads!!!");
		Test1 tObj = new Test1();
		tObj.start();
	}

}
