package javathreads;

class Task1{
	//synchronized block: used to lock an object for shared resource
	 void printing(int page) {
		 synchronized(this) {
			 for(int i = 1; i <= 5; i++) {
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
}

class Client3 extends Thread{
	Task1 t;
	Client3(Task1 t){
		this.t=t;
	}
	
	public void run() {
		t.printing(5);
	}
}

class Client4 extends Thread{
	Task1 t;
	Client4(Task1 t){
		this.t=t;
	}
	
	public void run() {
		t.printing(500);
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 obj = new Task1();
		Client3 tObj1 = new Client3(obj);
		Client4 tObj2 = new Client4(obj);
		tObj1.start();
		tObj2.start();
	}

}
