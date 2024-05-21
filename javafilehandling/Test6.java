package javafilehandling;

import java.nio.CharBuffer;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharBuffer buffer = CharBuffer.allocate(12);
		String data = "bufferSample";
		System.out.println("Data is: " + data);
		for(int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			buffer.put(c);
		}
		int pos = buffer.position();
		System.out.println("Position after data is written into buffer: " + pos);
		buffer.flip(); // limit is set to the current position and thenthe position is set to zero
		System.out.println("Reading Buffer data:");
		while(buffer.hasRemaining()) {
			System.out.println(buffer.get());
		}
		
		
	}

}
