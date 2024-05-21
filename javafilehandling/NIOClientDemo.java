package javafilehandling;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NIOClientDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			SocketChannel sc = SocketChannel.open();
			sc.connect(new InetSocketAddress("localhost",5454));
			ByteBuffer buff = ByteBuffer.allocate(256);
			String msg = "Hi,NIO Server!!!";
			buff.clear();
			buff.put(msg.getBytes());
			buff.flip();
			
			while(buff.hasRemaining()) {
				sc.write(buff);
			}
			buff.clear();
			sc.read(buff);
			buff.flip();
			
			String resp = new String(buff.array(),0, buff.limit());
			System.out.println("Server Response: " + resp);
			sc.close();
	}

}
