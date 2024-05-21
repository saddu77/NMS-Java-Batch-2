package javafilehandling;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NIOServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Selector selector = Selector.open();
		ServerSocketChannel serverSocket = ServerSocketChannel.open();
		serverSocket.bind(new InetSocketAddress("localhost",5454));
		serverSocket.configureBlocking(false);
		serverSocket.register(selector, SelectionKey.OP_ACCEPT);
		ByteBuffer buffer = ByteBuffer.allocate(256);
		System.out.println("Server started and listening on port 5454...");
		while(true) {
			selector.select();
			Set<SelectionKey> sk = selector.selectedKeys();
			Iterator<SelectionKey> itr = sk.iterator();
			
			while(itr.hasNext()) {
				SelectionKey key = itr.next();
				if(key.isAcceptable()) {
					ServerSocketChannel server = (ServerSocketChannel)key.channel();
					SocketChannel clientC = server.accept();
					clientC.configureBlocking(false);
					clientC.register(selector, SelectionKey.OP_READ);
				}
				
				if( key.isReadable()) {
					SocketChannel client = (SocketChannel)key.channel();
					buffer.clear();
					int byteRead = client.read(buffer);
					if ( byteRead == -1) {
						key.channel();
						client.close();
						continue;
					}
					buffer.flip();
					String recievedMsg = new String(buffer.array(),0,byteRead);
					System.out.println("Recieved: " + recievedMsg);
					buffer.rewind();
					client.write(buffer);
				}
				
				
				itr.remove();
			}
		}
	}

}
