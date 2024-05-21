package javathreads;

public class Test2 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 tObj = new Test2();
		Thread t = new Thread(tObj);
		t.start();
		
	}

	

}
