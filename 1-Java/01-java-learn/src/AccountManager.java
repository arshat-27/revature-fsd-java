
public class AccountManager {

	public static void main(String[] args) {
		String accountNumber = "01302343794";
		double balance = 5000;
		
		System.out.println("Account Statement Of " + accountNumber);
		System.out.println("Initial Balance : " + balance);
		System.out.println();
		LinePrinter.printLine(25);
	    System.out.println("Type Transaction Balance");
		LinePrinter.printLine(25);
		
		/*char type = 'w';
		double transaction = 2000;
		balance = balance - transaction;
		System.out.printf("%4c %12.2f %8.2f\n" ,type,transaction,balance);
		
	
	
		type = 'D';
		transaction = 20000 ;
		balance = balance - transaction;
		System.out.printf("%4c %12.2f %8.2f\n" ,type,transaction,balance);
		
		type = 'D';
		transaction = 500;
		balance = balance - transaction;
		System.out.printf("%4c %12.2f %8.2f\n" ,type,transaction,balance);
		
		type = 'w';
		transaction = 15500;
		balance = balance - transaction;
		System.out.printf("%4c %12.2f %8.2f\n" ,type,transaction,balance);
		
		type = 'w';
		transaction = 10000;
		balance = balance - transaction;
		System.out.printf("%4c %12.2f %8.2f\n" ,type,transaction,balance);
		LinePrinter.printLine(25);
	}*/
	balance = calculateBalancePrint('W',2000,balance);
	balance = calculateBalancePrint('D',20000,balance);
	balance = calculateBalancePrint('D',500,balance);
	balance = calculateBalancePrint('W',15500,balance);
	balance = calculateBalancePrint('W',10000,balance);
	LinePrinter.printLine(25);
	}
	public static double calculateBalancePrint(char type,double transaction,double balance) {
		if(type == 'D') {
			balance += transaction;
		}
		if(type == 'W') {
			balance -= transaction;
	}
		System.out.printf("%4c %12.2f %8.2f\n" ,type,transaction,balance);
		return balance;
	}
}

