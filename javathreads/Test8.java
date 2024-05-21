package javathreads;

public class Test8 {

	static volatile int number1 = 10,number2 = 20;
	static void updateValue() {
		number1++;
		number2++;
	}
	
	static void getValues(){
		System.out.println("num1: " + number1 + " " + "num2: " + number2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tObj1 = new Thread() {
			public void run() {
				for(int i = 0; i < 5;i++) {
					updateValue();
				}
			}
		};
		
		Thread tObj2 = new Thread() {
			public void run() {
				for(int i = 0; i < 5;i++) {
					getValues();
				}
			}
		};
		
		tObj1.start();
		tObj2.start();
	}

}
