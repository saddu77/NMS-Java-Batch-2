package javafilehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data = "This is sample data to be written into file";
		FileWriter file = new FileWriter("data.txt");
		BufferedWriter op = new BufferedWriter(file);
		op.write(data);
		op.close();
		System.out.println("File written success");
	}

}
