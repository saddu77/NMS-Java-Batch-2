package javafeatures;

import java.util.function.Predicate;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> lt = i -> ( i < 18);
		System.out.println(lt.test(10));
	}

}
