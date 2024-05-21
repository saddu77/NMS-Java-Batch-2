package javafilehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		int ch;
		// TODO Auto-generated method stub
		FileReader fr = null;
		
		fr = new FileReader("data.txt");
		
		while((ch=fr.read())!= -1) {
			System.out.print((char)ch);
		}
		fr.close();
	}

}
