package javagenerics;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Alex");
		al.add("Alen");
		//al.add(200);
		
		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);
		String s3 = (String) al.get(2);//Runtime Exception if no Generic 
	}

}
