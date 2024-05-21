package javathreads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task4 implements Runnable{
	
	private String name;	

	public Task4(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 0; i <= 5; i ++) {
				if(i == 0) {
					Date dObj = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Task Initialization: " +
										"Task Name : " + name + 
										" = " + 
										ft.format(dObj));
				}else {
					Date dObj = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Executing Time for Task : " +
										"Task Name : " + name + 
										" = " + 
										ft.format(dObj));
				}
				Thread.sleep(1000);
			}
			System.out.println(name + " completed ");
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
public class Test7 {

	static final int MAX_T = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Task4("scanning");
		Runnable r2 = new Task4("printing");
		Runnable r3 = new Task4("reading");
		Runnable r4 = new Task4("writing");
		Runnable r5 = new Task4("downloading");
		
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		pool.shutdown();
	}

}
