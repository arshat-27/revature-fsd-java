package arshtat.project.one;

public class Bmain {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount("1000000",100,"sahith","SahithMowa@gmail.com",1000000);
		BankAccount baa=new BankAccount("1000000",100,"sahith","SahithMowa@gmail.com",1000000);
		BankAccount sahith=new BankAccount("SahithMachaa","saa@gmail.com",1000000000);
		/*ba.setAccountNumber("1000000000");
		ba.setBalance(100);
		ba.setCustomerName("SAHITH MOWA");
		ba.setEmail("SahithMowa@gmail.com");
		ba.setPhoneNumber(1000000000);*/
		/*System.out.println("Account Number = "+ba.getAccountNumber());
		System.out.println("Balance = "+baa.getBalance());
		System.out.println("Customer Name = "+ba.getCustomerName());
		System.out.println("Email = "+ba.getEmail());
		System.out.println("Phone Number = "+ba.getPhoneNumber());
		System.out.println(ba.transaction('d',200));*/
		System.out.println(sahith.getAccountNumber() + " name " + sahith.getCustomerName());
		
		

	}

}
