package javathreads;

import java.util.concurrent.*;

public class Test10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
			return "Welcome from CompletableFuture";
		});
		
		System.out.println(cf.get());
	}

}
