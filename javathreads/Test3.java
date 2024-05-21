package javathreads;

class Task{
	//synchronized method: used to lock an object for shared resource
	synchronized void printing(int page) {
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

class Client1 extends Thread{
	Task t;
	Client1(Task t){
		this.t=t;
	}
	
	public void run() {
		t.printing(5);
	}
}

class Client2 extends Thread{
	Task t;
	Client2(Task t){
		this.t=t;
	}
	
	public void run() {
		t.printing(500);
	}
}



public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Task obj = new Task();
			Client1 tObj1 = new Client1(obj);
			Client2 tObj2 = new Client2(obj);
			tObj1.start();
			tObj2.start();
	}
}
