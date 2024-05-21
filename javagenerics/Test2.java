package javagenerics;

public class Test2 {

	public <T> void genericMethod(T data) {
		System.out.println("Generics Method: ");
		System.out.println("Data Passed: " + data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj = new Test2();
		obj.<String>genericMethod("Java Generics");
		obj.<Integer>genericMethod(200);
	}

}
 