package javafeatures;

public class Test8 {
//   implementation of Functional Interface using lambda function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Thread(
					() -> {
						System.out.println("New Thread created...");
					}
					).start();
	}
}
