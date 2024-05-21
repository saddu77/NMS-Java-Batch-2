package javafeatures;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("New Thread Created...");
			}
		}).start();;
				
				
	}

}
