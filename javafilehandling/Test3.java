package javafilehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("data.txt");
		BufferedReader buffReader = new BufferedReader(fr);
		
		int ch;
		while ((ch = buffReader.read())!=-1){
			System.out.print((char)ch);
		}
		buffReader.close();
		fr.close();

	}

}
