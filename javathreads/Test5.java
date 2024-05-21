package javathreads;

class Task3{
	synchronized static void printing(int page) {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Printing page: " + i +":" + page );
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}

	}
}

class C1 extends Thread{
	public void run() {
		Task3.printing(1);
	}
}

class C2 extends Thread{
	public void run() {
		Task3.printing(10);
	}
}

class C3 extends Thread{
	public void run() {
		Task3.printing(100);
	}
}

class C4 extends Thread{
	public void run() {
		Task3.printing(1000);
	}
}



public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 tObj1 = new C1();
		C2 tObj2 = new C2();
		C3 tObj3 = new C3();
		C4 tObj4 = new C4();
		
		tObj1.start();
		tObj2.start();
		tObj3.start();
		tObj4.start();
		
	}

}
