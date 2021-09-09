package account;

public class Transaction {
	private float amount;
	private char type;

public void transaction(float amount,char type) {
	this.amount=amount;
	this.type=type;
	
}
	public void displayTransaction(float balance) {
		   System.out.printf("%c %f %f /n",type,amount,balance);	
		}
		
	

	public static void main(String[] args) {
		System.out.println(displayTransaction(5000));

	}

}
