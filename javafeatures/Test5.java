package javafeatures;

import java.util.Arrays;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = Arrays.asList(20,40,60,80,100);
		int res = 0;
		for(Integer n : al) {
			if( n %2 == 0) {
				res = res + n * 2;
			}
		}
		System.out.println(res);
	}

}
