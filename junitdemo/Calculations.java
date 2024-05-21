package junitdemo;

public class Calculations {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public boolean isPositive(int num) {
		return num > 0;
	}
	
	public boolean isNegative(int num) {
		return num < 0;
	}
	
	public String getMsg() {
		return "Welcome";
	}
	
	public int[] getNumbers() {
		return new int[] {20,40,60};
	}
	
	public String getInfo() {
		return new String("Learning Java");
	}
	
	public void throwArithemeticException() {
		int res = 1 / 0;
	}
	
}
