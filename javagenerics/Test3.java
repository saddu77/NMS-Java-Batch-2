package javagenerics;

import java.util.Arrays;
import java.util.List;

public class Test3 {
	
	private static double sum(List <? extends Number> list) {
		double sum = 0.0;
		for ( Number i : list) {
			sum += i.doubleValue();			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = Arrays.asList(20,40,60,80,100);
		
		List<Double> li2 = Arrays.asList(2.1,5.1,6.1);
		
		System.out.println("Total Sum is: " + sum(li));
		
		System.out.println("Total sum is: " + sum(li2));
	}

}
