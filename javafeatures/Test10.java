package javafeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alex","Alen","Joe","John");
		Predicate<String> p = (s) -> s.startsWith("J");
		for(String st: names) {
			if(p.test(st)) {
				System.out.println(st);
			}
		}
	}

}
