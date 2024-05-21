package javathreads;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
		AtomicInteger count = new AtomicInteger();
		public void increment(){
			count.incrementAndGet();
		}
}

public class Test9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Counter cObj = new Counter();
		Thread tObj1 = new Thread(
				new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for (int i = 1; i <= 2000; i++) {
							cObj.increment();
						}
					}
				}
				);
		
		Thread tObj2 = new Thread(
				new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for (int i = 1; i <= 2000; i++) {
							cObj.increment();
						}
					}
				}
				);
		tObj1.start();
		tObj2.start();
		
		tObj1.join();
		tObj2.join();
		
		System.out.println(cObj.count);
	}

}
