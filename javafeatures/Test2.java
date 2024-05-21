package javafeatures;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> System.out.println("Running in Runnable Thread");
		r.run();
		System.out.println("Main Thread...");
	}

}
