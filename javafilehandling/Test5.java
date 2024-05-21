package javafilehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable{
	
	public String username;
	public String password;
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
public class Test5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		User uObj = new User("Alex", "123456");
		String file = "user.ser";
		//Serialization
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(uObj);
		out.close();
		fout.close();
		System.out.println("Object has been serialized");
		
		//Deserialization
		User uObj1 = new User("Bob", "123456");
		FileInputStream rfile = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(rfile);
		in.close();
		rfile.close();
		
		System.out.println("Object has been deserialized ");
		System.out.println("username is : " + uObj1.username);
		System.out.println("password is : " + uObj1.password);	
		
		}

}
