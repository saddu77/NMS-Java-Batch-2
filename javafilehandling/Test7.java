package javafilehandling;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile file = new RandomAccessFile("data.txt", "r");
		FileChannel fc = file.getChannel();
		ByteBuffer bf = ByteBuffer.allocate(512);
		while(fc.read(bf) > 0) {
			bf.flip();
			while(bf.hasRemaining()) {
				System.out.print((char)bf.get());
			}
		}
		file.close();
	}

}
