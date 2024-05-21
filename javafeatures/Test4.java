package javafeatures;

import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = Arrays.asList(20,40,60,80,100);
		al.forEach(number -> System.out.println(number + " "));
	}

}
