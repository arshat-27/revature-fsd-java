package arshtat.project.one;

public class Bmain {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.setAccountNumber("1000000000");
		ba.setBalance(100);
		ba.setCustomerName("SAHITH MOWA");
		ba.setEmail("SahithMowa@gmail.com");
		ba.setPhoneNumber(1000000000);
		/*System.out.println("Account Number = "+ba.getAccountNumber());
		System.out.println("Balance = "+ba.getBalance());
		System.out.println("Customer Name = "+ba.getCustomerName());
		System.out.println("Email = "+ba.getEmail());
		System.out.println("Phone Number = "+ba.getPhoneNumber());*/
		System.out.println(ba.transaction('d',200));
		
		

	}

}
