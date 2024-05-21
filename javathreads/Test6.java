package javathreads;

class Client5{
	int amount = 20000;
	
	synchronized void withdraw(int amount) {
		System.out.println("amount to be Withdrawn...");
		if(this.amount < amount) {
			System.out.println("Insufficient funds to make transaction");
			try {
				wait();
			}catch(Exception ex) {
				System.out.println(ex);
			}
			this.amount= this.amount-amount;
			
		}
		System.out.println("Fund Transfer completed !!!");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("amount to be Credited....");
		this.amount = this.amount + amount;
		System.out.println("Funds Credited Successfully....");
		notify();
	}
	
}


public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client5 cObj = new Client5();
		
		new Thread() {
			public void run(){
				cObj.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run(){
				cObj.deposit(10000);
			}
		}.start();

	}

}
