package javagenerics;

import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void printIntOnly(List<? super Integer> list) {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li1 = Arrays.asList(4,5,6,7);
		List<Integer> li2 = Arrays.asList(4,5,6,7);
		printIntOnly(li1);
		printIntOnly(li2);
	}

}
