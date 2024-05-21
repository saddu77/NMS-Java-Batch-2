package javafilehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String msg = "Welcome to Java!!!! File Handling";
		FileWriter fw = new FileWriter("data.txt");
		
		for(int i = 0; i < msg.length(); i++) {
			fw.write(msg.charAt(i));
		}
		
		System.out.println("Writing Successfully !!! ");
		fw.close();
	}
}
