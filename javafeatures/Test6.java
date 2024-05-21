package javafeatures;

import java.util.Arrays;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = Arrays.asList(20,40,60,80,100);
		
		System.out.println(
				al.stream().filter(num -> num % 2 == 0).mapToInt(e -> e * 2).sum()
				);
	}

}
