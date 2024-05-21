package javafeatures;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Run in Runnable Thread !!!");
			}
		};
		r.run();
		System.out.println("Main Thread...");
	}
}
