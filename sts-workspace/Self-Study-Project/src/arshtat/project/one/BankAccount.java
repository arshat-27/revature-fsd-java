package arshtat.project.one;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private double phoneNumber;
	
	public BankAccount() {
		this("56789",2.50,"Default name","Default name",123456789.0);
	}
	public BankAccount(String accountNumber,double balance,String customerName,String email,double phoneNumber) {
		this.accountNumber=accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return this.accountNumber;

	}

	public double getBalance() {
		return this.balance;

	}

	public String getCustomerName() {
		return this.customerName;

	}

	public String getEmail() {
		return this.email;

	}

	public double getPhoneNumber() {
		return this.phoneNumber;

	}

	public BankAccount(String customerName, String email, double phoneNumber) {
		this("Default",100,customerName,email,phoneNumber);
		
	}
	public double transaction(char type, float amount) {
		if (type == 'd') {
			balance = amount + balance;
		} else if (type == 'w') {
			if(balance-amount<0)
				System.out.println("Not enough Credits");
		}
			else {

			balance = amount - balance;
		}
		return balance;

	}

}
